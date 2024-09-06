import java.util.Scanner; //Scanner class is imported from java.util package
import java.text.DecimalFormat; //DecimalFormat class is imported from java.text package 

public class BankingSystem
{//Start class
	public static void main(String[] args)
	{//Start main method
		
		//Instantiation of object
		Scanner input = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("R00.00");
		
		//Declare variable
        int iOperation1, iOperation2; 
		int iPIN1 = 1234, iPIN_Entered1, iOption;
		double rBalance = 0, rDeposit, rWithdraw = 0;
		char cOtherOptions;
		
		//Flags---(Not used yet)
		boolean bPerson1 = false;
		boolean bPerson2 = false;
		boolean bPerson3 = false;
		boolean bPerson4 = false
		boolean bPerson5 = false;
		
		//Input
		System.out.println("+-----------------------------------+");
		System.out.println("|\t.....WELCOME.....           |");
		System.out.println("|-----------------------------------|");
		System.out.println("|\tSELECT AN OPERATION BELOW   |");
		System.out.println("|-----------------------------------|");
		System.out.println("|\t1 <---- login               |");
		System.out.println("|\t2 <---- Open account        |");
		System.out.println("+-----------------------------------+");
		iOperation1 = input.nextInt();
		
		switch ( iOperation1 )
		{ //Start switch for operation 1
		
			case 1 : //From log in process
			System.out.println("Enter pin: ");
			iPIN_Entered1 = input.nextInt();
			
			//Giving the user an access if the user entered the correct pin
			if ( iPIN1 == iPIN_Entered1 )
			{
				System.out.println("+------------------------------------------+");
				System.out.println("|\tSELECT ONE OF THE OPTIONS BELOW    |");
				System.out.println("|------------------------------------------|");
				System.out.println("|\t1 <---- Balance                    |");
				System.out.println("|\t2 <---- Deposit                    |");
				System.out.println("|\t3 <---- Withdraw                   |");
				System.out.println("|\t4 <---- Statement                  |");
 				System.out.println("|\t5 <---- Exit                       |");
				System.out.println("+------------------------------------------+");
				iOperation2 = input.nextInt();
				 
				//Continuing with option 1 <-- Balance
				while ( iOperation2 != 5 )
				{
					
				    switch ( iOperation2 )
			       {
					
				        case 1: //View balance
				        System.out.println("Balance: "+formatter.format(rBalance));
						break;
				
				        case 2: //deposit
				        System.out.println("Enter the deposit Amount: ");
				        rDeposit = input.nextDouble();
				        System.out.println("Amount deposited: "+formatter.format(rDeposit));
				        rBalance = rBalance + rDeposit;
				        System.out.println("Available Balance: "+formatter.format(rBalance));
						break;
				
				        case 3 : //Withdrawl
				        System.out.println("Enter the withdrawal amount: ");
				        rBalance = rBalance - rWithdraw;
				        System.out.println("Amount withdrawn :"+formatter.format(rWithdraw));
						break;
					
					    case 4 : //Printing statement
					    break; 

			            case 5 : //Long out 
			            System.out.println("You have logged out successfully");
				        System.exit(1);
						break;
						
						default :
						System.out.println("....Invalid Option....");
						break;
				   }
				   
				    System.out.println("+------------------------------------------+");
				    System.out.println("|\tSELECT ONE OF THE OPTIONS BELOW    |");
				    System.out.println("|------------------------------------------|");
				    System.out.println("|\t1 <---- Balance                    |");
				    System.out.println("|\t2 <---- Deposit                    |");
				    System.out.println("|\t3 <---- Withdraw                   |");
				    System.out.println("|\t4 <---- Statement                  |");
 				    System.out.println("|\t5 <---- Exit                       |");
				    System.out.println("+------------------------------------------+");
				    iOperation2 = input.nextInt();
				   
				}
				
			}
			
			//Opening an account
			case 2:
			break;
			
			default:
			System.out.println(".....INVALID OPTION.....");
			break;
		}
		
	}//End main method
}//End class