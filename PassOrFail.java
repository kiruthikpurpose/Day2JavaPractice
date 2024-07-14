import java.util.*;
public class PassOrFail {
    public static void main(String[] args) {
        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        marks = sc.nextInt();
        if (marks >= 50) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
        sc.close();
    }
}
