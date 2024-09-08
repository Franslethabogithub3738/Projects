import java.util.Scanner; //Scanner class is imported from java.util package
import java.text.DecimalFormat; //DecimalFormat class is imported from java.text package
import javax.swing.JFrame; //JFrame class is imported from swing library
import javax.swing.ImageIcon; //ImageIcon is imported swing library to change the log to my own choise of my logo
import java.awt.Color; //Color is imported from java.awt package

public class BankingSystem
{//Start class	
	public static void main(String[] args)
	{//Start main method
		
		//Creating a window--(something like a layout)
		JFrame frame = new JFrame(); //An object frame is instantiated based on JFrame class
		frame.setTitle("QUANTUM FINANCIAL"); //This sets a title of the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //EXIT OUT OF APPLICATION
		frame.setSize(500,500); //Setting the frame size (It sets the X-dimenssion and Y-dimenssion of a frame)
		frame.setResizable(true); //Prevent frame from being resized
		frame.setVisible(true); //Making the frame visible ( true to allow it to be visible and false to not allow it to be visible
		
		ImageIcon image = new ImageIcon("Logo.png"); //Create an image Icon
		//frame.setIconImage(Image.getImage()); //This will change the icon of frame
		
		//Changing the color of the frame
		frame.getContentPane().setBackground(new Color(800080)); //Change the color of the background(Google hexadecimal Colors)
		
		//Instantiation of object
		Scanner input = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("R00.00");
		
		//Declare variable
        int iOperation1, iOperation2; 
		int iPIN1 = 1234, iPIN_Entered1, iOption;
		double rBalance = 1000, rDeposit , rWithdraw = 0;
		char cOtherOptions;
		int iPinAttempts = 3;
		
		//Flags---(Not used yet)
		boolean bPerson1 = false;
		boolean bPerson2 = false;
		boolean bPerson3 = false;
		boolean bPerson4 = false;
		boolean bPerson5 = false;
		
		//Input
		System.out.println("+-----------------------------------+");
		System.out.println("|   ...QUANTUM FINANCIAL...         |");
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
				        System.out.println("Amount deposited : "+formatter.format(rDeposit));
				        rBalance = rBalance + rDeposit;
				        System.out.println("Available Balance: "+formatter.format(rBalance));
						break;
				
				        case 3 : //Withdrawl
				        System.out.println("Enter the withdrawal amount: ");
						rWithdraw = input.nextDouble();
				        rBalance = rBalance - rWithdraw;

				        System.out.println("Amount withdrawn : "+formatter.format(rWithdraw));
						System.out.println("Available balance: "+formatter.format(rBalance));
						break;
					
					    case 4 : //Printing statement
					    break; 

			            case 5 : //Long out 
			            System.out.println("You have logged out successfully");
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
			System.out.println(".....INVALID OPERATION.....");
			System.out.println(".....KINDLY SELECT THE CORRECT OPERATION.............");
		}
		
	}//End main method
}//End class
