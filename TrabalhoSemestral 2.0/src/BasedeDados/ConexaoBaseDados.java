/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BasedeDados;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Dell
 */
public class ConexaoBaseDados {
        // mettodo reaponsavel para estabelecer a conexao com o banco de dados 
    public static Connection conector() {
        Connection conexao = null;
        // A linha abaixo chama o driver
        String driver = "com.mysql.jdbc.Driver";
        // Armazenando informacoes referentes ao banco de dados
        final String url = "jdbc:mysql://localhost:3306/trabalho";
        final String user = "root";
        final String password = "";
        // Estabelecendo a conexao com o banco de dados
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            
            return null;
        }
    }
}
