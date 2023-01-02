package Person;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("quan","117");
        Student student = new Student("quan","117", "IT", 2, 0);
        Staff staff = new Staff("quan", "117", "dhsg", 1);
        System.out.println(person);   
        System.out.println(student);   
        System.out.println(staff);
        }
}
