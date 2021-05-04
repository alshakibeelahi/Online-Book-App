package classes;

import java.lang.*;

public class TextBook extends Book{
	private int standard;

	public TextBook(){
		super();
		//System.out.println("---------------E - Text Book---------------");
	}

	public TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard){
		super(isbn, bookTitle, authorName, price, availableQuantity);
		//System.out.println("---------------P - Text Book----------------");
		this.standard = standard;
	}

	public void setStandard(int standard){
		this.standard = standard;
	}

	public int getStandard(){
		return standard;
	}

	public void showDetails(){
		System.out.println("\nISBN              : "+isbn);
		System.out.println("Book Title        : "+bookTitle);
		System.out.println("Author Name       : "+authorName);
		System.out.println("Discount          : "+Book.getDiscountRate()+"%");
		System.out.println("Price             : "+price);
		System.out.println("AvailableQuantity : "+availableQuantity);
		System.out.println("Standard          : "+standard);
	}
}