package topic3;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no_of_students = 2;
		int total =0;
		float avg =0;
		String name1 = args[0];
		String name2 = args[1];

		try{
			for (int i= 3;i<args.length;i++){
				total = total+Integer.parseInt(args[i]);
				}
				avg = total/6;
				System.out.println("The average marks of" +no_of_students + " Students is " +avg);

		}
		catch(NumberFormatException e){
			System.out.println("The marks enered is not a valid value.Please enter again......." +e);
		}
	}

}
