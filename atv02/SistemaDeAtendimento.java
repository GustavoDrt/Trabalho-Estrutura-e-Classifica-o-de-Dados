
package br.com.gustavo.duarte.trabalhoedd2bim.atv02;


public class SistemaDeAtendimento {
     private Fila filaPrioritaria;
    private Fila filaNormal;
    private int proximoSenha;

    public SistemaDeAtendimento() {
        filaPrioritaria = new Fila(20);
        filaNormal = new Fila(20);
        proximoSenha = 1;
    }

    public void adicionarCliente(String nome, int anoNascimento) {
        Cliente cliente = new Cliente(proximoSenha++, nome, anoNascimento);

        if (calculoIdade(anoNascimento)) {
            filaPrioritaria.enqueue("Senha: " + cliente.senha + ", Nome: " + cliente.nome + ", Ano de Nascimento: " + cliente.anoNascimento);
            System.out.println("Cliente adicionado na fila prioritária: " + cliente.nome);
        } else {
            filaNormal.enqueue("Senha: " + cliente.senha + ", Nome: " + cliente.nome + ", Ano de Nascimento: " + cliente.anoNascimento);
            System.out.println("Cliente adicionado na fila normal: " + cliente.nome);
        }
    }

    public void chamarProximoCliente() {
        if (filaPrioritaria.isEmpty()) {
            System.out.println("Fila prioritária vazia. Atendendo próximo cliente na fila normal.");
            chamarProximoClienteDaFila(filaNormal);
        } else if (filaNormal.isEmpty()) {
            System.out.println("Fila normal vazia. Atendendo próximo cliente prioritário.");
            chamarProximoClienteDaFila(filaPrioritaria);
        } else {
            if (filaPrioritaria.tamanho() >= 2) {
                System.out.println("Atendendo próximo cliente prioritário: " + filaPrioritaria.dequeue());
                System.out.println("Atendendo próximo cliente prioritário: " + filaPrioritaria.dequeue());
                System.out.println("Atendendo próximo cliente normal: " + filaNormal.dequeue());
            } else {
                System.out.println("Atendendo próximo cliente prioritário: " + filaPrioritaria.dequeue());
                System.out.println("Atendendo próximo cliente normal: " + filaNormal.dequeue());
            }
        }
    }

    private void chamarProximoClienteDaFila(Fila fila) {
        System.out.println("Atendendo próximo cliente: " + fila.dequeue());
    }

    private boolean calculoIdade(int anoNascimento) {
        int anoAtual = getAnoAtual();
        int idade = anoAtual - anoNascimento;
        return idade >= 65;
    }

    private int getAnoAtual() {
        return 2024; 
    }
}
