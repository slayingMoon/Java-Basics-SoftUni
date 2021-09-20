import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        switch (operator){
            case "+":
                int sum = N1 + N2;
                //even/odd
                if (sum%2==0){
                    System.out.printf("%d %s %d = %d - even", N1,operator,N2,sum);
                }else {
                    System.out.printf("%d %s %d = %d - odd", N1,operator,N2,sum);
                }
                break;
            case "-":
                int diff = N1 - N2;
                //even/odd
                if (diff%2==0){
                    System.out.printf("%d %s %d = %d - even", N1,operator,N2,diff);
                }else {
                    System.out.printf("%d %s %d = %d - odd", N1,operator,N2,diff);
                }
                break;
            case "*":
                int multiply = N1 * N2;
                //even/odd
                if (multiply%2==0){
                    System.out.printf("%d %s %d = %d - even", N1,operator,N2,multiply);
                }else {
                    System.out.printf("%d %s %d = %d - odd", N1,operator,N2,multiply);
                }
                break;
            case "/":
                if (N2==0){
                    System.out.printf("Cannot divide %d by zero", N1);
                }else {
                    double divide = N1 * 1.0 / N2;
                    System.out.printf("%d %s %d = %.2f", N1, operator, N2, divide);
                }
                break;
            case "%":
                if (N2==0){
                    System.out.printf("Cannot divide %d by zero", N1);
                }else {
                    int modulDiv = N1 % N2;
                    System.out.printf("%d %s %d = %d", N1, operator, N2, modulDiv);
                }
                break;
        }
    }
}
