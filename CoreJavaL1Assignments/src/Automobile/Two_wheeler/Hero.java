package Automobile.Two_wheeler;

public class Hero extends Automobile.Vehicle{
	int speed_hero;
	public Hero(String regno, String model, String owner, int speed)
	{
		super(regno, model,owner);
		speed_hero = speed;
	}
	
public int speed(){
	return this.speed_hero;
}

public String radio(){
 return "Starting the radio.";
}

public String modelName(){
return modelName;
}

public String registrationNumber(){
	return registrationNumber;
}

public String ownerName(){
	return ownerName;
}
}
