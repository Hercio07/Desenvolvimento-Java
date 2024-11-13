/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BasedeDados;


import Classes.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class UsuarioBD {
     Connection conexao;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Usuario> list = new ArrayList<>();
    

     public void cadastrarUsuario(Usuario u) {
        conexao = new ConexaoBaseDados().conector();
        String sql = "INSERT INTO tbclientes(id_usuario, nomeCli, telefoneCli,emailCli) VALUES(?,?,?,?)";
        try {
            
            pstm = conexao.prepareStatement(sql);
            pstm.setInt(1, u.getIdCli());
            pstm.setString(2, u.getNome());
            pstm.setInt(2, u.getTelefone());
            pstm.setString(2, u.getEmail());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            System.out.println("Erro aconteceu na classe UsuarioBD metodo cadastrarUsuario " + erro.getMessage());
        }
    }
    
    public ArrayList<Usuario> listarUsuarios() {
        conexao = new ConexaoBaseDados().conector();
        String sql = "select * from tbclientes";

        try {
            pstm = conexao.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                
                Usuario us = new Usuario();
                us.setIdCli(rs.getInt("id_Cli"));
                us.setNome(rs.getString("nomeCli"));
                us.setTelefone(rs.getInt("telefoneCli"));
                us.setEmail(rs.getString("emailCli"));

                list.add(us);

            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioBD no metodo listarUsuario " + erro.getMessage());
        }
        return list;

    }
    
    public void cadastrarConta(Usuario u) {
        conexao = new ConexaoBaseDados().conector();
        String sql = "INSERT INTO tbusuarios(idUser,usuario,senha) VALUES(?,?,?)";
        try {
            
            pstm = conexao.prepareStatement(sql);
            pstm.setInt(1, u.getIdCli());
            pstm.setString(2, u.getNome());
            pstm.setString(3, u.getPassword());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            System.out.println("Erro aconteceu na classe UsuarioBD metodo cadastrardados " + erro.getMessage());
        }
    }
    
    public  boolean login(String username, String password) throws SQLException{
        String sql = "SELECT * FROM tbusuarios WHERE usuario = ? AND senha = ? ";
        PreparedStatement statement  = conexao.prepareStatement(sql);
         try {

        statement.setString(1, username);
        statement.setString(2, password);

        ResultSet resultSet = statement.executeQuery();

        return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
         return false;
    }

    
}
