package M1;
import java.util.Scanner;
public class ternaryop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum,secondNum;
        System.out.println("Enter the first number:");
        firstNum= sc.nextInt();
        System.out.println("Enter the second number:");
        secondNum= sc.nextInt();
        int largeNum;
        largeNum= firstNum > secondNum ? firstNum : secondNum;
        System.out.println("I "+largeNum + " is largest number");
        sc.close();

        
    }

    
}