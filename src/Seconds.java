import java.util.Scanner;

public class Seconds {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int hour, minutes, seconds, total;
		
		hour = sc.nextInt(); minutes = sc.nextInt(); seconds = sc.nextInt();
		
		hour *= 3600;
		minutes *= 60;
		total = hour + minutes + seconds;
		
		System.out.printf("%d seconds\n", total);
		
		sc.close();
    
	}
}
