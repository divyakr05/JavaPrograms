import java.util.Scanner;

class AddScan{

public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.println("Enter first Number"); 
int a = s.nextInt();
System.out.println("Enter second Number"); 
int b = s.nextInt();
int sum;
sum = a+b;
System.out.println("sum is: " +sum); 
}
}