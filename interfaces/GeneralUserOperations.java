package interfaces;

import java.lang.*;
import classes.GeneralUser;

public interface GeneralUserOperations
{
	boolean createAnAccount(GeneralUser g);
	boolean removeAnAccount(GeneralUser g);
	GeneralUser searchGeneralUser(String userName, String password);
	void showAllGeneralUser();
}