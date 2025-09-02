/*



4.5  Create a separate Driver(main)  class(for UI )  , "TestPoint" , with main(..)

4.6  Accept x,y co-ordinates for 2 points & store the co-ordinates
4.7  Display x,y co-ordinates of both of the points plotted  (using show() method)

4.8  (OPTIONAL WORK)
Find out if the points  are same or different (Hint : isEqual)

Print the message accordingly. (print SAME or DIFFERENT)
If points are not same , display distance between these 2 points.


*/
import java.util.Scanner;

class TestPoint{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the coordinates x1,x2,y1,y2");
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y1 = sc.nextInt();
		int y2 = sc.nextInt();
		
		TestPoint ref = new TestPoint();
		Point2D P1 = new Point2D(x1,x2,y1,y2);
		System.out.print(P1.show());
		if(P1.isEqual()==true){
			System.out.println(" Yes Coordinates are equal");
		}
		else{
			System.out.println(" Yes Coordinates are not equal");
		}
		
		P1.calculateDistance();
		
	}
}
