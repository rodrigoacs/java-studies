import java.util.Scanner;

public class gabaritoAlunos {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    char gabarito[] = new char[10];
    String teste = teclado.nextLine();
    for (int i = 0; i < 10; i++) {
      gabarito[i] = teste.charAt(i);
    }

    char questAlunos[][] = new char[3][10];
    String sequencia;
    for (int i = 0; i < 3; i++) {
      sequencia = teclado.nextLine();
      for (int j = 0; j < 10; j++) {
        questAlunos[i][j] = sequencia.charAt(j);
      }
    }

    int acertos[] = new int[3];
    int acimaDaMedia = 0;
    for (int i = 0; i < 3; i++) {
      acertos[i] = 0;
      for (int j = 0; j < 10; j++) {
        if (gabarito[j] == questAlunos[i][j]) {
          acertos[i]++;
        }
      }
      if (acertos[i] >= 6) {
        acimaDaMedia++;
      }
    }

    System.out.println("Nota do Aluno1: " + acertos[0]);
    System.out.println("Nota do Aluno2: " + acertos[1]);
    System.out.println("Nota do Aluno3: " + acertos[2]);
    System.out.println("Notas acima da media: " + acimaDaMedia);
  }
}
