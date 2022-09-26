import java.util.Scanner;

public class hanoiTower {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("number of disks.. \n");
        int n = sc.nextInt();

        int[][] O = new int[n][1];
        int[][] D = new int[n][1];
        int[][] A = new int[n][1];

        hanoi(n, O, D, A);

        sc.close();
    }

    static void hanoi(int n, int[][] O, int[][] D, int[][] A) {
        if(n == 1){
            System.out.printf("%d : %d %d %d - as disk : origin, destiny, auxiliar\n", n, O, D, A);
            return;
        }
        if(n > 1){
            n--;
            System.out.printf("%d : %d %d %d - as disk : origin, destiny, auxiliar\n", n, O, A, D);
            System.out.printf("1 : %d %d %d - as disk : origin, destiny, auxiliar\n", O, D, A);
            System.out.printf("%d : %d %d %d - as disk : origin, destiny, auxiliar\n", n, A, D, O);
            hanoi(n, A, D, O);
        }
    }
}