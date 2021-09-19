import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String evaluation = scanner.nextLine();
        //double roomForOne = 18.0;
        //double apartment = 25.0;
        //double presidentApp = 35.0;
        double cost = 0.0;
        //double discountPrice =0.0;
        int nights = days-1;


        switch (room){
            case "room for one person":
                if (days<10){
                    cost = nights*18;
                }else if (days>10 && days<15){
                    cost = nights*18;
                }else if (days>15){
                    cost = nights*18;
                }
                break;
            case "apartment":
                if (days<10){
                    cost = (nights*25)*0.7;
                }else if (days>10 && days<15){
                    cost = (nights*25)*0.65;
                }else if (days>15){
                    cost = (nights*25)*0.5;
                }
                break;
            case "president apartment":
                if (days<10){
                    cost = (nights*35)*0.9;
                }else if (days>10 && days<15){
                    cost = (nights*35)*0.85;
                }else if (days>15){
                    cost = (nights*35)*0.8;
                }
                break;
        }
        if (evaluation.equals("positive")){
            System.out.printf("%.2f", cost*1.25);
        }else if (evaluation.equals("negative")){
            System.out.printf("%.2f", cost*0.9);
        }
    }
}
