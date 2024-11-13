/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TrabalhoFila;

import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {
        
        int opcao;
        Fila paciente = new Fila();
        ListaLigada li = new ListaLigada();
         Fila consulta = new Fila();

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("========Menu========");
            System.out.println("1. Consulta");
            System.out.println("2. Pacientes");
            System.out.println("0. Sair");
            opcao = scan.nextInt();

            // Inicio do switch para opções do menu principal
            switch (opcao) {
                case 1: //Menu para consultas
                    System.out.println("======Consulta======");
                    System.out.println("1. Consulta Marcada");
                    System.out.println("2. Agendar Consulta");
                    System.out.println("3. Atender Consulta");
                    opcao = scan.nextInt();
                    ;
                    // Inicio do switch para opçoes do menu de consultas
                    switch (opcao) {
                        case 1:
                            // metodo metodo para listar a consulta seguinte
                                System.out.println("Consulta a seguir: "+consulta.get());
                            break;
                        case 2:
                            // metodo para agendar consulta
                            System.out.println("Agende a consulta");
                            String consult = scan.next();
                            consulta.adicionar(consult);
                            
                            break;
                        case 3: 
                            consulta.remover();
                            System.out.println(consulta.get()+" Efectuada com sucesso!");
                            
                    }
                    break; // Fim do switch para menu de consultas

                case 2: // Menu para pacientes
                    System.out.println("======Paciente======");
                    System.out.println("1. Adicionar Paciente");
                    System.out.println("2. Pesquisar Paciente");
                    System.out.println("3. Lista de Pacientes");
                    System.out.println("4. Atender Paciente");
                    opcao = scan.nextInt();
                    //Inicio do switch para opcoes do menu de pacientes
                    switch (opcao) {
                        case 1:
                          
                            // metodo para adicionar paciente
                            System.out.println("Adicione o paciente na Fila");
                            String add = scan.next();
                            paciente.adicionar(add);
                          
                            
                             
                            break;
                        case 2:
                            // metodo para pesquisar
                            System.out.println("Pesquise o paciente que deseja encontrar na fila");
                            String pesquisa = scan.next();
                             for(int i = 0; i<= li.getTamanho(); i++){
                                 if(paciente.get().equalsIgnoreCase(pesquisa)){
                                System.out.println(paciente.get()+ "E o primeiro da fila");
                                 }else{
                                   System.out.println("Paciente nao encontrado"); 
                                 }
                            }
                            
                            break;
                        case 3:
                              // metodo para listar paciente a seguir
                               System.out.println("Paciente a seguir");
                               System.out.println(paciente.get()+"\n");
                            
                            break;
                        case 4: 
                            // metodo para atender o primeiro paciente (remove)
                            paciente.remover();
                            System.out.println(paciente.get()+" foi Atendido!");
                            ;
                            break;
                    } //Fim do switch para opcoes do menu de pacientes
                    ;
                    break;
                case 0:
                    break;
            } //Fim do switch para opcoes do menu principal
        } while (opcao != 0);
    }
}


 
