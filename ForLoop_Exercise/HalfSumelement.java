import java.util.Scanner;

public class HalfSumelement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum += currentNumber;
            if (currentNumber > max) {
                max = currentNumber;
            }
        }
        int sumOthers = sum - max;
            if (max==sumOthers){
                System.out.println("Yes");
                System.out.print("Sum = " + sumOthers);
            }else {
                int diff = Math.abs(sumOthers - max);
                System.out.println("No");
                System.out.print("Diff = " + diff);
            }

    }
}
