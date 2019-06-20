package topic2;

public class Assignment4 {
	
	public static void main(String args[]){
		CashPayment p1 = new CashPayment(456);
		CashPayment p2 = new CashPayment(789.09);
		CreditCardPayment c1 = new CreditCardPayment(1104.98,"Jeeva", "10/21/", "XXXX-XXXX-XXXX-1104");
		CreditCardPayment c2 = new CreditCardPayment(706.09,"Vinay", "10/21/", "XXXX-XXXX-XXXX-1996");
		p1.paymentDetails();
		p2.paymentDetails();
		c1.paymentDetails();
		c2.paymentDetails();
	}
}
