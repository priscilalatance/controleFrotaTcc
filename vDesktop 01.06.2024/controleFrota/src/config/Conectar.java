/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates

 * and open the template in the editor.
 */
package config;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


 // @author Francisco Mariano
 // @author Priscila
 
public class Conectar {
    
    Connection conect = null;

     
    //Conexão Local
    public Connection conexao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://localhost/controleFrota", "root", ""); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar!!" + e);
        }
        return conect;
    }
    
        public void desconectar(Connection conn) {
        try {
            conn.close();
        } catch (SQLException ex) {

        }
    }
    
}