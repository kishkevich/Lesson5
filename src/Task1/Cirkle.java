package Task1;

public class Cirkle {
    private double radius;

    public Cirkle (double radius){
        this.radius=radius;
    }



    public double getArea (){
        return radius*radius*Math.PI;
    }

    public String toString (){
        return "Cirkle {"+
                "area = " +getArea()+ "}";
    }

}
