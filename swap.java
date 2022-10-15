class swap{

public static void main(String args[])
{
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
int temp;
System.out.println("Numbers before swapping: a:"+a+", b:"+b);
System.out.println("Result of Swapping with a temporary variable:");

temp = a;
a = b;
b = temp;
System.out.println("a:"+a+", b:"+b);

System.out.println("Numbers before swapping: a:"+a+", b:"+b);
System.out.println("Result of Swapping without temporary variable:");

a = a+b;
b = a-b;
a = a-b;
System.out.println("a:"+a+", b:"+b);
}
}