package Author;

public class Test {
    public static void main(String[] args) {
        Author author= new Author("asad","ASas",'f');
        Book book1 = new Book("Java OOP", author, 10,0);
        System.out.println(book1);  
    }
}
