

package br.com.gustavo.duarte.trabalhoedd2bim.atv02;

import java.util.Scanner;


public class TrabalhoEDD2BimAtv02 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        SistemaDeAtendimento sistema = new SistemaDeAtendimento();

        
        while (true) {
            System.out.println("\nSelecione uma opção:");
            System.out.println("1 - Adicionar cliente");
            System.out.println("2 - Chamar próximo cliente");
            System.out.println("\n0 - Sair");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 0:
                    System.out.println("Saindo");
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    scanner.nextLine();
                    String nome = scanner.nextLine();
                    System.out.print("Digite o ano de nascimento do cliente: ");
                    int anoNascimento = scanner.nextInt();
                    sistema.adicionarCliente(nome, anoNascimento);
                    break;
                case 2:
                    sistema.chamarProximoCliente();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
