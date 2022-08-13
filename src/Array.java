import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] cars = {"Volvo", "Toyota", "BMW", "Ferrari"};
        System.out.println(cars[1]);
        System.out.println(cars[3]);
        cars[3] = "Lamborguini";
        System.out.println(cars[3]);
        System.out.println(cars.length);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        for(String i : cars) {
            System.out.println(i);
        }

        
        String[][] climate = { {"Monday", "Thursday", "Wednesdey"}, {"Sunny", "Cloudy", "Rainy"} };
        String x = climate[1][1];
        System.out.println(x);

        for (int hor = 0; hor < climate.length; hor++) {
            for (int ver = 0; ver < climate[hor].length; ver++) {
                System.out.println(climate[hor][ver]);
            }
        }


        int[] grades = {10, 8, 4, 6, 3, 9};
        System.out.println(grades[0]);

        sc.close();
    }
    
}
