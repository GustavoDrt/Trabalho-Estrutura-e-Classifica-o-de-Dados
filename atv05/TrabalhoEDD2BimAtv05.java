

package br.com.gustavo.duarte.trabalhoedd2bim.atv05;

import java.util.Scanner;


public class TrabalhoEDD2BimAtv05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deposito deposito = new Deposito(10, 5);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Selecionar pilha");
            System.out.println("2. Mostrar pilhas");
            System.out.println("3. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o número da pilha:");
                    int numeroPilha = scanner.nextInt();
                    deposito.selecionarPilha(numeroPilha, scanner);
                    break;
                case 2:
                    deposito.mostrarPilhas();
                    break;
                case 3:
                    System.out.println("Saindo");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
    
}
