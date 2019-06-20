package topic3;

class InvalidAgeException extends Exception{
	 
	 public String toString(){
		 return "Age is less than/equal to 18 or more than/equal to 60";
	 }
}

class Assignment1{

public static void main(String args[]){

	int age = Integer.parseInt(args[0]);

	if(age > 18 && age <60)
		System.out.println("The age entered is "+age);
	else 
		try
		{
			throw new InvalidAgeException();
		}
		catch(InvalidAgeException e)
		{
			e.printStackTrace();
		}
	}
}


