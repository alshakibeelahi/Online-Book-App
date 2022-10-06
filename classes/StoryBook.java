package classes;

import java.lang.*;

public class StoryBook extends Book{
	private String category;

	public StoryBook(){
		super();
		//System.out.println("---------------E - Story Book---------------");
	}

	public StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category){
		super(isbn, bookTitle, authorName, price, availableQuantity);
		//System.out.println("---------------P - Story Book---------------");
		this.category = category;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}

	public void showDetails(){
		System.out.println("\nISBN              : "+isbn);
		System.out.println("Book Title        : "+bookTitle);
		System.out.println("Author Name       : "+authorName);
		System.out.println("Discount          : "+Book.getDiscountRate()+"%");
		System.out.println("Price             : "+price);
		System.out.println("AvailableQuantity : "+availableQuantity);
		System.out.println("Category          : "+category);
	}
}