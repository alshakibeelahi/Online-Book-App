package classes;

import java.util.Scanner;

public class Admin{
	protected String uName;
	protected String password;
	protected String dob;
	public Admin(){}
	
	public Admin(String uName, String password, String dob){
		this.uName = uName;
		this.password = password;
		this.dob = dob;
	}

	public void setAdminUserName(String uName){this.uName = uName;}
	public void setAdminPassword(String password){this.password = password;}
	public void setAdminDateOfBorth(String dob){this.dob = dob;}

	
	public String getAdminUserName(){return uName;}
	public String getAdminPassword(){return password;}
	public String getAdminDateOfBirth(){return dob;}
}