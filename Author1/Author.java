package Author1;
class Author {
    String name, email;   
    char gender;
    public Author(String name,String email,char gender) {
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public Author(String name2, String email2, String string) {
    }
    String getName() {
        return this.name;
    }
    String getEmail() {
        return this.email;
    }
    char getGender() {
        return this.gender;
    }
    public String toString () {
        return "Author: "+this.name+", email: " + this.email+", gender: "+ this.gender;
    }
}