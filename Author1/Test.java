package Author1;

public class Test {
    public static void main(String[] args) {
		Author[] authors = new Author[3];
		authors[0] = new Author("Vwt", "lsa",'f');
		authors[1] = new Author("qrqtuan", "Tsa",'f');
		authors[2] = new Author("qw2en", "asdo",'f');
		
		Book book1 = new Book("learn", authors, 210000);
		System.out.println(book1.getAuthorName());
	}
}
