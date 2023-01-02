package Person;

public class Student extends Person {
    String program;
    int year;
    double fee;
    public Student(String name, String adress, String program, int year, double fee) {
        super(name, adress);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    String getProgram() {
        return this.program;
    }
    void setProgram(String program) {
        this.program = program;
    }
    int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getFee() {
        return this.fee;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }
    public String toString() {
        return "Student[" + super.toString() + ", program: " + this.program + ", year: " + this.year + ", fee: " + this.fee + "]";
    }
}