package config;

import java.sql.Connection;
import java.sql.Date;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Priscila
 * @author Francisco Mariano
 * @autor Vinicius Henrique
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

//    public List<Manutencao> consultarPreventiva(int codPreventiva) {
//        Connection cn = con.conexao();
//        OrdemServico ordem = new OrdemServico();
//        Veiculos veiculo = new Veiculos();
//        VeiculosDao veiculoDao = new VeiculosDao();
//        CadastroItem produto = new CadastroItem();
//        PlanoManutencao planoManut = new PlanoManutencao();
//        List<Manutencao> manutencaoEncontrada = new ArrayList<>();
//
//        ResultSet rs = null;
//        try {
//            st = cn.prepareStatement("SELECT cp.idCodigo, ip.KmManutencao, cp.descricaoItem, cp.valorUnitario\n"
//                    + "FROM ordemservico os\n"
//                    + "JOIN ordem_plano op ON os.id = op.fk_idOrdem\n"
//                    + "JOIN plano_produto pp ON op.fk_idPlano = pp.fk_idPlano\n"
//                    + "JOIN planomanutencao ip ON pp.fk_idPlano = ip.idPlano\n"
//                    + "JOIN cadastro_produto cp ON pp.fk_idCodigo = cp.idCodigo\n"
//                    + "WHERE os.id = ?");
//
//            st.setInt(1, codPreventiva);
//
//            rs = st.executeQuery();
//            while (rs.next()) {
//                Manutencao manutencao = new Manutencao();
//                manutencao.setCodProduto(rs.getInt("idCodigo")); // Use setCodProduto em vez de setIdCodigo
//                manutencao.setKmManutencao(rs.getInt("KmManutencao")); // Use setKmManutencao em vez de setKmManutencao
//                manutencao.setDescricaoProduto(rs.getString("descricaoItem")); // Use setDescricaoProduto em vez de setDescricaoItem
//                produto.setValorUnitario(rs.getDouble("valorUnitario"));// preciso que corriga 
//                manutencaoEncontrada.add(manutencao);
//            }
//
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        } finally {
//            try {
//                if (rs != null) {
//                    rs.close();
//                }
//                if (st != null) {
//                    st.close();
//                }
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }
//        }
//        con.desconectar(cn);
//        return manutencaoEncontrada;
//    }
    
    
     public List<Manutencao> consultarPreventiva(int codPreventiva) {
        Connection cn = con.conexao();
        OrdemServico ordem = new OrdemServico();
        Veiculos veiculo = new Veiculos();
        VeiculosDao veiculoDao = new VeiculosDao();
        CadastroItem produto = new CadastroItem();
        PlanoManutencao planoManut = new PlanoManutencao();
        List<Manutencao> manutencaoEncontrada = new ArrayList<>();

        ResultSet rs = null;
        try {
            st = cn.prepareStatement("SELECT cp.idCodigo, ip.KmManutencao, cp.descricaoItem, cp.valorUnitario\n"
                    + "FROM ordemservico os\n"
                    + "JOIN ordem_plano op ON os.id = op.fk_idOrdem\n"
                    + "JOIN plano_produto pp ON op.fk_idPlano = pp.fk_idPlano\n"
                    + "JOIN planomanutencao ip ON pp.fk_idPlano = ip.idPlano\n"
                    + "JOIN cadastro_produto cp ON pp.fk_idCodigo = cp.idCodigo\n"
                    + "WHERE os.id = ?");

            st.setInt(1, codPreventiva);

            rs = st.executeQuery();
            while (rs.next()) {
                Manutencao manutencao = new Manutencao();
                manutencao.setCodProduto(rs.getInt("idCodigo")); // Use setCodProduto em vez de setIdCodigo
                manutencao.setKmManutencao(rs.getInt("KmManutencao")); // Use setKmManutencao em vez de setKmManutencao
                manutencao.setDescricaoProduto(rs.getString("descricaoItem")); // Use setDescricaoProduto em vez de setDescricaoItem
                manutencao.setValorProduto(rs.getDouble("valorUnitario")); // Definir o valor unitário

                manutencaoEncontrada.add(manutencao);
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
        List<CadastroItem> produtoEncontrado = new ArrayList<>();
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = cn.prepareStatement(
                    "SELECT cp.idCodigo, cp.descricaoItem, cp.valorUnitario "
                    + "FROM ordem_produto op "
                    + "JOIN cadastro_produto cp ON op.fk_idCodigo = cp.idCodigo "
                    + "WHERE op.fk_idOrdem = ?"
            );
            st.setInt(1, codCorretiva);
            rs = st.executeQuery();
            while (rs.next()) {
                CadastroItem produto = new CadastroItem();
                produto.setIdCodigo(rs.getInt("idCodigo"));
                produto.setDescricaoItem(rs.getString("descricaoItem"));
                produto.setValorUnitario(rs.getDouble("valorUnitario"));

                produtoEncontrado.add(produto);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            // Fechar recursos
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
            con.desconectar(cn);
        }

        return produtoEncontrado;
    }

    public int noEqualsProduct(String product) {
        int idProduct = Integer.parseInt(product);
        int value = 0;
        Connection cn = con.conexao();
        try {
            st = cn.prepareStatement("SELECT * FROM cadastro_produto WHERE idCodigo = ?");
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
            // Consulta para obter o código do produto associado à ordem de serviço
            PreparedStatement selectStmt = cn.prepareStatement("SELECT cp.idCodigo FROM ordem_produto op JOIN cadastro_produto cp ON op.fk_idCodigo = cp.idCodigo WHERE op.fk_idOrdem = ?");
            selectStmt.setInt(1, idOS);
            ResultSet rsOS = selectStmt.executeQuery();

            if (rsOS.next()) {
                // Obtém o código do produto
                String corretiva = rsOS.getString("idCodigo");

                // Insere um novo registro na tabela ordem_produto
                PreparedStatement insertStmt = cn.prepareStatement("INSERT INTO ordem_produto (fk_IdOrdem, fk_IdCodigo) VALUES (?, ?)");
                insertStmt.setInt(1, idOS);
                insertStmt.setString(2, idProduct);
                int insertStatus = insertStmt.executeUpdate();

                // Atualiza o status na tabela ordemservico
                PreparedStatement updateStmt = cn.prepareStatement("UPDATE ordemservico SET statusOrdem = 'Processo' WHERE Id = ?");
                updateStmt.setInt(1, idOS);
                int updateStatus = updateStmt.executeUpdate();

                // Verifica se as operações foram bem-sucedidas
                boolean allOperationsSuccessful = insertStatus > 0 && updateStatus > 0;
                con.desconectar(cn);
                return allOperationsSuccessful;
            } else {
                // Caso não encontre o código do produto associado à ordem de serviço
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
            // Remove o registro da tabela ordem_produto
            PreparedStatement deleteStmt = cn.prepareStatement("DELETE FROM ordem_produto WHERE fk_IdOrdem = ? AND fk_IdCodigo = ?");
            deleteStmt.setInt(1, idOS);
            deleteStmt.setString(2, idProduct);
            int deleteStatus = deleteStmt.executeUpdate();

            // Se a exclusão for bem-sucedida, atualiza o status na tabela ordemservico
            if (deleteStatus > 0) {
                PreparedStatement updateStmt = cn.prepareStatement("UPDATE ordemservico SET statusOrdem = 'Processo' WHERE Id = ?");
                updateStmt.setInt(1, idOS);
                int updateStatus = updateStmt.executeUpdate();

                // Se a atualização for bem-sucedida, define status como true
                if (updateStatus > 0) {
                    status = true;
                }
            }
        } catch (SQLException ex) {
            // Trate qualquer exceção SQL e retorne false
            return false;
        } finally {
            // Certifique-se de desconectar a conexão com o banco de dados, independentemente de sucesso ou falha
            con.desconectar(cn);
        }
        // Retorna o status final
        return status;
    }

public boolean atualizarOSPreventivaCorretiva(int idCodigo, Double valorTotal) {
    Date dataAtual = new Date(System.currentTimeMillis());

    Connection cn = con.conexao();
    int status = 0;

    try {
        // Atualiza a ordem de serviço
        st = cn.prepareStatement("UPDATE ordemservico SET valorTotal = ?, statusOrdem = ?, data = ? WHERE Id = ?");
        st.setDouble(1, valorTotal);
        st.setString(2, "Encerrado");
        st.setDate(3, dataAtual);
        st.setInt(4, idCodigo);
        status = st.executeUpdate();

        // Atualiza a agenda
        PreparedStatement updateAgendaStmt = cn.prepareStatement("UPDATE agenda INNER JOIN ordemservico ON agenda.placa = ordemservico.placa SET agenda.status = 'Encerrado' WHERE ordemservico.Id = ? AND agenda.status = 'agendado'");
        updateAgendaStmt.setInt(1, idCodigo);
        int updateAgendaStatus = updateAgendaStmt.executeUpdate();

        con.desconectar(cn);

        // Retorna true apenas se ambos os updates forem bem-sucedidos
        return status > 0 && updateAgendaStatus > 0;
    } catch (SQLException ex) {
        con.desconectar(cn);
        return false;
    }
}


}
