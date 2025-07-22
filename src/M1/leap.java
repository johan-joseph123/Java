package M1;

import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        System.out.print("Enter the year: ");
        int year;
        try(Scanner sc = new Scanner(System.in) ){
            //This method automatically closes Scanner
            year = sc.nextInt();
        }
        if(year%400==0){
            System.out.println("Its a leap year");
        }
        else if(year%4==0 && year%100!=0){
            System.out.println("Its a leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
    
}
