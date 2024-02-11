package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

// @author Francisco Mariano
public class UsuariosDao {

    Usuarios usuarios = new Usuarios();
    Connection conn;
    PreparedStatement st;

    public UsuariosDao() {
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

    public int salvar(Usuarios usuarios) {
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO usuario VALUES(?,?,?,?,?,?,?,?)");
            st.setString(1, usuarios.getRe());
            st.setString(2, usuarios.getNome());
            st.setString(3, usuarios.getEndereco());
            st.setString(4, usuarios.getEmail());
            st.setString(5, usuarios.getTelefone());
            st.setString(6, usuarios.getCpf());
            st.setString(7, usuarios.getSenha());
            st.setBoolean(8, usuarios.getInativarUsuario());

            status = st.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();
        }
    }

    public Usuarios consultar(String re) {
        try {
            st = conn.prepareStatement("SELECT * FROM usuario WHERE re = ?");
            st.setString(1, re);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                usuarios.setRe(rs.getString("re"));
                usuarios.setNome(rs.getString("nome"));
                usuarios.setEndereco((rs.getString("endereco")));
                usuarios.setEmail(rs.getString("email"));
                usuarios.setTelefone(rs.getString("telefone"));
                usuarios.setCpf(rs.getString("cpf"));
                usuarios.setSenha(rs.getString("senha"));
                usuarios.setInativarUsuario(rs.getBoolean("inativarUsuario"));

                return usuarios;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean excluir(String re) {
        try {
            st = conn.prepareStatement("DELETE FROM usuario WHERE re = ?");
            st.setString(1, re);
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

    public boolean alterar(Usuarios usuarios) {
        try {
            st = conn.prepareStatement("UPDATE usuario SET nome = ?, endereco = ?, email = ?, telefone = ?, cpf = ?, senha = ?, inativarUsuario = ? WHERE re = ?");
            st.setString(1, usuarios.getNome());
            st.setString(2, usuarios.getEndereco());
            st.setString(3, usuarios.getEmail());
            st.setString(4, usuarios.getTelefone());
            st.setString(5, usuarios.getCpf());
            st.setString(6, usuarios.getSenha());
            st.setBoolean(7, usuarios.getInativarUsuario());
            st.setString(8, usuarios.getRe());

            int status = st.executeUpdate();
            return status > 0;
        } catch (SQLException ex) {
            return false;
        }
    }

}
