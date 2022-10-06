import java.util.Scanner;

public class prob6 {
    public static void main(String[] args) {
        double durationInMonths, loanValue, amontOfTheLoan, depreciationQ;

        Scanner sc = new Scanner(System.in);

        while(hasNext()){
            
            durationInMonths = sc.nextDouble();

            if (durationInMonths >= 0){

                int initialMonth = 0;

                double carValue = loanValue + amontOfTheLoan;

                double monthNumber, depreciationPercentage;

                while (depreciationQ--) {
                    scanf("%d %d", &monthNumber, &depreciationPercentage);
                    int times = monthNumber - initialMonth;
                    while (times >= 0) {
                        carValue = carValue - (depreciationPercentage * carValue);
                        amontOfTheLoan -= loanValue;


                        if (carValue > amontOfTheLoan){
                            initialMonth++;
                            depreciationQ = 0;
                            break;
                        }
                        monthNumber--;
                        initialMonth++;
                    }
                }

                while (amontOfTheLoan > carValue){
                    carValue = carValue - (depreciationPercentage * carValue);
                    amontOfTheLoan -= loanValue;

                    initialMonth++;
                }

                if (initialMonth == 1){
                    printf("1 month\n");
                } else {
                    printf("%d months", initialMonth);
                }
            } else {
                break;
            }  
        }
    }
}
