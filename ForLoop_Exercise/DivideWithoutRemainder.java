import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int p1Sum = 0;
        int p2Sum = 0;
        int p3Sum = 0;

        for (int i = 1; i <= n ; i++) {
            int cNum = Integer.parseInt(scanner.nextLine());
            if (cNum % 2 == 0) {
                p1Sum++;
            } if (cNum % 3 == 0) {
                p2Sum++;
            } if (cNum % 4 == 0) {
                p3Sum++;
            }
        }
        double p1Percent = (p1Sum*1.0/n)*100;
        double p2Percent = (p2Sum*1.0/n)*100;
        double p3Percent = (p3Sum*1.0/n)*100;

        System.out.printf("%.2f%%\n", p1Percent);
        System.out.printf("%.2f%%\n", p2Percent);
        System.out.printf("%.2f%%", p3Percent);
    }
}
