/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Dell
 */
public class Usuario {
    private int idCli,telefone;
    private String nome,email,password;
    
    public Usuario(String nome, String password){

        this.email = email;
        this.password = password;
    }
    public Usuario(String nome, int telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.nome = nome;

    }

    public Usuario() {
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int id) {
        this.idCli = id;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
