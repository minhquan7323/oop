package Point;

public class Point {
    public static int length;
    float x = 1.0f;
    float y = 1.0f;
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
    }
    float getX() {
        return this.x;
    }
    void setX(float x) {
        this.x = x;
    }
    float getY() {
        return this.y;
    }
    void setY(float y) {
        this.y = y;
    }
    
    void setXY(float x,float y) {
        this.x = x;
        this.y = y;
    }
    float[] getXY() {
        float[] a= new float[2];
        a[0] = this.x;
        a[1] = this.y;
        return a;
    }
    public String toString() {
        return "("+this.x+","+this.y+")";
    }
}