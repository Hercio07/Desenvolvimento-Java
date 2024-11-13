/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.time.LocalTime;
import javax.swing.JOptionPane;

/**
 *
 * @author Dioneria Matavele
 */
public class Reserva {
   private int id;
   private Livro livro;
   private Usuario usuario;
   private LocalTime dataReserva;

    public Reserva(int id, Livro livro, Usuario usuario, LocalTime dataReserva) {
        this.id = id;
        this.livro = livro;
        this.usuario = usuario;
        this.dataReserva = dataReserva;
    }
   
    
    public void realizarReserva(){
        if(livro.isDisponivel()){
            livro.setDisponivel(false);
            JOptionPane.showMessageDialog(null, "Livro reservado com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Livro nao esta disponivel para reserva");
        }
    }
   public void cancelarReserva(){
       livro.setDisponivel(true);
       
   }
}
