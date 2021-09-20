import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double cost = 0.0;

        if (season.equals("summer")){
            if (budget<=100){
                System.out.println("Somewhere in Bulgaria");
                cost = budget*0.3;
                System.out.printf("Camp - %.2f", cost);
            }else if (budget>100 && budget<=1000){
                System.out.println("Somewhere in Balkans");
                cost = budget*0.4;
                System.out.printf("Camp - %.2f", cost);
            }else if (budget>1000){
                System.out.println("Somewhere in Europe");
                cost = budget*0.9;
                System.out.printf("Hotel - %.2f", cost);
            }
        }
        if (season.equals("winter")){
            if (budget<=100){
                System.out.println("Somewhere in Bulgaria");
                cost = budget*0.7;
                System.out.printf("Hotel - %.2f", cost);
            }else if (budget>100 && budget<=1000){
                System.out.println("Somewhere in Balkans");
                cost = budget*0.8;
                System.out.printf("Hotel - %.2f", cost);
            }else if (budget>1000){
                System.out.println("Somewhere in Europe");
                cost = budget*0.9;
                System.out.printf("Hotel - %.2f", cost);
            }
        }
    }
}
