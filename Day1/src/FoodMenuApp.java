/*Display food menu to user. User will select items from menu along with the quantity.
(eg 1. Dosa 2. Samosa 3. Idli ... 0 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option(0) , display total bill & exit.*/


import java.util.Scanner;

public class FoodMenuApp{
	
	public static void main(String[] args){
		
		Scanner Entry = new Scanner(System.in);
		double Dosa = 60.00;
		double Samosa = 15.00;
		double Idli = 40.00;
		int choice = 1;
		double bill=0.00;
		do{
			System.out.println("+++++MENU+++++");
			System.out.println("Select your Food Item");
			System.out.println("1. Dosa.");
			System.out.println("2. Samosa.");
			System.out.println("3. Idli.");
			System.out.println("0. To exit the choice filling and Generating Bill.");
			int choice2, Quantity;
			System.out.print("Enter your choice and Quantity: ");
			choice2 = Entry.nextInt();
			System.out.print(" : ");
			
			switch(choice2){
				
				case 1: 
					Quantity = Entry.nextInt();
					bill+=(Quantity * Dosa);
					break;
				case 2: 
					Quantity = Entry.nextInt();
					bill+=(Quantity * Samosa);
					break;
				case 3:
					Quantity = Entry.nextInt();
					bill+=(Quantity * Idli);
					break;
				case 0:
					System.out.println("Thank you for choosing :D");
					System.out.println("Your Total Bill is: $" + bill);
					System.out.print("-----Exiting Program-----");
					choice = 0;
					break;
				default:
					System.out.println(" !!!Invalid Input :( ");
					break;
				}

			}while(choice!=0);

		}
	}
