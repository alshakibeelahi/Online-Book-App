package classes;

import java.lang.*;

public class Cart{
	protected String isbn;
	protected String bookTitle;
	protected String authorName;
	protected double price;
	protected int availableQuantity;
	protected int quantity;
	protected Book book[];
	
	public Cart(){
		book = new Book[500];
	}
	public Cart(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int quantity){
		this();
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.price = price;
		this.availableQuantity = availableQuantity;
		this.quantity = quantity;
	}

	public void setIsbn(String isbn){this.isbn = isbn;}
	public void setBookTitle(String bookTitle){this.bookTitle = bookTitle;}
	public void setAuthorName(String authorName){this.authorName = authorName;}
	public void setPrice(double price){this.price = price;}
	public void setAvailableQuantity(int availableQuantity){this.availableQuantity = availableQuantity;}
	public void setQuantity(int quantity){this.quantity = quantity;}

	public String getIsbn(){return isbn;}
	public String getBookTitle(){return bookTitle;}
	public String getAuthorName(){return authorName;}
	public double getPrice(){return price;}
	public int getAvailableQuantity(){return availableQuantity;}
	public int getQuantity(){return quantity;}
	

	public void showDetailsFromCart(){
		System.out.println("\nISBN              : "+isbn);
		System.out.println("Book Title        : "+bookTitle);
		System.out.println("Author Name       : "+authorName);
		System.out.println("Price             : "+price);
		System.out.println("Quantity          : "+quantity);
		System.out.println("Bill              : "+price*quantity);
	}

	
	public boolean removedQuantityofBook(int amount){	
	boolean flag = false;	
		if(amount>=0 && amount<=quantity){
			quantity = quantity - amount;
			flag = true;
		}
		else{
			System.out.println("Invalid amount, please give the proper valid amount\n\t\t to end this procedure....");
		}
		return flag;
    }
}