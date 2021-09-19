import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        double price = 0.0;

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")){
            switch (fruit){
                case "banana":
                    price=amount*2.50;
                    break;
                case "apple":
                    price=amount*1.20;
                    break;
                case "orange":
                    price=amount*0.85;
                    break;
                case "grapefruit":
                    price=amount*1.45;
                    break;
                case "kiwi":
                    price=amount*2.70;
                    break;
                case "pineapple":
                    price=amount*5.50;
                    break;
                case "grapes":
                    price=amount*3.85;
                    break;
                default:
                    System.out.println("error");
                    break;
            }
            System.out.printf("%.2f", price);
        }else if (day.equals("Saturday") || day.equals("Sunday")){
            switch (fruit){
                case "banana":
                    price=amount*2.70;
                    break;
                case "apple":
                    price=amount*1.25;
                    break;
                case "orange":
                    price=amount*0.90;
                    break;
                case "grapefruit":
                    price=amount*1.60;
                    break;
                case "kiwi":
                    price=amount*3.00;
                    break;
                case "pineapple":
                    price=amount*5.60;
                    break;
                case "grapes":
                    price=amount*4.20;
                    break;
                default:
                    System.out.println("error");
                    break;
            }
            System.out.printf("%.2f", price);
        }else {
            System.out.println("error");
        }
    }
}
