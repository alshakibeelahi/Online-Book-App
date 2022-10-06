package classes;

import java.lang.*;
import interfaces.AdminOperation;
import interfaces.UserOperations;
import interfaces.BookOperations;
import interfaces.CartOperations;


public class BookShop implements AdminOperation,UserOperations, BookOperations, CartOperations{
	private String name;
	private Book book[];
	private User user[];
	private Admin admin[];
	private Cart cart[];

	public BookShop(){
		//System.out.println("E - Book Shop");
		book = new Book[1000];
		user = new User[500];
		admin = new Admin[3];
		cart = new Cart[500];
	}

	public BookShop(String name){
		this();
		//System.out.println("P - Book Shop");
		this.name = name;
	    
	}

	public void setName(String name){this.name = name;}

	public String getName(){return name;}

	public void showDetails(){
		System.out.println("Name : "+name);
	}

	public Admin searchAdmin(String dob){
		Admin a = null;
		for(int i=0; i<admin.length;i++){
			if(admin[i] != null){
				if(admin[i].getAdminDateOfBirth().equals(dob)){
					a = admin[i];
					break;
				}
			}
		}
		return a;
	}

	public boolean insertUser(User u){
		boolean flag = false;
		for(int i=0; i<user.length; i++){
			if(user[i]==null){
				user[i]=u;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean removeUser(User u){
		boolean flag = false;
		for(int i=0; i<user.length; i++){
			if(user[i]==u){
				user[i]=null;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public User searchUser(String nid){
		User u = null;
		for(int i=0; i<user.length;i++){
			if(user[i] != null){
				if(user[i].getNID().equals(nid)){
					u = user[i];
					break;
				}
			}
		}
		return u;
	}

	public void showRegisteredUser(){
		for(int i=0; i<user.length; i++){
			if(user[i] != null){
				user[i].showDetails();
				System.out.println();
			}
		}
	}

	public User forgetPIN(String nid){
		User u = null;
		for(int i=0; i<user.length; i++){
			if(user[i] != null){
				if(user[i].getNID().equals(nid)){
					u = user[i];
					break;
				}
			}
		}
		return u;
	}

	public boolean insertBook(Book b){
		boolean flag = false;
		for(int i=0; i<book.length; i++){
			if(book[i]==null){
				book[i]=b;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removeBook(Book b){
		boolean flag = false;
		for(int i=0; i<book.length; i++){
			if(book[i] == b){
				book[i]=null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public void showAllBooks(){
		for(int i=0; i<book.length; i++){
			if(book[i] != null){
				book[i].showDetails();
				System.out.println();
			}
		}
	}

	public Book searchBook(String isbn){
		Book b = null;
		for(int i=0; i<book.length;i++){
			if(book[i] != null){
				if(book[i].getIsbn().equals(isbn)){
					b = book[i];
					break;
				}
			}
		}
		return b;
	}

	public boolean addToCart(Cart c){

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
	public boolean removeFromCart(Cart c){
		boolean flag = false;
		for(int i=0; i<cart.length; i++){
			if(cart[i] == c){
				cart[i]=null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public void showAllBooksInsideCart(){
		for(int i=0; i<cart.length; i++){
			if(cart[i] != null){
				cart[i].showDetailsFromCart();
				System.out.println();
			}
		}
	}

	public Cart searchBookFromCart(String isbn){
		Cart c = null;
		for(int i = 0; i<cart.length; i++){
			if(cart[i] != null){
				if(cart[i].getIsbn().equals(isbn)){
					c = cart[i];
					break;
				}
			}
		}
		return c;
	}
}