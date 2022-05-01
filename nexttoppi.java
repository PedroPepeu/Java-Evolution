package P1;

import java.util.Scanner;

public class nexttopi {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int n, interation =0, nPointsInCircle=0;
        double x=0, y=0, PI=0;

        n = sc.nextInt();

        while(interation < n) {
            x = (Math.random() * 2) - 1;
            y = (Math.random() * 2) - 1;

            boolean isInsideCircle = Math.pow(x, 2) + Math.pow(y, 2) <=1;

            if(isInsideCircle) {
                nPointsInCircle++;
            } else {
                interation++;
            }
        }
        
        PI = (4* nPointsInCircle) / n;

        System.out.println(PI);

        

        sc.close();
    }
}
