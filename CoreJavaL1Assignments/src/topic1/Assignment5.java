package topic1;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		
		System.out.println("Enter the 4 digit number:");
		Scanner in = new Scanner(System.in); 
		String s = in.nextLine();
		
		int number = Integer.parseInt(s);

		int sum = 0;

		while(number != 0){
			
		sum = sum + number % 10;
		number = number /10;
			
		}

		System.out.println("Sum of digits=" + sum);
	}
}
