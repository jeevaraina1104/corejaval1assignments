package Automobile;
 abstract public class Vehicle {
	public String registrationNumber ;
	public String modelName;
	public String ownerName;
	abstract public String modelName();
	abstract public String registrationNumber();
	//abstract public String ownerName();
	
	public Vehicle(String regno, String model, String owner)
	 {
		registrationNumber = regno;
		modelName = model;
		ownerName = owner;
	 }
}