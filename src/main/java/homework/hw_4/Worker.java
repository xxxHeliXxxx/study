package homework.hw_4;

public class Worker {
    String name;
    String position;
    int salary;


    public Worker(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }


    String info(int monthQuantity) {
        return "Sotrudnik " + name + ", '" + position + "' ," + "za poslednie " + monthQuantity + " poluchil " + salary * monthQuantity;
    }
}
