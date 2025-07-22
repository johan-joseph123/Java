package M1;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num , fact=1;
        System.out.println("Enter the number");
        num = sc.nextInt();
        while(num>0){
            fact*=num;
            num--;

        }
        System.out.println("Factorial = "+fact);
        sc.close();

        
    }
    
}
