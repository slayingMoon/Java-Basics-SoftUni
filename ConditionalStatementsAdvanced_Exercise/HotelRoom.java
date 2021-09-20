import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double priceMayOctoberS = 50;
        double priceMayOctoberA = 65;
        //
        double priceJuneSeptemberS = 75.20;
        double priceJuneSeptemberA = 68.70;
        //
        double priceJulyAugustS = 76;
        double priceJulyAugustA = 77;
        //
        //double discountStudio = 0;
        //double discountApp = 0;
        double finalPriceS = 0;
        double finalPriceA = 0;

        switch (month){
            case "May":
            case "October":
                if (nights<=7){
                    finalPriceS=priceMayOctoberS*nights;
                    finalPriceA=priceMayOctoberA*nights;
                }else if (nights<14){
                    finalPriceS=(priceMayOctoberS*nights)*0.95;
                    finalPriceA=priceMayOctoberA*nights;
                }else {
                    finalPriceS=(priceMayOctoberS*nights)*0.7;
                    finalPriceA=(priceMayOctoberA*nights)*0.9;
                }
                System.out.printf("Apartment: %.2f lv.\n", finalPriceA);
                System.out.printf("Studio: %.2f lv.", finalPriceS);
                break;
            case "June":
            case "September":
                if (nights>14){
                    finalPriceS=(priceJuneSeptemberS*nights)*0.8;
                    finalPriceA=(priceJuneSeptemberA*nights)*0.9;
                }else {
                    finalPriceS=priceJuneSeptemberS*nights;
                    finalPriceA=priceJuneSeptemberA*nights;
                }
                System.out.printf("Apartment: %.2f lv.\n", finalPriceA);
                System.out.printf("Studio: %.2f lv.", finalPriceS);
                break;
            case "July":
            case "August":
                if (nights>14){
                    finalPriceS=priceJulyAugustS*nights;
                    finalPriceA=(priceJulyAugustA*nights)*0.9;
                }else {
                    finalPriceS=priceJulyAugustS*nights;
                    finalPriceA=priceJulyAugustA*nights;
                }
                System.out.printf("Apartment: %.2f lv.\n", finalPriceA);
                System.out.printf("Studio: %.2f lv.", finalPriceS);
                break;
        }
    }
}
