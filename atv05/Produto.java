
package br.com.gustavo.duarte.trabalhoedd2bim.atv05;

public class Produto {
     private String codProduto;
    private String descricao;
    private String dataEntrega;
    private String origem;
    private String destino;

    public Produto(String codProduto, String descricao, String dataEntrega, String origem, String destino) {
        this.codProduto = codProduto;
        this.descricao = descricao;
        this.dataEntrega = dataEntrega;
        this.origem = origem;
        this.destino = destino;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
