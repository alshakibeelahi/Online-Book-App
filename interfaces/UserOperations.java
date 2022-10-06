package interfaces;

import java.lang.*;
import classes.User;

public interface UserOperations
{
	boolean insertUser(User u);
	boolean removeUser(User u);
	User searchUser(String nid);
	void showRegisteredUser();
	User forgetPIN(String nid);
}