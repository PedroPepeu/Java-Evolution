public class recurs3fat {
    public static void main(String args) {

        int n = 3;
        System.out.printf("Factorial of %i is: "+ factorial(n));
    }

    static int factorial(int x) {
        if (x == 1) {
            return 1;
        } else {
            return(x * factorial(x-1));
        }
    }
    
}
