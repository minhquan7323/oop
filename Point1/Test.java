package Point1;

public class Test {
    public static void main(String[] args) {
		Point begin = new Point(1, 1);
		Point end = new Point(2, 2);
		Line line1 = new Line(begin, end);
		System.out.println(line1.toString() + "\n" + line1.getLength());
        
		Line line2 = new Line(2, 3, 4, 5);
		System.out.println(line2.toString() + "\n" + line2.getLength());
	}
}
