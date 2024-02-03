package config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Priscila
 */
public class PlanoManutencaoDao {

    //Criando a conexão com o banco
    Conectar con = new Conectar();
    Connection cn = con.conexao();
    PreparedStatement st;

    public int incluirKit(PlanoManutencao plano) {
        int status;
        try {

            st = cn.prepareStatement("INSERT INTO planomanutencao VALUES(?,?,?,?,?,?,?)");
            st.setString(1, plano.getMarca());
            st.setString(2, plano.getModelo());
            st.setString(3, plano.getMotor());
            st.setInt(4, plano.getKmManutencao());
            st.setInt(5, plano.getAnoModelo());
            st.setInt(6, plano.getAnoFabricacao());
            st.setDouble(7, plano.getValorTotal());
            status = st.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();
        }
    }

    public boolean alterar(PlanoManutencao plano) {

        try {
            st = cn.prepareStatement("SELECT marca FROM planomanutencao WHERE modelo = ?"
                    + " AND motor  = ? AND kmManutencao = ? AND anoModelo  = ? AND  anoFabricacao  = ?");
            st.setString(1, plano.getModelo());
            st.setString(2, plano.getMotor());
            st.setInt(3, plano.getKmManutencao());
            st.setInt(4, plano.getAnoModelo());
            st.setInt(5, plano.getAnoFabricacao());

            ResultSet rsMarca = st.executeQuery();

            if (rsMarca.next()) {

                if (!rsMarca.getString("marca").equals(plano.getMarca())) {

                    st = cn.prepareStatement("UPDATE planomanutencao SET  marca = ? WHERE modelo = ?"
                            + " AND motor  = ? AND kmManutencao = ? AND anoModelo  = ? AND  anoFabricacao  = ?");

                    st.setString(1, plano.getMarca());
                    st.setString(2, plano.getModelo());
                    st.setString(3, plano.getMotor());
                    st.setInt(4, plano.getKmManutencao());
                    st.setInt(5, plano.getAnoModelo());
                    st.setInt(6, plano.getAnoFabricacao());

                    int status = st.executeUpdate();
                    return status > 0;

                } else {
                    return false;
                }
            }
        } catch (SQLException ex) {
            return false;
        }
        return false;
    }

    public List<PlanoManutencao> consultarKit() {
        List<PlanoManutencao> kitDisponivel = new ArrayList<>();

        try {
            st = cn.prepareStatement("SELECT* FROM planomanutencao WHERE modelo = ?"
                    + " AND motor  = ? AND marca = ? AND anoModelo  = ? AND  anoFabricacao  = ?");

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                PlanoManutencao plano = new PlanoManutencao();
                plano.setMarca(rs.getString("marca"));
                plano.setModelo(rs.getString("modelo"));
                plano.setMotor(rs.getString("motor"));
                plano.setAnoModelo(rs.getInt("anoModelo"));
                plano.setAnoFabricacao(rs.getInt("anoFabricacao"));
                plano.setKmManutencao(rs.getInt("kmManutencao"));
                plano.setValorTotal(rs.getDouble("valorTotal"));
                kitDisponivel.add(plano);
            }

        } catch (SQLException ex) {
        }
        return kitDisponivel;
    }

    public List<PlanoManutencao> consultarPorTipoVeiculo(String marca, String modelo, String motor, Integer anoModelo, Integer anoFabricacao) {
        List<PlanoManutencao> planoEncontrado = new ArrayList<>();

        ResultSet rs = null;
        try {
            st = cn.prepareStatement("SELECT marca, modelo, motor, kmManutencao, anoModelo, anoFabricacao, valorTotal"
                    + " FROM planomanutencao WHERE marca = ? AND modelo = ? AND motor = ? AND anoFabricacao = ? AND anoModelo = ?");

            st.setString(1, marca);
            st.setString(2, modelo);
            st.setString(3, motor);
            st.setInt(4, anoFabricacao);
            st.setInt(5, anoModelo);

            rs = st.executeQuery();
            while (rs.next()) {
                PlanoManutencao plano = new PlanoManutencao();
                plano.setMarca(marca);
                plano.setMarca(rs.getString("marca"));
                plano.setModelo(rs.getString("modelo"));
                plano.setMotor(rs.getString("motor"));
                plano.setAnoModelo(rs.getInt("anoModelo"));
                plano.setAnoFabricacao(rs.getInt("anoFabricacao"));
                plano.setKmManutencao(rs.getInt("kmManutencao"));
                plano.setValorTotal(rs.getDouble("valorTotal"));
                planoEncontrado.add(plano);
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
        return planoEncontrado;
    }
}
