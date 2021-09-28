import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine(); //chislo ili stop
        //spirame: komanda = stop
        //produljavame komanda != stop
        int sumPrime = 0;
        int sumNonPrime = 0;

        while (!command.equals("stop")){
            //chislo "123" -> 123
            int number = Integer.parseInt(command);
            if (number < 0){
                System.out.println("Number is negative.");
            }

                //proverka za chisloto dali e prosto ili ne
                //prosto ako ima tochno 2 delitelq i te sa 1 i samoto chislo
                int count = 0; // broqch na delitelite
                for (int i = 1; i <= number; i++) {
                    //preminavame prez vsichki chisla ot 1 do moeto
                    if (number % i == 0) {
                        count++;
                    }

                }

                if (count == 2) {
                    //chisloto e prosto
                    sumPrime += number;

                } else if (count > 2) {
                    //chisloto e sustavno
                    sumNonPrime += number;
                }

                command = scanner.nextLine();

        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonPrime);

    }
}
