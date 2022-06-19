package Week2.P5;

public class Square {
    Rectangle rectangle;

    public Square(int size) {
        rectangle = new Rectangle(size, size);
    }
    public int getHeight() {
        return rectangle.getHeight();
    }
    public int getWidth() {
        return rectangle.getWidth();
    }
}
