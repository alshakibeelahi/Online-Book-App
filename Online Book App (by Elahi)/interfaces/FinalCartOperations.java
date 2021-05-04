package interfaces;

import java.lang.*;
import classes.Cart;

public interface FinalCartOperations
{
	boolean addToFinalize(Cart c);
	void removeBookFromFinalize();
	void showAllFinalizedBooks();
	Cart searchBookFromFinalize(String isbn);
}