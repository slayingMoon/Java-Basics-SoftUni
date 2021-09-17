import java.util.Scanner;

public class Scholarship2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = Double.parseDouble(scanner.nextLine());
        double averageScore = Double.parseDouble(scanner.nextLine());
        double minimumWage = Double.parseDouble(scanner.nextLine());

        //iziskvaniq za socialna stipendiq
        //1.income<minimum wage
        //2.averageScore > 4.5
        //-> razmer na soc. stipendiq = 0.35*minimum wage
        double socialScholarship = 0.35*minimumWage;

        //iziskvaniq za stipendiq otlichen uspeh
        //1.average score >= 5.5
        //-> razmer na stipendiq otlichen uspeh = average score*25
        double excellentResultScholarship = averageScore*25;

        if (averageScore >= 5.50 && income<minimumWage){
            if (socialScholarship>excellentResultScholarship){
                System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScholarship));
            }else {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excellentResultScholarship));
            }
        }else if (averageScore>=5.50){
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excellentResultScholarship));
        }else if (averageScore>4.50 && income<minimumWage){
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScholarship));
        }else {
            System.out.println("You cannot get a scholarship!");
        }


    }
}
