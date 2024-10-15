import java.util.Scanner; // Scanner class is imported from java.util package
import java.text.DecimalFormat; // DecimalFormat class is imported from java.text package

public class BankingSystemTesting 
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

        // Declaring variables for client names registration
        String sFirstName1 = "", sLastName1 = "";
        String sFirstName2 = "", sLastName2 = "";
        String sFirstName3 = "", sLastName3 = "";
        String sFirstName4 = "", sLastName4 = "";
        String sFirstName5 = "", sLastName5 = "";

        // Declaring variables for client Phone number registration
        String sPhoneNumber1 = "", sPhoneNumber2 = "", sPhoneNumber3 = "", sPhoneNumber4 = "", sPhoneNumber5 = "";

        // Declaring variables for IDnumberRegistration
        String sIDnumber1 = "", sIDnumber2 = "", sIDnumber3 = "", sIDnumber4 = "", sIDnumber5 = "";

        // Declaring variables for PIN registration
        String sPINcreate;

        // Client Balances
        double rBalance1 = 0.0, rBalance2 = 0.0, rBalance3 = 0.0, rBalance4 = 0.0, rBalance5 = 0.0;

        while (true) { // Start while(true)-infinite loop
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
					{ // Start operations for client 1
                        while (true) 
						{
                            input.nextLine();
                            System.out.println("You will provide your phone numbers and PIN to prove you are client 1");
                            System.out.println("Enter phone numbers: ");
                            String sPhoneNumbers = input.nextLine();
                            System.out.println("Enter PIN: ");
                            String sPIN = input.nextLine();
                            if (sPhoneNumbers.equals(sPhoneNumber1) && sPIN.equals(sPINregistered1)) 
							{
                                System.out.println("Login successful");

                                // Loop to keep the client logged in until they choose to exit
                                while (true) {
                                    System.out.println("+------------------------------------------+");
                                    System.out.println("|\tACCOUNT MANAGEMENT                 |");
                                    System.out.println("|------------------------------------------|");
                                    System.out.println("|\tSELECT ONE OF THE OPTIONS BELOW    |");
                                    System.out.println("|------------------------------------------|");
                                    System.out.println("|\t1 <---- Balance                    |");
                                    System.out.println("|\t2 <---- Deposit                    |");
                                    System.out.println("|\t3 <---- Withdraw                   |");
                                    System.out.println("|\t4 <---- Exit                       |");
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
                                            break;

                                        case 3:
                                            System.out.println("Enter amount you want to withdraw: ");
                                            double rWithdrawAmount1 = input.nextDouble();
                                            if (rWithdrawAmount1 > 0 && rWithdrawAmount1 <= rBalance1) 
											{
                                                rBalance1 = rBalance1 - rWithdrawAmount1;
                                                System.out.println("Amount withdrawn: " + formatter.format(rWithdrawAmount1));
                                                System.out.println("Available balance: " + formatter.format(rBalance1));
                                            } 
											while (rWithdrawAmount1 > rBalance1) 
											{
                                                System.out.println("Insufficient balance! Unable to withdraw the requested amount.");
												System.out.println("Please try again..!");
												rWithdrawAmount1 = input.nextDouble();
                                            } 
											while ( rWithdrawAmount1 < 0 )
											{
                                                System.out.println("Invalid withdrawal amount! Please enter a positive value.");
												rWithdrawAmount1 = input.nextDouble();
											}
                                            break;

                                        case 4:
                                            System.out.println("Logging out...");
                                            break;

                                        default:
                                            System.out.println("Invalid option");
											System.out.println("Please try again");
											iOperation1 = input.nextInt();
											
                                    }

                                    // Exit the loop if the user chooses to log out
                                    if (iOperation1 == 4) 
									{
                                        break;
                                    }
                                }
                                break; // Exit login loop after the session ends
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
                        }
                    } // End-operations for client 1
					
					if (iClientNumber == 2) 
					{ // Start operations for client 2
                        while (true) 
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
                                    System.out.println("|\t4 <---- Exit                       |");
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
                                            break;

                                        case 3:
                                            System.out.println("Enter amount you want to withdraw: ");
                                            double rWithdrawAmount2 = input.nextDouble();
                                            if (rWithdrawAmount2 > 0 && rWithdrawAmount2 <= rBalance2) 
											{
                                                rBalance2 = rBalance2 - rWithdrawAmount2;
                                                System.out.println("Amount withdrawn: " + formatter.format(rWithdrawAmount2));
                                                System.out.println("Available balance: " + formatter.format(rBalance2));
                                            } 
											while (rWithdrawAmount2 > rBalance2) 
											{
                                                System.out.println("Insufficient balance! Unable to withdraw the requested amount.");
												System.out.println("Please try again..!");
												rWithdrawAmount2 = input.nextDouble();
                                            } 
											while ( rWithdrawAmount2 < 0 )
											{
                                                System.out.println("Invalid withdrawal amount! Please enter a positive value.");
												rWithdrawAmount2 = input.nextDouble();
											}
                                            break;

                                        case 4:
                                            System.out.println("Logging out...");
                                            break;

                                        default:
                                            System.out.println("Invalid option");
											System.out.println("Please try again");
											iOperation2 = input.nextInt();
											
                                    }

                                    // Exit the loop if the user chooses to log out
                                    if (iOperation2 == 4) 
									{
                                        break;
                                    }
                                }
                                break; // Exit login loop after the session ends
                            } else 
							{
                                System.out.println("|--------------------------------------------|");
                                System.out.println("|\tINVALID LOGIN                        |");
                                System.out.println("|--------------------------------------------|");
                                System.out.println("|  Enter your client number(between 1 to 5): |");
                                System.out.println("+--------------------------------------------+");
                                iClientNumber = input.nextInt();
                            }
                        }
                    } // End-operations for client 2
					
					if (iClientNumber == 3) 
					{ // Start operations for client 3
                        while (true) 
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
                                    System.out.println("|\t4 <---- Exit                       |");
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
                                            break;

                                        case 3:
                                            System.out.println("Enter amount you want to withdraw: ");
                                            double rWithdrawAmount3 = input.nextDouble();
                                            if (rWithdrawAmount3 > 0 && rWithdrawAmount3 <= rBalance3) 
											{
                                                rBalance3 = rBalance3 - rWithdrawAmount3;
                                                System.out.println("Amount withdrawn: " + formatter.format(rWithdrawAmount3));
                                                System.out.println("Available balance: " + formatter.format(rBalance3));
                                            } 
											while (rWithdrawAmount3 > rBalance3) 
											{
                                                System.out.println("Insufficient balance! Unable to withdraw the requested amount.");
												System.out.println("Please try again..!");
												rWithdrawAmount3 = input.nextDouble();
                                            } 
											while ( rWithdrawAmount3 < 0 )
											{
                                                System.out.println("Invalid withdrawal amount! Please enter a positive value.");
												rWithdrawAmount3 = input.nextDouble();
											}
                                            break;

                                        case 4:
                                            System.out.println("Logging out...");
                                            break;

                                        default:
                                            System.out.println("Invalid option");
											System.out.println("Please try again");
											iOperation3 = input.nextInt();
											
                                    }

                                    // Exit the loop if the user chooses to log out
                                    if (iOperation3 == 4) 
									{
                                        break;
                                    }
                                }
                                break; // Exit login loop after the session ends
                            } else 
							{
                                System.out.println("|--------------------------------------------|");
                                System.out.println("|\tINVALID LOGIN                        |");
                                System.out.println("|--------------------------------------------|");
                                System.out.println("|  Enter your client number(between 1 to 5): |");
                                System.out.println("+--------------------------------------------+");
                                iClientNumber = input.nextInt();
                            }
                        }
                    } // End-operations for client 3
					
					if (iClientNumber == 4) 
					{ // Start operations for client 3
                        while (true) 
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
                                    System.out.println("|\t4 <---- Exit                       |");
                                    System.out.println("+------------------------------------------+");
                                    int iOperation4 = input.nextInt();

                                    // Client 3 transactions
                                    switch (iOperation4) 
									{
                                        case 1:
                                            System.out.println("Balance: " + formatter.format(rBalance3));
                                            break;

                                        case 2:
                                            System.out.println("Enter the deposit Amount: ");
                                            double rDeposit4 = input.nextDouble();
                                            rBalance4 = rBalance4 + rDeposit4;
                                            System.out.println("Amount deposited : " + formatter.format(rDeposit4));
                                            System.out.println("Available Balance: " + formatter.format(rBalance4));
                                            break;

                                        case 3:
                                            System.out.println("Enter amount you want to withdraw: ");
                                            double rWithdrawAmount4 = input.nextDouble();
                                            if (rWithdrawAmount4 > 0 && rWithdrawAmount4 <= rBalance4) 
											{
                                                rBalance4 = rBalance4 - rWithdrawAmount4;
                                                System.out.println("Amount withdrawn: " + formatter.format(rWithdrawAmount4));
                                                System.out.println("Available balance: " + formatter.format(rBalance4));
                                            } 
											while (rWithdrawAmount4 > rBalance4) 
											{
                                                System.out.println("Insufficient balance! Unable to withdraw the requested amount.");
												System.out.println("Please try again..!");
												rWithdrawAmount4 = input.nextDouble();
                                            } 
											while ( rWithdrawAmount4 < 0 )
											{
                                                System.out.println("Invalid withdrawal amount! Please enter a positive value.");
												rWithdrawAmount4 = input.nextDouble();
											}
                                            break;

                                        case 4:
                                            System.out.println("Logged out...");
                                            break;

                                        default:
                                            System.out.println("Invalid option");
											System.out.println("Please try again");
											iOperation4 = input.nextInt();
											
                                    }

                                    // Exit the loop if the user chooses to log out
                                    if (iOperation4 == 4) 
									{
                                        break;
                                    }
                                }
                                break; // Exit login loop after the session ends
                            } else 
							{
                                System.out.println("|--------------------------------------------|");
                                System.out.println("|\tINVALID LOGIN                        |");
                                System.out.println("|--------------------------------------------|");
                                System.out.println("|  Enter your client number(between 1 to 5): |");
                                System.out.println("+--------------------------------------------+");
                                iClientNumber = input.nextInt();
                            }
                        }
                    } // End-operations for client 4
					
					if (iClientNumber == 5) 
					{ // Start operations for client 5
                        while (true) 
						{
                            input.nextLine();
                            System.out.println("You will provide your phone numbers and PIN to prove you are client 4");
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
                                    System.out.println("|\t4 <---- Exit                       |");
                                    System.out.println("+------------------------------------------+");
                                    int iOperation5 = input.nextInt();

                                    // Client 5 transactions
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
                                            break;

                                        case 3:
                                            System.out.println("Enter amount you want to withdraw: ");
                                            double rWithdrawAmount5 = input.nextDouble();
                                            if (rWithdrawAmount5 > 0 && rWithdrawAmount5 <= rBalance5) 
											{
                                                rBalance5 = rBalance5 - rWithdrawAmount5;
                                                System.out.println("Amount withdrawn: " + formatter.format(rWithdrawAmount5));
                                                System.out.println("Available balance: " + formatter.format(rBalance5));
                                            } 
											while (rWithdrawAmount5 > rBalance5) 
											{
                                                System.out.println("Insufficient balance! Unable to withdraw the requested amount.");
												System.out.println("Please try again..!");
												rWithdrawAmount5 = input.nextDouble();
                                            } 
											while ( rWithdrawAmount5 < 0 )
											{
                                                System.out.println("Invalid withdrawal amount! Please enter a positive value.");
												rWithdrawAmount5 = input.nextDouble();
											}
                                            break;

                                        case 4:
                                            System.out.println("Logged out...");
                                            break;

                                        default:
                                            System.out.println("Invalid option");
											System.out.println("Please try again");
											iOperation5 = input.nextInt();
											
                                    }

                                    // Exit the loop if the user chooses to log out
                                    if (iOperation5 == 4) 
									{
                                        break;
                                    }
                                }
                                break; // Exit login loop after the session ends
                            } else 
							{
                                System.out.println("|--------------------------------------------|");
                                System.out.println("|\tINVALID LOGIN                        |");
                                System.out.println("|--------------------------------------------|");
                                System.out.println("|  Enter your client number(between 1 to 5): |");
                                System.out.println("+--------------------------------------------+");
                                iClientNumber = input.nextInt();
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
                        if (sPINcreate.equals(sPINregistered1)) 
						{
                            System.out.println("Client registration successfully");
                        } 
						while ( sPINcreate != sPINregistered1 )
						{
                            System.out.println("PINs do not match. Please try again.");
							System.out.println("Create PIN: ");
							sPINcreate = input.nextLine();
							System.out.println("Confirm your PIN: ");
							sPINregistered1 = input.nextLine();
							
                        }
                    }
					
					//Registering client 2
					 if (iClientNumber == 2) 
					{
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
                        if (sPINcreate.equals(sPINregistered1)) 
						{
                            System.out.println("Client registration successfully");
                        } 
						while ( sPINcreate != sPINregistered2 )
						{
                            System.out.println("PINs do not match. Please try again.");
							System.out.println("Create PIN: ");
							sPINcreate = input.nextLine();
							System.out.println("Confirm your PIN: ");
							sPINregistered2 = input.nextLine();
                        }
                    }
					
					//Registering client 3
					 if (iClientNumber == 3) 
					{
                        input.nextLine();
                        System.out.println("Enter your first name: ");
                        sFirstName3 = input.nextLine();
                        System.out.println("Enter your last name: ");
                        sLastName3 = input.nextLine();
                        System.out.println("Enter your phone numbers: ");
                        sPhoneNumber3 = input.nextLine();
                        System.out.println("Enter your ID number: ");
                        sIDnumber3 = input.nextLine();
                        System.out.println("Create PIN: ");
                        sPINcreate = input.nextLine();
                        System.out.println("Confirm your PIN: ");
                        sPINregistered3 = input.nextLine();
                        if (sPINcreate.equals(sPINregistered3)) 
						{
                            System.out.println("Client registration successfully");
                        } 
						while ( sPINcreate != sPINregistered3 )
						{
                            System.out.println("PINs do not match. Please try again.");
							System.out.println("Create PIN: ");
							sPINcreate = input.nextLine();
							System.out.println("Confirm your PIN: ");
							sPINregistered3 = input.nextLine();
                        }
                    }
					
					//Registering client 4
					 if (iClientNumber == 4) 
					{
                        input.nextLine();
                        System.out.println("Enter your first name: ");
                        sFirstName4 = input.nextLine();
                        System.out.println("Enter your last name: ");
                        sLastName4 = input.nextLine();
                        System.out.println("Enter your phone numbers: ");
                        sPhoneNumber4 = input.nextLine();
                        System.out.println("Enter your ID number: ");
                        sIDnumber4 = input.nextLine();
                        System.out.println("Create PIN: ");
                        sPINcreate = input.nextLine();
                        System.out.println("Confirm your PIN: ");
                        sPINregistered4 = input.nextLine();
                        if (sPINcreate.equals(sPINregistered4)) 
						{
                            System.out.println("Client registration successfully");
                        } 
						while ( sPINcreate != sPINregistered4 )
						{
                            System.out.println("PINs do not match. Please try again.");
							System.out.println("Create PIN: ");
							sPINcreate = input.nextLine();
							System.out.println("Confirm your PIN: ");
							sPINregistered4 = input.nextLine();
                        }
                    }
					
					//Registering client 5
					 if (iClientNumber == 5) 
					{
                        input.nextLine();
                        System.out.println("Enter your first name: ");
                        sFirstName5 = input.nextLine();
                        System.out.println("Enter your last name: ");
                        sLastName5 = input.nextLine();
                        System.out.println("Enter your phone numbers: ");
                        sPhoneNumber5 = input.nextLine();
                        System.out.println("Enter your ID number: ");
                        sIDnumber5 = input.nextLine();
                        System.out.println("Create PIN: ");
                        sPINcreate = input.nextLine();
                        System.out.println("Confirm your PIN: ");
                        sPINregistered5 = input.nextLine();
                        if (sPINcreate.equals(sPINregistered5)) 
						{
                            System.out.println("Client registration successfully");
                        } 
						while ( sPINcreate != sPINregistered5 )
						{
                            System.out.println("PINs do not match. Please try again.");
							System.out.println("Create PIN: ");
							sPINcreate = input.nextLine();
							System.out.println("Confirm your PIN: ");
							sPINregistered5 = input.nextLine();
                        }
                    }
					break;

                default:
                    System.out.println("Invalid operation!");
					System.out.println("Please try again");
					iOperation = input.nextInt();
            } // End switch
        } // End while(true)-infinite loop
    }
}
