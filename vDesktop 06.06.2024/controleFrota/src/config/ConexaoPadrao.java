/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Priscila
 */
public class ConexaoPadrao {
    
    Connection conn;
    
    public boolean conectar() {
            
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/controleFrota", "root", "");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
    }
        
    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException ex) {

        }
    }
}
