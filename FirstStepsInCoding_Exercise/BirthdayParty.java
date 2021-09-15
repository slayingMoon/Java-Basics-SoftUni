import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hallPrice = Integer.parseInt(scanner.nextLine());
        double cakePrice = 0.2 * hallPrice;
        double drinksPrice = cakePrice - 0.45 * cakePrice; //0.55 * cakePrice
        double animatorPrice = hallPrice / 3.0;
        double expenses = hallPrice + cakePrice + drinksPrice + animatorPrice;
        System.out.println(expenses);
    }
}
