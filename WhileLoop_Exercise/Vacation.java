import javax.swing.*;
import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyVacation = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        int daysCount = 0;
        int spendingDays = 0;

        while (budget < moneyVacation && spendingDays < 5) {
            String action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            daysCount++;
            if (action.equals("save")) {
                budget+=money;
                spendingDays=0;
            }else if (action.equals("spend")){
                budget-=money;
                spendingDays++;
                if (budget < 0) {
                    budget = 0;
                }
            }
        }
        if (spendingDays == 5) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", daysCount);
        }
        if (budget >= moneyVacation) {
            System.out.printf("You saved the money for %d days.", daysCount);
        }
    }
}
