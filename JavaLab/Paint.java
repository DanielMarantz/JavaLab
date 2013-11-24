//***********************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***********************************************************************
import java.util.Scanner;

public class Paint
{

	public static void main(String[] args)
	{
		final int COVERAGE = 350;  //paint covers 350 sq ft/gal
		double length, width, height;
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println (" Enter the length of the room: ");
		length = scan.nextInt();
		
		System.out.println (" Enter the width of the room: ");
		width = scan.nextInt();
		
		System.out.println (" Enter the height of the room: ");
		height = scan.nextInt();
		
		final double totalSqFt = length * width;
		
		System.out.println (" Your total sqaure feet is:" +
		totalSqFt);
		
		int Door;
		int Window;
		
		System.out.println (" How many doors in the room ");
		Door = scan.nextInt();
		
		System.out.println (" How many windows in the room ");
		Window = scan.nextInt();
		
		//equation for the total of everything 
		double TOTALR = totalSqFt - ((Door*20) + (Window*15)); 
		
		System.out.println ("Your total sqft with door and window "+ TOTALR);
		System.out.println ("The total paint you need is:" +
		TOTALR / COVERAGE + "gals");
		
		
			}

}
