

package br.com.gustavo.duarte.trabalhoeed2bim.atv03;

import java.util.Scanner;


public class TrabalhoEED2BimAtv03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PilhaDeLivros pilha = new PilhaDeLivros(5);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Listar livros");
            System.out.println("3. Retirar livro");
            System.out.println("4. Mostrar livro no topo");
            System.out.println("5. Sair\n");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do livro:");
                    scanner.nextLine();
                    String livro = scanner.nextLine();
                    pilha.adicionarLivro(livro);
                    break;
                case 2:
                    pilha.listarLivros();
                    break;
                case 3:
                    pilha.retirarLivro();
                    break;
                case 4:
                    pilha.mostrarTopo();
                    break;
                case 5:
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
