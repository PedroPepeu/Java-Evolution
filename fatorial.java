//in this code I'm gonna do an factorial calculator using the normal method
import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int times = num;
        while(times>1) {
            times--;
            num *= times;
        }
        System.out.printf("%d", num);
        sc.close();
    }
}