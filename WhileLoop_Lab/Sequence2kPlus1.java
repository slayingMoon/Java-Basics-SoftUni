import java.util.Scanner;

public class Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int currentNum = 1;

        while (currentNum <= n) {
            System.out.printf("%d\n", currentNum);
            currentNum=2*currentNum+1;
        }
    }
}
