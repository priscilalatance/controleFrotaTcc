package config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Francisco Mariano
 * @autor Vinicius Henrique
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
            // Atualiza a consulta para trazer o KmManutencao da tabela planomanutencao
            st = cn.prepareStatement(
                    "SELECT os.dataCheck, os.Id, pm.kmManutencao "
                    + "FROM ordemservico os "
                    + "JOIN ordem_plano op ON os.Id = op.fk_idOrdem "
                    + "JOIN planomanutencao pm ON op.fk_idPlano = pm.idPlano "
                    + "WHERE os.placa = ? AND os.tipoManutencao = ? AND os.statusOrdem = ?"
            );

            st.setString(1, placa);
            st.setString(2, preventiva);
            st.setString(3, aberto);

            rs = st.executeQuery();
            while (rs.next()) {
                OrdemServico ordem = new OrdemServico();
                ordem.setDataCheck(rs.getDate("dataCheck").toLocalDate());
                ordem.setId(rs.getInt("Id"));
                ordem.setKmManutencao(rs.getInt("kmManutencao"));
                ordemServico.add(ordem);
            }
        } catch (SQLException ex) {
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
            } catch (SQLException ex) {
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
            st = cn.prepareStatement("SELECT os.dataCheck, os.Id, op.FK_IDCodigo, cp.descricaoItem "
                    + "FROM ordemservico os "
                    + "JOIN ordem_produto op ON os.Id = op.FK_idOrdem "
                    + "JOIN cadastro_produto cp ON op.FK_IDCodigo = cp.idCodigo "
                    + "WHERE os.placa = ? AND os.tipoManutencao = ? AND os.statusOrdem = ?");
            st.setString(1, placa);
            st.setString(2, corretiva);
            st.setString(3, aberto);

            rs = st.executeQuery();
            while (rs.next()) {
                OrdemServico ordem = new OrdemServico();
                ordem.setDataCheck(rs.getDate("dataCheck").toLocalDate());
                ordem.setId(rs.getInt("Id"));
                ordem.setProdutoCorretiva(rs.getString("descricaoItem"));
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

}
