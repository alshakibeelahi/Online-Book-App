package classes;

import java.lang.*;
import java.util.Scanner;

public class Info extends GeneralUser{
	private String fName;
	private String lName;
	private String phoneNumber;
	private String presentAddress;
	
	public Info(String gUserName, String gPassword){
		super(gUserName, gPassword);
	}
	public Info(String fName, String lName, String phoneNumber, String presentAddress, String gUserName, String gPassword){
		super(gUserName, gPassword);
		this.fName = fName;
		this.lName = lName;
		this.phoneNumber = phoneNumber;
		this.presentAddress = presentAddress;
		}

	public void showDetails(){
		System.out.println("Name            : "+fName+" "+lName);
		System.out.println("User Name       : "+gUserName);
		System.out.println("Phone Number    : "+phoneNumber);
		System.out.println("Present Address : "+presentAddress);
	}
	
}