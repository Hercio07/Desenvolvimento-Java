/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;
import javax.swing.JOptionPane;


public class Emprestimo  {
    private int id_Emprestimo;
    private Livro livEmprestimo;
    private Usuario Usuariodev;
    private Date dataEmprestimo, dataDevolucao;

    public Emprestimo(Livro livEmprestado, Usuario Usuariodev, Date dataEmprestimo, Date dataDevolucao) {
        this.livEmprestimo = livEmprestimo;
        this.Usuariodev = Usuariodev;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }
    public void realizarEmprestimo(){
        if(livEmprestimo.isDisponivel()){
            livEmprestimo.setDisponivel(false);
            JOptionPane.showMessageDialog(null, "Livro Emprestado");
        }else{
            JOptionPane.showMessageDialog(null, "Livro Indisponivel para Emprestimo");
        }
    }
    
    public void realizarDevolucao(){
        livEmprestimo.setDisponivel(true);
        JOptionPane.showMessageDialog(null, "Livro devolvido com Sucesso");
    }
    public Livro getLivEmprestado() {
        return livEmprestimo;
    }

    public void setLivEmprestado(Livro livEmprestado) {
        this.livEmprestimo = livEmprestado;
    }

    public Usuario getUsuariodev() {
        return Usuariodev;
    }

    public void setUsuariodev(Usuario Usuariodev) {
        this.Usuariodev = Usuariodev;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public int getId_Emprestimo() {
        return id_Emprestimo;
    }

    public void setId_Emprestimo(int id_Emprestimo) {
        this.id_Emprestimo = id_Emprestimo;
    }

    public Livro getLivEmprestimo() {
        return livEmprestimo;
    }

    public void setLivEmprestimo(Livro livEmprestimo) {
        this.livEmprestimo = livEmprestimo;
    }
    
    
}
