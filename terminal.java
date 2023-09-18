import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class terminal {
  public static void main(String[] args) throws java.io.IOException {
    String input = "";
    Scanner in = new Scanner(System.in);
    Terminal terminal = new Terminal();

    while (!input.equals("exit")) {
      input = in.nextLine();
      String command, flag;
      command = input.split(" ", 0)[0];

      if (input.contains(" ")) {
        flag = input.split(" ", 0)[1];
      } else {
        flag = "";
      }

      switch (command) {
        case "ls":
          terminal.ls();
          break;
        case "date":
          terminal.date();
          break;
        case "touch":
          terminal.touch(flag);
          break;
      }
    }
    in.close();
  }

  static class Terminal {
    public void ls() {
      File file = new File("./");
      String[] files;
      files = file.list();

      for (String f : files) {
        System.out.print(f + " ");
      }
      System.out.println();
    }

    public void touch(String filename) throws java.io.IOException {
      File file = new File("./" + filename);
      file.createNewFile();
    }

    public void date() {
      System.out.println(new SimpleDateFormat("E d MMM Y k:m:s Z").format(new Date()));
    }
  }

}