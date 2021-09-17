import java.util.Scanner;

public class TimePlus15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int startTimeMinutes = hours * 60 + minutes;
        int timeAfter15Minutes = startTimeMinutes + 15;
        int finalHour = timeAfter15Minutes / 60;
        int finalMinutes = timeAfter15Minutes % 60;

        if (finalHour == 24){
            finalHour = 0;
        }
        System.out.printf("%d:%02d", finalHour, finalMinutes);
    }
}
