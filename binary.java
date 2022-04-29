import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class binary {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int num, i, newi, pow=2;

        ArrayList <Integer> pot = new ArrayList<>();
        pot.add(1);
        ArrayList <Integer> bin = new ArrayList<>();
        
        num = sc.nextInt();

        while(num>pow) {
            pow *= 2;
            pot.add(pow);
        }

        boolean nIsPair = num % 2 ==0;
        
        Collections.reverse(pot);

            if(nIsPair) {
                for(i = 0; i<pot.size();i++) {
                    newi = pot.get(i);
                    if(num - newi >= 0) {
                        num -= newi;
                        bin.add(1);
                    } else {
                        bin.add(0);
                    }
                }
                bin.add(0);
            } else {
                num--;
                for(i = 0; i<pot.size();i++) {
                    newi = pot.get(i);
                    if(num - newi >= 0) {
                        num -= newi;
                        bin.add(1);
                    } else {
                        bin.add(0);
                    }
                }
                bin.add(1);
            }
            System.out.println(bin);
        
        System.out.printf("\n");

        sc.close();
    }
    
}
