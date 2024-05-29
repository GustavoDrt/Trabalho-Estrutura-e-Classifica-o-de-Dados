
package br.com.gustavo.duarte.trabalhoecd2bim.atv01;

public class Fila {
     
    private String[] vetorDados;
    private int frente;
    private int fim;
    private int qtItens;

    public Fila(int tamanho) {
        vetorDados = new String[tamanho];
        frente = 0;
        fim = -1;
        qtItens = 0;
    }

    public void enqueue(String elemento) {
        if (fim == vetorDados.length - 1) {
            fim = -1;
        }
        vetorDados[++fim] = elemento;
        qtItens++;
    }

    public String dequeue() {
        String elemento = vetorDados[frente++];
        if (frente == vetorDados.length) {
            frente = 0;
        }
        qtItens--;
        return elemento;
    }

    public boolean isEmpty() {
        return qtItens == 0;
    }

    public boolean isFull() {
        return qtItens == vetorDados.length;
    }

    
}

