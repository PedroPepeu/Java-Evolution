public class recurs2 {

    public static void main(String[] args) {

        p();

    }

    static void p() {
        System.out.println("Recursion");
        int count = 0;
        while (count < 5) {
            count++;
            p();
        }
    }
    
}
