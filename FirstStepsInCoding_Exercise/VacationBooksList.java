import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.да си прочетем входните данни и да ги съхраним в променливи
        //2. за колко часа трябва да прочете книгата: 212стр./20стр./час= 10 часа
        //3. за колко часа на ден трябва да прочете книгата: 10часа/2дни= 5 часа на ден
        //4.да печатаме получените часове

        int bookPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int readingDays = Integer.parseInt(scanner.nextLine());

        int hoursToRead = bookPages/pagesPerHour;
        int hoursPerDay = hoursToRead/readingDays;

        System.out.println(hoursPerDay);

    }
}
