import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mydogs = scanner.nextLine();
        double dogs = Double.parseDouble(mydogs);
        String otheranimals = scanner.nextLine();
        double other = Double.parseDouble(otheranimals);
        double dogprice = dogs * 2.50;
        double otherprice = other * 4;
        double total = dogprice + otherprice;
        System.out.printf("%.2f", total);
        System.out.println(" lv.");

    }
}
