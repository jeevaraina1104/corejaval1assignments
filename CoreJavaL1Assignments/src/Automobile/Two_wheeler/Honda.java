package Automobile.Two_wheeler;
public class Honda extends Automobile.Vehicle{
	int speed_honda ;
	public Honda(String regno, String model, String owner, int speed)
	{
		super(regno, model,owner);
		speed_honda = speed	;
	}

public int speed(){
 return this.speed_honda ;
}

public String cdplayer(){
return "Starting cd player";
}


public String modelName(){
return this.modelName;
}
public String registrationNumber(){
	return this.registrationNumber ;
}
public String ownerName(){
	return this.ownerName;
}
}






