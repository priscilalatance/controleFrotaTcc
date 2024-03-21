package config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Priscila
 */
public class OrdemServicoDao {
    //Criando a conexão com o banco

    Conectar con = new Conectar();

    PreparedStatement st;

    public int NoEqualsPlaca(String placa) {
        Connection cn = con.conexao();
        int value = 0;
        try {
            st = cn.prepareStatement("SELECT * FROM veiculo WHERE placa = ?");
            st.setString(1, placa);
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

    public List<OrdemServico> consultarPreventiva(String placa, String preventiva, String aberto) {
        Connection cn = con.conexao();
        List<OrdemServico> ordemServico = new ArrayList<>();

        ResultSet rs = null;
        try {
            st = cn.prepareStatement("SELECT dataCheck, Id, kmPreventiva"
                    + " FROM ordemservico WHERE placa = ? AND tipoManutencao = ? AND statusOrdem = ?");

            st.setString(1, placa);
            st.setString(2, preventiva);
            st.setString(3, aberto);

            rs = st.executeQuery();
            while (rs.next()) {
                OrdemServico ordem = new OrdemServico();
                ordem.setDataCheck(rs.getDate("dataCheck").toLocalDate());
                ordem.setId(rs.getInt("Id"));
                ordem.setKmPreventiva(rs.getString("kmPreventiva"));

                ordemServico.add(ordem);
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
        return ordemServico;

    }

    public List<OrdemServico> consultarCorretiva(String placa, String corretiva, String aberto) {
        List<OrdemServico> ordemServico = new ArrayList<>();
        Connection cn = con.conexao();
        ResultSet rs = null;
        try {
            st = cn.prepareStatement("SELECT dataCheck, Id, produtoCorretiva"
                    + " FROM ordemservico WHERE placa = ? AND tipoManutencao = ? AND statusOrdem = ?");

            st.setString(1, placa);
            st.setString(2, corretiva);
            st.setString(3, aberto);

            rs = st.executeQuery();
            while (rs.next()) {
                OrdemServico ordem = new OrdemServico();
                ordem.setDataCheck(rs.getDate("dataCheck").toLocalDate());
                ordem.setId(rs.getInt("Id"));
                ordem.setProdutoCorretiva(rs.getString("produtoCorretiva"));

                ordemServico.add(ordem);
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
        return ordemServico;
    }

    public String descricaoProduto(int idProduto) {
        Connection cn = con.conexao();
        try {
            st = cn.prepareStatement("SELECT descricaoItem FROM cadastro_item WHERE idCodigo = ?");
            st.setInt(1, idProduto);
            ResultSet rs = st.executeQuery();
            if (rs.first()) {
                String result = rs.getString("descricaoItem");
                con.desconectar(cn);
                return result;

            } else {
                con.desconectar(cn);
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
}
