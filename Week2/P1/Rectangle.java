package Week2.P1;

public class Rectangle implements Shape{
    private double width;
    private double heigth;

    @Override
    public double getArea() {
        return width * heigth;
    }
}
