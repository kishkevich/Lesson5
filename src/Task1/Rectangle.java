package Task1;

public class Rectangle {
    private double lengths;
    private double width;

    public Rectangle (double lengths, double width){
        this.lengths=lengths;
        this.width=width;
    }

    public double getArea(){
        return lengths*width;
    }

    public String toString (){
        return "Rectangle {"+
                "area = " +getArea()+ "}";
    }
}
