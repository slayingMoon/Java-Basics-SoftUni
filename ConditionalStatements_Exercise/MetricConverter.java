import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        String metricValue = scanner.nextLine();
        String outputValue = scanner.nextLine();
        double finalNumber = 0;

        if (metricValue.equals("mm") && outputValue.equals("m")){
            finalNumber = number / 1000;
        }else if (metricValue.equals("mm") && outputValue.equals("cm")){
            finalNumber = number / 10;
        }else if (metricValue.equals("cm") && outputValue.equals("m")){
            finalNumber = number / 100;
        }else if (metricValue.equals("cm") && outputValue.equals("mm")){
            finalNumber = number*10;
        }else if (metricValue.equals("m") && outputValue.equals("mm")){
            finalNumber = number * 1000;
        }else if (metricValue.equals("m") && outputValue.equals("cm")){
            finalNumber = number * 100;
        }
        System.out.printf("%.3f", finalNumber);
    }
}
