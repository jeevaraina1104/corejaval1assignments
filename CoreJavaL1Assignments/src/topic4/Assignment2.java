package topic4;

import java.util.Date;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long t= System.currentTimeMillis();
		long end = t+20000;
		while(System.currentTimeMillis() < end) {
		  Date t1 = new Date();
		  System.out.println("Current date is " +t1);
		  try{
		  Thread.sleep( 2000 );
		  }
		  catch(InterruptedException e){
			  	e.printStackTrace();
		  }
		  
		}
	}

}
