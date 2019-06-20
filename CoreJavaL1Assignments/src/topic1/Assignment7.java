package topic1;

import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		
		System.out.println("Enter the number:");
		Scanner in = new Scanner(System.in); 
		String s = in.nextLine();
		int number = Integer.parseInt(s);
		int factorial=Factorial(number);
		System.out.println("The factorial of the number is " + factorial);
	}
	public static int Factorial(int num){
		if(num==0){
			return 1;
		}	
		else{
			return num *Factorial(num-1);
		 }
		}
}
