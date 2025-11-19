package Trabalho_POO;

public abstract class Peca implements Item{
    private String descricao;
    private int quantidade;
    private int estoqueMaximo;
    private int estoqueMinimo;

    public Peca(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo){
        this.descricao=descricao;
        this.quantidade=quantidade;
        this.estoqueMinimo=estoqueMinimo;
        this.estoqueMaximo=estoqueMaximo;
    }

    public abstract void venda();

    public void mostrarEstoqueTamanhos(){

    }

    public void reposicaoEstoque(){
        if(quantidade<estoqueMinimo)
            quantidade = estoqueMaximo;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    public int getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }
}
