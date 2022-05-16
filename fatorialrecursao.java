//this one is also fatorial, but using recursao
import java.util.Scanner;

public class fatorialrecursao {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int fatoriall = sc.nextInt();
        if(fatoriall < 0) {
            fatoriall = Math.abs(fatoriall);
        }
        int answer = fator(fatoriall);
        System.out.printf("O fatorial de %d! é: %d\n", fatoriall, answer);
        sc.close();
    }

    public static int fator(int num) {
        if(num == 0) {
            return 1;
        }
        return num*fator(num-1);
    }
    
}
