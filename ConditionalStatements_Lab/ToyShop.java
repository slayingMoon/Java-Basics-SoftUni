import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceVacation = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());
        double sum = puzzles*2.60+dolls*3+bears*4.10+minions*8.20+trucks*2;
        double toyAmount = puzzles+dolls+bears+minions+trucks;


        if (toyAmount > 50){
            double discount = sum*0.25;
            double totalCost = sum - discount;
            double rent = totalCost*0.1;
            double profit = totalCost - rent;

            if (profit>priceVacation){
                double moneyLeft = profit - priceVacation;
                System.out.printf("Yes! %.2f lv left.", moneyLeft);
            }else {
                double moneyNeeded = priceVacation - profit;
                System.out.printf("Not enough money! %.2f lv needed.", moneyNeeded);
            }
        }else {
            double rent = sum*0.1;
            double profit = sum - rent;
            if (profit>priceVacation){
                double moneyLeft = profit - priceVacation;
                System.out.printf("Yes! %.2f lv left.", moneyLeft);
            }else {
                double moneyNeeded = priceVacation - profit;
                System.out.printf("Not enough money! %.2f lv needed.", moneyNeeded);
            }
        }

    }
}
