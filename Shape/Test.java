package Shape;
import java.util.Random;
public class Test {
    public static void main(String[] args) {
        Random ran = new Random();
        Shape[] s = new Shape[100];
        double sum = 0;
        for(int i=0; i<s.length;i++) {
            int hinh = ran.nextInt(0, 3);
            int r = ran.nextInt(0, 5);
            int w = ran.nextInt(0, 5);
            int l = ran.nextInt(0, 5);
            int a = ran.nextInt(0, 5);
            int b = ran.nextInt(0, 5);
            int c = ran.nextInt(0, 5);
            if(hinh == 0) s[i] = new Circle(r);
            if(hinh == 1) s[i] = new Rectangle(w,l);
            if(hinh == 2) s[i] = new Triangle(a,b,c);
            // if(hinh == 3) s[i] = new Square(w);
            System.out.println(s[i]);
            sum += s[i].getArea(); // Tính đa hình
        }
        System.out.println(sum);
    }
}