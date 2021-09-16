import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        double area = 0;

        if (figure.equals("square")){
            double squareSide = Double.parseDouble(scanner.nextLine());
            area = squareSide*squareSide;
            System.out.printf("%.3f", area);
        }else if (figure.equals("rectangle")){
            double rectangleWidth = Double.parseDouble(scanner.nextLine());
            double rectangleHeight = Double.parseDouble(scanner.nextLine());
            area = rectangleWidth*rectangleHeight;
            System.out.printf("%.3f", area);
        }else if (figure.equals("circle")){
            double radius = Double.parseDouble(scanner.nextLine());
            area = radius*radius*Math.PI;
            System.out.printf("%.3f", area);
        }else if (figure.equals("triangle")){
            double triangleSide = Double.parseDouble(scanner.nextLine());
            double triangleHeight = Double.parseDouble(scanner.nextLine());
            area = triangleHeight*triangleSide/2;
            System.out.printf("%.3f",area);
        }
    }
}
