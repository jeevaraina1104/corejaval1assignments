package topic5;

import Automobile.Two_wheeler.Hero;
import Automobile.Two_wheeler.Honda;

public class Assignment3 {
	
	public static void main(String args[]){
	
	Hero v = new Hero("TN-45- S -5512", "Maruti", "Jeeva", 110);
	System.out.println("Details of hero vehicle:");
	System.out.println("Reg_no:"+v.registrationNumber());
	System.out.println("Model:"+v.modelName());
	System.out.println("Owner:"+v.ownerName());
	System.out.println("Speed:"+v.speed());
	System.out.println("Equipment:"+v.radio());
	Honda v1 = new Honda("KA-03- S -5345", "Activa", "Vinay", 120);
	System.out.println("Details of Honda vehicle:");
	System.out.println("Reg_no:"+v1.registrationNumber());
	System.out.println("Model:"+v1.modelName());
	System.out.println("Owner:"+v1.ownerName());
	System.out.println("Speed:"+v1.speed());
	System.out.println("Equipment:"+v1.cdplayer());
	}
}
