package POOinit;

public class Main {

    public static void main(String[] args) {
        Human person1 = new Human("Pedro Pepeu", 18);
        Human personCopy = new Human("Pedro Pepeu", 18);
        Human person2 = new Human("Guga", 19);
        
        System.out.println(person1);
        System.out.println(person2);
        
        boolean equals = person1.equals(personCopy);
        System.out.println(equals);


    }
    
}
