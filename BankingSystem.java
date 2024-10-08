import java.util.Scanner; //Scanner class is imported from java.util package
import java.text.DecimalFormat; //DecimalFormat class is imported from java.text packajave


public class BankingSystemTestingJava2
{//Start class	
	public static void main(String[] args)
	{//Start main method
		
		//Instantiation of object
		Scanner input = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("R00.00");
		
		//Flags---(Not used yet)
		boolean bPerson1 = false;
		boolean bPerson2 = false;
		boolean bPerson3 = false;
		boolean bPerson4 = false;
		boolean bPerson5 = false;
		
		//Declare variables for login process
		String sPINregistered1 = "",sPINregistered2 = "",sPINregistered3 = "",sPINregistered4 = "",sPINregistered5 = "";
		String sPhoneNumbersRegistered1 = "",sPhoneNumbersRegistered2 = "",sPhoneNumbersRegistered3 = "",sPhoneNumbersRegistered4 = "",sPhoneNumbersRegistered5 = "";
		int iClientNumber;
		
		//Declaring variables for client names  registration
		String sFirstName1,sSecondName1,sLastName1;
		String sFirstName2,sSecondName12,sLastName2;
		//Declaring variables for client Phone number registration
		String sPhoneNumber1 = "";
		String sPhoneNumber2 = "";
		//Declaring variables for IDnumberRegistration
		String sIDnumber1,sIDnumber2;
		//Declaring variables for PIN registration
		String sPINcreate;
		
		//ClientNumbers
		int iClientCount1 = 0;
		int iClientCount2 = 0;
		int iClientCount3 = 0;
		int iClientCount4 = 0;
		int iClientCount5 = 0;


		while ( true )
		{//Start while(true)-infinite loop
			
			//Log-in and opening account
			System.out.println("+-----------------------------------+");
			System.out.println("|        UNITY FINANCIAL BANK       |");
			System.out.println("|-----------------------------------|");
			System.out.println("|\tSELECT AN OPERATION BELOW   |");
			System.out.println("|-----------------------------------|");
			System.out.println("|\t1 <---- login               |");
			System.out.println("|\t2 <---- Open account        |");
			System.out.println("+-----------------------------------+");
			int iOperation = input.nextInt();
			
		    switch ( iOperation )
			{//Start switch
				
				//log in
				case 1 :
				System.out.println("+--------------------------------------------+");
				System.out.println("|           UNITY FINANCIAL BANK             |");
				System.out.println("|--------------------------------------------|");
				System.out.println("|  Enter your client number(between 1 to 5): |");
				System.out.println("+--------------------------------------------+");
				iClientNumber = input.nextInt();
				
				//Client 1 log in
				if ( iClientNumber == 1 )
				    {//Start operations for client 1
				    while ( iClientNumber == 1 )
						{
							input.nextLine();
							System.out.println("You will provide your phone numbers and PIN to prove you are client 1");
							System.out.println("Enter phone numbers: ");
							String sPhoneNumbers = input.nextLine();
							System.out.println("Enter PIN: ");
							String sPIN = input.nextLine();
							if ( sPhoneNumbers.equals(sPhoneNumber1) && sPIN.equals(sPINregistered1))
							{
								System.out.println("Login successful");
								System.out.println("+------------------------------------------+");
								System.out.println("|\tACCOUNT MANAGEMENT                 |");
								System.out.println("|------------------------------------------|");
								System.out.println("|\tSELECT ONE OF THE OPTIONS BELOW    |");
								System.out.println("|------------------------------------------|");
								System.out.println("|\t1 <---- Balance                    |");
								System.out.println("|\t2 <---- Deposit                    |");
								System.out.println("|\t3 <---- Transfer                   |");
								System.out.println("|\t4 <---- Statement                  |");
								System.out.println("|\t5 <---- Exit                       |");
								System.out.println("+------------------------------------------+");
								int iOperation1 = input.nextInt();
								
								//Client 1 transactions
								double rBalance1 = 0;
								switch ( iOperation1 )
								{
									case 1 :
										System.out.println("Balance: "+formatter.format(rBalance1));
									break;
									
									case 2 :
										System.out.println("Enter the deposit Amount: ");
										double rDeposit1 = input.nextDouble();
										System.out.println("Amount deposited : "+formatter.format(rDeposit1));
										rBalance1 = rBalance1 + rDeposit1;
										System.out.println("Available Balance: "+formatter.format(rBalance1));
									break;
									
									case 3 :
										System.out.println("Enter amount you want to withdraw: ");
										double rWithdrawAmount1 = input.nextDouble();
										rBalance1 = rBalance1 - rWithdrawAmount1;
										System.out.println("Amount withdawan : "+formatter.format(rWithdrawAmount1));
										System.out.println("Available balance: "+formatter.format(rBalance1));
									break;
									
									case 4 :
									break;
									
									case 5 :
									break;
									
									default :
										System.out.println("Invalid option");
										
								}	
							}
							else
							{
								System.out.println("|--------------------------------------------|");
								System.out.println("|\tINVALID LOGIN                        |");
								System.out.println("|--------------------------------------------|");
								System.out.println("|  Enter your client number(between 1 to 5): |");
								System.out.println("+--------------------------------------------+");
								iClientNumber = input.nextInt();
							}
							System.out.println("|\tACCOUNT MANAGEMENT                 |");
							System.out.println("|------------------------------------------|");
							System.out.println("|\tSELECT ONE OF THE OPTIONS BELOW    |");
							System.out.println("|------------------------------------------|");
							System.out.println("|\t1 <---- Balance                    |");
							System.out.println("|\t2 <---- Deposit                    |");
							System.out.println("|\t3 <---- Transfer                   |");
							System.out.println("|\t4 <---- Statement                  |");
							System.out.println("|\t5 <---- Exit                       |");
							System.out.println("+------------------------------------------+");
							int iOperation1 = input.nextInt();
						}
					}//End-operations for client 1
					
				break; //breaking switch 1 ( log in )
				
				 
				//Opening Account
				case 2:
				System.out.println("+--------------------------------------------+");
				System.out.println("|           UNITY FINANCIAL BANK             |");
				System.out.println("|--------------------------------------------|");
				System.out.println("|  Enter your client number(between 1 to 5): |");
				System.out.println("+--------------------------------------------+");
				iClientNumber = input.nextInt();
				
				
				//Registering client 1
				if ( iClientNumber == 1 )
					{//Start client 1 registration
						input.nextLine();
						System.out.println("Enter your first name: ");
						sFirstName1 = input.nextLine();
						System.out.println("Enter your last name: ");
						sLastName1 = input.nextLine();
						System.out.println("Enter your phone numbers: ");
						sPhoneNumber1 = input.nextLine();
						System.out.println("Enter your ID number: ");
						sIDnumber1 = input.nextLine();
						System.out.println("Create PIN: ");
						sPINcreate = input.nextLine();
						System.out.println("Confirm your PIN: ");
						sPINregistered1 = input.nextLine();
						iClientCount1 ++;
						if ( sPINcreate.equals(sPINregistered1))
						{
							System.out.println("Client registration successfully");
							System.out.println("+-----------------------------------+");
							System.out.println("|        UNITY FINANCIAL BANK       |");
							System.out.println("|-----------------------------------|");
							System.out.println("|\tSELECT AN OPERATION BELOW   |");
							System.out.println("|-----------------------------------|");
							System.out.println("|\t1 <---- login               |");
							System.out.println("|\t2 <---- Open account        |");
							System.out.println("+-----------------------------------+");
							iOperation = input.nextInt();
							iClientCount1 ++;
						}
						while ( iClientCount1 > 0 )
						{
							System.out.println ("This client number is already occupied\nPlease try registering on client number 2,3,4 or 5");
							System.out.println("+--------------------------------------------+");
							System.out.println("|           UNITY FINANCIAL BANK             |");
							System.out.println("|--------------------------------------------|");
							System.out.println("|  Enter your client number(between 1 to 5): |");
							System.out.println("+--------------------------------------------+");
							iClientNumber = input.nextInt();
						}
					}//End client 1 registration
				    
				else if ( iClientNumber == 2 )
					{//Start client 1 registration
						input.nextLine();
						System.out.println("Enter your first name: ");
						sFirstName2 = input.nextLine();
						System.out.println("Enter your last name: ");
						sLastName2 = input.nextLine();
						System.out.println("Enter your phone numbers: ");
						sPhoneNumber2 = input.nextLine();
						System.out.println("Enter your ID number: ");
						sIDnumber2 = input.nextLine();
						System.out.println("Create PIN: ");
						sPINcreate = input.nextLine();
						System.out.println("Confirm your PIN: ");
						sPINregistered2 = input.nextLine();
						iClientCount2 ++;
						if ( sPINcreate.equals(sPINregistered1))
						{
							System.out.println("Client registration successfully");
							System.out.println("+-----------------------------------+");
							System.out.println("|        UNITY FINANCIAL BANK       |");
							System.out.println("|-----------------------------------|");
							System.out.println("|\tSELECT AN OPERATION BELOW   |");
							System.out.println("|-----------------------------------|");
							System.out.println("|\t1 <---- login               |");
							System.out.println("|\t2 <---- Open account        |");
							System.out.println("+-----------------------------------+");
							iOperation = input.nextInt();
							iClientCount2 ++;
						}
						while ( iClientCount1 > 0 )
						{
							System.out.println ("This client number is already occupied\nPlease try registering on client number 1,3,4 or 5");
							System.out.println("+--------------------------------------------+");
							System.out.println("|           UNITY FINANCIAL BANK             |");
							System.out.println("|--------------------------------------------|");
							System.out.println("|  Enter your client number(between 1 to 5): |");
							System.out.println("+--------------------------------------------+");
							iClientNumber = input.nextInt();
						}
					}//End client 2 registration
			
				
				break;
				
				
			}//End switch
				
		}//End while(true)-infinite loop
	}//End main method
}//End class	
