/*Write Java program for the following - 
It should  run till user enters any other option than add or sub or multiply or divide
Prompt user to enter the input operation : (add|subtract|multiply|divide) & 2 numbers(double)
Display the result of the operation.
Use Scanner for accepting all inputs from user. 
Hint : use switch-case*/

import java.util.Scanner;

public class Calculate{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int ch;
		int Flag=1;
		double num1,num2,result;
		System.out.print("Enter two numbers: ");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		do{
	
			System.out.println("--------Enter your choice--------");
			System.out.println("Enter 1 for '+' Addition");
			System.out.println("Enter 2 for '-' Subtraction");
			System.out.println("Enter 3 for '*' Multiplication");
			System.out.println("Enter 4 for '/' Division");
			System.out.println("To exit the calculator press 0");
			
			ch = sc.nextInt();

			switch(ch){
			
			case 1:
				result = num1+num2;
				System.out.print("Your values Addition: " + result);
				break;

			case 2:
				result = num1-num2;
				System.out.print("Your values Subtraction: " + result);
				break;

			case 3:
				result = num1*num2;
				System.out.print("Your values Multiplication: " + result);
				break;

			case 4:
				result = num1/num2;
				System.out.print("Your values Division: " + result);
				break;
			
			case 0:
				System.out.println("Exiting.....");
				Flag=0;
				break;
			
			default:
				System.out.println(" T_T---Invalid imput---T_T ");
				break;

				}


			}while(Flag!=0);
	}
}