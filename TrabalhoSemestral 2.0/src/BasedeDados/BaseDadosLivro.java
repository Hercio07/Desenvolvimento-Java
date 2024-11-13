/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BasedeDados;

import Classes.Emprestimo;
import Classes.Livro;
import Classes.Usuario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class BaseDadosLivro {
     Connection conexao;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Livro> lista = new ArrayList<>();
    ArrayList<Usuario> list = new ArrayList<>();
    //cadastrar livros   

    public void cadastrarLivros(Livro l) {
        conexao = new ConexaoBaseDados().conector();
        String sql = "insert into tblivro(titulo,genero,anoPublicacao,autor,precoEmprestimo,quantEstoque) VALUES(?,?,?,?,?,?,?)";
        try {
            pstm = conexao.prepareStatement(sql);
            
            pstm.setString(1, l.getTitulo());
            pstm.setString(2, l.getAutor());
            pstm.setString(3, l.getGenero());
            pstm.setInt(4, l.getAnoPub());
            pstm.setInt(5, l.getQuantEst());
            pstm.setDouble(6, l.getPreco());
            pstm.setBoolean(7, l.isDisponivel());
            


            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            System.out.println("Erro aconteceu na classe LivroBaseDados metodo cadastrardados " + erro.getMessage());
        }
    }
    
    public ArrayList<Livro> listarLivros() {
        conexao = new ConexaoBaseDados().conector();
        String sql = "select * from tblivro";

        try {
            pstm = conexao.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Livro l4 = new Livro();
                
                l4.setTitulo(rs.getString("titulo"));
                l4.setGenero(rs.getString("genero"));
                l4.setAnoPub(rs.getInt("anoPublicacao"));
                l4.setAutor(rs.getString("autor"));
                l4.setPreco(rs.getInt("precoEmprestimo"));
                l4.setQuantEst(rs.getInt("quantEstoque"));
                
                l4.setDisponivel(rs.getBoolean("disponivel"));

                lista.add(l4);

            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "BaseDados no metodo listar " + erro.getMessage());
        }
        return lista;

    }
    
    // deletar livros
    public void deletarLivros(Livro bi) {
        conexao = new ConexaoBaseDados().conector();
        try {
            String sql = "DELETE * FROM tblivro WHERE titulo = ?";
            Livro p = new Livro();
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, "titulo");
            rs = pstm.executeQuery();

            pstm.setString(1, p.getTitulo());
            pstm.setString(2, p.getAutor());
            pstm.setString(3, p.getGenero());
            pstm.setDouble(4, p.getPreco());
            pstm.setInt(5, p.getQuantEst());
            pstm.setInt(6, p.getAnoPub());
            pstm.setBoolean(7, p.isDisponivel());

            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar" + erro);

        }

    }  
    public Livro PesquisarLivro(String titulo) {
         conexao = new ConexaoBaseDados().conector();
        try {
            String sql = "SELECT * FROM tblivro WHERE bi = ?";
            Livro p = new Livro();
            
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, titulo);
            rs = pstm.executeQuery();

            rs.first();
            p.setIdLivro(rs.getInt("id_livro"));
            p.setTitulo(rs.getString("titulo"));
            p.setAutor(rs.getString("autor"));
            p.setGenero(rs.getString("genero"));
            p.setPreco(rs.getInt("preco"));
            p.setDisponivel(rs.getBoolean("di0sponivel"));
            
            return p;

        } catch (Exception erro) {
            return null;
        }

    }
    public void EmprestarLivro(int userId, int bookId, Date DataEntrega) {
    try (Connection connection = ConexaoBaseDados.conector();
         PreparedStatement statement = connection.prepareStatement(
                 "UPDATE tblivro SET available = FALSE WHERE id_livro = ?")) {
        statement.setInt(1, bookId);
        int rowsAffected = statement.executeUpdate();

        if (rowsAffected > 0) {
            try (PreparedStatement insertStatement = connection.prepareStatement(
                    "INSERT INTO tbEmprestimo (id_usuario, id_livro,data_emprestimo) VALUES (?,?, ?)")) {
                insertStatement.setInt(1, userId);
                insertStatement.setInt(2, bookId);
                insertStatement.setDate(3, DataEntrega);
                insertStatement.executeUpdate();
                System.out.println("Livro emprestado com sucesso!");
            }
        } else {
            System.out.println("O livro não está disponível para empréstimo.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
public void ReservarLivro(int userId, int bookId, Date DataReserva) {
    try (Connection connection = ConexaoBaseDados.conector();
         PreparedStatement statement = connection.prepareStatement(
                 "INSERT INTO tbReserva (user_id, book_id, data_reserva) VALUES (?,?, ?)")) {
        statement.setInt(1, userId);
        statement.setInt(2, bookId);
        statement.setDate(2, DataReserva);
        statement.executeUpdate();
        System.out.println("Livro reservado com sucesso!");
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
public void devolverLivro(int loanId, int bookId, Date dataDevolucao) {
    try (Connection connection = ConexaoBaseDados.conector();
         PreparedStatement statement = connection.prepareStatement(
                 "DELETE FROM tbEmprestimo WHERE id_livro = ?")) {
        statement.setInt(1, loanId);
        int rowsAffected = statement.executeUpdate();

        if (rowsAffected > 0) {
            try (PreparedStatement updateStatement = connection.prepareStatement(
                    "UPDATE tblivro SET disponivel = TRUE WHERE id_livro = ?")) {
                updateStatement.setInt(1, bookId);
                updateStatement.setDate(2, dataDevolucao);

                updateStatement.executeUpdate();
                System.out.println("Livro devolvido com sucesso!");
            }
        } else {
            System.out.println("O ID de empréstimo fornecido é inválido.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}



}
