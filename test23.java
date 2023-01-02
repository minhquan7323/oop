class base {
    public void in() {
        System.out.println("base");
    }
}
class de extends base {
    public void in() {
        System.out.println("de");
    }
}
class Main {
    public static void dz(base o) {
        o.in();
    }
    public static void main(String[] args) {
        base x = new base();
        base y = new de();
        de z = new de();
        dz(x);
        dz(y);
        dz(z);
    }
}