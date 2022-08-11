import java.util.Scanner;

public class nexttopi {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        double num, interation =0, nPointsInCircle=0;
        double x=0, y=0, PI=0;

        num = sc.nextInt();

        while(interation < num) {
            x = (Math.random() * 2) - 1;
            y = (Math.random() * 2) - 1;

            boolean isInsideCircle = insideCircle(x, y);

            if(isInsideCircle) {
                nPointsInCircle++;
                interation++;
            } else {
                interation++;
            }
        }
        
        PI = (4* nPointsInCircle) / num;

        System.out.printf("%f\n", PI);

        

        sc.close();
    }

    public static boolean insideCircle (double z, double w) {
        if(Math.pow(z, 2) + Math.pow(w, 2) <=1) {
            return true;
        }
        return false;
    }

}
