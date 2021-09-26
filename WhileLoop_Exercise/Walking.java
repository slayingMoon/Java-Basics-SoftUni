import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumSteps = 0;
        String command = scanner.nextLine();

        while (!command.equals("Going home")) {
            int steps = Integer.parseInt(command);
                sumSteps+=steps;

            if (sumSteps >= 10000) {
                break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("Going home")){
            int stepsHome = Integer.parseInt(scanner.nextLine());
            sumSteps += stepsHome;
        }
        if (sumSteps >= 10000) {
            System.out.println("Goal reached! Good job!");
            int moreSteps = sumSteps-10000;
            System.out.printf("%d steps over the goal!", moreSteps);
       }else {
            int stepsRemaining = 10000-sumSteps;
            System.out.printf("%d more steps to reach goal.", stepsRemaining);
       }
    }
}
