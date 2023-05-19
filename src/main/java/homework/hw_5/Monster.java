package homework.hw_5;

public class Monster {
    int eyes;
    int legs;
    int hands;

    public Monster(){
        this.eyes = 2;
        this.legs = 2;
        this.hands = 2;
    }
    public Monster(int eyes) {
        this.eyes = eyes;
        this.legs = 2;
        this.hands = 2;
    }
    public Monster(int eyes, int legs) {
        this.eyes = eyes;
        this.legs = legs;
        this.hands = 2;
    }
    public Monster(int eyes, int legs, int hands) {
        this.eyes = eyes;
        this.legs = legs;
        this.hands = hands;
    }

    void voice(){
        System.out.println("Golos");
    }
    void voice(int i) {
        for (int y = 0; y < i; y++) {
            System.out.println("Golos");
        }
    }

    void voice (int i, String word) {
        for (int y = 0; y < i; y++) {
            System.out.println(word);
        }
    }



}
