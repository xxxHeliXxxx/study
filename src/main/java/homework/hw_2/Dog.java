package homework.hw_2;

public class Dog {
    String klichhka;
    String poroda;
    int speed;

    public void run() {
        for (int i = 0; i < speed; i++) {
            System.out.println("gav");
        }
    }

    public String info(){
       return klichhka + " " + poroda + " " + speed;
    }

}
