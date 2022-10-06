package interfaces;

import java.lang.*;
import classes.Cart;

public interface CartOperations
{
	boolean addToCart(Cart c);
	boolean removeFromCart(Cart c);
	void showAllBooksInsideCart();
	Cart searchBookFromCart(String isbn);
}