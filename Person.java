public class Person {
    private String name;

    public Person(String initialName) {     //initializing person name as String
        this.name = initialName;
    }

    public Person() {
    }

    public String getName() {               //get name from a person
        return name;
    }

    public void setName(String fullName) {  //get full name from a person
        this.name = fullName;
    }

    public String toString() {
        return name;
    }
}