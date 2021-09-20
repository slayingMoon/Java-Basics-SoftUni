import java.util.Scanner;

public class NewHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double cost = 0.0;


        switch (flower){
            case "Roses":
                if (flowerCount>80) {
                    cost = (flowerCount * 5)*0.9;
                }else {
                    cost = flowerCount*5;
                }
                break;
            case "Dahlias":
                if (flowerCount>90) {
                    cost = (flowerCount * 3.80)*0.85;
                }else {
                    cost = flowerCount*3.80;
                }
                break;
            case "Tulips":
                if (flowerCount>80) {
                    cost = (flowerCount * 2.80)*0.85;
                }else {
                    cost = flowerCount*2.80;
                }
                break;
            case "Narcissus":
                if (flowerCount<120) {
                    cost = (flowerCount * 3)*1.15;
                }else {
                    cost = flowerCount*3;
                }
                break;
            case "Gladiolus":
                if (flowerCount<80) {
                    cost = (flowerCount * 2.50)*1.20;
                }else {
                    cost = flowerCount*2.50;
                }
                break;
        }
        if (budget>=cost){
            double moneyLeft = budget - cost;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flower,moneyLeft );
        }else {
            double moneyNeeded = cost - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", moneyNeeded);
        }
    }
}
