import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int firstDigit = 1; firstDigit <=n ; firstDigit++) {
            for (int secondDigit = 1; secondDigit <=n ; secondDigit++) {
                for (char thirdDigit = 'a'; thirdDigit <'a' + l ; thirdDigit++) {
                    for (char fourthDigit = 'a'; fourthDigit <'a' + l ; fourthDigit++) {
                        for (int fifthDigit = 1; fifthDigit <=n ; fifthDigit++) {

                            if (fifthDigit > firstDigit && fifthDigit > secondDigit){
                                //validna kombinaciq
                                System.out.printf("%d%d%c%c%d ", firstDigit, secondDigit, thirdDigit, fourthDigit, fifthDigit);
                            }
                        }
                        
                    }
                    
                }
                
            }
            
        }
    }
}
