package homework.hw_1;

public class Main {

    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();
        Human human4 = new Human();
        Human human5 = new Human();

        human1.age = 25;
        human1.name = "Loha";
        human1.weight = 110.5;

        human2.age = 25;
        human2.name = "Loha";
        human2.weight = 110.5;

        human3.age = 25;
        human3.name = "Loha";
        human3.weight = 110.5;

        human4.age = 25;
        human4.name = "Loha";
        human4.weight = 110.5;

        human5.age = 150;
        human5.name = "Loha";
        human5.weight = 110.5;

        System.out.println((human1.age + human2.age + human3.age + human4.age + human5.age) / 5);

    }

}
