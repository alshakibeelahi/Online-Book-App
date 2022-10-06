package classes;

import java.lang.*;
import interfaces.FinalCartOperations;

public final class Finalize implements FinalCartOperations{
	private Cart cart[] = new Cart[500];
	private double totalBill;

	public void setTotalBill(double totalBill){this.totalBill = totalBill;}
	public double getTotalBill(){return totalBill;}

	public boolean addToFinalize(Cart c){

		boolean flag = false;
		for(int i=0; i<cart.length; i++){
			if(cart[i]==null){
				cart[i]=c;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public void removeBookFromFinalize(){
		for(int i=0; i<cart.length; i++){
			cart[i]=null;
			break;
		}
	}
	public void showAllFinalizedBooks(){
		for(int i=0; i<cart.length; i++){
			if(cart[i] != null){
				System.out.println("\nISBN              : "+cart[i].getIsbn());
				System.out.println("Book Title        : "+cart[i].getBookTitle());
				System.out.println("Author Name       : "+cart[i].getAuthorName());
				System.out.println("Price             : "+cart[i].getPrice());
				System.out.println("Quantity          : "+cart[i].getQuantity());
				System.out.println("Price             : "+cart[i].getPrice()*cart[i].getQuantity());			
				System.out.println();
			}
		}
	}

	public Cart searchBookFromFinalize(String isbn){
		Cart c = null;
		for(int i = 0; i<cart.length; i++){
			if(cart[i] != null){
				if(cart[i].getIsbn() == isbn){
					c = cart[i];
					break;
				}
			}
		}
		return c;
	}

	public void totalBill(int n){
		for(int i=0; i<cart.length; i++){
			if(cart[i] != null){
				totalBill = totalBill + cart[i].getQuantity()*cart[i].getPrice();
			}
		}
	}

}