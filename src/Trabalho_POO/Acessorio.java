package Trabalho_POO;

import java.util.Scanner;

public class Acessorio extends Peca {
    public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public void venda() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Escreva a quantidade vendida em números");
        int quantidadeVendida = kb.nextInt();
        int novaQuantidade = getQuantidade() - quantidadeVendida;
        setQuantidade(novaQuantidade);
    }
}
