import java.util.Scanner; // Scanner class is imported from java.util package
import java.text.DecimalFormat; // DecimalFormat class is imported from java.text package

//@Author Lethabo Matsi

public class BankingSystem
{
    public static void main(String[] args) 
	{

        // Instantiation of object
        Scanner input = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("R00.00");

        // Declare variables for login process
        String sPINregistered1 = "", sPINregistered2 = "", sPINregistered3 = "", sPINregistered4 = "", sPINregistered5 = "";
        String sPhoneNumbersRegistered1 = "", sPhoneNumbersRegistered2 = "", sPhoneNumbersRegistered3 = "", sPhoneNumbersRegistered4 = "", sPhoneNumbersRegistered5 = "";
        int iClientNumber;
		
		//Declare variables for daily reports
		int iNumDeposit1 = 0, iNumDeposit2 = 0, iNumDeposit3 = 0, iNumDeposit4 = 0, iNumDeposit5 = 0;
		int iNumWithdraw1 = 0, iNumWithdraw2 = 0, iNumWithdraw3 = 0,  iNumWithdraw4 = 0,  iNumWithdraw5 = 0;

        // Declaring variables for client names registration
        String sFirstName1 = "", sLastName1 = "";
        String sFirstName2 = "", sLastName2 = "";
        String sFirstName3 = "", sLastName3 = "";
        String sFirstName4 = "", sLastName4 = "";
        String sFirstName5 = "", sLastName5 = "";
		
		//Declaring variables for client numbers
		int iClientNumberFill1 = 0, iClientNumberFill2 = 0, iClientNumberFill3 = 0, iClientNumberFill4 = 0, iClientNumberFill5 = 0;

        // Declaring variables for client Phone number registration
        String sPhoneNumber1 = "", sPhoneNumber2 = "", sPhoneNumber3 = "", sPhoneNumber4 = "", sPhoneNumber5 = "";

        // Declaring variables for IDnumberRegistration
        String sIDnumber1 = "", sIDnumber2 = "", sIDnumber3 = "", sIDnumber4 = "", sIDnumber5 = "";

        // Declaring variables for PIN registration
        String sPINcreate;

        // Client Balances
        double rBalance1 = 0.0, rBalance2 = 0.0, rBalance3 = 0.0, rBalance4 = 0.0, rBalance5 = 0.0;
		
		//This boolean variable keeps the user logged in until the user logs out and closes an account
		boolean keepLogIn = true;

		//The following declared boolean variables exit a loop for client login when the user enters an incorrect login credentials and when you do not have an account
		boolean ClientOneLogin = true, ClientTwoLogin = true, ClientThreeLogin = true, ClientFourLogin = true, ClientFiveLogin = true;
		
        while (true) 
		{ // Start while(true)-infinite loop
            // Log-in and opening account
            System.out.println("+-----------------------------------+");
            System.out.println("|        UNITY FINANCIAL BANK       |");
            System.out.println("|-----------------------------------|");
            System.out.println("|\tSELECT AN OPERATION BELOW   |");
            System.out.println("|-----------------------------------|");
            System.out.println("|\t1 <---- login               |");
            System.out.println("|\t2 <---- Open account        |");
            System.out.println("+-----------------------------------+");
            int iOperation = input.nextInt();

            switch (iOperation) 
			{ // Start switch

                // Log in
                case 1:
                    System.out.println("+--------------------------------------------+");
                    System.out.println("|           UNITY FINANCIAL BANK             |");
                    System.out.println("|--------------------------------------------|");
                    System.out.println("|  Enter your client number(between 1 to 5): |");
                    System.out.println("+--------------------------------------------+");
                    iClientNumber = input.nextInt();

                    // Client 1 log in
					if (iClientNumber == 1) 
					{ 
						// Start operations for client 1
						while (ClientOneLogin) 
						{
							input.nextLine();
							System.out.println("You will provide your phone numbers and PIN to prove you are client 1");
							System.out.println("Enter phone numbers: ");
							String sPhoneNumbers = input.nextLine();
							System.out.println("Enter PIN: ");
							String sPIN = input.nextLine();
							
							if (sPhoneNumbers.equals(sPhoneNumber1) && sPIN.equals(sPINregistered1)) //Error control 
							{
								System.out.println("Login successful");

								// Loop to keep the client logged in until they choose to exit
								while (keepLogIn) 
								{
									System.out.println("+------------------------------------------+");
									System.out.println("|\tACCOUNT MANAGEMENT                 |");
									System.out.println("|------------------------------------------|");
									System.out.println("|\tSELECT ONE OF THE OPTIONS BELOW    |");
									System.out.println("|------------------------------------------|");
									System.out.println("|\t1 <---- Balance                    |");
									System.out.println("|\t2 <---- Deposit                    |");
									System.out.println("|\t3 <---- Withdraw                   |");
									System.out.println("|\t4 <---- Daily Report               |");
									System.out.println("|\t5 <---- Log out                    |");
									System.out.println("|\t6 <---- Close account              |");
									System.out.println("+------------------------------------------+");
									int iOperation1 = input.nextInt();

									// Client 1 transactions
									switch (iOperation1) 
									{
										case 1:
											System.out.println("Balance: " + formatter.format(rBalance1));
										break;

										case 2:
											System.out.println("Enter the deposit Amount: ");
											double rDeposit1 = input.nextDouble();
											rBalance1 = rBalance1 + rDeposit1;
											System.out.println("Amount deposited : " + formatter.format(rDeposit1));
											System.out.println("Available Balance: " + formatter.format(rBalance1));
											iNumDeposit1++;
										break;

										case 3:
											System.out.println("Enter amount you want to withdraw: ");
											double rWithdrawAmount1 = input.nextDouble();
											
											while ( rBalance1 == 0 )
											{
												System.out.println("You have no funds in your account. Withdrawal not possible.");
												System.out.println("PLEASE enter 0 to continue");
												rWithdrawAmount1 = input.nextDouble();
												break;
											}

											while (rWithdrawAmount1 < 0) 
											{
												System.out.println("Invalid withdrawal amount! Please enter a positive value.");
												rWithdrawAmount1 = input.nextDouble();
											}

											while (rWithdrawAmount1 > rBalance1) 
											{
												System.out.println("Insufficient balance! Unable to withdraw the requested amount.");
												System.out.println("Try again");
												rWithdrawAmount1 = input.nextDouble();
											}

											rBalance1 -= rWithdrawAmount1;
											System.out.println("Amount withdrawn: " + formatter.format(rWithdrawAmount1));
											System.out.println("Available balance: " + formatter.format(rBalance1));
											iNumWithdraw1++;
										break;

										case 4:
											System.out.println("+-----------------------------------------------------+");
											System.out.println("|\t\t\t DAILY REPORT");
											System.out.println("|-----------------------------------------------------|");
											System.out.println("| Name:\t\t\t" + sFirstName1);
											System.out.println("| Surname:\t\t" + sLastName1);
											System.out.println("| ID Number:\t\t" + sIDnumber1);
											System.out.println("|-----------------------------------------------------|");
											System.out.println("| Number of Deposits:   \t" + iNumDeposit1);
											System.out.println("| Number of Withdrawals:   \t" + iNumWithdraw1);
											System.out.println("| Available Balance:        \t" + formatter.format(rBalance1));
											System.out.println("+-----------------------------------------------------+");
										break;

										case 5:
											System.out.println("Logged out successfully\n");
											System.out.println("Thank you..Byeee..!");
										break;

										case 6:
										  System.out.println("DO you really want to close your account?");
										  System.out.println("Enter <YES> to confirm");
										  System.out.println("Enter <NO> to return to Account Management");
										  char cAnswer1 = Character.toUpperCase(input.next().charAt(0));
										  
											if ( cAnswer1 == 'Y' )
												
											{
												System.out.println("Your account has been closed successfully");
												sFirstName1 = " ";
												sLastName1 = " ";
												rBalance1 = 0;
												rWithdrawAmount1 = 0;
												rDeposit1 = 0;
												sIDnumber1 = " ";
												iClientNumberFill1 --;
												sPhoneNumber1 = " ";
												sPINregistered1 = " ";
												iNumDeposit1 = 0;
												iNumWithdraw1 = 0;
												keepLogIn = false;
												break;
												
											}
											
											else
											{
												break;
											}

										default:
											System.out.println("Invalid option");
											System.out.println("Please try again");
											break;
									}

									// Exit the loop if the user chooses to log out
									if (iOperation1 == 5) {
										break;
									}
								}
								break; // Exit login loop after the session ends
							} else {
								System.out.println("|--------------------------------------------|");
								System.out.println("|\tINVALID LOGIN                        |");
								System.out.println("|--------------------------------------------|");
								ClientOneLogin = false;
								break;
							}
						}
					} // End-operations for client 1

					
					// Client 2 log in
					if (iClientNumber == 2) 
					{ 
						// Start operations for client 2
						while (ClientTwoLogin) 
						{
							input.nextLine();
							System.out.println("You will provide your phone numbers and PIN to prove you are client 2");
							System.out.println("Enter phone numbers: ");
							String sPhoneNumbers = input.nextLine();
							System.out.println("Enter PIN: ");
							String sPIN = input.nextLine();
							
							if (sPhoneNumbers.equals(sPhoneNumber2) && sPIN.equals(sPINregistered2)) 
							{
								System.out.println("Login successful");

								// Loop to keep the client logged in until they choose to exit
								while (keepLogIn) 
								{
									System.out.println("+------------------------------------------+");
									System.out.println("|\tACCOUNT MANAGEMENT                 |");
									System.out.println("|------------------------------------------|");
									System.out.println("|\tSELECT ONE OF THE OPTIONS BELOW    |");
									System.out.println("|------------------------------------------|");
									System.out.println("|\t1 <---- Balance                    |");
									System.out.println("|\t2 <---- Deposit                    |");
									System.out.println("|\t3 <---- Withdraw                   |");
									System.out.println("|\t4 <---- Daily Report               |");
									System.out.println("|\t5 <---- Log out                    |");
									System.out.println("|\t6 <---- Close account              |");
									System.out.println("+------------------------------------------+");
									int iOperation2 = input.nextInt();

									// Client 2 transactions
									switch (iOperation2) 
									{
										case 1:
											System.out.println("Balance: " + formatter.format(rBalance2));
											break;

										case 2:
											System.out.println("Enter the deposit Amount: ");
											double rDeposit2 = input.nextDouble();
											rBalance2 = rBalance2 + rDeposit2;
											System.out.println("Amount deposited : " + formatter.format(rDeposit2));
											System.out.println("Available Balance: " + formatter.format(rBalance2));
											iNumDeposit2++;
											break;

										case 3:
											System.out.println("Enter amount you want to withdraw: ");
											double rWithdrawAmount2 = input.nextDouble();
											
											while ( rBalance2 == 0 )
											{
												System.out.println("You have no funds in your account. Withdrawal not possible.");
												System.out.println("PLEASE enter 0 to continue");
												rWithdrawAmount2 = input.nextDouble();
												break;
											}

											while (rWithdrawAmount2 < 0) 
											{
												System.out.println("Invalid withdrawal amount! Please enter a positive value.");
												rWithdrawAmount2 = input.nextDouble();
											}

											while (rWithdrawAmount2 > rBalance2) 
											{
												System.out.println("Insufficient balance! Unable to withdraw the requested amount.");
												System.out.println("Try again");
												rWithdrawAmount2 = input.nextDouble();
											}

											rBalance2 -= rWithdrawAmount2;
											System.out.println("Amount withdrawn: " + formatter.format(rWithdrawAmount2));
											System.out.println("Available balance: " + formatter.format(rBalance2));
											iNumWithdraw2++;
										break;

										case 4:
											System.out.println("+-----------------------------------------------------+");
											System.out.println("|\t\t\t DAILY REPORT");
											System.out.println("|-----------------------------------------------------|");
											System.out.println("| Name:\t\t\t" + sFirstName2);
											System.out.println("| Surname:\t\t" + sLastName2);
											System.out.println("| ID Number:\t\t" + sIDnumber2);
											System.out.println("|-----------------------------------------------------|");
											System.out.println("| Number of Deposits:   \t" + iNumDeposit2);
											System.out.println("| Number of Withdrawals:   \t" + iNumWithdraw2);
											System.out.println("| Available Balance:        \t" + formatter.format(rBalance2));
											System.out.println("+-----------------------------------------------------+");
										break;

										case 5:
											System.out.println("Logged out successfully\n");
											System.out.println("Thank you..Byeee..!");
										break;

										case 6:
										  System.out.println("DO you really want to close your account?");
										  System.out.println("Enter <YES> to confirm");
										  System.out.println("Enter <NO> to return to Account Management");
										  char cAnswer2 = Character.toUpperCase(input.next().charAt(0));
										  
											if ( cAnswer2 == 'Y' )
												
											{
												System.out.println("Your account has been closed successfully");
												sFirstName2 = " ";
												sLastName2 = " ";
												rBalance2 = 0;
												rWithdrawAmount2 = 0;
												rDeposit2 = 0;
												sIDnumber2 = " ";
												iClientNumberFill2 --;
												sPhoneNumber2 = " ";
												sPINregistered2 = " ";
												iNumDeposit2 = 0;
												iNumWithdraw2 = 0;
												keepLogIn = false;
												break;
											}
											
											else
											{
												break;
											}

										default:
											System.out.println("Invalid option");
											System.out.println("Please try again");
										break;
									}

									// Exit the loop if the user chooses to log out
									if (iOperation2 == 5) 
									{
										break;
									}
								}
								break; // Exit login loop after the session ends
							} else {
								System.out.println("|--------------------------------------------|");
								System.out.println("|\tINVALID LOGIN                        |");
								System.out.println("|--------------------------------------------|");
								ClientTwoLogin = false;
								break;
							}
						}
					} // End-operations for client 2
					
					//Client 3 log in
					if (iClientNumber == 3) 
					{ 
						// Start operations for client 3
						while (ClientThreeLogin) 
						{
							input.nextLine();
							System.out.println("You will provide your phone numbers and PIN to prove you are client 3");
							System.out.println("Enter phone numbers: ");
							String sPhoneNumbers = input.nextLine();
							System.out.println("Enter PIN: ");
							String sPIN = input.nextLine();
							
							if (sPhoneNumbers.equals(sPhoneNumber3) && sPIN.equals(sPINregistered3)) 
							{
								System.out.println("Login successful");

								// Loop to keep the client logged in until they choose to exit
								while (keepLogIn) 
								{
									System.out.println("+------------------------------------------+");
									System.out.println("|\tACCOUNT MANAGEMENT                 |");
									System.out.println("|------------------------------------------|");
									System.out.println("|\tSELECT ONE OF THE OPTIONS BELOW    |");
									System.out.println("|------------------------------------------|");
									System.out.println("|\t1 <---- Balance                    |");
									System.out.println("|\t2 <---- Deposit                    |");
									System.out.println("|\t3 <---- Withdraw                   |");
									System.out.println("|\t4 <---- Daily Report               |");
									System.out.println("|\t5 <---- Log out                    |");
									System.out.println("|\t6 <---- Close account              |");
									System.out.println("+------------------------------------------+");
									int iOperation3 = input.nextInt();

									// Client 3 transactions
									switch (iOperation3) 
									{
										case 1:
											System.out.println("Balance: " + formatter.format(rBalance3));
										break;

										case 2:
											System.out.println("Enter the deposit Amount: ");
											double rDeposit3 = input.nextDouble();
											rBalance3 = rBalance3 + rDeposit3;
											System.out.println("Amount deposited : " + formatter.format(rDeposit3));
											System.out.println("Available Balance: " + formatter.format(rBalance3));
											iNumDeposit3++;
										break;

										case 3:
											System.out.println("Enter amount you want to withdraw: ");
											double rWithdrawAmount3 = input.nextDouble();
											
											while ( rBalance3 == 0 )
											{
												System.out.println("You have no funds in your account. Withdrawal not possible.");
												System.out.println("PLEASE enter 0 to continue");
												rWithdrawAmount3 = input.nextDouble();
												break;
											}

											while (rWithdrawAmount3 < 0) 
											{
												System.out.println("Invalid withdrawal amount! Please enter a positive value.");
												rWithdrawAmount3 = input.nextDouble();
											}

											while (rWithdrawAmount3 > rBalance3) 
											{
												System.out.println("Insufficient balance! Unable to withdraw the requested amount.");
												System.out.println("Try again");
												rWithdrawAmount3 = input.nextDouble();
											}

											rBalance3 -= rWithdrawAmount3;
											System.out.println("Amount withdrawn: " + formatter.format(rWithdrawAmount3));
											System.out.println("Available balance: " + formatter.format(rBalance3));
											iNumWithdraw3++;
										break;

										case 4:
											System.out.println("+-----------------------------------------------------+");
											System.out.println("|\t\t\t DAILY REPORT");
											System.out.println("|-----------------------------------------------------|");
											System.out.println("| Name:\t\t\t" + sFirstName3);
											System.out.println("| Surname:\t\t" + sLastName3);
											System.out.println("| ID Number:\t\t" + sIDnumber3);
											System.out.println("|-----------------------------------------------------|");
											System.out.println("| Number of Deposits:   \t" + iNumDeposit3);
											System.out.println("| Number of Withdrawals:   \t" + iNumWithdraw3);
											System.out.println("| Available Balance:        \t" + formatter.format(rBalance3));
											System.out.println("+-----------------------------------------------------+");
											break;

										case 5:
											System.out.println("Logged out successfully\n");
										break;

										case 6:
										  System.out.println("DO you really want to close your account?");
										  System.out.println("Enter <YES> to confirm");
										  System.out.println("Enter <NO> to return to Account Management");
										  char cAnswer3 = Character.toUpperCase(input.next().charAt(0));
										  
											if ( cAnswer3 == 'Y' )
												
											{
												System.out.println("Your account has been closed successfully");
												sFirstName3 = " ";
												sLastName3 = " ";
												rBalance3 = 0;
												rWithdrawAmount3 = 0;
												rDeposit3 = 0;
												sIDnumber3 = " ";
												iClientNumberFill3 --;
												sPhoneNumber3 = " ";
												sPINregistered3 = " ";
												iNumDeposit3 = 0;
												iNumWithdraw3 = 0;
												keepLogIn = false;
												break;
											}
											
											else
											{
												break;
											}

										default:
											System.out.println("Invalid option");
											System.out.println("Please try again");
											break;
									}

									// Exit the loop if the user chooses to log out
									if (iOperation3 == 5) {
										break;
									}
								}
								break; // Exit login loop after the session ends
							} else {
								System.out.println("|--------------------------------------------|");
								System.out.println("|\tINVALID LOGIN                        |");
								System.out.println("|--------------------------------------------|");
								ClientThreeLogin = false;
								break;
							}
						}
					} // End-operations for client 3
					
					//Client 4 log in
					if (iClientNumber == 4) 
					{ 
						// Start operations for client 4
						while (ClientFourLogin) 
						{
							input.nextLine();
							System.out.println("You will provide your phone numbers and PIN to prove you are client 4");
							System.out.println("Enter phone numbers: ");
							String sPhoneNumbers = input.nextLine();
							System.out.println("Enter PIN: ");
							String sPIN = input.nextLine();
							
							if (sPhoneNumbers.equals(sPhoneNumber4) && sPIN.equals(sPINregistered4)) 
							{
								System.out.println("Login successful");

								// Loop to keep the client logged in until they choose to exit
								while (keepLogIn) 
								{
									System.out.println("+------------------------------------------+");
									System.out.println("|\tACCOUNT MANAGEMENT                 |");
									System.out.println("|------------------------------------------|");
									System.out.println("|\tSELECT ONE OF THE OPTIONS BELOW    |");
									System.out.println("|------------------------------------------|");
									System.out.println("|\t1 <---- Balance                    |");
									System.out.println("|\t2 <---- Deposit                    |");
									System.out.println("|\t3 <---- Withdraw                   |");
									System.out.println("|\t4 <---- Daily Report               |");
									System.out.println("|\t5 <---- Log out                    |");
									System.out.println("|\t6 <---- Close account              |");
									System.out.println("+------------------------------------------+");
									int iOperation4 = input.nextInt();

									// Client 4 transactions
									switch (iOperation4) 
									{
										case 1:
											System.out.println("Balance: " + formatter.format(rBalance4));
										break;

										case 2:
											System.out.println("Enter the deposit Amount: ");
											double rDeposit4 = input.nextDouble();
											rBalance4 = rBalance4 + rDeposit4;
											System.out.println("Amount deposited : " + formatter.format(rDeposit4));
											System.out.println("Available Balance: " + formatter.format(rBalance4));
											iNumDeposit4++;
										break;

										case 3:
											System.out.println("Enter amount you want to withdraw: ");
											double rWithdrawAmount4 = input.nextDouble();
											
											while ( rBalance4 == 0 )
											{
												System.out.println("You have no funds in your account. Withdrawal not possible.");
												System.out.println("PLEASE enter 0 to continue");
												rWithdrawAmount4 = input.nextDouble();
												break;
											}

											while (rWithdrawAmount4 < 0) 
											{
												System.out.println("Invalid withdrawal amount! Please enter a positive value.");
												rWithdrawAmount4 = input.nextDouble();
											}

											while (rWithdrawAmount4 > rBalance4) 
											{
												System.out.println("Insufficient balance! Unable to withdraw the requested amount.");
												System.out.println("Try again");
												rWithdrawAmount4 = input.nextDouble();
											}

											rBalance4 -= rWithdrawAmount4;
											System.out.println("Amount withdrawn: " + formatter.format(rWithdrawAmount4));
											System.out.println("Available balance: " + formatter.format(rBalance4));
											iNumWithdraw4++;
										break;

										case 4:
											System.out.println("+-----------------------------------------------------+");
											System.out.println("|\t\t\t DAILY REPORT");
											System.out.println("|-----------------------------------------------------|");
											System.out.println("| Name:\t\t\t" + sFirstName4);
											System.out.println("| Surname:\t\t" + sLastName4);
											System.out.println("| ID Number:\t\t" + sIDnumber4);
											System.out.println("|-----------------------------------------------------|");
											System.out.println("| Number of Deposits:   \t" + iNumDeposit4);
											System.out.println("| Number of Withdrawals:   \t" + iNumWithdraw4);
											System.out.println("| Available Balance:        \t" + formatter.format(rBalance4));
											System.out.println("+-----------------------------------------------------+");
											break;

										case 5:
											System.out.println("Logged out successfully\n");
											System.out.println("Thank you..Byeee..!");
										break;

										case 6:
										  System.out.println("DO you really want to close your account?");
										  System.out.println("Enter <YES> to confirm");
										  System.out.println("Enter <NO> to return to Account Management");
										  char cAnswer4 = Character.toUpperCase(input.next().charAt(0));
										  
											if ( cAnswer4 == 'Y' )
												
											{
												System.out.println("Your account has been closed successfully");
												sFirstName4 = " ";
												sLastName4 = " ";
												rBalance4 = 0;
												rWithdrawAmount4 = 0;
												rDeposit4 = 0;
												sIDnumber4 = " ";
												iClientNumberFill4 --;
												sPhoneNumber4 = " ";
												sPINregistered4 = " ";
												iNumDeposit4 = 0;
												iNumWithdraw4 = 0;
												keepLogIn = false;
											}
											
											else
											{
												break;
											}

										default:
											System.out.println("Invalid option");
											System.out.println("Please try again");
											break;
									}

									// Exit the loop if the user chooses to log out
									if (iOperation4 == 5) {
										break;
									}
								}
								break; // Exit login loop after the session ends
							} else {
								System.out.println("|--------------------------------------------|");
								System.out.println("|\tINVALID LOGIN                        |");
								System.out.println("|--------------------------------------------|");
								ClientFourLogin = false;
								break;
							}
						}
					} // End-operations for client 4
					
					
					//Client 5 log in
					if (iClientNumber == 5) 
					{ 
						// Start operations for client 5
						while (ClientFiveLogin) 
						{
							input.nextLine();
							System.out.println("You will provide your phone numbers and PIN to prove you are client 5");
							System.out.println("Enter phone numbers: ");
							String sPhoneNumbers = input.nextLine();
							System.out.println("Enter PIN: ");
							String sPIN = input.nextLine();
							
							if (sPhoneNumbers.equals(sPhoneNumber5) && sPIN.equals(sPINregistered5)) 
							{
								System.out.println("Login successful");

								// Loop to keep the client logged in until they choose to exit
								while (true) 
								{
									System.out.println("+------------------------------------------+");
									System.out.println("|\tACCOUNT MANAGEMENT                 |");
									System.out.println("|------------------------------------------|");
									System.out.println("|\tSELECT ONE OF THE OPTIONS BELOW    |");
									System.out.println("|------------------------------------------|");
									System.out.println("|\t1 <---- Balance                    |");
									System.out.println("|\t2 <---- Deposit                    |");
									System.out.println("|\t3 <---- Withdraw                   |");
									System.out.println("|\t4 <---- Daily Report               |");
									System.out.println("|\t5 <---- Log out                    |");
									System.out.println("|\t6 <---- Close account              |");
									System.out.println("+------------------------------------------+");
									int iOperation5 = input.nextInt();

									// Client 4 transactions
									switch (iOperation5) 
									{
										case 1:
											System.out.println("Balance: " + formatter.format(rBalance5));
										break;

										case 2:
											System.out.println("Enter the deposit Amount: ");
											double rDeposit5 = input.nextDouble();
											rBalance5 = rBalance5 + rDeposit5;
											System.out.println("Amount deposited : " + formatter.format(rDeposit5));
											System.out.println("Available Balance: " + formatter.format(rBalance5));
											iNumDeposit5++;
										break;

										case 3:
											System.out.println("Enter amount you want to withdraw: ");
											double rWithdrawAmount5 = input.nextDouble();
											
											while ( rBalance5 == 0 )
											{
												System.out.println("You have no funds in your account. Withdrawal not possible.");
												System.out.println("PLEASE enter 0 to continue");
												rWithdrawAmount5 = input.nextDouble();
												break;
											}

											while (rWithdrawAmount5 < 0) 
											{
												System.out.println("Invalid withdrawal amount! Please enter a positive value.");
												rWithdrawAmount5 = input.nextDouble();
											}

											while (rWithdrawAmount5 > rBalance5) 
											{
												System.out.println("Insufficient balance! Unable to withdraw the requested amount.");
												System.out.println("Try again");
												rWithdrawAmount5 = input.nextDouble();
											}

											rBalance5 -= rWithdrawAmount5;
											System.out.println("Amount withdrawn: " + formatter.format(rWithdrawAmount5));
											System.out.println("Available balance: " + formatter.format(rBalance5));
											iNumWithdraw5++;
										break;

										case 4:
											System.out.println("+-----------------------------------------------------+");
											System.out.println("|\t\t\t DAILY REPORT");
											System.out.println("|-----------------------------------------------------|");
											System.out.println("| Name:\t\t\t" + sFirstName5);
											System.out.println("| Surname:\t\t" + sLastName5);
											System.out.println("| ID Number:\t\t" + sIDnumber5);
											System.out.println("|-----------------------------------------------------|");
											System.out.println("| Number of Deposits:   \t" + iNumDeposit5);
											System.out.println("| Number of Withdrawals:   \t" + iNumWithdraw5);
											System.out.println("| Available Balance:        \t" + formatter.format(rBalance5));
											System.out.println("+-----------------------------------------------------+");
										break;

										case 5:
											System.out.println("Logged out successfully\n");
											System.out.println("Thank you..Byeee..!");
										break;

										case 6:
										  System.out.println("Do you really want to close your account?");
										  System.out.println("Enter <YES> to confirm");
										  System.out.println("Enter <NO> to return to Account Management");
										  char cAnswer5 = Character.toUpperCase(input.next().charAt(0));
										  
											if ( cAnswer5 == 'Y' )
												
											{
												System.out.println("Your account has been closed successfully");
												sFirstName5 = " ";
												sLastName5 = " ";
												rBalance5 = 0;
												rWithdrawAmount5 = 0;
												rDeposit5 = 0;
												sIDnumber5 = " ";
												iClientNumberFill5 --;
												sPhoneNumber5 = " ";
												sPINregistered5 = " ";
												iNumDeposit5 = 0;
												iNumWithdraw5 = 0;
												keepLogIn = false;
											}
											
											else
											{
												break;
											}

										default:
											System.out.println("Invalid option");
											System.out.println("Please try again");
											break;
									}

									// Exit the loop if the user chooses to log out
									if (iOperation5 == 5) {
										break;
									}
								}
								break; // Exit login loop after the session ends
							} else {
								System.out.println("|--------------------------------------------|");
								System.out.println("|\tINVALID LOGIN                        |");
								System.out.println("|--------------------------------------------|");
								ClientFiveLogin = false;
								break;
							}
						}
					} // End-operations for client 5
					
                    break; // Breaking switch 1 ( log in )
					

                // Opening Account
                case 2:
                    System.out.println("+--------------------------------------------+");
                    System.out.println("|           UNITY FINANCIAL BANK             |");
                    System.out.println("|--------------------------------------------|");
                    System.out.println("|  Enter your client number(between 1 to 5): |");
                    System.out.println("+--------------------------------------------+");
                    iClientNumber = input.nextInt();

					// Registering client 1
					if (iClientNumber == 1) 
					{
						if (iClientNumberFill1 == 1) 
						{
							System.out.println("Another client already registered under this client number");
							System.out.println("Please choose another client number between client number 2, 3, 4 or 5");
							iClientNumber = input.nextInt();
						}

						input.nextLine(); // Removing keyboard buffer
						System.out.println("Enter your first name: ");
						sFirstName1 = input.nextLine();
						System.out.println("Enter your last name: ");
						sLastName1 = input.nextLine();
						System.out.println("Enter your phone number: ");
						sPhoneNumber1 = input.nextLine();

						while (sPhoneNumber1.length() != 10) 
						{
							System.out.println("Phone number must be 10 digits");
							System.out.println("Please re-enter your phone number");
							sPhoneNumber1 = input.nextLine();
						}

						System.out.println("Enter your ID number: ");
						sIDnumber1 = input.nextLine();

						while (sIDnumber1.length() != 13) 
						{
							System.out.println("ID number must be 13 digits");
							System.out.println("Please re-enter your ID number");
							sIDnumber1 = input.nextLine();
						}

						System.out.println("Create PIN: ");
						sPINcreate = input.nextLine();
						System.out.println("Confirm your PIN: ");
						sPINregistered1 = input.nextLine();

						// PIN validation
						while (!sPINcreate.equals(sPINregistered1)) 
						{
							System.out.println("PINs do not match. Please try again.");
							System.out.println("Create PIN: ");
							sPINcreate = input.nextLine();
							System.out.println("Confirm your PIN: ");
							sPINregistered1 = input.nextLine();
						}

						System.out.println("Client registration successful");
						System.out.println("Please log in on your client number");
						sPINcreate = "";
						iClientNumberFill1++;
						
					 }
					
					//Registering client 2
					if (iClientNumber == 2) 
					{
						if (iClientNumberFill2 == 1) 
						{
							System.out.println("Another client already registered under this client number");
							System.out.println("Please choose another client number between client number 1, 3, 4 or 5");
							iClientNumber = input.nextInt();
						}

						input.nextLine(); // Removing keyboard buffer
						System.out.println("Enter your first name: ");
						sFirstName2 = input.nextLine();
						System.out.println("Enter your last name: ");
						sLastName2 = input.nextLine();
						System.out.println("Enter your phone number: ");
						sPhoneNumber2 = input.nextLine();

						while (sPhoneNumber2.length() != 10) 
						{
							System.out.println("Phone number must be 10 digits");
							System.out.println("Please re-enter your phone number");
							sPhoneNumber2 = input.nextLine();
						}

						System.out.println("Enter your ID number: ");
						sIDnumber2 = input.nextLine();

						while (sIDnumber2.length() != 13) 
						{
							System.out.println("ID number must be 13 digits");
							System.out.println("Please re-enter your ID number");
							sIDnumber2 = input.nextLine();
						}

						System.out.println("Create PIN: ");
						sPINcreate = input.nextLine();
						System.out.println("Confirm your PIN: ");
						sPINregistered2 = input.nextLine();

						// PIN validation
						while (!sPINcreate.equals(sPINregistered2)) 
						{
							System.out.println("PINs do not match. Please try again.");
							System.out.println("Create PIN: ");
							sPINcreate = input.nextLine();
							System.out.println("Confirm your PIN: ");
							sPINregistered2 = input.nextLine();
						}

						System.out.println("Client registration successful");
						System.out.println("Please log in on your client number");
						sPINcreate = "";
						iClientNumberFill2++;
					 }
					
					//Registering client 3
					if (iClientNumber == 3) 
					{
						if (iClientNumberFill3 == 1) 
						{
							System.out.println("Another client already registered under this client number");
							System.out.println("Please choose another client number between client number 1, 2, 4 or 5");
							iClientNumber = input.nextInt();
						}

						input.nextLine(); // Removing keyboard buffer
						System.out.println("Enter your first name: ");
						sFirstName3 = input.nextLine();
						System.out.println("Enter your last name: ");
						sLastName3 = input.nextLine();
						System.out.println("Enter your phone number: ");
						sPhoneNumber3 = input.nextLine();

						while (sPhoneNumber3.length() != 10) 
						{
							System.out.println("Phone number must be 10 digits");
							System.out.println("Please re-enter your phone number");
							sPhoneNumber3 = input.nextLine();
						}

						System.out.println("Enter your ID number: ");
						sIDnumber3 = input.nextLine();

						while (sIDnumber3.length() != 13) 
						{
							System.out.println("ID number must be 13 digits");
							System.out.println("Please re-enter your ID number");
							sIDnumber3 = input.nextLine();
						}

						System.out.println("Create PIN: ");
						sPINcreate = input.nextLine();
						System.out.println("Confirm your PIN: ");
						sPINregistered3 = input.nextLine();

						// PIN validation
						while (!sPINcreate.equals(sPINregistered3)) 
						{
							System.out.println("PINs do not match. Please try again.");
							System.out.println("Create PIN: ");
							sPINcreate = input.nextLine();
							System.out.println("Confirm your PIN: ");
							sPINregistered3 = input.nextLine();
						}

						System.out.println("Client registration successful");
						System.out.println("Please log in on client number 3");
						sPINcreate = "";
						iClientNumberFill3++;
					 }
					
					//Registering client 4
					if (iClientNumber == 4) 
					{
						if (iClientNumberFill4 == 1) 
						{
							System.out.println("Another client already registered under this client number");
							System.out.println("Please choose another client number between client number 1, 2, 3 or 5");
							iClientNumber = input.nextInt();
						}

						input.nextLine(); // Removing keyboard buffer
						System.out.println("Enter your first name: ");
						sFirstName4 = input.nextLine();
						System.out.println("Enter your last name: ");
						sLastName4 = input.nextLine();
						System.out.println("Enter your phone number: ");
						sPhoneNumber4 = input.nextLine();

						while (sPhoneNumber4.length() != 10) 
						{
							System.out.println("Phone number must be 10 digits");
							System.out.println("Please re-enter your phone number");
							sPhoneNumber4 = input.nextLine();
						}

						System.out.println("Enter your ID number: ");
						sIDnumber4 = input.nextLine();

						while (sIDnumber4.length() != 13) {
							System.out.println("ID number must be 13 digits");
							System.out.println("Please re-enter your ID number");
							sIDnumber4 = input.nextLine();
						}

						System.out.println("Create PIN: ");
						sPINcreate = input.nextLine();
						System.out.println("Confirm your PIN: ");
						sPINregistered4 = input.nextLine();

						// PIN validation
						while (!sPINcreate.equals(sPINregistered4)) 
						{
							System.out.println("PINs do not match. Please try again.");
							System.out.println("Create PIN: ");
							sPINcreate = input.nextLine();
							System.out.println("Confirm your PIN: ");
							sPINregistered4 = input.nextLine();
						}

						System.out.println("Client registration successful");
						System.out.println("Please log in oo your client number");
						sPINcreate = "";
						iClientNumberFill4++;
					 }
					 
					 //Registering client 5
					if (iClientNumber == 5) 
					{
						if (iClientNumberFill5 == 1) 
						{
							System.out.println("Another client already registered under this client number");
							System.out.println("Please choose another client number between client number 1, 2, 3 or 4");
							iClientNumber = input.nextInt();
						}

						input.nextLine(); // Removing keyboard buffer
						System.out.println("Enter your first name: ");
						sFirstName5 = input.nextLine();
						System.out.println("Enter your last name: ");
						sLastName5 = input.nextLine();
						System.out.println("Enter your phone number: ");
						sPhoneNumber5 = input.nextLine();

						while (sPhoneNumber5.length() != 10) 
						{
							System.out.println("Phone number must be 10 digits");
							System.out.println("Please re-enter your phone number");
							sPhoneNumber5 = input.nextLine();
						}

						System.out.println("Enter your ID number: ");
						sIDnumber5 = input.nextLine();

						while (sIDnumber5.length() != 13) 
						{
							System.out.println("ID number must be 13 digits");
							System.out.println("Please re-enter your ID number");
							sIDnumber5 = input.nextLine();
						}

						System.out.println("Create PIN: ");
						sPINcreate = input.nextLine();
						System.out.println("Confirm your PIN: ");
						sPINregistered5 = input.nextLine();

						// PIN validation
						while (!sPINcreate.equals(sPINregistered5)) 
						{
							System.out.println("PINs do not match. Please try again.");
							System.out.println("Create PIN: ");
							sPINcreate = input.nextLine();
							System.out.println("Confirm your PIN: ");
							sPINregistered5 = input.nextLine();
						}

						System.out.println("Client registration successful");
						System.out.println("Please log in on your client number");
						sPINcreate = "";
						iClientNumberFill5++;
					 }
					 if ( (iClientNumberFill1 == 1 ) && ( iClientNumberFill2 == 1 ) && ( iClientNumberFill3 == 1 ) && ( iClientNumberFill4 == 1 ) && ( iClientNumberFill5 == 1 ) )
					{
						System.out.println("Maximum number of clients registered");
						System.out.println("Cannot register more clients");
					}
					break;

                default:
                    System.out.println("Invalid Option!");
					System.out.println("Please try again");
					iOperation = input.nextInt();
            } // End switch
			
        } // End while(true)-infinite loop
    }
}
