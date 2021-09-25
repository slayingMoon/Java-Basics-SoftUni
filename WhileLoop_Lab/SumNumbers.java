import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sumNums = 0;

        while (sumNums < num) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sumNums+=currentNum;
        }
        System.out.print(sumNums);
    }
}
