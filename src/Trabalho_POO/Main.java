package Trabalho_POO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Peca[] estoque = new Peca[5];

        estoque[0] = new Acessorio("Camisa", 10, 2, 20);
        estoque[1] = new RoupaTamanhoUnico("Saia", 15, 3, 25);
        estoque[2] = new Acessorio("Cinto", 8, 1, 15);
        estoque[3] = new Acessorio("Pulseira", 20, 5, 30);
        estoque[4] = new RoupaPMG("Saída de praia", 5, 5, 5, 2, 10);

        int opcao = -1;
        String Menu = """
                0 – Camisa
                1 – Saia
                2 – Cinto
                3 – Pulseira
                4 – Saída de praia
                5 – Sair do sistema
                Escolha uma opção:
                """;

        while (opcao != 5) {
            System.out.println("\n--- SISTEMA DE CONTROLE DE ESTOQUE ---");
            System.out.println(Menu);

            opcao = scanner.nextInt();

            if (opcao >= 0 && opcao <= 4) {
                Peca produto = estoque[opcao];

                System.out.println("\nProduto: " + produto.getDescricao());
                System.out.println("Estoque atual: " + produto.getQuantidade());

                produto.venda();

                produto.reposicaoEstoque();

                System.out.println("Estoque atualizado: " + produto.getQuantidade());

            } else if (opcao == 5) {
                System.out.println("\n---------------------------------------");
                System.out.println("       ESTOQUE FINAL DOS PRODUTOS");
                System.out.println("---------------------------------------");

                for (int i = 0; i < estoque.length; i++) {
                    Peca produto = estoque[i];
                    System.out.println("\n" + i + " - " + produto.getDescricao());
                    System.out.println("   Estoque: " + produto.getQuantidade());

                    produto.mostrarEstoqueTamanhos();
                }

                System.out.println("\n---------------------------------------");
                System.out.println("           Sistema encerrado!\n                  :D");
                System.out.println("---------------------------------------");

            } else {
                System.out.println("\nOp inválida! Tente novamente.");
            }
        }
    }
}