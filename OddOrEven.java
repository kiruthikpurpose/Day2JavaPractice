import java.util.*;

public class OddOrEven{
    public static void main(String[] args){
        int num;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println(num + " is even");
        }
        else{
            System.out.println(num + " is odd");
        }
        sc.close();
    }
}