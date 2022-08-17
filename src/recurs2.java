public class recurs2 {

    public static void main(String[] args) {

        p();

    }

    static void p() {
        int count = 0;
        System.out.println("Recursion"+count);
        while (count < 5) {
            count++;
            p();
        }
    }
    
}
