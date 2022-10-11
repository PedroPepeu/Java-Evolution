package POOinit;

public class Human {
   
    //Atributes
    private String name;
    private int age;

    //Contructor
    Human(String parName, int parAge) {
        name = parName;
        age = parAge;
    }

    //Identity
    public boolean equals(Object obj) {
        if(obj instanceof Human) {
            Human other = (Human) obj;
            return this.name.equals(other.name);
        }
        return false;
    }

    //Operations
    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    //String representation of the object
    public String toString() {
        return this.name + " - " + this.age + " Yo";
    }
}
