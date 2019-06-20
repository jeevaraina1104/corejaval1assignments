package topic2;

public class Book {

	String isbn;
	String title;
	String author;
	float price;

	Book(String isbn, String title, String author, float price ){
	this.isbn = isbn;
	this.title = title;
	this.author = author;
	this.price = price;
	 
	}

	void displaydetails(){
	System.out.println("The isbn of Book is: " +isbn);
	System.out.println("The title of Book is: " +title);
	System.out.println("The Author of Book is: "+ author);
	System.out.println("The price of Book is: "+ price);

	}

	float discountedprice(float discount_percent){
	float discounted_price = price -(discount_percent/100)*price ;
	return discounted_price ;
	}

}
