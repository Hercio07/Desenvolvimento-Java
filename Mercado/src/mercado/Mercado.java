/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mercado;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Mercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto p1 = new Produto("Farinha de Trigo", 70, 50);
        Produto p2 = new Produto("Arroz", 1200, 30);
        Produto p3 = new Produto("Aveia", 200, 20);
        Produto p4 = new Produto("Feijao", 150, 100);

        Scanner scan = new Scanner(System.in);

        ArrayList<Item> list = new ArrayList<Item>();
        Item itens1 = new Item(p1, 3);
        Item itens2 = new Item(p2, 1);
        Item itens3 = new Item(p3, 1);
        Item itens4 = new Item(p4, 1);

        list.add(itens1);
        list.add(itens2);
        list.add(itens3);
        list.add(itens4);


        System.out.println("1.Lista de Produtos");
        System.out.println("2.Comprar Produtos");

        System.out.println("Escolha uma opcao");
        int opcao = scan.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Produtos disponiveis");

                System.out.println(p1.getName());
                System.out.println(p1.getPrice());
                System.out.println(p1.getQuantityInStock());

                System.out.println(p2.getName());
                System.out.println(p2.getPrice());
                System.out.println(p2.getQuantityInStock());

                System.out.println(p3.getName());
                System.out.println(p3.getPrice());
                System.out.println(p3.getQuantityInStock());
                break;

            case 2:
                System.out.println("Insira o nome do produto");
                String nome = scan.next();
                
                System.out.println("Insira o valor que tem a pagar");
                double valor= scan.nextDouble();

                System.out.println("Insira a quantidade");
                int quantidade = scan.nextInt();
             
                System.out.println("Insira o tipo de pagamento que deseja");
                String tipoPagamento = scan.next();
                
                Produto p5 = new Produto(nome, valor , quantidade);
                Item itens5 = new Item(p5, 1);
               
                for(int i=0;i<list.size();i++){
                Client cl1 = new Client("Clayton BAzar","850752538");
                Client cl2 = new Client("Lurdes ","84756964"); 
               // System.out.println(compra1.Pagamento(p5,preco);
                System.out.println(cl1.processPayment());
                }
                

        }
    }
    
}
