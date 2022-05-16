import java.util.Scanner;

public class cedulas {
 
    public static void main(String[] args){
 
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        
        int fator1 = x / 100;
        int resto1 = x % 100;
        
        int fator2 = resto1 / 50;
        int resto2 = resto1 % 50;
        
        int fator3 = resto2 / 20;
        int resto3 = resto2 % 20;
        
        int fator4 = resto3 / 10;
        int resto4 = resto3 % 10;
        
        int fator5 = resto4 / 5;
        int resto5 = resto4 % 5;
        
        int fator6 = resto5 / 2;
        int resto6 = resto5 % 2;
        
        int fator7 = resto6 / 1;
        
        System.out.printf("%d\n", x);
        System.out.printf("%d nota(s) de R$ 100,00\n", fator1);
        System.out.printf("%d nota(s) de R$ 50,00\n", fator2);
        System.out.printf("%d nota(s) de R$ 20,00\n", fator3);
        System.out.printf("%d nota(s) de R$ 10,00\n", fator4);
        System.out.printf("%d nota(s) de R$ 5,00\n", fator5);
        System.out.printf("%d nota(s) de R$ 2,00\n", fator6);
        System.out.printf("%d nota(s) de R$ 1,00\n", fator7);
        
        sc.close();
        
    }
 
}
