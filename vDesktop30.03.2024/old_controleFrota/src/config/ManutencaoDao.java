package config;

import java.sql.Connection;
import java.sql.Date;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Priscila
 */
public class ManutencaoDao {
    //Criando a conexão com o banco

    Conectar con = new Conectar();

    PreparedStatement st;

    public Veiculos consultar(String placa) {
        Veiculos veiculos = new Veiculos();
        Connection cn = con.conexao();
        try {
            st = cn.prepareStatement("SELECT * FROM veiculo WHERE placa = ?");
            st.setString(1, placa);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                veiculos.setPlaca(rs.getString("placa"));
                veiculos.setDataCadastro(rs.getDate("dataCadastro").toLocalDate());
                veiculos.setMarca(rs.getString("marca"));
                veiculos.setModelo(rs.getString("modelo"));
                veiculos.setCor(rs.getString("cor"));
                veiculos.setCombustivel(rs.getString("combustivel"));
                veiculos.setTipoVeiculo(rs.getString("tipoVeiculo"));
                veiculos.setAnoFabricacao(rs.getInt("anoFabricacao"));
                veiculos.setAnoModelo(rs.getInt("anoModelo"));
                veiculos.setMotor(rs.getString("motor"));

                return veiculos;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }

    }

    public List<Manutencao> consultarPreventiva(int codPreventiva) {
        Connection cn = con.conexao();
        OrdemServico ordem = new OrdemServico();
        Veiculos veiculo = new Veiculos();
        VeiculosDao veiculoDao = new VeiculosDao();
        PlanoItemManutencaoDao daoPlano = new PlanoItemManutencaoDao();
        List<Manutencao> manutencaoEncontrada = new ArrayList<>();

        ResultSet rs = null;
        try {
            st = cn.prepareStatement("SELECT kmPreventiva, placa"
                    + " FROM ordemservico WHERE Id = ?");

            st.setInt(1, codPreventiva);

            rs = st.executeQuery();
            while (rs.next()) {
                ordem.setPlaca(rs.getString("placa"));
                ordem.setKmPreventiva(rs.getString("kmPreventiva"));
            }

            String[] kmManutencao = ordem.getKmPreventiva().split(",");
            int[] numberKM = Arrays.stream(kmManutencao).mapToInt(Integer::parseInt).toArray();

            veiculo = consultar(ordem.getPlaca());

            for (int idKM : numberKM) {
                List<CadastroItem> itensPlano = daoPlano.consultarPorItem(veiculo.getModelo(), veiculo.getMotor(), idKM, veiculo.getAnoModelo(), veiculo.getAnoFabricacao());

                for (CadastroItem idProduto : itensPlano) {
                    Manutencao manut = new Manutencao();
                    manut.setCodProduto(idProduto.getIdCodigo());
                    manut.setKmManutencao(idKM);
                    manut.setDescricaoProduto(idProduto.getDescricaoItem());
                    manut.setValorProduto(idProduto.getValorUnitario());

                    manutencaoEncontrada.add(manut);

                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        con.desconectar(cn);
        return manutencaoEncontrada;
    }

    public List<CadastroItem> consultarCorretiva(int codCorretiva) {

        Connection cn = con.conexao();
        OrdemServico ordem = new OrdemServico();

        List<CadastroItem> produtoEncontrado = new ArrayList<>();

        ResultSet rs = null;
        try {
            st = cn.prepareStatement("SELECT produtoCorretiva"
                    + " FROM ordemservico WHERE Id = ?");

            st.setInt(1, codCorretiva);

            rs = st.executeQuery();
            while (rs.next()) {
                ordem.setProdutoCorretiva(rs.getString("produtoCorretiva"));
            }
            String produto = ordem.getProdutoCorretiva();
            if (produto.endsWith(",")) {
                produto = produto.substring(0, produto.length() - 1);
            }
            String[] produtos = produto.split(",");
            int[] numberProduto = Arrays.stream(produtos).mapToInt(Integer::parseInt).toArray();

            ResultSet rsCorretiva = null;
            for (int idCorretiva : numberProduto) {
                try {
                    st = cn.prepareStatement("SELECT descricaoItem,valorUnitario FROM cadastro_item WHERE idCodigo = ?");
                    st.setInt(1, idCorretiva);
                    rsCorretiva = st.executeQuery();

                    if (rsCorretiva.next()) {
                        CadastroItem product = new CadastroItem();
                        product.setIdCodigo(idCorretiva);
                        product.setDescricaoItem(rsCorretiva.getString("descricaoItem"));
                        product.setValorUnitario(rsCorretiva.getDouble("valorUnitario"));

                        produtoEncontrado.add(product);
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        con.desconectar(cn);
        return produtoEncontrado;

    }

    public int noEqualsProduct(String product) {
        int idProduct = Integer.parseInt(product);
        int value = 0;
        Connection cn = con.conexao();
        try {
            st = cn.prepareStatement("SELECT * FROM cadastro_item WHERE idCodigo = ?");
            st.setInt(1, idProduct);
            ResultSet rs = st.executeQuery();
            if (rs.first()) {
                value = 1;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
        }
        con.desconectar(cn);
        return value;
    }

    public boolean updateProductOSCorretiva(int idOS, String idProduct) {

        Connection cn = con.conexao();
        try {
            st = cn.prepareStatement("SELECT produtoCorretiva"
                    + " FROM ordemservico WHERE Id = ?");
            st.setInt(1, idOS);

            ResultSet rsOS = st.executeQuery();

            if (rsOS.next()) {
                String corretiva = rsOS.getString("produtoCorretiva");
                String updateCorretiva = corretiva + idProduct + ",";

                st = cn.prepareStatement("UPDATE ordemservico SET  produtoCorretiva = ?, statusOrdem = ? WHERE Id = ?");

                st.setString(1, updateCorretiva);
                st.setString(2, "Processo");                
                st.setInt(3, idOS);
                int status = st.executeUpdate();
                con.desconectar(cn);
                return status > 0;

            } else {
                con.desconectar(cn);
                return false;

            }
        } catch (SQLException ex) {
            con.desconectar(cn);
            return false;
        }

    }

    public boolean excluirProductOSCorretiva(int idOS, String idProduct) {
        boolean status = false;
        Connection cn = con.conexao();
        try {
            st = cn.prepareStatement("SELECT produtoCorretiva"
                    + " FROM ordemservico WHERE Id = ?");
            st.setInt(1, idOS);

            ResultSet rsOS = st.executeQuery();

            if (rsOS.next()) {
                String corretiva = rsOS.getString("produtoCorretiva");
                String product = idProduct + ",";
                if (corretiva.contains(product)) {
                    corretiva = corretiva.replace(product, "");

                    st = cn.prepareStatement("UPDATE ordemservico SET  produtoCorretiva = ?, statusOrdem = ? WHERE Id = ?");

                    st.setString(1, corretiva);
                    st.setString(2, "Processo");                     
                    st.setInt(3, idOS);
                    int statusUpdate = st.executeUpdate();

                    if (statusUpdate > 0) {
                        status = true;
                    }
                    con.desconectar(cn);
                }
            }
        } catch (SQLException ex) {
            con.desconectar(cn);
            return false;
        }
        con.desconectar(cn);
        return status;

    }

    public boolean atualizarOSPreventivaCorretiva(int idCodigo, Double valorTotal) {
        Date dataAtual = new Date(System.currentTimeMillis());

        Connection cn = con.conexao();
        int status = 0;

        try {
            st = cn.prepareStatement("UPDATE ordemservico SET  valorTotal = ?, statusOrdem = ?, data = ? WHERE Id = ?");
            st.setDouble(1, valorTotal);
            st.setString(2, "Encerrado");
            st.setDate(3, dataAtual);
            st.setInt(4, idCodigo);
            status = st.executeUpdate();
            con.desconectar(cn);
            return status > 0;
        } catch (SQLException ex) {
            con.desconectar(cn);
            return false;
        }

    }



}
