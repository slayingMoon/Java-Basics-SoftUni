import java.util.Scanner;

public class GiftsFromSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number1 = scanner.nextLine();
        int n = Integer.parseInt(number1);

        String number2 = scanner.nextLine();
        int m = Integer.parseInt(number2);

        String number3 = scanner.nextLine();
        int s = Integer.parseInt(number3);


        for (int i = m; i > n; i--) {

            if (i % 2 == 0 && i % 3 == 0) {

                if (i == s) {
                    break;
                } else {

                    System.out.print(i + " ");
                }
            }
        }
    }
}
