public class somaDiagonal {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        // Preenche a matriz com valores
        int valor = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = valor;
                valor++;
            }
        }

        int somaDiagonal = 0;
        for (int i = 4; i >= 0; i--) {
            somaDiagonal += matriz[i][i];
        }

        System.out.println("Soma da diagonal principal: " + somaDiagonal);

    }
}
