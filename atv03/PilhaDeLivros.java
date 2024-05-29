
package br.com.gustavo.duarte.trabalhoeed2bim.atv03;


public class PilhaDeLivros {
     private String[] pilha;
    private int posicaoTopo;

    public PilhaDeLivros(int tamanho) {
        pilha = new String[tamanho];
        posicaoTopo = -1;
    }

    public void adicionarLivro(String livro) {
        if (!isFull()) {
            pilha[++posicaoTopo] = livro;
            System.out.println("Livro adicionado: " + livro);
        } else {
            System.out.println("Pilha cheia. Não é possível adicionar mais livros.");
        }
    }

    public void listarLivros() {
        System.out.println("Livros na pilha:");
        for (int i = 0; i <= posicaoTopo; i++) {
            System.out.println((i + 1) + ". " + pilha[i]);
        }
    }

    public void retirarLivro() {
        if (!isEmpty()) {
            String livroRemovido = pop();
            System.out.println("Livro removido: " + livroRemovido);
        } else {
            System.out.println("Pilha vazia. Não há livros para remover.");
        }
    }

    public void mostrarTopo() {
        if (!isEmpty()) {
            System.out.println("Livro no topo da pilha: " + top());
        } else {
            System.out.println("Pilha vazia. Não há livros no topo.");
        }
    }

    public boolean isFull() {
        return posicaoTopo == pilha.length - 1;
    }

    public boolean isEmpty() {
        return posicaoTopo == -1;
    }

    public String top() {
        return pilha[posicaoTopo];
    }

    
    public String pop() {
        return pilha[posicaoTopo--];
    }

}
