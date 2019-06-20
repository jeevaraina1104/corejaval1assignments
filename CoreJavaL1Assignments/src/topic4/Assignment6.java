package topic4;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalize f1 = new Finalize();
		Finalize f2 = new Finalize();
		f1= f2;
		Runtime.getRuntime().gc();
	}

}

class Finalize {
protected void finalize() throws Throwable
    {  
   	System.out.println("Finalize Method called") ; 
   } 

}
