class LargestNum{

public static void main(String args[])
{
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
int c = Integer.parseInt(args[2]);

System.out.println("Largest of "+a+","+b+","+c+" is:");

if(a>b && a>c)
{
	System.out.println(+a);
	if(b>c)
	{
		System.out.println("Second Largest is:"+b);
		System.out.println("Smallest is:"+c);
	}
	else
	{
		System.out.println("Second Largest is:"+c);
		System.out.println("Smallest is:"+b);
	}
}
else if(b>a && b>c)
{
	System.out.println(+b);
	if(a>c)
	{
		System.out.println("Second Largest is:"+a);
		System.out.println("Smallest is:"+c);
	}
	else
	{
		System.out.println("Second Largest is:"+c);
		System.out.println("Smallest is:"+a);
	}
}
else 
{
	System.out.println(+c);
	if(a>b)
	{
		System.out.println("Second Largest is:"+a);
		System.out.println("Smallest is:"+b);
	}
	else
	{
		System.out.println("Second Largest is:"+b);
		System.out.println("Smallest is:"+a);
	}

}

}

}