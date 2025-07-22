package M1;
import java.util.Scanner;
public class fibonacci {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    int a=0,b=1,c;
    System.out.print("Fibonocci series: ");
    while(num>0){
        System.out.print(a+" ");
        c=a+b;
        a=b;
        b=c;
        num--;
    }
    sc.close();
}
    
}
