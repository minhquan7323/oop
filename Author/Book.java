package Author;

public class Book {
    String name;
    Author author;
    double price;
    int qty = 0;
    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    String getName() {
        return this.name;
    }
    Author getAuthor() {
        return this.author;
    }
    double getPrice() {
        return this.price;
    }
    void setPrice(double price) {
        setPrice(price);
    }
    int getQty() {
        return this.qty;
    }
    void setQty(int qty) {

    }
    public String toString () {
        return "Book: "+this.name+", " +this.author +",price " +this.price+" qty "+this.qty;
    }
}
