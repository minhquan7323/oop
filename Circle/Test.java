package Circle;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder(5, 5, "blue");
        System.out.println(circle.getArea());   
        System.out.println(cylinder.getArea());
    }
}
