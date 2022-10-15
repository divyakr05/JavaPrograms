import java.util.Scanner;

class TriangleArea{

public static void main(String args[])
{

Scanner s  = new Scanner(System.in);
System.out.println("Enter 0 for Right angled triangle");
System.out.println("Enter 1 for Equilateral triangle");

int x = s.nextInt();

if(x == 0)
{
	System.out.println("Enter sides of Right angled triangle");
	float b = s.nextFloat();
	float h = s.nextFloat();
	float area = (b*h)/2;
	System.out.println("Area of Right angled triangle: " +area);
	
	
}
else if(x == 1)
{
	System.out.println("Enter side of Equilateral triangle");
	float a = s.nextFloat();
	float area = (a*a*1.73f)/4;
	//area = area*1.73f;
	System.out.println("Area of Equilateral triangle: " +area);

}
else 
{
	System.out.println("You entered an invalid number");

}
}
}