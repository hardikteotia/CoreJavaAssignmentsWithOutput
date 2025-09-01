import java.util.Scanner;

class AverageOfNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 5 double numbers: ");
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		double d3 = sc.nextDouble();
		double d4 = sc.nextDouble();
		double d5 = sc.nextDouble();
		double average = 0;
		average = (d1+d2+d3+d4+d5)/5;
		System.out.println("Average is: " + average);
		sc.close();
	}
}