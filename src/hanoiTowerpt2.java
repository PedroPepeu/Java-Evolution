import java.util.Scanner;

public class hanoiTowerpt2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("number of disks.. ");
        int n = sc.nextInt();

        int[][] O = new int[n][1];
        int[][] D = new int[n][1];
        int[][] A = new int[n][1];

        hanoi(n--, O, D, A);

        sc.close();
    }

    static void hanoi(int n, int[][] O, int[][] D, int[][] A) {
        if(n == 1){
            System.out.printf("%d : %d %d %d - as disk : origin, destiny, auxiliar\n", n, O, D, A);
            return;
        }
        if(n > 1){
            //n--;
            System.out.printf("%d : %d %d %d - as disk : origin, destiny, auxiliar\n", n, O, A, D);
            //changeArr();
            System.out.printf("1 : %d %d %d - as disk : origin, destiny, auxiliar\n", O, D, A);
            System.out.printf("%d : %d %d %d - as disk : origin, destiny, auxiliar\n", n, A, D, O);
            //changeArr();
            hanoi(n--, A, D, O);
        }
    }

    /*static int[][] changeArr (int A[][], int B[][]) {

        int move;
        for(int m = 0; A[m][0] == 0; m++) {
            move = A[m][0];
        }
    }*/

}
