import java.util.Scanner;

public class GodzillaVsKong_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double priceCostume = Double.parseDouble(scanner.nextLine());
        //
        double decor = budget*0.1;
        double priceAllCostumes = priceCostume*extras;

        if (extras > 150){
            priceAllCostumes = priceAllCostumes - 0.1*priceAllCostumes;
        }
        double totalCost = priceAllCostumes + decor;

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
