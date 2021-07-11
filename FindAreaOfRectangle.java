package JAVA;

import java.util.Scanner;
class FindAreaOfRectangle 
{

	public static void main(String[] args) 
	{
	
				Scanner scanner = new Scanner(System.in);
				System.out.println(" Enter the length of the rectangle:");
				double length = scanner.nextDouble();
				System.out.println(" Enter the width of rectangle:");
				double width = scanner.nextDouble();
				// Area = length*width;
				double area = length*width;
				
				System.out.println(" Area of rectangle is:"+area);
	}
}
