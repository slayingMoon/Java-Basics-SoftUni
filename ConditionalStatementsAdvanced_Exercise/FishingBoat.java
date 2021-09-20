import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermanCount = Integer.parseInt(scanner.nextLine());
        double cost = 0.0;


        switch (season){
            case "Summer":
            case "Autumn":
                cost = 4200;
                break;
            case "Spring":
                cost = 3000;
                break;
            case "Winter":
                cost = 2600;
                break;
        }
        if (fishermanCount<=6){
            cost = cost*0.9;
        }else if (fishermanCount>=7 && fishermanCount<=11){
            cost = cost*0.85;
        }else if (fishermanCount>=12){
            cost = cost*0.75;
        }
        if (fishermanCount%2==0 && !season.equals("Autumn")){
            cost = cost*0.95;
        }
        if (budget>=cost){
            double moneyLeft = budget-cost;
            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
        }else {
            double moneyNeeded = cost-budget;
            System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded);
        }

    }
}
