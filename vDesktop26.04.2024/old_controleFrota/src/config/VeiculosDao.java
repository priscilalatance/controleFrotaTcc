package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author Priscila
 */
public class VeiculosDao {

    public VeiculosDao() {
    }

    Veiculos veiculos = new Veiculos();
    Connection conn;
    PreparedStatement st;
    DateTimeFormatter formatoEntradaBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter formatoSaidaAmericano = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public boolean conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/controleFrota", "root", "");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
    }

    public int salvar(Veiculos veiculos) {

        int status;
        try {
            st = conn.prepareStatement("INSERT INTO veiculo VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            st.setString(1, veiculos.getPlaca());
            st.setString(2, veiculos.getMarca());
            st.setString(3, veiculos.getModelo());
            st.setString(4, veiculos.getCor());
            st.setString(5, veiculos.getCombustivel());
            st.setString(6, veiculos.getTipoVeiculo());
            st.setInt(7, veiculos.getAnoFabricacao());
            st.setInt(8, veiculos.getAnoModelo());
            st.setInt(9, veiculos.getKmAtual());
            st.setString(10, veiculos.getCrv());
            st.setString(11, veiculos.getRenavam());
            st.setString(12, veiculos.getChassi());
            st.setString(13, veiculos.getMotor());
            st.setBoolean(14, veiculos.getInativarVeiculo());
            st.setDate(15, java.sql.Date.valueOf(veiculos.getDataCadastro().format(formatoSaidaAmericano)));
            st.setDate(16, java.sql.Date.valueOf(veiculos.getDataCompra().format(formatoSaidaAmericano)));
            st.setDate(17, java.sql.Date.valueOf(veiculos.getVencimentoGarantia().format(formatoSaidaAmericano)));
            st.setInt(18, 0);

            status = st.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();
        }

    }

    public Veiculos consultar(String placa) {
        try {
            st = conn.prepareStatement("SELECT * FROM veiculo WHERE placa = ?");
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
                veiculos.setKmAtual(rs.getInt("kmAtual"));
                veiculos.setDataCompra(rs.getDate("dataCompra").toLocalDate());
                veiculos.setVencimentoGarantia(rs.getDate("vencimentoGarantia").toLocalDate());
                veiculos.setCrv(rs.getString("crv"));
                veiculos.setRenavam(rs.getString("renavam"));
                veiculos.setChassi(rs.getString("chassi"));
                veiculos.setMotor(rs.getString("motor"));
                veiculos.setInativarVeiculo(rs.getBoolean("inativarVeiculo"));

                return veiculos;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }

    }

    public boolean excluir(String placa) {
        try {
            st = conn.prepareStatement("DELETE FROM veiculo WHERE placa = ?");
            st.setString(1, placa);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }

    }

    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException ex) {

        }
    }

    public boolean alterar(Veiculos veiculos) {
        try {
            st = conn.prepareStatement("UPDATE veiculo SET  marca = ?, modelo = ?, cor = ?, combustivel = ?, tipoVeiculo = ?, anoFabricacao = ?, anoModelo  = ?, kmAtual  = ?, crv = ? , renavam = ?,chassi  = ?, motor  = ?, inativarVeiculo  = ?, dataCadastro = ?, dataCompra = ?, vencimentoGarantia = ?  WHERE placa = ?");

            st.setString(1, veiculos.getMarca());
            st.setString(2, veiculos.getModelo());
            st.setString(3, veiculos.getCor());
            st.setString(4, veiculos.getCombustivel());
            st.setString(5, veiculos.getTipoVeiculo());
            st.setInt(6, veiculos.getAnoFabricacao());
            st.setInt(7, veiculos.getAnoModelo());
            st.setInt(8, veiculos.getKmAtual());
            st.setString(9, veiculos.getCrv());
            st.setString(10, veiculos.getRenavam());
            st.setString(11, veiculos.getChassi());
            st.setString(12, veiculos.getMotor());
            st.setBoolean(13, veiculos.getInativarVeiculo());
            st.setDate(14, java.sql.Date.valueOf(veiculos.getDataCadastro().format(formatoSaidaAmericano)));
            st.setDate(15, java.sql.Date.valueOf(veiculos.getDataCompra().format(formatoSaidaAmericano)));
            st.setDate(16, java.sql.Date.valueOf(veiculos.getVencimentoGarantia().format(formatoSaidaAmericano)));
            st.setString(17, veiculos.getPlaca());

            int status = st.executeUpdate();
            return status > 0;
        } catch (SQLException ex) {
            return false;
        }

    }

    public int NoEqualsPlaca(String placa) {
        int value = 0;
        try {
            st = conn.prepareStatement("SELECT * FROM veiculo WHERE placa = ?");
            st.setString(1, placa);
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
