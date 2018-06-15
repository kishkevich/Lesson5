package Task1;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public String toString() {
        return "Square {" +
                " area = " + getArea() + "}";

    }
}
