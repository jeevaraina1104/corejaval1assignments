package topic3;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int number = args.length;
		double average ;

		try {
		 if (number <5){
			throw new ArrayIndexOutOfBoundsException();
		 }
		else{ 
			for(int i=0; i<args.length; i++)
			{
				total = total + Integer.parseInt(args[i]);
			}
			System.out.println(total);
			average = (double)total / number;
			System.out.println("The averge of integers entered is " +average);
		}
		}
		catch (ArrayIndexOutOfBoundsException e){
			e.printStackTrace();	
		}

		}
	}


