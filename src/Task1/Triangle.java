package Task1;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    //private double perimetr;

    public Triangle (double sideA,double sideB,double sideC){
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }

    public double getArea() {
        double perimetr = (sideA+sideB+sideC)/2;
        return Math.sqrt((perimetr)*(perimetr-sideA)*(perimetr-sideB)*(perimetr-sideC));
    }

    public String toString (){
        return "Triangle {"+
                "area = " +getArea()+ "}";
    }
}
