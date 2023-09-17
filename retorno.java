public class retorno {
  public static void main(String[] args) {
    Salve salve = new Salve();

    System.out.println(salve.dizOi());

    salve.dizTchau();

  }

  public static class Salve {
    public String dizOi() {
      return "Oi!";
    }

    public void dizTchau() {
      System.out.println("Tchau!");
    }
  }

}
