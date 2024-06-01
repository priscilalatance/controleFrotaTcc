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
            st = conn.prepareStatement("INSERT INTO usuario VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            st.setString(1, usuarios.getRe());
            st.setString(2, usuarios.getNome());
            st.setString(3, usuarios.getEndereco());
            st.setInt(4, usuarios.getNumero());
            st.setString(5, usuarios.getBairro());
            st.setString(6, usuarios.getCidade());
            st.setString(7, usuarios.getEstado());
            st.setString(8, usuarios.getCep());
            st.setString(9, usuarios.getFuncao());
            st.setString(10, usuarios.getEmail());
            st.setString(11, usuarios.getTelefone());
            st.setString(12, usuarios.getCpf());
            st.setString(13, usuarios.getSenha());
            st.setBoolean(14, usuarios.getInativarUsuario());


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
                usuarios.setNumero(rs.getInt("numero"));
                usuarios.setBairro(rs.getString("bairro"));
                usuarios.setCidade(rs.getString("cidade"));
                usuarios.setEstado(rs.getString("estado"));
                usuarios.setCep(rs.getString("cep"));
                usuarios.setFuncao(rs.getString("perfil"));                                                               
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
    
    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException ex) {

        }
    }

    public boolean alterar(Usuarios usuarios) {
        try {
            st = conn.prepareStatement("UPDATE usuario SET nome = ?, endereco = ?, email = ?,"
                    + " telefone = ?, cpf = ?, senha = ?, inativarUsuario = ?, "
                    + "numero = ?, bairro = ?, cidade = ?, estado = ?, cep = ? , perfil = ? WHERE re = ?");
            st.setString(1, usuarios.getNome());
            st.setString(2, usuarios.getEndereco());
            st.setString(3, usuarios.getEmail());
            st.setString(4, usuarios.getTelefone());
            st.setString(5, usuarios.getCpf());
            st.setString(6, usuarios.getSenha());
            st.setBoolean(7, usuarios.getInativarUsuario());
            st.setInt(8, usuarios.getNumero());
            st.setString(9, usuarios.getBairro());
            st.setString(10, usuarios.getCidade());
            st.setString(11, usuarios.getEstado());
            st.setString(12, usuarios.getCep());
            st.setString(13, usuarios.getFuncao()); 
            st.setString(14, usuarios.getRe());                        
                                                          
            int status = st.executeUpdate();
            return status > 0;
        } catch (SQLException ex) {
            return false;
        }
    }

}
