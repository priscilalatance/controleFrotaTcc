/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Priscila
 */
public class PlanoItemManutencaoDao {

    //Criando a conexão com o banco
    Conectar con = new Conectar();
    Connection cn = con.conexao();
    PreparedStatement st;

    public int incluirItemAoKit(PlanoItemManutencao plano) {
        int status;
        try {

            st = cn.prepareStatement("INSERT INTO plano_item VALUES(?,?,?,?,?,?)");
            st.setString(1, plano.getModelo());
            st.setString(2, plano.getMotor());
            st.setInt(3, plano.getKmManutencao());
            st.setInt(4, plano.getAnoModelo());
            st.setInt(5, plano.getAnoFabricacao());
            st.setInt(6, plano.getIdCodigo());

            status = st.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();
        }
    }

    public Boolean excluir(String modelo, String motor, Integer km, Integer anoModelo, Integer anoFabricacao, Integer idCodigo) {
        try {
            st = cn.prepareStatement("SELECT codigo_Item FROM plano_item WHERE modelo_kit = ? AND motor_kit = ? AND km_kit = ? "
                    + "AND anoModelo_kit = ? AND anoFabricacao_kit = ? AND codigo_Item = ?");
            st.setString(1, modelo);
            st.setString(2, motor);
            st.setInt(3, km);
            st.setInt(4, anoModelo);
            st.setInt(5, anoFabricacao);
            st.setInt(6, idCodigo);

            ResultSet rsCodigo = st.executeQuery();

            if (rsCodigo.next()) {

                st = cn.prepareStatement("DELETE FROM plano_item WHERE modelo_kit = ? AND motor_kit = ? AND km_kit = ? AND anoModelo_kit = ? AND anoFabricacao_kit = ? AND codigo_Item = ?");
                st.setString(1, modelo);
                st.setString(2, motor);
                st.setInt(3, km);
                st.setInt(4, anoModelo);
                st.setInt(5, anoFabricacao);
                st.setInt(6, idCodigo);
                st.executeUpdate();
                return true;

            } else {
                JOptionPane.showMessageDialog(null, "Item não existe para ser excluido");
            }
            return false;
        } catch (SQLException ex) {
            return false;
        }
    }

    public List<CadastroItem> consultarPorItem(String modelo, String motor, Integer km, Integer anoModelo, Integer anoFabricacao) {

        List<CadastroItem> itemEncontrado = new ArrayList<>();

        ResultSet rs = null;
        ResultSet rs1 = null;
        try {
            st = cn.prepareStatement("SELECT codigo_Item "
                    + " FROM plano_item WHERE modelo_kit = ? AND motor_kit = ? AND anoFabricacao_kit = ? AND anoModelo_kit = ? AND km_kit = ?");

            st.setString(1, modelo);
            st.setString(2, motor);
            st.setInt(3, anoFabricacao);
            st.setInt(4, anoModelo);
            st.setInt(5, km);

            rs = st.executeQuery();

            while (rs.next()) {

                st = cn.prepareStatement("SELECT * FROM cadastro_item WHERE idCodigo = ? ");
                st.setInt(1, rs.getInt("codigo_Item"));

                rs1 = st.executeQuery();

                while (rs1.next()) {
                    CadastroItem item = new CadastroItem();
                    item.setIdCodigo(rs1.getInt("idCodigo"));
                    item.setMarca(rs1.getString("marca"));
                    item.setModelo(rs1.getString("modelo"));
                    item.setCor(rs1.getString("cor"));
                    item.setAnoModelo(rs1.getInt("anoModelo"));
                    item.setAnoFabricacao(rs1.getInt("anoFabricacao"));
                    item.setDescricaoItem(rs1.getString("descricaoItem"));
                    item.setValorUnitario(rs1.getDouble("valorUnitario"));

                    itemEncontrado.add(item);
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
        return itemEncontrado;

    }

    public int NoEqualsVeiculoItem( String modelo, String motor, int km, int anoModelo, int anoFabricacao) {
        int value = 0;
        try {
            st = cn.prepareStatement("SELECT * FROM veiculo WHERE marca = ?"
                    + " AND modelo  = ? AND motor = ? AND kmAtual = ? AND anoModelo  = ? AND  anoFabricacao  = ?");
            st.setString(1, modelo);
            st.setString(2, motor);
            st.setInt(3, km);
            st.setInt(4, anoModelo);
            st.setInt(5, anoFabricacao);
            
            ResultSet rs = st.executeQuery();
            if(rs.first()) {
                value = 1;
            } 
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
        }
        
        return value;

    }

    public int NoEqualsKitItem(String modelo, String motor, int km, int anoModelo, int anoFabricacao) {
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

            if(rs.first()) {
                value = 1;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
        }
        return value;
    }
}
