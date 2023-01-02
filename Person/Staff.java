package Person;

public class Staff extends Person{
    String school;
    double pay;
    public Staff(String name,String adress,String school, double pay) {
        super(name, adress);
        this.school = school;
        this.pay = pay;
    }
    public String getSchool() {
        return this.school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public double getPay() {
        return this.pay;
    }
    public void setPay(double pay) {
        this.pay = pay;
    }
    public String toString(){
        return "Staff[" + super.toString() + ", school: " + this.school + ", pay: " + this.pay + "]";
    }
}