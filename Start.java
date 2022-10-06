import java.util.Scanner;
import java.util.Random;
import classes.*;
import fileio.*;
import java.io.*;
import java.io.File;

public class Start{
    public static void main(String[] args){

    	try{
	        BookShop b = new BookShop();

	        UserInfo file1 = new UserInfo();
	        Sales file2 = new Sales();
	        Transactions file3 = new Transactions();

	        System.out.println("\n------> Welcome to Shakib Book Shop <------");
	        Finalize f = new Finalize();
	        User u = new User();
	        Account adAC = new Account(000001,"shakib",436652);
	        Scanner sc = new Scanner(System.in);
	        InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader bfr = new BufferedReader(isr);
	        Random rn = new Random();

	        boolean repeat = true;
 
        
            while(repeat){
                System.out.println("\n1. Admin Access\n2. Registration for User \n3. User Access\n4. Exit");
                System.out.print("\nEnter your choice : ");
                int choice = sc.nextInt();
                switch(choice){

                    case 1:
                        System.out.println("\n-------------------------------------------");
                        System.out.println("------ You have selected Admin Access -----");
                        System.out.println("-------------------------------------------");

                        Admin a = new Admin("Shakib","436652","09-09-2000");
                        
                        System.out.println("\n1. Login \n2. Forget Password \n3. Go Back");
                        System.out.print("\nEnter your choice : ");
                        int choice1 = sc.nextInt();
                            switch(choice1){

                                case 1:
                                    System.out.println("\n-------------------------------------------");
                                    System.out.println("--------- You have selected Login ---------");
                                    System.out.println("-------------------------------------------");

                                    System.out.print("\nEnter User Name : ");
                                    String userName1c1 = bfr.readLine();
                                    System.out.print("Enter Password  : ");
                                    String pass1c1 = bfr.readLine();

	                                if(userName1c1.equals(a.getAdminUserName()) && pass1c1.equals(a.getAdminPassword())){
	                                    System.out.println("\n-------------------------------------------");
			                            System.out.println("------------ Login Successful ------------");
			                            System.out.println("-------------------------------------------");
			                            boolean repeat1 = true;
		                                while(repeat1){
			                                System.out.println("\n1. Admin Access Pannel \n2. User Access Pannel \n3. Transactions Control Pannel \n4. Logout");
			                                System.out.print("\nEnter your choice : ");
		                                    int choice1c1 = sc.nextInt();
			                                
			                                switch(choice1c1){
			                                    	case 1: 
			                                    	System.out.println("\n-------------------------------------------");
		                                    		System.out.println("-- You have selected Admin Access Pannel --");
		                                    		System.out.println("-------------------------------------------");
						                                
		                                    			Boolean repeat1c1 = true;
		                                    			while(repeat1c1){
						                                    System.out.println("\n1. Insert a Book \n2. Remove a Book \n3. Change in Quantity \n4. Search Book \n5. See All Books \n6. Sales Details \n7. Go Back");
						                                    System.out.print("\nEnter your choice : ");
					                                        int choice1c1c1 = sc.nextInt();
					                                    	switch(choice1c1c1){
					                                    		case 1:
					                                    			System.out.println("\n-------------------------------------------");
						                                        	System.out.println("----- You have selected Insert a Book -----");
						                                            System.out.println("-------------------------------------------");

						                                            System.out.println("\nRight now, there are 2 types of Books : ");
						                                            System.out.println("\t1. Text Book");
						                                            System.out.println("\t2. Story Book");
						                                            System.out.println("\t3. Go Back");
						                                            System.out.print("\nEnter your type : ");

						                                            int type1c1 = sc.nextInt();

						                                            Book book1c1 = null;

						                                            if(type1c1 == 1){
							                                            System.out.println("\n-------------------------------------------");
							                                            System.out.println("------- You have selected Text Book -------");
							                                            System.out.println("-------------------------------------------");

							                                            System.out.print("\nEnter ISBN               : ");
							                                            String isbn1c1t1 = bfr.readLine();
							                                            System.out.print("Enter Book Title         : ");
							                                            String bTitle1c1t1 = bfr.readLine();
							                                            System.out.print("Enter Author Name        : ");
							                                            String aName1c1t1 = bfr.readLine();
							                                            System.out.print("Enter Price              : ");
							                                            Double price1c1t1 = sc.nextDouble();
							                                            System.out.print("Enter Available Quantity : ");
							                                            int aQuantityc1t1 = sc.nextInt();
							                                            System.out.print("Enter Standard           : ");
							                                            int standard1c1t1 = sc.nextInt();
							                                            TextBook t1c1t1 = new TextBook(isbn1c1t1, bTitle1c1t1, aName1c1t1, price1c1t1, aQuantityc1t1, standard1c1t1);
							                                            book1c1 = t1c1t1;

						                                            }

						                                            else if(type1c1 == 2){
							                                            System.out.println("\n-------------------------------------------");
							                                            System.out.println("------ You have selected Story Book -------");
							                                            System.out.println("-------------------------------------------");

							                                            System.out.print("\nEnter ISBN               : ");
							                                            String isbn1c1t2 = bfr.readLine();
							                                            System.out.print("Enter Book Title         : ");
							                                            String bTitle1c1t2 = bfr.readLine();
							                                            System.out.print("Enter Author Name        : ");
							                                            String aName1c1t2 = bfr.readLine();
							                                            System.out.print("Enter Price              : ");
							                                            Double price1c1t2 = sc.nextDouble();
							                                            System.out.print("Enter Available Quantity : ");
							                                            int aQuantityc1t2 = sc.nextInt();
							                                            System.out.print("Enter Category           : ");
							                                            String category1c1t2 = bfr.readLine();

							                                            StoryBook s1c1t2 = new StoryBook(isbn1c1t2, bTitle1c1t2, aName1c1t2, price1c1t2, aQuantityc1t2, category1c1t2);
							                                            book1c1 = s1c1t2;

						                                            }

						                                            else if(type1c1 == 3){
						                                    			System.out.println("\n-------------------------------------------");
							                                            System.out.println("-------- You have selected Go Back --------");
							                                            System.out.println("-------------------------------------------");
							    							        }
						                                            
					                                    		
						                                            else{
						                                                System.out.println("\n-------------------------------------------");
						                                                System.out.println("------------- Invalid Choice --------------");
						                                                System.out.println("-------------------------------------------");
						   						                     
						   						                    }

						                                            if(book1c1 != null){
						                                                                                                
						                                                if(book1c1 != null)
						                                                {
						                                                    if(b.insertBook(book1c1))
						                                                    {
						                                                        System.out.println("\nBook Inserted....  ISBN : " + book1c1.getIsbn());
						      													book1c1.priceAfterDiscount();
						                                                            
						                                                    }
						                                                    else
						                                                    {
						                                                        System.out.println("\nBook NOT Inserted yet....");
						                                                    }
						                                                }
						                                                else
						                                                {
						                                                    System.out.println("\nInvalid Book....");
						                                                }
						                                            }
						                                            else
						                                            {
						                                                System.out.println("\nNO book information found....");
						                                            }
					                                    		break;

					                                    		case 2:
					                                    			System.out.println("\n-------------------------------------------");
						                                            System.out.println("----- You have selected Remove a Book -----");
						                                            System.out.println("-------------------------------------------");

						                                            System.out.print("\nEnter the ISBN : ");
						                                            String isbn1c2 = bfr.readLine();

						                                            Book book1c2 = b.searchBook(isbn1c2);

						                                            if(book1c2 != null){
						                                            	if(b.removeBook(book1c2)){
						                                                	System.out.println("\nBook removed successfully....");
						                                            	}
						                                            	else{
						                                                	System.out.println("\nNo book found....");
						                                            	}
						                                            }
						                                            else{
						                                            	System.out.println("Book has not been inserted yet....");
						                                            }
					                                    		break;

					                                    		case 3:
					                                    			System.out.println("\n-------------------------------------------");
						                                            System.out.println("-- You have selected Change in Quantity ---");
						                                            System.out.println("-------------------------------------------");

						                                            System.out.print("\nEnter ISBN : ");
						                                            String isbn1c1c3 = bfr.readLine();

						                                            Book b1c1c3 = b.searchBook(isbn1c1c3);
						                                            if(b1c1c3 != null){
						                                            	System.out.print("\n\t1. Increase Quantity \n\t2. Decrease Quantity\nEnter your choice : ");
						                                            	int choice1c1c3 = sc.nextInt();
						                                            	System.out.print("\nEnter Amount      : ");
						                                            	int amount1c1c1c3 = sc.nextInt();
						                                            	if(choice1c1c3 == 1){	
						                                            		if(b1c1c3.addQuantity(amount1c1c1c3)){
						                                            			System.out.println("\nNew Amount added....");
						                                            		}
						                                            	}
						                                            	else if(choice1c1c3 == 2){
						                                            		if(b1c1c3.sellQuantity(amount1c1c1c3)){
						                                            			System.out.println("\nExternal sales has been updated....");
						                                            		}
						                    						    }
						                                            }

					                                    		break;

					                                    		case 4:
					                                    			System.out.println("\n-------------------------------------------");
						                                            System.out.println("----- You have selected Search a Book -----");
						                                            System.out.println("-------------------------------------------");

						                                            System.out.print("\nEnter the ISBN : ");
						                                            String isbn1c3 = bfr.readLine();

						                                            Book book1c3 = b.searchBook(isbn1c3);

						                                            if(book1c3 != null){
						                                                System.out.println("\nBook found....");
						                                                System.out.println("\nISBN              : "+book1c3.getIsbn());
															            System.out.println("Book Title        : "+book1c3.getBookTitle());
															            System.out.println("Author Name       : "+book1c3.getAuthorName());
															            System.out.println("Price             : "+book1c3.getPrice());
															            System.out.println("AvailableQuantity : "+book1c3.getAvailableQuantity());
						                                            }
						                                            else{
						                                            	System.out.println("Book not found....");
						                                            }
					                                    		break;

					                                    		case 5:
					                                    			System.out.println("\n-------------------------------------------");
						                                            System.out.println("----- You have selected See All Books -----");
						                                            System.out.println("-------------------------------------------\n");

						                                            b.showAllBooks();

					                                    		break;

					                                    		
					                                    		case 6:
					                                    	        System.out.println("\n-------------------------------------------");
					                                                System.out.println("----- You have selected Sales Details -----");
					                                                System.out.println("-------------------------------------------");
					                                                if(file2.fileFound("fileio/Sales.txt")){
					                                                	file2.readFromFile();
					                                                }
					                                                else{
					                                                	System.out.println("\nNo trade has been done yet....");
					                                                }
					                                                
					             					            break;

					             					            
					                                    		case 7:
					                                    			System.out.println("\n-------------------------------------------");
						                                            System.out.println("-------- You have selected Go Back --------");
						                                            System.out.println("-------------------------------------------");
						                                            repeat1c1 = false;
					                                    		break;

					                                    		default:
					                                    			System.out.println("\n-------------------------------------------");
						                                            System.out.println("------------- Invalid choice --------------");
						                                            System.out.println("-------------------------------------------");
					                                    		break;
					                                    	}
				                                    	}
				                                    break;

				                                    case 2:
			                                    	System.out.println("\n-------------------------------------------");
		                                    		System.out.println("-- You have selected User Access Pannel ---");
		                                    		System.out.println("-------------------------------------------");

		                                    		Boolean repeat1c2 = true;
		                                    		while(repeat1c2){

							                            System.out.println("\n1. Show All Users \n2. Cancel Full User Access \n3. Go Back");
							                            System.out.print("\nEnter your choice : ");
						                                int choice1c1c2 = sc.nextInt();
						                                switch(choice1c1c2){
						                                    case 1: 
						                                    	System.out.println("\n-------------------------------------------");
							                                    System.out.println("----- You have selected See All Users -----");
							                                    System.out.println("-------------------------------------------");
							                                    if(file1.fileFound("fileio/UserInfo.txt")){
						                                            file1.readFromFile();
						                                        }
						                                        else{
						                                            System.out.println("\nNo User has been signed up right now....");
						                                        }

										                    break;

										                    case 2:
											                    System.out.println("\n-------------------------------------------");
							                                    System.out.println(" You have selected Cancel Full User Access ");
							                                    System.out.println("-------------------------------------------");

							                                    System.out.print("\nEnter NID no : ");
							                                    String nid1c1c2 = bfr.readLine();

							                                    User u1c1c2 = b.searchUser(nid1c1c2);

							                                    if(u1c1c2 != null){
							                                    	if(b.removeUser(u1c1c2)){
							                                    		System.out.println("\nRegistration cancelation has been done....");
							                                    	}
							                                    	else{
							                                    		System.out.println("\nCacelation can't be done....");
							                                    	}
							                                    }
							                                    else{
							                                    	System.out.println("\nUser has not been registered yet....");
							                                    }

										                    break;									                    

										                    case 3:
										                        System.out.println("\n-------------------------------------------");
							                                    System.out.println("-------- You have selected Go Back --------");
							                                    System.out.println("-------------------------------------------");
										                        repeat1c2 = false;
										                    break;

										                    default:
						                                    	System.out.println("\n-------------------------------------------");
							                                    System.out.println("------------- Invalid choice --------------");
							                                    System.out.println("-------------------------------------------");
						                                    break;

						                                }
					                            	}
						                                

						                            break;

						                            case 3:
							                        System.out.println("\n-------------------------------------------");
			                                    	System.out.println("------> Transactions Control Pannel -------");
			                                    	System.out.println("-------------------------------------------");

			                                    	Boolean repeat1c3 = true;
		                                    		while(repeat1c3){

							                            System.out.println("\n1. Show Balance \n2. Show Transactions \n3. Cash In \n4. Cash Out \n5. Go Back");
							                            System.out.print("\nEnter your choice : ");
						                                int choice1c1c3 = sc.nextInt();
						                                switch(choice1c1c3){
						                                	case 1:
						             					        System.out.println("\n-------------------------------------------");
							                                    System.out.println("-- You have selected See Account Balance --");
							                                    System.out.println("-------------------------------------------");

							                                    System.out.print("\nYou total Account Balance is : "+adAC.getBalance()+"\n");
						             					    break;

						             					    case 2:
						             					    	System.out.println("\n-------------------------------------------");
							                                    System.out.println("--- You have selected Show Transactions ---");
							                                    System.out.println("-------------------------------------------");
							                                    if(file3.fileFound("fileio/Transactions.txt")){
						                                            file3.readFromFile();
						                                        }
						                                        else{
						                                            System.out.println("\nNo Transactions has been done yet....");
						                                        }
						             					    break;

						             					    case 3:
						             					    	System.out.println("\n-------------------------------------------");
									                            System.out.println("-------- You have selected Cash In --------");
									                            System.out.println("-------------------------------------------");

									        					System.out.println("\n-------------------------------------------");
								                                System.out.println("-------- You have selected Cash In --------");
								                                System.out.println("-------------------------------------------");
							                        			System.out.print("\nEnter a BKash number : ");
							                        			String bkNumber1 = bfr.readLine();
							                        			if(bkNumber1.startsWith("+8801")){
							                        				if(bkNumber1.length() == 14){
							                        					System.out.print("\nEnter amount         : ");
										                        		double amount3c3c3c2 = sc.nextDouble();
									                        			if(adAC.cashIn(amount3c3c3c2)){
									                        				System.out.println("\nCash in successful....");
									                        				
									                        			}
									   								    else{
									                        				System.out.println("\nCash in can't be done....");
									                        				break;
									         						    }
							                        				}
							                        				else{
								                        				System.out.println("\nInvalid number format....Must contain 14 Digits....");
								                        				break;
								                        			}
							                        			}
							                        			else if(bkNumber1.startsWith("01")){
							                        				if(bkNumber1.length() == 11){
							                        					System.out.print("\nEnter amount         : ");
										                        		double amount3c3c3c2 = sc.nextDouble();
									                        			if(adAC.cashIn(amount3c3c3c2)){
									                        				System.out.println("\nCash in successful....");
									                        				
									                        			}
									                        			else{
									                        				System.out.println("\nCash in can't be done....");
									                        				break;
									                        			}
							                        				}else{
								                        				System.out.println("\nInvalid number format....Must contain 11 Digits....");
								                        				break;
								                        			}
							                        			}
							                        			else{
							                        				System.out.println("\nFormat doesn't match with Bangladeshi number....");
							                        				break;
							                        			}

						             					    break;

						             					    case 4:
						             					    	System.out.println("\n-------------------------------------------");
									                            System.out.println("-------- You have selected Cash out -------");
									                            System.out.println("-------------------------------------------");

									                            System.out.print("\nEnter a BKash number : ");
							                        			String bkNumber2 = bfr.readLine();
							                        			if(bkNumber2.startsWith("+8801")){
							                        				if(bkNumber2.length() == 14){
							                        					System.out.print("\nEnter amount         : ");
										                        		double amount3c3c3c3 = sc.nextDouble();
									                        			if(adAC.cashOut(amount3c3c3c3)){
									                        				System.out.println("\nCash out successful....");
									                        			}
									                        			else{
									                        				System.out.println("\nCash out can't be done....");
									                        			}
							                        				}
							                        				else{
								                        				System.out.println("\nInvalid number format....Must Contain 14 Digits....");
								                        				break;
								                        			}
							                        			}
							                        			else if(bkNumber2.startsWith("01")){
							                        				if(bkNumber2.length() == 11){
							                        					System.out.print("\nEnter amount        : ");
										                        		double amount3c3c3c3 = sc.nextDouble();
									                        			if(adAC.cashOut(amount3c3c3c3)){
									                        				System.out.println("\nCash out successful....");
									                        			}
									                        			else{
									                        				System.out.println("\nCash out can't be done....");
									                        			}
									                        		}else{
									                        			System.out.println("\nInvalid number format....Must contain 11 Digits....");
									                        			break;
									                        		}
							                        			}
							                        			else{
							                        				System.out.println("\nFormat doesn't match with Bangladeshi number....");
							                        			}
						             					    break;

						             					    case 5:
						             					    	System.out.println("\n-------------------------------------------");
									                            System.out.println("-------- You have selected Go Back --------");
									                            System.out.println("-------------------------------------------");
									                            repeat1c3 = false;
						             					    break;

						             					    default:
							                                    System.out.println("\n-------------------------------------------");
								                                System.out.println("------------- Invalid choice --------------");
								                                System.out.println("-------------------------------------------");
							                                break;
						                                }
					                            	}
						                            break;

						                            case 4:
							                            System.out.println("\n-------------------------------------------");
							                            System.out.println("----- You have successfully logged out ----");
							                            System.out.println("-------------------------------------------");
							                            repeat1 = false;
						                            break;

						                            default:
					                                    System.out.println("\n-------------------------------------------");
						                                System.out.println("------------- Invalid choice --------------");
						                                System.out.println("-------------------------------------------");
					                                break;

				                            }
				                        }
				                    }   
	                                else{
	                                    System.out.println("Invalid User Name or Password....");
	                                }
                                break;
                                    
                                case 2:
                                    System.out.println("\n-------------------------------------------");
                                    System.out.println("---- You have selected Forget Password ----");
                                    System.out.println("-------------------------------------------");

                                    System.out.print("\nEnter Date of Birth (Format DD-MM-YYYY) : "); 
                                    String dob1c2 = bfr.readLine();

                                    Admin a1c2 = b.searchAdmin(dob1c2);
                                    if(a.getAdminDateOfBirth().equals(dob1c2)){
                                        int c1C2 = rn.nextInt(100000)+1;
                                        System.out.print("\n--------> OTP : "+c1C2);
                                        System.out.print("\nEnter the OTP : ");
                                        int d1C2 = sc.nextInt();
                                        if(d1C2 == c1C2){
                                        	System.out.println("\n-------------------------------------------");
                                            System.out.println("-------------Password : "+a.getAdminPassword()+"-------------");
                                            System.out.println("-------------------------------------------");
                                        }
                                        else{
                                            System.out.println("\nOTP doesn't match....");
                                        }
                                    }
                                    else{
                                            System.out.println("\nInvalid Date of Birth....");
                                    }
                                break;

                                case 3:
                                    System.out.println("\n-------------------------------------------");
                                    System.out.println("------ You have selected to Go Back -------");
                                    System.out.println("-------------------------------------------");
                                break;

                                default:
                                    System.out.println("\n-------------------------------------------");
                                    System.out.println("------------- Invalid Choice --------------");
                                    System.out.println("-------------------------------------------");
                                break;
                            }
                        
                    break;


                    case 2:
                        System.out.println("\n-------------------------------------------");                    
                        System.out.println("- You have selected Registration for User -");
                        System.out.println("-------------------------------------------");

                        System.out.println("\n1. Registration \n2. Forget PIN \n3. Delete Registration \n4. Go Back");
                        System.out.print("\nEnter your choice : ");
                        int choice2 = sc.nextInt();

                        switch(choice2){
                        	case 1:
                        		System.out.print("\nEnter your NID no : ");
		                        String nid2c1 = bfr.readLine();
		                        System.out.print("Enter your PIN    : ");
		                        String pin2c1 = bfr.readLine();

		                        User u2c1 = new User(nid2c1, pin2c1);
		                        User uVerification = b.searchUser(nid2c1);
		                        if(uVerification == null){
		                        	int c2C1 = rn.nextInt(100000)+1;
                                    System.out.print("\n--------> OTP     : "+c2C1);
                                    System.out.print("\nEnter the OTP     : ");
                                    int d2C1 = sc.nextInt();
                                    if(d2C1 == c2C1){
			                        	if(b.insertUser(u2c1)){
			                            	System.out.println("\nUser Registered.... NID : "+u2c1.getNID());
			                        	}
			                        	else{
			                            	System.out.println("\nUser not registered yet");
			                        	}
			                        }
			                        else{
			                        	System.out.println("OTP does not match....");
			                        }
		                        }
		                        else{
		                        	System.out.println("\nThis NID has been already registered....");
		                        }

                        	break;

                            case 2:
                                System.out.println("\n-------------------------------------------");
                                System.out.println("------ You have selected Forget PIN -------");
                                System.out.println("-------------------------------------------");
                                
                                System.out.print("\nEnter your NID no : ");
                                String nid2c2 = bfr.readLine();

                                User u3c2 = b.searchUser(nid2c2);

                                if(u3c2 != null){
                                        System.out.println("\n-------------------------------------------");
                                        System.out.println("-------------Password : "+u3c2.getPIN()+"-------------");
                                        System.out.println("-------------------------------------------"); 
                                }
                                else{
                                    System.out.println("\nNID has not been Registered yet....");
                                }

                            break;

                        	case 3:
                        		System.out.println("\n-------------------------------------------");
                                System.out.println("-- You have selected Delete Registration --");
                                System.out.println("-------------------------------------------");

                        		System.out.print("\nEnter your NID no : ");
		                        String nid2c3 = bfr.readLine();

		                        User u2c3 = b.searchUser(nid2c3);

		                        if(u2c3 != null){
                                    if(b.removeUser(u2c3)){
                                    System.out.println("\nUser removed successfully....");
                                    }
                                    else{
                                        System.out.println("\nInvalid NID....");
                                    }
                                }
                                else{
                                    System.out.println("\nUser has not been Registered yet....");

                                }
                        	break;

                        	case 4:
                        		System.out.println("\n-------------------------------------------");
                                System.out.println("------ You have selected to Go Back -------");
                                System.out.println("-------------------------------------------");
                        	break;

                            default:
                                System.out.println("\n-------------------------------------------");
                                System.out.println("------------- Invalid Choice --------------");
                                System.out.println("-------------------------------------------");
                            break;
                        }

                    break;


                    case 3:
                        System.out.println("\n-------------------------------------------");                    
                        System.out.println("------ You have selected User Access ------");
                        System.out.println("-------------------------------------------");
                        boolean repeati3 = true;
                        while(repeati3){
	                        System.out.println("\n1. Login \n2. User Account Procedure \n3. Transactional Procedure \n4. Go Back");
	                        System.out.print("\nEnter your choice : ");
	                        int choice3 = sc.nextInt();                   
	                                                 
	                            if(choice3 == 1){
	                                
	                                System.out.println("\n-------------------------------------------");
	                                System.out.println("--------- You have selected Login ---------");
	                                System.out.println("-------------------------------------------");


	                                System.out.print("\nEnter User Name  : ");
	                                String userName3c1 = bfr.readLine();
	                                System.out.print("Enter Password   : ");
	                                String pass3c1 = bfr.readLine();
	                                System.out.print("Enter your NID   : ");
	                                String nid3c1 = bfr.readLine();
	                                System.out.print("Enter Account No : ");
	                                int accountNumber3c1 = sc.nextInt();

	                                User u3c1 = b.searchUser(nid3c1);
	                                
	                                if(u3c1 != null){
	                                	Account acc3c1 = u3c1.searchTransactionalAccount(accountNumber3c1);
	                                	if(acc3c1 != null){
		                                     if(u3c1.searchGeneralUser(userName3c1, pass3c1)!= null ){
		                                    	boolean repeat3c1 = true;
		                                    	System.out.println("\n-------------------------------------------");
					                            System.out.println("------------ Login Successful -------------");
					                            System.out.println("-------------------------------------------");
					                            while(repeat3c1){
					                            	GeneralUser g3c1 = u3c1.searchGeneralUser(userName3c1, pass3c1);

					                                System.out.println("\n1. See All Books \n2. Add to Cart \n3. Remove from Cart \n4. See Total Books Taken \n5. Finalize a Book \n6. Payment & Get Memo \n7. Download Order List for Courier Service \n8. Logout");

					                                System.out.print("\nEnter your choice : ");
			                                        int choice3c1 = sc.nextInt();

			                                           	if(choice3c1 == 1){
			                                                System.out.println("\n-------------------------------------------");
			                                                System.out.println("----- You have selected See All Books -----");
			                                                System.out.println("-------------------------------------------");

			                                                b.showAllBooks();
			                                            }

			                                            else if(choice3c1 == 2){
			                                            	System.out.println("\n-------------------------------------------");
			                                                System.out.println("------ You have selected Add to Cart ------");
			                                                System.out.println("-------------------------------------------");

			                                            	System.out.print("\nEnter ISBN     : ");
			                                            	String isbn3c1c2 = bfr.readLine();
					                                       
			                                            	Book book3c1c2 = b.searchBook(isbn3c1c2);

			                                            	if(book3c1c2 !=null){
			                                            		System.out.print("Enter Quantity : ");
			                                            		int quantity3c1c2 = sc.nextInt();
			                                            		if(quantity3c1c2>0 && quantity3c1c2<=book3c1c2.getAvailableQuantity()){
						                                      	    Cart c3c1c2 = new Cart(book3c1c2.getIsbn(), book3c1c2.getBookTitle(), book3c1c2.getAuthorName(), book3c1c2.getPrice(), book3c1c2.getAvailableQuantity(), quantity3c1c2);
						                                      	    if(b.addToCart(c3c1c2)){
						                          				        if(book3c1c2.sellQuantity(quantity3c1c2)){
						                          				        	System.out.println("\nBook has been inserted....");
						                                      	    	}
						                                      	    }
						                                      	    else{
						                                      	    	System.out.println("\nBook can not be inserted....");
						                                      	    }
						                                      	}
						                                      	else{
						                                      	    System.out.println("\nInvalid amount....");
						                                      	}
					                                        }
					                                        else{
					                                        	System.out.println("\nNo Book found....");
					                                        }

			                                            }

			                                            else if(choice3c1 == 3){
			                                            	System.out.println("\n-------------------------------------------");
			                                                System.out.println("-You have selected Remove a Book from Cart-");
			                                                System.out.println("-------------------------------------------");

			                                                System.out.print("\nEnter the ISBN : ");
				                                            String isbn3c1c3 = bfr.readLine();
				                                                
				                                                Book book3c1c3c1 = b.searchBook(isbn3c1c3);
				                                                Cart cart3c1c3 = b.searchBookFromCart(isbn3c1c3);

			                                                	if(cart3c1c3 != null){

			                                                		System.out.println("What do you want : \n\t1. Decrease Amount of a Book \n\t2. Remove the Book totally");
			                                                		System.out.print("\nEnter your choice : ");
			                                                		int choice3c1c3 = sc.nextInt();

			                                                		if(choice3c1c3 == 1){
				                                                		System.out.print("\nEnter amount you want to remove : ");
				                                                		int amount3c1c3c1 = sc.nextInt();
				                                                		
				                                                		if(book3c1c3c1.addQuantity(amount3c1c3c1)){
				                                                			if(cart3c1c3.removedQuantityofBook(amount3c1c3c1)){
					                                                			System.out.println("\n"+amount3c1c3c1+" books has been removed successfully....");
				                                                			}
																		}		                                                		
				                                                		
				                                                		else{
				                                                			System.out.println("\nInvalid amount....");
				                                                		}
				                                                	}
				                                                	else if(choice3c1c3 == 2){
					                                              		
					                                              		if(book3c1c3c1.addQuantity(cart3c1c3.getQuantity())){
					                                              			if(b.removeFromCart(cart3c1c3)){
							                                                    System.out.println("\nBook removed successfully....");
							                                                    cart3c1c3.setQuantity(0);
							                                                }
							                                               	else{
							                                                    System.out.println("\n No book found....");
							                                                }
						                                            	}
						                                            }

				                                                else{
				                                                	System.out.println("\nBook not found....");
				                                                }
			                                                }
			                                                
			                                            }
			                                            
			                                            else if(choice3c1 == 4){
			                                            	System.out.println("\n-------------------------------------------");
			                                                System.out.println("- You have selected See Total Books Taken -");
			                                                System.out.println("-------------------------------------------\n");

			                                                b.showAllBooksInsideCart();
			                                                
			                                            }

			                                            else if(choice3c1 == 5){
			                                            	System.out.println("\n-------------------------------------------");
			                                                System.out.println("---- You have selected Finalize a Book ----");
			                                                System.out.println("-------------------------------------------");

			                                                System.out.println("\nWhat do you want ? : \n\n\t1. Confirm \n\t2. Due Finalization\n\nEnter your choice : ");
			                                                int choice3c1c5 = sc.nextInt();
			                                                if(choice3c1c5 == 1){
			                                                	System.out.println("\n-------------------------------------------");
			                                                	System.out.println("-------- You have selected Confirm --------");
			                                                	System.out.println("-------------------------------------------");

			                                                	System.out.print("\nEnter ISBN : ");
			                                                	String isbn3c1c5 = bfr.readLine();
			                                                	Cart cart3c1c5 = b.searchBookFromCart(isbn3c1c5);

			                                                	if(f.addToFinalize(cart3c1c5)){

				                                                	String msg = "\nUser Name         : "+g3c1.getGeneralUserName()+"\nISBN              : "+cart3c1c5.getIsbn()+"\nBook Title        : "+cart3c1c5.getBookTitle()+"\nQuantity          : "+cart3c1c5.getQuantity()+"\nBill              : "+cart3c1c5.getPrice()*cart3c1c5.getQuantity()+"\n";
							                                        file2.writeInFile(msg);
				                                                	System.out.println("\n------ Your order has been finalized ------\n\n--------->If you want to add something else\nplease visit 'Add To Cart'<----------------\n");
				                                                	
				                    		                		f.totalBill(1);
			                                                	}
			                                                	else{
			                                                		System.out.println("\nBook not found....");
			                                                	}

			                                                	if(cart3c1c5 != null){
			                                                		if(b.removeFromCart(cart3c1c5)){
			                                                			System.out.println("\nElse, please go to Memo for later procedure\n");
			                                                		}
			                                                		else{
			                                                			System.out.println("\nSomething went wrong....");
			                                                		}
			                                                	}
			                                                }
			                                                else if(choice3c1c5 == 2){
			                                                	System.out.println("\n-------------------------------------------");
			                                                	System.out.println("--- You have selected Due Confirmation ----");
			                                                	System.out.println("-------------------------------------------");
			                                                }
			                                            }

			                                            else if(choice3c1 == 6){
							                        		System.out.println("\n-------------------------------------------");
				                                            System.out.println("--> You have selected Payment & Get Memo --");
				                                            System.out.println("-------------------------------------------");

				                                            System.out.print("\nEnter NID number     : ");
				                                            String nid3c1c6 = bfr.readLine();
				                                            System.out.print("Enter Account Number : ");
				                                            int accountNumber3c1c6 = sc.nextInt();

				                                            User u3c1c6 = b.searchUser(nid3c1c6);
				                                            Account a3c1c6 = u3c1c6.searchTransactionalAccount(accountNumber3c1c6);

				                    		                if(a3c1c6 != null){
				                    		                	System.out.print("\n->Your total bill is : "+f.getTotalBill());

				                    		                	if(a3c1c6.getBalance()>=f.getTotalBill()){
				                    		                		System.out.print("\n\nEnter PIN no to pay the Bill");
					                    		                	System.out.print("\n------>PIN           : ");
					                    				            int pin3c1c6 = sc.nextInt();
					                  		                    		if(pin3c1c6 == a3c1c6.getPinNo()){
					                    		                			adAC.cashIn(f.getTotalBill());
						              		                    		    a3c1c6.cashOut(f.getTotalBill());
						                    		                		f.showAllFinalizedBooks();
						                    		                		System.out.println("\n---------> Bill Paid successfully <--------");
						                    		                		System.out.println("-> Your order will be sent through Courier-");
						                    		                		System.out.println("\n--------- Thank you for choosing ----------\n------------> Shakib Book Shop <-----------");
						                    		                		String msg = "\nNID number        : "+nid3c1c6+"\nAccount number    : "+a3c1c6.getAccountNumber()+"\nCash in Amount    : "+f.getTotalBill()+"\n";
						                    		                	    file3.writeInFile(msg);
						                    		                	    f.removeBookFromFinalize();
						                    		                	    f.setTotalBill(0);
						                    		                	}
						                    		                	else{
						                    		                		System.out.println("\nInvalid PIN no....");
						                    		                		break;
						                    		                	}
					                    		                	
					                    		                }
					                    		                else{
					                    		                    System.out.println("\nNot enough money, please Cash in....");
					                    		                	break;
					                    		                }
					                    		            }
					                    		            else{
					                    		            	System.out.println("No Transactional Account found....");
					                    		            }
				                    		              			                                            		                                            		                                            
							                        	}

							                        	else if(choice3c1 == 7){
							                        		System.out.println("\n-------------------------------------------");
				                                            System.out.println("--->Download Order List for Courier Service");
				                                            System.out.println("-------------------------------------------");
				                                            file2.readFromFile();
				                                        }

							                        	else if(choice3c1 == 8){
							                        		System.out.println("\n-------------------------------------------");
				                                            System.out.println("----- You have successfully logged out -----");
				                                            System.out.println("-------------------------------------------");
				                                            repeat3c1 = false;
							                        	}

							                            else{
							                                System.out.println("\n-------------------------------------------");
							                                System.out.println("------------- Invalid Choice --------------");
							                                System.out.println("-------------------------------------------");
							                           	}
			                                              
			                                    }
		                                    }
		                                  	else{
		                                        System.out.println("\nInvalid User Name or Password....");
		                                    }
		                                }else{
		                                	System.out.println("\nAccount not Found....");
		                                }
	                                }
	                                else{
	                                    System.out.println("\nNID not Found....");
	                                }
	                            }

	                            else if(choice3 == 2){
	                            	System.out.println("\n-------------------------------------------");                    
			                        System.out.println("-> You have selected User Account Procedure ");
			                        System.out.println("-------------------------------------------");

			                        boolean repeat3c2 = true;
			                        while(repeat3c2){
				                        System.out.println("\n1. Create an Account \n2. Forget Password \n3. Delete Account \n4. Go Back");
				                        System.out.print("\nEnter your choice : ");
				                        int choice3c2 = sc.nextInt();

				                        GeneralUser g = null;

				                        if(choice3c2 == 1){
			                                System.out.println("\n-------------------------------------------");
			                                System.out.println("--- You have selected Create An Account ---");
			                                System.out.println("-------------------------------------------");

			                                                                      
			                                System.out.print("\nEnter First Name      : ");
			                                String fName = bfr.readLine();
			                                System.out.print("Enter Last Name       : ");
			                                String lName = bfr.readLine();
			                                System.out.print("Enter User Name       : ");
			                                String uName = bfr.readLine();
			                                System.out.print("Password              : ");
			                                String pass = bfr.readLine();
			                                System.out.print("Enter Phone Number    : ");
			                                String pNumber = bfr.readLine();
			                                System.out.print("Enter Present Address : ");
			                                String pAddress = bfr.readLine();
			                                    

			                                    
			                                Info i3c3 = new Info(fName, lName, pNumber, pAddress, uName, pass);
			                                String msg = "\nName            : "+fName+" "+lName+"\nUser Name       : "+uName+"\nPhone Number    : "+pNumber+"\nPresent Address : "+pAddress;   
											file1.writeInFile(msg);
			                                g = i3c3;
			                            }

		                            	else if(choice3c2 == 2){
			                                System.out.println("\n-------------------------------------------");
			                                System.out.println("---- You have selected Forget Password ----");
			                                System.out.println("-------------------------------------------");
			                                
			                                System.out.print("\nEnter your NID no    : ");
			                                String nid3c2 = bfr.readLine();
			                                System.out.print("Enter your User Name : ");
			                                String userName3c2 = bfr.readLine();

			                                User u3c2 = b.searchUser(nid3c2);
			                                GeneralUser g3c2 = u3c2.forgetPassword(userName3c2);
			                                if(u3c2 != null){
			                                	if(g3c2 != null){
			                                		System.out.println("\n-------------------------------------------");
			                                        System.out.println("-------------Password : "+g3c2.getGeneralPassword()+"-------------");
			                                        System.out.println("-------------------------------------------");
			                                		
			                                		break;
			                                	}
			                                	else{
			                                		System.out.println("\nAccount has not been Created yet....");
			                                	}
			                                }
			                                else{
			                                	System.out.println("\nNID has not been Registered yet....");
			                                }
			                            }

			                            else if(choice3c2 == 3){
			                                System.out.println("\n-------------------------------------------");
			                                System.out.println("---- You have selected Delete Account -----");
			                                System.out.println("-------------------------------------------");
			                                
			                                System.out.print("\nEnter your NID no    : ");
			                                String nid3c4 = bfr.readLine();
			                                System.out.print("Enter your User Name : ");
			                                String userName3c4 = bfr.readLine();
			                                System.out.print("Enter your Password  : ");
			                                String pass3c4 = bfr.readLine();

			                                User u3c4 = b.searchUser(nid3c4);
			                                GeneralUser g3c4 = u3c4.searchGeneralUser(userName3c4, pass3c4);
			                                if(u3c4 != null){
			                                	if(u3c4.removeAnAccount(g3c4)){
			                                		System.out.println("\nAccount removed.... User Name : "+g3c4.getGeneralUserName());
			                                		break;
			                                	}
			                                	else{
			                                		System.out.println("\nAccount has not been Created yet....");
			                                        break;
			                                	}
			                                }
			                                else{
			                                	System.out.println("\nInvalid NID....");
			                                    break;
			                                }

			                            }

			                            else if(choice3c2 == 4){
			                            	System.out.println("\n-------------------------------------------");
			                                System.out.println("------ You have selected to Go Back -------");
			                                System.out.println("-------------------------------------------");
			                                repeat3c2 = false;
			                                break;
			                            }

			                            else{
			                                System.out.println("\n-------------------------------------------");
			                                System.out.println("------------- Invalid Choice --------------");
			                                System.out.println("-------------------------------------------");
			                                break;                                    
			                            }

			                            if(g!=null){
			                            System.out.print("\nEnter your NID no     : ");
			                            String nid3 = bfr.readLine();

			                            User u3 = b.searchUser(nid3);

				                            if(u3!=null){
				                                if(u3.createAnAccount(g)){
					                                System.out.println("\nAccount has been created successfully....");
					                                String msg = "NID             : "+nid3+"\n------> Status  : Valid <------";

					                                file1.writeInFile(msg);
					                                    
				                                }
				                                else{
				                                    System.out.println("\nAccount can not be created....");
				                                }
				                            }
				                            else{
				                                System.out.println("\nInvalid User");
				                                String msg = "\n------> Status : Invalid <------"+"\n";
				                                file1.writeInFile(msg);
				                            }
			 	                        }
			                            else{
			                                System.out.println("\nUser has not been registered yet");
			                            }
		                            }
	                        	}
	                            
	                            else if(choice3 == 3){
	                            	System.out.println("\n-------------------------------------------");                    
			                        System.out.println("->You have selected Transactional Procedure");
			                        System.out.println("-------------------------------------------");

			                        boolean repeat3c3 = true;
			                        while(repeat3c3){
				                        System.out.println("\n1. Create Transactional Account \n2. Forget PIN \n3. Transactional Balance \n4. Delete Transactional Account \n5. Go Back");
				                        System.out.print("\nEnter your choice : ");
				                        int choice3c3 = sc.nextInt();

		                        		Account acc = null;
		                            	
		                            	if(choice3c3 == 1){
			                                System.out.println("\n-------------------------------------------");
			                                System.out.println("------> Create Transactional Account ------");
			                                System.out.println("-------------------------------------------");

			                                System.out.print("\nAccount Holder Name   : ");
			                                String accHName3c3c1 = bfr.readLine();
			                                System.out.print("Enter Account Number  : ");
			                                int accountNumber3c3c1 = sc.nextInt();
			                                System.out.print("Enter PIN Number      : ");
			                                int pinNumber3c3c1 = sc.nextInt();
			                                Account a3c3c1 = new Account(accountNumber3c3c1, accHName3c3c1, pinNumber3c3c1);
			                                acc = a3c3c1;
			                                
			                            }

		                            	else if(choice3c3 == 2){
			                                System.out.println("\n-------------------------------------------");
			                                System.out.println("---------------> Forget PIN ---------------");
			                                System.out.println("-------------------------------------------");
			                                
			                                System.out.print("\nEnter your NID no    : ");
			                                String nid3c3c2 = bfr.readLine();
			                                System.out.print("Enter Account Number : ");
			                                int acNumber3c3c2 = sc.nextInt();

			                                User u3c3c2 = b.searchUser(nid3c3c2);
			                                Account a3c3c2 = u3c3c2.forgetPIN(acNumber3c3c2);
			                                if(u3c3c2 != null){
			                                	if(a3c3c2 != null){
			                                		System.out.println("\n-------------------------------------------");
			                                        System.out.println("-------------Password : "+a3c3c2.getPinNo()+"-------------");
			                                        System.out.println("-------------------------------------------");
			                                		
			                                		break;
			                                	}
			                                	else{
			                                		System.out.println("\nAccount has not been Created yet....");
			                                		break;
			                                	}
			                                }
			                                else{
			                                	System.out.println("\nNID has not been Registered yet....");
			                                	break;
			                                }
			                            }

			                            else if(choice3c3 == 3){
			                            	System.out.println("\n-------------------------------------------");
			                                System.out.println("---------> Transactional Balance ----------");
			                                System.out.println("-------------------------------------------");

			                                System.out.print("\nEnter NID number     : ");
				                            String nid3c3c3 = bfr.readLine();
				                            System.out.print("Enter Account Number : ");
				                            int accountNumber3c1c6 = sc.nextInt();

				                            User u3c3c3 = b.searchUser(nid3c3c3);
				                            Account a3c3c3 = u3c3c3.searchTransactionalAccount(accountNumber3c1c6);

			                                if(a3c3c3 != null){
			                                	System.out.println("What do you want ? : \n\n\t1. Show Balance \n\t2. Cash In \n\t3. Cash Out");
			                                	System.out.print("\nEnter your choice : ");
				                        		int choice3c3c3 = sc.nextInt();
				                        		
				                        		if(choice3c3c3 == 1){
				                        			System.out.println("\n-------------------------------------------");
					                                System.out.println("----- You have selected Show Balance ------");
					                                System.out.println("-------------------------------------------");
				                        			System.out.println("\nYour Balance is : "+a3c3c3.getBalance());
				                        			break;
				                        		}

				                        		else if(choice3c3c3 == 2){
				                        			System.out.println("\n-------------------------------------------");
					                                System.out.println("-------- You have selected Cash In --------");
					                                System.out.println("-------------------------------------------");
				                        			System.out.print("\nEnter a BKash number : ");
				                        			String bkNumber = bfr.readLine();
				                        			if(bkNumber.startsWith("+8801")){
				                        				if(bkNumber.length() == 14){
				                        					System.out.print("\nEnter amount         : ");
							                        		double amount3c3c3c2 = sc.nextDouble();
						                        			if(a3c3c3.cashIn(amount3c3c3c2)){
						                        				System.out.println("\nCash in successful....");
						                        				break;
						                        			}
						   								    else{
						                        				System.out.println("\nCash in can't be done....");
						                        				break;
						         						    }
				                        				}
				                        				else{
					                        				System.out.println("\nInvalid number format....Must take 14 Digits....");
					                        				break;
					                        			}
				                        			}
				                        			else if(bkNumber.startsWith("01")){
				                        				if(bkNumber.length() == 11){
				                        					System.out.print("\nEnter amount         : ");
							                        		double amount3c3c3c2 = sc.nextDouble();
						                        			if(a3c3c3.cashIn(amount3c3c3c2)){
						                        				System.out.println("\nCash in successful....");
						                        				break;
						                        			}
						                        			else{
						                        				System.out.println("\nCash in can't be done....");
						                        				break;
						                        			}
				                        				}
				                        				else{
					                        				System.out.println("\nInvalid number format....Must take 11 Digits....");
					                        				break;
					                        			}
				                        			}
				                        						                        		
				                        		}
				                        		else if(choice3c3c3 == 3){
				                        			System.out.println("\n-------------------------------------------");
					                                System.out.println("-------- You have selected Cash Out -------");
					                                System.out.println("-------------------------------------------");
				                        			System.out.print("\nEnter a BKash number : ");
				                        			String bkNumber = bfr.readLine();
				                        			if(bkNumber.startsWith("+8801")){
				                        				if(bkNumber.length() == 14){
				                        					System.out.print("\nEnter amount         : ");
							                        		double amount3c3c3c3 = sc.nextDouble();
						                        			if(a3c3c3.cashOut(amount3c3c3c3)){
						                        				System.out.println("\nCash out successful....");
						                        				break;
						                        			}
						                        			else{
						                        				System.out.println("\nCash out can't be done....");
						                        				break;
						                        			}
				                        				}
				                        				else{
						                        			System.out.println("\nInvalid number format....Must take 14 Digits....");
						                        			break;
						                        		}
				                        			}
				                        			else if(bkNumber.startsWith("01")){
				                        				if(bkNumber.length() == 11){
				                        					System.out.print("\nEnter amount        : ");
							                        		double amount3c3c3c3 = sc.nextDouble();
						                        			if(a3c3c3.cashOut(amount3c3c3c3)){
						                        				System.out.println("\nCash out successful....");
						                        				break;
						                        			}
						                        			else{
						                        				System.out.println("\nCash out can't be done....");
						                        				break;
						                        			}
						                        		}
						                        		else{
						                        			System.out.println("\nInvalid number format....Must Take 11 Digits....");
						                        			break;
						                        		}
				                        			}
				                        			else{
				                        				System.out.println("\nNumber does not fulfill requiremnt of Bangladesh....");
				                        				break;
				                        			}			                        		
				                        		}
			                                }
			                                
			                            }

			                            else if(choice3c3 == 4){
			                                System.out.println("\n-------------------------------------------");
			                                System.out.println("------> Delete Transactional Account ------");
			                                System.out.println("-------------------------------------------");
			                                
			                                System.out.print("\nEnter your NID no    : ");
			                                String nid3c3c4 = bfr.readLine();
			                                System.out.print("Enter Account Number : ");
			                                int accountNumber3c3c4 = sc.nextInt();

			                                User u3c3c4 = b.searchUser(nid3c3c4);
			                                Account a3c3c4 = u3c3c4.searchTransactionalAccount(accountNumber3c3c4);

			                                if(u3c3c4 != null){
			                                	if(u3c3c4.removeTransactionalAccount(a3c3c4)){
			                                		System.out.println("\nTransactional Account removed....");
			                                		break;
			                                	}
			                                	else{
			                                		System.out.println("\nTransactional Account has not been Created yet....");
			                                        break;
			                                	}
			                                }
			                                else{
			                                	System.out.println("\nInvalid NID....");
			                                    break;
			                                }

			                            }

			                            else if(choice3c3 == 5){
			                            	System.out.println("\n-------------------------------------------");
			                                System.out.println("------ You have selected to Go Back -------");
			                                System.out.println("-------------------------------------------");
			                                repeat3c3 = false;
			                                break;
			                            }

			                            else{
			                                System.out.println("\n-------------------------------------------");
			                                System.out.println("------------- Invalid Choice --------------");
			                                System.out.println("-------------------------------------------");
			                                break;                                    
			                            }

			                            if(acc != null){
			                            System.out.print("\nEnter your NID no     : ");
			                            String nid3c3c4i = bfr.readLine();

			                            User u3c3c4i = b.searchUser(nid3c3c4i);

					                        if(u3c3c4i != null){
					                            if(u3c3c4i.createTransactionalAccount(acc)){
						                            System.out.println("\nAccount has been created successfully....");
						                            String msg = "Account Number  : "+acc.getAccountNumber()+"\n------> Status  : Valid <------";
						                            file1.writeInFile(msg);
						                            break;
						                        }
						                        else{
						                        	System.out.println("Transactional Account can not be created....");
						                        	break;
						                        }
						                    }		                        
						                    else{
						                        System.out.println("\nInvalid User");
						                        String msg = "\n------> Status : Invalid <------"+"\n";
						                        file1.writeInFile(msg);
						                        break;
						                    }
			   	                        }
			                            else{
			                                System.out.println("\nUser has not been registered yet");
			                            }

		                            }
	                        	}

	                            else if(choice3 == 4){
						        System.out.println("\n-------------------------------------------");
			                    System.out.println("-------- You have selected Go Back --------");
			                    System.out.println("-------------------------------------------");
			                    repeati3 = false;
						        }

						        else{
						        System.out.println("\n-------------------------------------------");
						        System.out.println("------------- Invalid Choice --------------");
						        System.out.println("-------------------------------------------");
						        }
						    }
                    
                    break;


                    case 4:
                        System.out.println("-------------------------------------------");
                        System.out.println("-------- You have selected to Exit --------");
                        System.out.println("-------------------------------------------");
                        
                        repeat = false;
                        
                    break;


                    default:
                        System.out.println("-------------------------------------------");
                        System.out.println("------------- Invalid Choice --------------");
                        System.out.println("-------------------------------------------");
                    break;
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }    
    }    
}   
    


