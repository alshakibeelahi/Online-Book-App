package classes;

import java.lang.*;
import interfaces.GeneralUserOperations;
import interfaces.AccountOperations;

public class User implements GeneralUserOperations, AccountOperations{
	private String nid;
	private String pin;
	private GeneralUser generalUser[];
	private Account account[];

	public User(){
		generalUser = new GeneralUser[500];
		account = new Account[500];
	}

	public User(String nid, String pin){
		this();
		this.nid = nid;
		this.pin = pin;
	}

	public void showDetails(){
		System.out.println("NID : "+nid);
	}

	public void setNID(String nid){this.nid = nid;}
	public void setPIN(String pin){this.pin = pin;}

	public String getNID(){return nid;}
	public String getPIN(){return pin;}

	public boolean createAnAccount(GeneralUser g){
		boolean flag = false;
		for(int i=0; i<generalUser.length; i++){
			if(generalUser[i] == null){
				generalUser[i] = g;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean removeAnAccount(GeneralUser g){
		boolean flag = false;
		for(int i=0; i<generalUser.length; i++){
			if(generalUser[i] == g){
				generalUser[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public void showAllGeneralUser(){
		for(int i=0; i<generalUser.length; i++){
			if(generalUser[i] != null){
				generalUser[i].showDetails();
				System.out.println();
			}
		}
	}

	public GeneralUser searchGeneralUser(String userName, String password){
		GeneralUser g = null;
		for(int i=0; i<generalUser.length; i++){
			if(generalUser[i] != null){
				if(generalUser[i].getGeneralUserName().equals(userName) && generalUser[i].getGeneralPassword().equals(password)){
					g = generalUser[i];
					break;
				}
			}
		}
		return g;
	}

	public GeneralUser searchGeneralUser(String userName){
		GeneralUser g = null;
		for(int i=0; i<generalUser.length; i++){
			if(generalUser[i] != null){
				if(generalUser[i].getGeneralUserName().equals(userName)){
					g = generalUser[i];
					break;
				}
			}
		}
		return g;
	} 

	public GeneralUser forgetPassword(String userName){
		GeneralUser g = null;
		for(int i=0; i<generalUser.length; i++){
			if(generalUser[i] != null){
				if(generalUser[i].getGeneralUserName().equals(userName)){
					g = generalUser[i];
					break;
				}
			}
		}
		return g;
	}

	public boolean createTransactionalAccount(Account ac){
		boolean flag = false;
		for(int i=0; i<account.length; i++){
			if(account[i] == null){
				account[i] = ac;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean removeTransactionalAccount(Account ac){
		boolean flag = false;
		for(int i=0; i<account.length; i++){
			if(account[i] == ac){
				account[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public Account searchTransactionalAccount(int number){
		Account ac = null;
		for(int i=0; i<account.length; i++){
			if(account[i] != null){
				if(account[i].getAccountNumber() == number){
					ac = account[i];
					break;
				}
			}
		}
		return ac;
	}

	public Account forgetPIN(int number){
		Account ac = null;
		for(int i=0; i<account.length; i++){
			if(account[i] != null){
				if(account[i].getAccountNumber() == number){
					ac = account[i];
					break;
				}
			}
		}
		return ac;
	}
}
