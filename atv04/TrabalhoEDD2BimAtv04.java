

package br.com.gustavo.duarte.trabalhoedd2bim.atv04;

import java.util.Scanner;


public class TrabalhoEDD2BimAtv04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PilhaDeProdutos pilha = new PilhaDeProdutos(10);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Enviar produto");
            System.out.println("3. Mostrar pilha");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o código do produto:");
                    scanner.nextLine();
                    String codProduto = scanner.nextLine();
                    System.out.println("Digite a descrição do produto:");
                    String descricao = scanner.nextLine();
                    System.out.println("Digite a data de entrada do produto:");
                    String dataEntrada = scanner.nextLine();
                    System.out.println("Digite a origem do produto:");
                    String origem = scanner.nextLine();
                    System.out.println("Digite o destino do produto:");
                    String destino = scanner.nextLine();

                    Produto produto = new Produto(codProduto, descricao, dataEntrada, origem, destino);
                    pilha.push(produto);
                    break;
                case 2:
                    pilha.pop();
                    break;
                case 3:
                    pilha.mostrarPilha();
                    break;
                case 4:
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
