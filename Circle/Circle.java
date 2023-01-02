package Circle;

public class Circle {
    double radius = 1.0;
    String color = "red";
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    double getRadius() {
        return radius;
    }
    void setRadius(double radius) {
        this.radius = radius;
    }
    String getColor() {
        return color;
    }
    void setColor(String color) {
        this.color = color;
    }
    double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}
