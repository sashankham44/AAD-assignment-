package Assignment2.Basic;

import java.util.Scanner;

public class asciiConvert
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter: ");
		char inp = sc.next().charAt(0);

		int value = inp;

		System.out.println("ASCII value: "+value);
		sc.close();
	}
	
}
