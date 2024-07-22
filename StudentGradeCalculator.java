import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name of Student : ");
        String Name = sc.nextLine();
        System.out.println(" Enter the Marks :");
        System.out.println("Enter the Physics marks :");
        float physics = sc.nextInt();
        System.out.println("Enter the chemistry marks :");
        float chemistry = sc.nextInt();
        System.out.println("Enter the mathematics marks :");
        float math = sc.nextInt();
        System.out.println("Enter the English marks :");
        float English = sc.nextInt();
        System.out.println("Enter the Hindi marks :");
        float Hindi = sc.nextInt();


        float totalkmarks = physics + chemistry + math + English + Hindi;
        float percentage = (physics + chemistry + math + English + Hindi) / 5.0f;
        String Grade;
        if (percentage > 40 && percentage < 60)
            Grade = "C";
        else if (percentage > 60 && percentage < 80)
            Grade = "B";
        else if (percentage > 80 && percentage < 90)
            Grade = "A";
        else if (percentage < 100 && percentage >= 91)
            Grade = "A+";
        else
            Grade = "fail";
        System.out.println("Total marks=" + totalkmarks);
        System.out.println("percentage=" + percentage);
        System.out.println("Grade=" + Grade);

    }
}