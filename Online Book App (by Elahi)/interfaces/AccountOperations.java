package interfaces;

import java.util.*;
import classes.Account;

public interface AccountOperations{
	boolean createTransactionalAccount(Account ac);
	boolean removeTransactionalAccount(Account ac);
	Account searchTransactionalAccount(int number);
	Account forgetPIN(int number);
}