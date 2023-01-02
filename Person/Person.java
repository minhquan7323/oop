package Person;

public class Person {
    String name;
    String adress;
    public Person(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }
    String getname() {
        return this.name;
    }
    String getAdress() {
        return this.adress;
    }
    void setAdress(String adress) {
        this.adress = adress;
    }
    public String toString() {
        return "Person[name: " + this.name + ", adress: " + this.adress + "]";
    }
}
