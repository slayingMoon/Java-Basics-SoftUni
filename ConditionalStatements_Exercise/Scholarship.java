import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = Double.parseDouble(scanner.nextLine());
        double averageScore = Double.parseDouble(scanner.nextLine());
        double minimumWage = Double.parseDouble(scanner.nextLine());

        //iziskvaniq za socialna stipendiq
        //1.income<minimum wage
        //2.averageScore > 4.5
        //-> razmer na soc. stipendiq = 0.35*minimum wage

        //iziskvaniq za stipendiq otlichen uspeh
        //1.average score >= 5.5
        //-> razmer na stipendiq otlichen uspeh = average score*25

        //ako uchenikut ima pravo na socialna stipendiq i tq e po visoka ot tazi za otlichen uspeh
        //-> souf(You get a Social scholarship {стойност на стипендия} BGN)

        //ako uchenikut ima pravo na stipendiq za otlichen uspeh i tq e po visoka ili ravna na socialnata
        //->souf(You get a scholarship for excellent results {стойност на стипендията} BGN)

        double socialScholarship = 0.35*minimumWage;
        double excellentResultScholarship = averageScore*25;

        if (income>minimumWage || averageScore <= 4.5){
            System.out.println("You cannot get a scholarship!");
        }else if (income<minimumWage && averageScore > 4.5 && socialScholarship>excellentResultScholarship){
            //-> ima pravo na socialna stipendiq
            //-> proverka dali e po-visoka ot tazi za otlichen uspeh
                System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScholarship));
        }else if (averageScore>=5.5 && excellentResultScholarship>=socialScholarship){
                System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excellentResultScholarship));
        }

    }
}
