import java.util.Scanner;

public class MDCorGCD {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int bigger = Greater(num1, num2);
        int lower = Lower(num1, num2);

        System.out.printf("GCD(%d, %d)\n", bigger, lower);

        while(bigger != lower && bigger >= lower) {
            bigger -= lower;
        }
        if(lower > bigger) {
            while(lower != bigger && lower > bigger) {
                lower -= bigger;
            }
        }
        System.out.printf("GCD:%d", lower);
        
        sc.close();
        
    }

    public static int Greater(int x, int y) {
        if(y>x) {
            return y;
        }
        return x;
    }

    public static int Lower(int x, int y) {
        if(x<y) {
            return x;
        }
        return y;
    }
}
