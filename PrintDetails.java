import java.util.Scanner;

class PrintDetails
{
public static void main(String args[])
{
Scanner a = new Scanner(System.in);
System.out.println("Hi! Enter Your Name:");
String name = a.nextLine();
System.out.println("Hi " +name+ "! Enter Your Age:");
int age = a.nextInt();
System.out.println(name + "'s Age is " +age);
}

}