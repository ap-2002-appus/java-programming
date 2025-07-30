class Book{
	String title;
	String author;
	double price;
	int quantity;
	double totalValue;

Book(String title,String author,double price,int quantity){
	this.title = title;
	this.author = author;
	this.price = price;
	this.quantity = quantity;
	
}
public void totalVal() {
	totalValue = price*quantity;
}
public void displayDetails() {
	System.out.println("Title of the Book:"+title);
	System.out.println("Author:"+author);
	System.out.println("Price:"+price);
	System.out.println("Quantity:"+quantity);
	System.out.println("Total Value:"+totalValue);
	
}

}


public class BookStore {

	public static void main(String[] args) {
		Book b1 = new Book("Wings ","ghghg",500,5);
		b1.totalVal();
		b1.displayDetails();
		Book b2 = new Book("world wide","ygj",465,10);
		b2.totalVal();
		b2.displayDetails();
	
	}

}
		

	


