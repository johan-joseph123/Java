package M1;
import java.util.Scanner;
public class reverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();
        int modulus=0, reverse=0;
        
        for(;num>0;num=num/10){
            modulus=num%10;
            reverse=reverse*10+modulus;
        }
        System.out .print("Reversed number: "+reverse);
    }
    
}
