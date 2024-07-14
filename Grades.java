import java.util.*;

public class Grades {
    public static void main(String[] args) {
        int score;
        System.out.println("Enter your marks: ");
        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();
        if (score >= 80 && score <= 100){
            System.out.println("Grade: A");
        } else if (score >= 60 && score < 80) {
            System.out.println("Grade: B");
        } else if (score >= 50 && score < 60) {
                System.out.println("Grade: C");
        } else if (score >=0 && score < 50) {
                    System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid Marks");
        }
        sc.close();
    }
}
