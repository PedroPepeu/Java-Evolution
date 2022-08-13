import java.util.Scanner;

public class squareroot {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		double solution = sc.nextDouble();
		double answer = sqrt(solution);
		System.out.printf("%.4f\n", answer);

		sc.close();

	}

	public static double sqrt(double c) {
		double errorAccept = 0.0001;
		double starter = c;
		double erro = c;
		while(erro>errorAccept) {
			double zone = c/starter;
			erro = Math.abs(starter - (zone));
			starter = (starter + zone)/2;
		}
		return starter;
	}

	
}
