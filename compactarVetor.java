// Leia um vetor de 50 posições e o compacte, ou seja, elimine as posições com valor zero
// avançando uma posição, com os valores subseqüentes do vetor. Dessa forma todos “zeros” devem ficar para as posições finais do vetor.

import java.util.Arrays;
import java.util.Scanner;

public class compactarVetor {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] vetor = new int[10];

    // Leitura do vetor
    System.out.println("Digite os valores do vetor:");
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = scanner.nextInt();
    }

    // Compactação do vetor
    int posicaoZero = -1;
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] == 0 && posicaoZero == -1) {
        posicaoZero = i;
      } else if (vetor[i] != 0 && posicaoZero != -1) {
        vetor[posicaoZero] = vetor[i];
        vetor[i] = 0;
        posicaoZero++;
      }
    }

    // Impressão do vetor compactado
    System.out.println("Vetor compactado:");
    System.out.println(Arrays.toString(vetor));
  }
}
