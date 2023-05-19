package homework.hw_4;

public class Main {


    public static void main(String[] args) {
        Worker worker = new Worker("Vasyl", "Loh", 1800);

        String info = worker.info(12);

        System.out.println(info);


    }
}
