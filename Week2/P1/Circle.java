package Week2.P1;

public class Circle implements Shape {
    private double radius;

    @Override
    public double getArea() {
        return (22/7)*radius*radius;
    }
}
