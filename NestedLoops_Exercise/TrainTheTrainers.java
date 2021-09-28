import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countJury = Integer.parseInt(scanner.nextLine());
        double sumGradesAllPresentations = 0;
        int countGrades = 0;
        //String presentation = scanner.nextLine();
        //double countGrades = Double.parseDouble(scanner.nextLine());
        while (true){
            String presentation = scanner.nextLine();
            if (presentation.equals("Finish")){
                break;
            }
            //ime na prezentaciq -> poluchavame ocenka ot vseki edin ot jurito
            //suma ot ocenkite
            double sumGradesPerPresentation = 0;
            for (int jury = 1; jury <=countJury ; jury++) {
                //dava ocenka
                double grade = Double.parseDouble(scanner.nextLine());
                sumGradesPerPresentation += grade;
                sumGradesAllPresentations += grade;
                countGrades++;
                
            }
            //da izchislim sredno aritmetichno
            double averageGrade = sumGradesPerPresentation / countJury;
            System.out.printf("%s - %.2f.%n", presentation, averageGrade);
        }
        double averageForAll = sumGradesAllPresentations / countGrades;
        System.out.printf("Student's final assessment is %.2f.", averageForAll);
    }
}
