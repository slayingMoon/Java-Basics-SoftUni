import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.igrae voleibol samo prez uikendite i praznichnite dni

        //2.igrae v Sofia vsqka subota,kogato ne e na rabota, i ne si putuva do rodniq grad
        //3.igrae i 2/3 ot praznichnite dni
        //3.putuva do rodniq si grad h puti v godinata, kudeto igrae sus starite si priqteli v nedelq
        //4. ne e na rabota 3/4 ot uikendite, v koito e v Sofia
        //5. otdelno prez visokosnite godini igrae s 15% poveche voleibol ot normalnoto
        //---->priemame, che godinata ima 48 uikenda podhodqshti za voleibol
        //---->da se zakrugli rezultata nadolu do nai-blizkoto chislo
        //
        String year = scanner.nextLine();
        int yearlyHolidays = Integer.parseInt(scanner.nextLine());
        int weekendsHomeTown = Integer.parseInt(scanner.nextLine());

        double weekendsSofia = (48-weekendsHomeTown)*(3.0/4);
        double holidaysPlay = yearlyHolidays*(2.0/3);
        double playedDays = weekendsSofia+holidaysPlay+weekendsHomeTown;

        if (year.equals("leap")){
            playedDays=playedDays*1.15;
            System.out.printf("%.0f",Math.floor(playedDays));
        }else if (year.equals("normal")){
            System.out.printf("%.0f",Math.floor(playedDays));
        }


    }
}
