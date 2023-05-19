package homework.hw_3;

public class Rect {
    int length;
    int width;

    public void setDimens(int width, int length) {
        this.length = length;
        this.width = width;
    }

    public int perimeter() {
        return (width + length) * 2;
    }

    public int square() {
        return width + length;
    }
}
