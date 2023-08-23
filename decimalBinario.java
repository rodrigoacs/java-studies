import java.util.Scanner;

public class decimalBinario {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Insira o numero inteiro: ");
    int dec = scan.nextInt();
    int resto;
    String binario = "";
    do {
      resto = dec % 2;
      dec = dec / 2;
      binario = resto + binario;
    } while (dec > 0);

    System.out.println(binario);
    scan.close();
  }

}
