package topic1;

import java.util.Arrays;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = {347, 988, 786, 695, 127};
		Arrays.sort(array);
		
		int len = array.length;
		System.out.println("The greatest in an array is: " + array[len-1]);
	}

}
