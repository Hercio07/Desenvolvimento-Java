/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Classes;

/**
 *
 * @author Dell
 */
public interface Biblioteca {
    
    public void EmprestarLivro(Livro liv, Usuario usu );
    public void DevolverLivro(Livro liv, Usuario usu);
}
