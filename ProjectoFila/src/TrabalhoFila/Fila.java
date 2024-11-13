/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabalhoFila;

/**
 *
 * @author Dell
 */
public class Fila {
    private ListaLigada lista;
    
    public Fila(){
        this.lista = new ListaLigada();
    }
    
    public void adicionar(String novoValor){
        this.lista.adicionar(novoValor);
    }
    
    public void remover(){
        if(this.lista.getPrimeiro() == null){
          throw new NullPointerException("Impossivel apagar porque nao existe nenhum valor na lista");
        }else{
          this.lista.remover(this.get());
        }
    
    }
    
    public String get(){
        if (this.lista.getPrimeiro() == null){
            throw new NullPointerException("Nao existe nenhum valor na lista");
        }else{
        return this.lista.getUltimo().getValor();
    }
    }
}
