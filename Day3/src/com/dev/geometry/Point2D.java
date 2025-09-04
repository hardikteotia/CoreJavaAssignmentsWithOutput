/*4. Hands on

Create a  class Point2D   for representing a point in x & y(int) co-ordinate system.
(Tight encapsulation please !)

4.1 Create a parameterized constructor to accept x & y co-ords.

4.2 Add  show() method  --to return point's x & y co-ords

4.3 
Add a non static  , isEqual method to Point2D class : boolean returning method : must return true if both points are having same x,y co-ords or false otherwise.
Hint - Ask yourself - 
How will you invoke it from the tester ?

4.4 
Add a non static method , calculateDistance , to calc distance between 2 points
Hint : use distance formula.

Hint - Ask yourself - 
How will you invoke it from the tester ?


*/
package com.dev.geometry;
import static java.lang.Math.*;


public class Point2D{
		private int x1,x2;
		private int y1,y2;
		
		public Point2D(int x1, int x2, int y1, int y2){
			this.x1=x1;
			this.x2=x2;
			this.y1=y1;
			this.y2=y2;
		}
		public String show(){
			return "Value of x1: " + x1 + " x2: " + x2 + " value of y1: " + y1 + " y2: " + y2;
		}
		
		public Boolean isEqual(){
			return ((x1==x2)&&(y1==y2))?true:false;
		}
		
		public void calculateDistance(){
			double a, res;
			a = pow((x2-x1),2)+pow((y2-y1),2);
			res = sqrt(a);
			System.out.println("Distance: " + res);
		} 
}