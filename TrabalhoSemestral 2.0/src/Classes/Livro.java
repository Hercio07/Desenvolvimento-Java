/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Dell
 */
public class Livro {
 private int idLivro;
 private String titulo, autor,genero; 
 private int anoPub,QuantEst;
 private int preco;
 private boolean disponivel;

    public Livro(int idLivro, String titulo, String autor, String genero, int anoPub, int QuantEst, int preco, boolean disponivel) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anoPub = anoPub;
        this.QuantEst = QuantEst;
        this.preco = preco;
        this.disponivel = disponivel;
    }

    public Livro() {
    }
    
    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }


    

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int id) {
        this.idLivro = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoPub() {
        return anoPub;
    }

    public void setAnoPub(int anoPub) {
        this.anoPub = anoPub;
    }

    public int getQuantEst() {
        return QuantEst;
    }

    public void setQuantEst(int QuantEst) {
        this.QuantEst = QuantEst;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
 
 
}
