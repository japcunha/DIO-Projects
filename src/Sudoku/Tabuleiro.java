package Sudoku;

public class Tabuleiro {
    private int[][] matriz = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
    };

    public void imprimir() {
        System.out.println("---- Sudoku ----");
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) System.out.println(" -----------------");
            for (int j = 0; j < 9; j++)
            {
                if (j % 3 == 0 && j != 0) System.out.print("| ");
                System.out.print(matriz[i][j] == 0 ? ". " : matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean jogadaValida(int linha, int coluna, int numero) {

        for (int i = 0; i < 9; i++) {
            if (matriz[linha][i] == numero || matriz[i][coluna] == numero) return false;
        }

        int blocoLinha = (linha / 3) * 3;
        int blocoColuna  = (coluna / 3) * 3;
        for (int i = blocoLinha; i < blocoLinha + 3; i++) {
            for (int j = blocoColuna; j < blocoColuna + 3; j++) {
                if (matriz[i][j] == numero) return false;
            }
        }

        return true;
    }

    public boolean posicaoPreenchida(int linha, int coluna) {
        return matriz[linha][coluna] != 0;
    }

    public void setValor(int linha, int coluna, int numero) {
        matriz[linha][coluna] = numero;
    }

    public boolean estaCompleto() {
        for (int[] linha : matriz) {
            for (int valor : linha) {
                if (valor == 0) return false;
            }
        }
        return true;
    }
}

