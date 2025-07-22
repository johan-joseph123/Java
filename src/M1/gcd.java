package M1;
import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        
        int FirstNum,SecondNum;
        try(Scanner sc = new Scanner(System.in) ){
            System.err.print("Enter the First number: ");
            FirstNum = sc.nextInt();
            System.err.print("Enter the Second number: ");
            SecondNum = sc.nextInt();
            }
            int x=FirstNum,y=SecondNum;
            while(y!=0){
                int temp=y;
                y=x%y;
                x=temp;
                
            }
            System.out.print("Greatest Common Divisor is: "+x);
           
        }
}
