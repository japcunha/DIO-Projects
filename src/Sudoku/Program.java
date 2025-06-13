package Sudoku;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Sudoku jogo = new Sudoku();

                while (!jogo.estaCompleto()) {
                    jogo.exibirTabuleiro();

                    System.out.print("Linha (0-8): ");
                    int linha = scanner.nextInt();

                    System.out.print("Coluna (0-8): ");
                    int coluna = scanner.nextInt();

                    System.out.print("Número (1-9): ");
                    int numero = scanner.nextInt();

                    if (!jogo.jogar(linha, coluna, numero)) {
                        System.out.println("Jogada inválida. Tente novamente.");
                    }
                }

                jogo.exibirTabuleiro();
                System.out.println(" parabéns! Você completou o Sudoku :D");
                scanner.close();
            }
}
