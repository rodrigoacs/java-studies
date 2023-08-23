package petshop;

public class Petshop {
    public static void main(String[] args) {
        Cat cat1 = new Cat(); // Crie um objeto Cat
        cat1.name = "Frodo"; // Atribua um nome ao gato

        System.out.println("Nome do gato: " + cat1.name);
        cat1.speak();
    }
}