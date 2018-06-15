package Task1;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(2);
        Cirkle cirkle = new Cirkle(3);
        Rectangle rectangle = new Rectangle(4, 3);
        Triangle triangle = new Triangle(3, 4, 5);


        System.out.println(square.toString());
        System.out.println(cirkle.toString());
        System.out.println(rectangle.toString());
        System.out.println(triangle.toString());

    }
}
