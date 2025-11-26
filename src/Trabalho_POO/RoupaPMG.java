package Trabalho_POO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RoupaPMG implements Item {
    private int quantidadeP;
    private int quantidadeM;
    private int quantidadeG;
    private int estoqueMinimo;
    private int estoqueMaximo;

    public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo, int estoqueMaximo) {
        this.quantidadeP = quantidadeP;
        this.quantidadeM = quantidadeM;
        this.quantidadeG = quantidadeG;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
    }

    public void venda() {
        try {
            Scanner kb = new Scanner(System.in);
            boolean ok = false;
            char tam;
            String resp;

            do {
                System.out.println("Qual o tamanho? (P/M/G)");
                resp = kb.nextLine();
                tam = resp.toUpperCase().charAt(0);

                if (resp.length() > 0) {
                    tam = resp.toUpperCase().charAt(0);

                    if (tam == 'P') {
                        quantidadeP--;
                        ok = true;
                    } else if (tam == 'M') {
                        quantidadeM--;
                        ok = true;
                    } else if (tam == 'G') {
                        quantidadeG--;
                        ok = true;
                    } else {
                        System.out.println("Opção inválida. Escolha P, M ou G.");
                    }
                }
            } while (!ok);
        } catch (InputMismatchException | StringIndexOutOfBoundsException e) {
            System.out.println("Entrada inválida! Por favor, insira um caractere válido.");
        }
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

    public String getDescricao() {
        return "RoupaPMG";
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public int getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public int getQuantidade() {
        return quantidadeP + quantidadeM + quantidadeG;
    }

    @Override
    public void mostrarEstoqueTamanhos() {
        System.out.println("P: " + quantidadeP +
                " | M: " + quantidadeM +
                " | G: " + quantidadeG);
    }
}