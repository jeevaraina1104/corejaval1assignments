package topic2;

class Payment{
	
protected double amount_of_payment;

Payment(double amt){
	this.amount_of_payment = amt;
}

public double getAmount(){
	return amount_of_payment;
}

public void setAmount(double amount_payable){
	
amount_of_payment = amount_payable;
}

void paymentDetails(){
	System.out.println("The amount payable is: ");
}
}

class CashPayment extends Payment{
	
	CashPayment(double cash){
		super(cash);
	}
	
	void paymentDetails(){
	System.out.println("The Cash amount payable is: " +getAmount());
}
}

class CreditCardPayment extends Payment{
	String name;
	String expiry_date;
	String creditcard_number;
	
	CreditCardPayment(double amount, String name, String expiry_date, String creditcard_number){
		super(amount);
		this.name = name;
		this.expiry_date=expiry_date;
		this.creditcard_number =creditcard_number;
	}
	
	void paymentDetails(){
	System.out.println("The amount of "  +amount_of_payment+ " was paid by "+name +" through credit card "+creditcard_number+" expiring on "+expiry_date);
	
}

}