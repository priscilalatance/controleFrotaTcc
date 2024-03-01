package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

// @author Francisco Mariano
public class CadastroItemDao {

    CadastroItem cadItem = new CadastroItem();
    Connection conn;
    PreparedStatement st;

    public CadastroItemDao() {
    }

    public boolean conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/controleFrota", "root", "");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
    }

    public int salvar(CadastroItem cadItem) {
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO cadastro_item VALUES(?,?,?,?,?,?,?,?,?)");

            st.setInt(1, cadItem.getIdCodigo());
            st.setString(2, cadItem.getMarca());
            st.setString(3, cadItem.getModelo());
            st.setString(4, cadItem.getCor());
            st.setInt(5, cadItem.getAnoFabricacao());
            st.setInt(6, cadItem.getAnoModelo());
            st.setString(7, cadItem.getDescricaoItem());
            st.setDouble(8, cadItem.getValorUnitario());
            st.setBoolean(9, cadItem.getPecaUniversal());

            status = st.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();
        }
    }

//    
//    private void id_autoIncremente(int idCodigo){
//        try{
//             st = conn.prepareStatement("SELECT * FROM cadastItem");
//             st.setInt(1, idCodigo);
//            ResultSet rs = st.executeQuery();
//        }catch (SQLException ex) {
//            System.out.println("Verificar campo autoIncremente");
//        }
//    }
//   
    public boolean alterar(CadastroItem cadItem) {
        try {

            st = conn.prepareStatement("UPDATE cadastro_item SET marca = ?, modelo = ?, cor = ?, anoFabricacao = ?, anoModelo  = ?, descricaoItem  = ?, valorUnitario = ?, pecaUniversal = ?  WHERE idCodigo = ?");

            st.setString(1, cadItem.getMarca());
            st.setString(2, cadItem.getModelo());
            st.setString(3, cadItem.getCor());
            st.setInt(4, cadItem.getAnoFabricacao());
            st.setInt(5, cadItem.getAnoModelo());
            st.setString(6, cadItem.getDescricaoItem());
            st.setDouble(7, cadItem.getValorUnitario());
            st.setBoolean(8, cadItem.getPecaUniversal());
            st.setInt(9, cadItem.getIdCodigo());

            int status = st.executeUpdate();
            return status > 0;
        } catch (SQLException ex) {
            return false;
        }

    }

    public CadastroItem consultar(int idCodigo) {
        try {
            st = conn.prepareStatement("SELECT * FROM cadastro_item WHERE idCodigo = ?");
            st.setInt(1, idCodigo);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                cadItem.setIdCodigo(rs.getInt("idCodigo"));
                cadItem.setMarca(rs.getString("marca"));
                cadItem.setModelo(rs.getString("modelo"));
                cadItem.setCor(rs.getString("cor"));
                cadItem.setAnoFabricacao(rs.getInt("anoFabricacao"));
                cadItem.setAnoModelo(rs.getInt("anoModelo"));
                cadItem.setDescricaoItem(rs.getString("descricaoItem"));
                cadItem.setValorUnitario(rs.getDouble("valorUnitario"));
                cadItem.setPecaUniversal(rs.getBoolean("pecaUniversal"));
                return cadItem;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }

    }

    public CadastroItem consultarDescricao(String descricaoItem) {
        try {
            st = conn.prepareStatement("SELECT * FROM cadastro_item WHERE descricaoItem = ?");
            st.setString(1, descricaoItem);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                cadItem.setIdCodigo(rs.getInt("idCodigo"));
                cadItem.setMarca(rs.getString("marca"));
                cadItem.setModelo(rs.getString("modelo"));
                cadItem.setCor(rs.getString("cor"));
                cadItem.setAnoFabricacao(rs.getInt("anoFabricacao"));
                cadItem.setAnoModelo(rs.getInt("anoModelo"));
                cadItem.setDescricaoItem(rs.getString("descricaoItem"));
                cadItem.setValorUnitario(rs.getDouble("valorUnitario"));
                cadItem.setPecaUniversal(rs.getBoolean("pecaUniversal"));
                return cadItem;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }

    }

    public List<CadastroItem> consultarPorDescricao(String descricao) {
        List<CadastroItem> itensEncontrados = new ArrayList<>();
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT * FROM cadastro_item WHERE descricaoItem LIKE ?");
            st.setString(1, "%" + descricao + "%");
            rs = st.executeQuery();
            while (rs.next()) {
                CadastroItem cadItem = new CadastroItem(); // Criar um novo objeto em cada iteração
                cadItem.setIdCodigo(rs.getInt("idCodigo"));
                cadItem.setMarca(rs.getString("marca"));
                cadItem.setModelo(rs.getString("modelo"));
                cadItem.setCor(rs.getString("cor"));
                cadItem.setAnoFabricacao(rs.getInt("anoFabricacao"));
                cadItem.setAnoModelo(rs.getInt("anoModelo"));
                cadItem.setDescricaoItem(rs.getString("descricaoItem"));
                double valorUnitario = rs.getDouble("valorUnitario");
                cadItem.setValorUnitario(valorUnitario); // Definir o valor unitário diretamente
                cadItem.setPecaUniversal(rs.getBoolean("pecaUniversal"));
                itensEncontrados.add(cadItem);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(); // Você pode ajustar isso conforme necessário para lidar com a exceção
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
        return itensEncontrados;
    }

    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException ex) {

        }
    }

}
