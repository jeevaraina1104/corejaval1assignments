package topic4;

import java.util.HashMap;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GetPhone g1 = new GetPhone();
		g1.addname("Jeeva",new Integer(45877890));
		g1.addname("Vinay", 89876545);
		System.out.println("Got PhoneNumber of " +g1.getphone("Jeeva"));
	}

}

class GetPhone{
	HashMap<String,Integer> hm = new HashMap<String,Integer>();
	public void addname(String name,Integer phone){
		hm.put(name, phone);
	}
	
	public int getphone(String name){
		return hm.get(name);
	}
	
}
