import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());

        double swimmingTime = distance*secondsPerMeter;
        double delay = Math.floor(distance/15);
        double delaySeconds = delay*12.5;
        double totalTime = swimmingTime + delaySeconds;

        if (totalTime<record){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }else {
            double neededTime = totalTime - record;
            System.out.printf("No, he failed! He was %.2f seconds slower.", neededTime);
        }

    }
}
