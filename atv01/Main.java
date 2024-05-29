package br.com.gustavo.duarte.trabalhoecd2bim.atv01;


import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(20);
        Scanner scanner = new Scanner(System.in);
        int escolha;

       
        while (true) {
            System.out.println("\nSistema de Fila de Clínica");
            System.out.println("1. Adicionar paciente");
            System.out.println("2. Chamar próximo paciente");
            System.out.println("3. Sair");
            System.out.print("Entre com a sua escolha: ");
            escolha = scanner.nextInt();
            switch (escolha) {
                case 1 : {
                    System.out.print("Entre com o nome do paciente: ");
                    scanner.nextLine();
                    String paciente = scanner.nextLine();
                    fila.enqueue(paciente);
                    System.out.println(paciente + " adicionado à fila.");
                    break;
                }
                case 2 : {
                    if (fila.isEmpty()) {
                        System.out.println("Fila vazia.");
                    } else {
                        String proximoPaciente = fila.dequeue();
                        System.out.println("Próximo paciente: " + proximoPaciente);
                    }
                    break;
                }
                case 3:
                     System.exit(0);
                     break;
                
                default : System.out.println("Escolha inválida. Por favor, tente novamente.");
            }
            
        }

       
    }
}