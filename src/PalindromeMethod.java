import java.util.Scanner;

public class PalindromeMethod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int[] aSequence = new int[x];

        for(int i = 0; i < aSequence.length; i++) {
            aSequence[i] = i;
        }

        int i = 0, j = aSequence.length;

        checkPalindrome (aSequence, i, j);

        sc.close();

    }

    static boolean checkPalindrome (int[] x, y, z) {

        if(x.length == 1) {
            return true;
        }

        /*for(int i = 0, j = x.length - 1; i < j; i++, j--) {
            if(i != j) {
                return false;
            }
        }*/

        if(i < j)

        return true;
        
    }
}