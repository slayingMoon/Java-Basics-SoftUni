import java.text.NumberFormat;
import java.util.Scanner;

public class USDToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getNumberInstance();
        //1.променлива за долари(идват от конзолата)
        //2. 1USD = 1.79549 BGN
        //3. променлива за бг лева = USD * 1.79549 (долари * курс)
        //4. принтираме със System.out.print..
        //* Алгоритъм = стъпките през които ще минем за да решим дадена задача
        double USD = Double.parseDouble(scanner.nextLine());
        double BGN = 1.79549*USD;

        System.out.printf("%.2f",BGN);
    }
}

