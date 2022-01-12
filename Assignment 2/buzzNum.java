package Assignment2.Number;

import java.util.Scanner;

public class buzzNum {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n%7==0 || n%10==7){
            System.out.println(n+" is a Buzz number");
        }
        else{
            System.out.println(n+" is NOT a Buzz number");
        }
        sc.close();
    }
}
