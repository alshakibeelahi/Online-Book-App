package classes;

import java.lang.*;
import interfaces.TradingOperations;

public abstract class Book implements TradingOperations{
	protected String isbn;
	protected String bookTitle;
	protected String authorName;
	protected double price;
	protected int availableQuantity;
	private static double discountRate;
	

	public Book(){
		//System.out.println("----------------- E - Book -----------------");
	}
	public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity){
		//System.out.println("----------------- P - Book -----------------");
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.price = price;
		this.availableQuantity = availableQuantity;
	}

	public void setIsbn(String isbn){
		this.isbn = isbn;
	}
	public void setBookTitle(String bookTitle){
		this.bookTitle = bookTitle;
	}
	public void setAuthorName(String authorName){
		this.authorName = authorName;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public void setAvailableQuantity(int availableQuantity){
		this.availableQuantity = availableQuantity;
	}
	public static void setDiscountRate(double rate){
		rate = discountRate;
	}

	public String getIsbn(){
		return isbn;
	}
	public String getBookTitle(){
		return bookTitle;
	}
	public String getAuthorName(){
		return authorName;
	}
	public double getPrice(){
		return price;
	}
	public int getAvailableQuantity(){
		return availableQuantity;
	}
	public static double getDiscountRate(){
		return discountRate;
	}

	static{
		discountRate = 20;
	}

	public void priceAfterDiscount(){
		if(discountRate>=0 && discountRate<=100){
			price = price - (price * (discountRate/100));
		}
		else{
			System.out.println("Invalid Discount Rate....");
		}
	}

	public boolean addQuantity(int amount){
		boolean flag = false;
		if(amount>0){
			availableQuantity = availableQuantity + amount;
			flag = true;
			//System.out.println("New Stock updated");
	    }
	    else{
		System.out.println("Invalid amount....");
	    }
	    return flag;
    }

    public boolean sellQuantity(int amount){
    	boolean flag = false;
 	    if(amount>0 && amount<=availableQuantity){
		    availableQuantity = availableQuantity - amount;
		    flag = true;
		    //System.out.println("Total Sell updated");
	    }
	    else{
		    System.out.println("Invalid amount....");
	    }
	    return flag;
    }

    public abstract void showDetails();

}