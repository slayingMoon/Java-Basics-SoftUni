import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //vsichki chisla ot 1111 do 9999

        for (int number = 1111; number <=9999 ; number++) {
            //da vzemem vsichki cifri na chisloto
            //1245
            int firstDigit = number / 1000 % 10;
            int secondDigit = number / 100 % 10;
            int thirdDigit = number / 10 % 10;
            int fourthDigit = number % 10;

            //proverka dali chisloto e specialno
            // n / first ; n / second ; n / third ; n / fourth

            boolean check1 = firstDigit != 0 && n % firstDigit == 0;
            boolean check2 = secondDigit != 0 && n % secondDigit == 0;
            boolean check3 = thirdDigit != 0 && n % thirdDigit == 0;
            boolean check4 = fourthDigit != 0 && n % fourthDigit == 0;

            if (check1 && check2 && check3 && check4){
                System.out.print(number + " ");
            }

        }
    }
}
