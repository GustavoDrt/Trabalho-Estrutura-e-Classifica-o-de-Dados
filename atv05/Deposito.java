
package br.com.gustavo.duarte.trabalhoedd2bim.atv05;

import java.util.Scanner;

public class Deposito {
    private PilhaDeProdutos[] pilhas;

    public Deposito(int tamanhoPilha, int numeroPilhas) {
        pilhas = new PilhaDeProdutos[numeroPilhas];
        for (int i = 0; i < numeroPilhas; i++) {
            pilhas[i] = new PilhaDeProdutos(tamanhoPilha);
        }
    }

    public void mostrarPilhas() {
        for (int i = 0; i < pilhas.length; i++) {
            System.out.println("Pilha " + (i + 1) + ":");
            pilhas[i].mostrarPilha();
            System.out.println();
        }
    }

    public void selecionarPilha(int numeroPilha, Scanner scanner) {
        if (numeroPilha > 0 && numeroPilha <= pilhas.length) {
            PilhaDeProdutos pilhaSelecionada = pilhas[numeroPilha - 1];
            System.out.println("Pilha " + numeroPilha + " selecionada.");

            while (true) {
                System.out.println("\nEscolha uma opção:");
                System.out.println("1. Adicionar produto");
                System.out.println("2. Despachar produto");
                System.out.println("3. Mostrar pilha");
                System.out.println("4. Voltar");

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
                        pilhaSelecionada.push(produto);
                        break;
                    case 2:
                        pilhaSelecionada.pop();
                        break;
                    case 3:
                        pilhaSelecionada.mostrarPilha();
                        break;
                    case 4:
                        System.out.println("Voltando");
                        return;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            }
        } else {
            System.out.println("Pilha inválida. Tente novamente.");
        }
    }        
}
    

