package Assignment2.String;

import java.util.Scanner;
public class remWhiteSpace
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter: ");
		String str = sc.nextLine();
	    String finalstr = "";
		for (int i = 0; i<str.length(); i++){
		    if (str.charAt(i)==' '){
		        continue;
		    }
		    else{
		        finalstr += str.charAt(i);
		    }
		}
		System.out.println(finalstr);
		sc.close();
	}
}
