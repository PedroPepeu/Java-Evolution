public class allPrime {
    public static void main(String[] args) {

        double limit = 10;
        int temp = 0;

        for(double num = 2; num < limit; num++, limit *=10) {
            outer:
            for(double i = 1; i < num; i++) {
                temp = 0;
                boolean test = prime(num, i);

                if(test = true) {
                    continue;
                } else {
                    temp++;
                    break outer;
                }
            }
            if(temp > 0) {
                System.out.println("");
            }
        }
    }

    static boolean prime(double x, double y) {
        if(x % y == 0) {
            return false;
        } else {
            return true;
        }
    }
}