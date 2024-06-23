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
public class Plano_ProdutoDao {
    
    //Criando a conexão com o banco
    Conectar con = new Conectar();
    Connection cn = con.conexao();
    PreparedStatement st;

    public int incluirItemAoKit(PlanoManutencao plano, Plano_Produto produtoDoPlano) {
        Connection cn = con.conexao();
        int status = 0;
        
        try {

            st = cn.prepareStatement("SELECT idPlano"
                    + " FROM planomanutencao WHERE modelo = ? AND motor = ? AND anoFabricacao = ? AND anoModelo = ? And KmManutencao = ? ");
            st.setString(1, plano.getModelo());
            st.setString(2, plano.getMotor());
            st.setInt(3, plano.getAnoFabricacao());
            st.setInt(4, plano.getAnoModelo());            
            st.setInt(5, plano.getKmManutencao());            

            ResultSet rs = st.executeQuery();

            if (rs.first()) {
                produtoDoPlano.setIdPlano(rs.getInt("idPlano"));

                try {

                    st = cn.prepareStatement("INSERT INTO plano_produto(fk_idPlano, fk_idCodigo) VALUES(?,?)");
                        st.setInt(1, produtoDoPlano.getIdPlano());
                        st.setInt(2, produtoDoPlano.getIdCodigo());
                        
                       status = st.executeUpdate();

                    con.desconectar(cn);
                    return status;
                } catch (SQLException ex) {
                    System.err.println("Erro ao gravar agenda no banco de dados: " + ex.getMessage());
                return status;
                }

            }

            con.desconectar(cn);
            return status;

        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            con.desconectar(cn);
            return status;
        }
    
    }
    
    public Boolean excluir(String modelo, String motor, Integer km, Integer anoModelo, Integer anoFabricacao, Integer idCodigo) {
        Connection cn = con.conexao();
        int value = 0;
        
        try {

            st = cn.prepareStatement("SELECT idPlano"
                    + " FROM planomanutencao WHERE modelo = ? AND motor = ? AND anoFabricacao = ? AND anoModelo = ? And KmManutencao = ? ");
            st.setString(1, modelo);
            st.setString(2, motor);
            st.setInt(3, anoFabricacao); 
            st.setInt(4, anoModelo);        
            st.setInt(5, km);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                int idPlano = (rs.getInt("idPlano"));

                st = cn.prepareStatement("DELETE FROM plano_produto WHERE  fk_idPlano = ? AND fk_idCodigo = ?");                
                st.setInt(1, idPlano);
                st.setInt(2, idCodigo);

                value = st.executeUpdate();



            }
            con.desconectar(cn);
            return value > 0;

        } catch (SQLException ex) {
            con.desconectar(cn);
            return false;
        }
    
    }

    public List<CadastroItem> consultarPorItem(String modelo, String motor, Integer km, Integer anoModelo, Integer anoFabricacao) {
        Connection cn = con.conexao();
        List<CadastroItem> itemEncontrado = new ArrayList<>();

        ResultSet rs = null;
        try {
            st = cn.prepareStatement("SELECT cadastro_produto.* "
                    + " FROM planomanutencao"
                    + " inner join plano_produto ON planomanutencao.idPlano = plano_produto.fk_idPlano"
                    + " inner join cadastro_produto ON plano_produto.fk_idCodigo =  cadastro_produto.idCodigo"
                    + " WHERE planomanutencao.modelo = ? AND planomanutencao.motor = ? "
                    + "AND planomanutencao.anoFabricacao = ? AND planomanutencao.anoModelo = ? AND planomanutencao.kmManutencao = ?");

            st.setString(1, modelo);
            st.setString(2, motor);
            st.setInt(3, anoFabricacao);
            st.setInt(4, anoModelo);
            st.setInt(5, km);

            rs = st.executeQuery();

            while (rs.next()) {
                    CadastroItem item = new CadastroItem();
                    item.setIdCodigo(rs.getInt("idCodigo"));
                    item.setMarca(rs.getString("marca"));
                    item.setModelo(rs.getString("modelo"));
                    item.setCor(rs.getString("cor"));
                    item.setAnoModelo(rs.getInt("anoModelo"));
                    item.setAnoFabricacao(rs.getInt("anoFabricacao"));
                    item.setDescricaoItem(rs.getString("descricaoItem"));
                    item.setValorUnitario(rs.getDouble("valorUnitario"));

                    itemEncontrado.add(item);

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
        return itemEncontrado;

    }

    public int NoEqualsVeiculoItem(String modelo, String motor, int anoModelo, int anoFabricacao) {
        Connection cn = con.conexao();
        int value = 0;
        try {
            st = cn.prepareStatement("SELECT * FROM veiculo WHERE modelo  = ? AND motor = ? AND anoModelo  = ? AND  anoFabricacao  = ?");
            st.setString(1, modelo);
            st.setString(2, motor);
            st.setInt(3, anoModelo);
            st.setInt(4, anoFabricacao);

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

    public int NoEqualsKitItem(String modelo, String motor, int km, int anoModelo, int anoFabricacao) {
        Connection cn = con.conexao();
        int value = 0;
        try {
            st = cn.prepareStatement("SELECT * FROM planomanutencao WHERE modelo  = ?"
                    + " AND motor = ? AND kmManutencao = ? AND anoModelo  = ? AND  anoFabricacao  = ?");

            st.setString(1, modelo);
            st.setString(2, motor);
            st.setInt(3, km);
            st.setInt(4, anoModelo);
            st.setInt(5, anoFabricacao);

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
}
