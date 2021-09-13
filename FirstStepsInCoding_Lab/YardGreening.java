import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double squareMeters = Double.parseDouble(scanner.nextLine());
        double Price = squareMeters*7.61;
        double discount = Price*0.18;
        double finalPrice = Price - discount;
        System.out.printf("The final price is: %.2f lv. %n", finalPrice);
        System.out.printf("The discount is: %.2f lv.", discount);


    }
}
