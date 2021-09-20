import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourExam = Integer.parseInt(scanner.nextLine());
        int minutesExam = Integer.parseInt(scanner.nextLine());
        int hourArrival = Integer.parseInt(scanner.nextLine());
        int minutesArrival = Integer.parseInt(scanner.nextLine());

        int totalExamTime = hourExam*60 + minutesExam;
        int totalArrivalTime = hourArrival*60 + minutesArrival;

        //Late
        if (totalArrivalTime>totalExamTime){
            System.out.println("Late");
            int lateArrival = totalArrivalTime-totalExamTime;
            //zakusnenie pod 60 minuti
            if (lateArrival<60) {
                System.out.printf("%d minutes after the start", lateArrival);
            }else {
                //zakusnenie nad 60 minuti
                int hours = lateArrival/60;
                int minutes = lateArrival%60;
                System.out.printf("%d:%02d hours after the start", hours,minutes);
            }
        }
        //On Time
        else if (totalArrivalTime==totalExamTime||totalExamTime-totalArrivalTime<=30){
            System.out.println("On time");
            int onTime = totalExamTime-totalArrivalTime;
            if (onTime<=30 && onTime !=0 || totalArrivalTime != totalExamTime){
                System.out.printf("%d minutes before the start", onTime);
            }

        }
        //Early
        else if (totalExamTime-totalArrivalTime>30){
            System.out.println("Early");
            //s kolko minuti podranqvame
            int earlyArrival = totalExamTime-totalArrivalTime;
            //po-rano s po-malko ot chas
            if (earlyArrival<60){
                System.out.printf("%d minutes before the start", earlyArrival);
            }
            //po-rano s poveche ot chas
            else {
                int hours = earlyArrival/60;
                int minutes = earlyArrival%60;
                System.out.printf("%d:%02d hours before the start", hours,minutes);
            }
        }
    }
}
