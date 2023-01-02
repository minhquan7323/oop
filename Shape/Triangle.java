package Shape;

public class Triangle extends Shape {
    protected double a,b,c;
    public Triangle() {
        super();
        a  = 1.0;
        b = 1.0;
    }
    public Triangle(double a, double b, double c) {
        super();
        this.a  = a;
        this.b = b;
        this.c = c;
    }
    public Triangle(double a, double b, double c, String color, boolean filled) {
        super(color, filled);
        this.a  = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.c = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    public double getArea() {
        double p = getPerimeter() * 0.5;
        return Math.sqrt(Math.abs(p * (p - a) * (p - b) * (p - c)));
    }
    public double getPerimeter() {
        return a + b + c;
    }
    public String toString() {
        return "Triangle: a = " + this.a + ", b = " + this.b + ", c = " + this.c;
        // return "Rectangle[" + super.toString() + ",width= " + this.width + ",length = " + this.length + "]";
    }
}