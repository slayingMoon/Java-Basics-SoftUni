import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double priceCostume = Double.parseDouble(scanner.nextLine());
        double decor = budget*0.1;



        if (extras > 150) {
            double totalPriceCostumes = priceCostume * extras;
            double discountPriceCostumes = totalPriceCostumes - 0.1 * totalPriceCostumes;
            double discountCost = decor + discountPriceCostumes;
            if (budget >= discountCost) {
                double moneyleft = budget - discountCost;
            System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f leva left.", moneyleft);
            }else {
                double moneyNeeded = discountCost - budget;
                System.out.println("Not enough money!");
                System.out.printf("Wingard needs %.2f leva more.", moneyNeeded);
            }
        }else{
            double totalPriceCostumes = priceCostume*extras;
            double totalCost = decor + totalPriceCostumes;
            if (budget >= totalCost) {
                double moneyleft = budget - totalCost;
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f leva left.", moneyleft);
            }else {
                double moneyNeeded = totalCost - budget;
                System.out.println("Not enough money!");
                System.out.printf("Wingard needs %.2f leva more.", moneyNeeded);
            }
        }

    }
}
