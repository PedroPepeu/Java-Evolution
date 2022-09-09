public class PalindromeMethod {
    public static void main(String[] args) {

        int [] arr = {1, 2, 6, 6, 2, 1};
        recur(0, arr, arr.length - 1);

    }

    public static void recur(int i, int[] a, int j) {

        if(a.length == 1) {
            System.out.println("Pass");
            return;
        }
        
        if (i > a.length - 1) {
            System.out.println("Pass");
            return;
        } else {
            if (a[i] != a[j]) {
                System.out.println("Do not pass");
                return;
            }
            recur(i + 1, a, j - 1);
        }
    }
}
