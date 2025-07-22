package M1;
import java.util.Scanner;
public class primeLim {
    public static void main(String[] args) {
        int num=0;
        System.out.print("Enter the upper to list all the prime numbers :");
        try(Scanner sc = new Scanner(System.in)){
            num = sc.nextInt();
        }
        if(num<2){
            System.out.print("Enter the number greater than or equal to 2");
        }
        else{
        for(int i=2;i<=num;i++){
            boolean isPrime=true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
            System.out.println(i+" is a Prime Number");
        }
        }

        }
    }
    
}