package classes;

import java.lang.*;

public abstract class GeneralUser{
	protected String gUserName;
	protected String gPassword;

	public GeneralUser(){}
	
	public GeneralUser(String gUserName, String gPassword){
		this.gUserName = gUserName;
		this.gPassword = gPassword;
	}

	public void setGeneralUserName(String gUserName){this.gUserName = gUserName;}
	public void setGeneralPassword(String gPassword){this.gPassword = gPassword;}

	
	public String getGeneralUserName(){return gUserName;}
	public String getGeneralPassword(){return gPassword;}

	public abstract void showDetails();

	
}