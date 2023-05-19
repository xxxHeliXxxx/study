package homework.hw_2;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.speed = 10;
        dog.poroda = "Sobaka";
        dog.klichhka = "Petro";

        System.out.println(dog.info());

        dog.run();
    }

}
