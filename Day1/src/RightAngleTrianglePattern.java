/*
*
**
***
****
*****

*/

import java.util.Scanner;

public class RightAngleTrianglePattern{
	public static void main(String [] args){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range: ");
		num = sc.nextInt();
		for(int i=0;i<num;i++){
			for(int j=0;j<=i;j++){
				System.out.print(" * ");
			}
			System.out.println();
		}

	}
}