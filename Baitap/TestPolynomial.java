

public class TestPolynomial {
    public static void main(String[] args)    {
        MyPolynomial p1 = new MyPolynomial(1,2,3,4,6);
        MyPolynomial p2 = new MyPolynomial(0,-2,-3,5);
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println();
        System.out.println("p1 khi x = 3 : " + p1.evaluate(3));
        System.out.println("p2 khi x = 4 : " + p2.evaluate(4));
        System.out.println();
        System.out.println("p1 + p2 = " + p1.add(p2));
        System.out.println("p1 * p2 = " + p1.multiply(p2));
    }
}