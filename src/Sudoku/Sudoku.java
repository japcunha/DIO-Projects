package Sudoku;

public class Sudoku {
        private Tabuleiro tabuleiro;

        public Sudoku() {
            tabuleiro = new Tabuleiro();
        }

        public boolean jogar(int linha, int coluna, int numero) {
            if (tabuleiro.posicaoPreenchida(linha, coluna)) {
                System.out.println("Essa posição já está preenchida.");
                return false;
            }

            if (tabuleiro.jogadaValida(linha, coluna, numero)) {
                tabuleiro.setValor(linha, coluna, numero);
                return true;
            }

            return false;
        }

        public void exibirTabuleiro() {
            tabuleiro.imprimir();
        }

        public boolean estaCompleto() {
            return tabuleiro.estaCompleto();
        }
    }

