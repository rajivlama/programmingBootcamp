package practiseproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validPassword {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the password");
		
		String password = sc.nextLine();
		if(isValid(password)) {
			System.out.println("The password is invalid");
		}
		else {
			System.out.println("The password is valid");
		}
		;
		
		
	}
	
	public static boolean isValid(String password) {		
		
		boolean check=false;
		int count=0;
		char ch;
		for(int i = 0; i<password.length(); i++) {
				ch = password.charAt(i);
			if(ch == '0' || ch=='1' || ch == '2' || ch=='3' || ch == '4' || ch=='5' || ch == '6' || ch=='7' ||ch== '8'|| ch == '9') {
				count++;
			}
		}
		if(password.length()<10 || count <2) {
			System.out.println("The length has to be at least 10 characters or at least two digits ");
			check = true;
		}
		else {
			Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
			Matcher matcher = pattern.matcher(password); 
			check = matcher.find();
		}
		return check;
			
	}

}
