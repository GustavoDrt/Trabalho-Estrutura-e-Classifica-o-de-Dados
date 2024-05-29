
package br.com.gustavo.duarte.trabalhoedd2bim.atv05;


class PilhaDeProdutos {
    private Produto[] pilha;
    private int posicaoTopo;

    public PilhaDeProdutos(int tamanho) {
        pilha = new Produto[tamanho];
        posicaoTopo = -1;
    }

    public void push(Produto produto) {
        if (!isFull()) {
            pilha[++posicaoTopo] = produto;
            System.out.println("Produto adicionado: " + produto.getDescricao());
        } else {
            System.out.println("Pilha cheia. Não é possível adicionar mais produtos.");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            Produto produtoRemovido = pilha[posicaoTopo--];
            System.out.println("Produto despachado: " + produtoRemovido.getDescricao());
        } else {
            System.out.println("Pilha vazia. Não há produtos para despachar.");
        }
    }

    public void mostrarPilha() {
        System.out.println("Produtos na pilha:");
        for (int i = 0; i <= posicaoTopo; i++) {
            System.out.println((i + 1) + ". " + pilha[i].getDescricao());
        }
    }

    public boolean isFull() {
        return posicaoTopo == pilha.length - 1;
    }

    public boolean isEmpty() {
        return posicaoTopo == -1;
    }
}
    

