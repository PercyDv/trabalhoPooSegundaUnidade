package Trabalho_POO;

import java.util.Scanner;

public class RoupaPMG extends Peca {
    private int quantidadeP;
    private int quantidadeM;
    private int quantidadeG;

    public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG,
                    int estoqueMinimo, int estoqueMaximo) {
        super(descricao, (quantidadeP + quantidadeM + quantidadeG), estoqueMinimo, estoqueMaximo);
        this.quantidadeP = quantidadeP;
        this.quantidadeM = quantidadeM;
        this.quantidadeG = quantidadeG;
    }

    public void venda() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Qual o tamanho? (P/M/G)");
        char tam = kb.next().charAt(0);
        boolean ok = false;

        do {
            if (tam == 'P' || tam == 'p') {
                this.quantidadeP--;
                ok = true;

            } else if (tam == 'M' || tam == 'm') {
                this.quantidadeM--;
                ok = true;

            } else if (tam == 'G' || tam == 'g') {
                this.quantidadeG--;
                ok = true;

            } else {
                System.out.println("Op inválida. Escolha P, M ou G.");
            }

        } while (!ok);
        setQuantidade(quantidadeP + quantidadeM + quantidadeG);
    }

    public void reposicaoEstoque() {
        if (quantidadeP < getEstoqueMinimo()) {
            quantidadeP = getEstoqueMaximo();
        }
        if (quantidadeM < getEstoqueMinimo()) {
            quantidadeM = getEstoqueMaximo();
        }
        if (quantidadeG < getEstoqueMinimo()) {
            quantidadeG = getEstoqueMaximo();
        }
        setQuantidade(quantidadeP + quantidadeM + quantidadeG);
    }

    public int getQuantidadeP() {
        return quantidadeP;
    }

    public int getQuantidadeM() {
        return quantidadeM;
    }

    public int getQuantidadeG() {
        return quantidadeG;
    }

    public void mostrarEstoqueTamanhos(){
        System.out.println(  "P: " + quantidadeP +
                " | M: " + quantidadeM +
                " | G: " + quantidadeG);
    }
}
