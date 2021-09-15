import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depositSum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double dividendPerYear = depositSum * (percent / 100); //лихва за година
        double dividendPerMonth = dividendPerYear / 12;
        //сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        double sum = depositSum + months * dividendPerMonth;
        System.out.println(sum);
    }
}
