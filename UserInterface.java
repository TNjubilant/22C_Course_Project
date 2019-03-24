import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		char choice;
		String username;
		String password;
		
		
		
		System.out.println("Welcome to the Philz Coffee Storefront.\n");
		System.out.print("Press C to login as a customer or E to login as employee: ");
		
		choice = input.next().charAt(0);
		Character.toUpperCase(choice);
		
		//Allow user to keep entering a choice until input is valid
		if (choice != 'A' && choice != 'R' && choice != 'X') 
		{
			System.out.println("User choice was not a valid option. "
			+ "Enter C or E only.");
					
			System.out.print("Enter your choice: ");
			choice = input.next().charAt(0);
					
			while (choice != 'C' && choice != 'E') 
			{		
			System.out.println("\nUser choice was not a valid option. "
			+ "Enter C or E only.");
			System.out.print("Enter your choice: ");
			choice = input.next().charAt(0);
			Character.toUpperCase(choice);
			}
		}
		
		//If user chooses to login as customer, display customer options
		if (choice == 'C')
		{
			int option;
			
			System.out.println("\n-Press '1' to enter account details to login.");
			System.out.println("-Press '2' to create a new account.");
			System.out.println("-Press '3' to login as guest");
			System.out.print("\nOption: ");
			option = input.nextInt();
			
			switch (option)
			{		    //Customer enters login details
			  case '1': System.out.print("Enter your username: ");
					    username = input.nextLine();
			
					    System.out.print("Enter your password: ");
					    password = input.nextLine();
			
					    //Verify login details
					  
					    //if verified, print message
					    System.out.println("Login successful!");
					    
					    //else continue asking for account details until user inputs valid info
					    break;
					    
			  case '2': System.out.print("Enter your desired username: ");
			  		    username = input.nextLine();
				
			  		    System.out.print("Enter your desired password: ");
			  		    password = input.nextLine();
			  		  
			  		    //Write account details to account text file
			  		    
			  		    break;
			  		    
			  case '3': System.out.println("Logging in as guest!");
			            break;
			  
			}
			
			//Display menu options for customer
			do 
			{
				System.out.println("Choose from the following options.\n");
				System.out.println("-Press 'S' to search for a product");
				System.out.println("-Press 'L' to list the product database");
				System.out.println("-Press 'P' to place an order");
				System.out.println("-Press 'V' to view purchases");
				System.out.println("-Press 'Q' to quit the program");
				
				System.out.print("\nUser choice: ");
				choice = input.next().charAt(0);
				Character.toUpperCase(choice);
				
				//Allow user to keep entering a choice until input is valid
				if (choice != 'S' && choice != 'L' && choice != 'P' && choice != 'V' && choice != 'Q') 
				{
					System.out.println("\nUser choice was not a valid option. "
					+ "Enter S, L, P, V, or Q only.");
							
					System.out.print("Enter your choice: ");
					choice = input.next().charAt(0);
							
					while (choice != 'S' && choice != 'L' && choice != 'P' && choice != 'V' && choice != 'Q') 
					{		
						System.out.println("\nUser choice was not a valid option. "
								+ "Enter S, L, P, V, or Q only.");
						System.out.print("Enter your choice: ");
						choice = input.next().charAt(0);
						Character.toUpperCase(choice);
					}
				}
					//Perform action based on user's choice
					switch (choice)
					{
						case 'S':
						       	  break;
						       	  
						case 'L':
							     break;
					
						case 'P':
						         break;
				    
						case 'V': 
						       	  break;
				    
						case 'Q': System.out.print("\nExiting application. Goodbye!");
				  			  	  System.exit(0);
				  			  	  break;
					}
				
			} while (choice == 'S' || choice == 'L' || choice == 'P' || choice == 'V'); 
		}
		
		//If user chooses to login as employee, display employee options
		if (choice == 'E')
		{
			
			System.out.print("Enter your username: ");
		    username = input.nextLine();

		    System.out.print("Enter your password: ");
		    password = input.nextLine();
		    
		    //Verify login details
			  
		    //if verified, print message
		    System.out.println("Login successful!");
		    
		    //else continue asking for account details until user inputs valid info
		    
		    //Display menu options for customer
			do 
			{
				System.out.println("Choose from the following options.\n");
				System.out.println("-Press 'S' to search for a customer by name");
				System.out.println("-Press 'D' to display unsorted customer information");
				System.out.println("-Press 'V' to view orders by priority");
				System.out.println("-Press 'O' to ship an order");
				System.out.println("-Press 'L' to list the product database");
				System.out.println("-Press 'A' to add a new product");
				System.out.println("-Press 'R' to remove a product");
				System.out.println("-Press 'Q' to quit the program");
				
				System.out.print("\nUser choice: ");
				choice = input.next().charAt(0);
				Character.toUpperCase(choice);
				
				//Allow user to keep entering a choice until input is valid
				if (choice != 'S' && choice != 'D' && choice != 'V' && choice != 'O' && choice != 'L'
					&& choice != 'A' && choice != 'R' && choice != 'Q') 
				{
					System.out.println("\nUser choice was not a valid option. "
					+ "Enter S, D, V, O, L, A, R, or Q only.");
							
					System.out.print("Enter your choice: ");
					choice = input.next().charAt(0);
					Character.toUpperCase(choice);
					
					while (choice != 'S' && choice != 'D' && choice != 'V' && choice != 'O' && choice != 'L'
							&& choice != 'A' && choice != 'R' && choice != 'Q') 
					{		
						System.out.println("\nUser choice was not a valid option. "
								+ "Enter S, D, V, O, L, A, R, or Q only.");
						System.out.print("Enter your choice: ");
						choice = input.next().charAt(0);
						Character.toUpperCase(choice);
					}
				}
					//Perform action based on user's choice
					switch (choice)
					{
						case 'S': 
						       	  break;
						       	  
						case 'D':
							     break;
					
						case 'V':
						         break;
				    
						case 'O': 
						       	  break;
						
						case 'L': 
					       	      break;
					     
						case 'A': 
					       	      break;
					    
						case 'R': 
					       	      break;
				    
						case 'Q': System.out.print("\nExiting application. Goodbye!");
				  			  	  System.exit(0);
				  			  	  break;
					}
				
			} while (choice == 'S' || choice == 'D' || choice == 'V' || choice == 'O' || choice == 'L'
					|| choice == 'A' || choice == 'R' || choice == 'Q');
		}
		
		input.close();
		
	}
}
