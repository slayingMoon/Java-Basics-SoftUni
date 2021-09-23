import javax.naming.spi.DirObjectFactory;
import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int p1Sum = 0;
        int p2Sum = 0;
        int p3Sum = 0;
        int p4Sum = 0;
        int p5Sum = 0;

        for (int i = 1; i <= n ; i++) {
            int cNum = Integer.parseInt(scanner.nextLine());
            if (cNum < 200) {
                p1Sum++;
            }else if (cNum >= 200 && cNum <400){
                p2Sum++;
            } else if (cNum >= 400 && cNum < 600) {
                p3Sum++;
            } else if (cNum >= 600 && cNum < 800) {
                p4Sum++;
            } else if (cNum >= 800) {
                p5Sum++;
            }
        }
        double p1Percent = (p1Sum*1.0/n)*100;
        System.out.printf("%.2f%%\n", p1Percent);
        double p2Percent = (p2Sum*1.0/n)*100;
        System.out.printf("%.2f%%\n", p2Percent);
        double p3Percent = (p3Sum*1.0/n)*100;
        System.out.printf("%.2f%%\n", p3Percent);
        double p4Percent = (p4Sum*1.0/n)*100;
        System.out.printf("%.2f%%\n", p4Percent);
        double p5Percent = (p5Sum*1.0/n)*100;
        System.out.printf("%.2f%%", p5Percent);
    }
}
