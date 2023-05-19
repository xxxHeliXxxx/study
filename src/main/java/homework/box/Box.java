package homework.box;

public class Box {
    private double width;
    private double height;
    private double length;

    private Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    private Box(double size) {
        width = size;
        height = size;
        length = size;
    }

    private Box() {
        width = 0;
        height = 0;
        length = 0;
    }

    private Box(Box box) {
        this.width = box.width;
        this.height = box.height;
        this.length = box.length;
    }


    private Box(Box box1, Box box2) {
        this.width = box1.width + box2.width;
        this.length = box1.length + box2.length;
        this.height = box1.height + box2.height;
    }

    private void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    private Box increase(int i) {
        return new Box(width * i, height * i, length * i);
    }

    private Box sumBox(Box box) {
        return new Box(this.width + box.width, this.height + box.height, this.length + box.length);
    }

    private double volume() {
        return width * height * length;
    }

    private void showVolume() {
        System.out.println(volume());
    }

    private int compare(Box box) {
        double thisVolume = volume();
        double boxVolume = box.volume();
        int result;
        if (thisVolume > boxVolume) {
            result = 1;
        } else if (thisVolume < boxVolume) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }
}
