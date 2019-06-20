package topic2;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float discount = 10;

		Book b1 = new Book("11049-06574", "Core Java Programming", "Smith", 1200);

		b1.displaydetails();

		float discounted_price = b1.discountedprice(discount);

		System.out.println("The discounted price " +discounted_price);

	}

}
