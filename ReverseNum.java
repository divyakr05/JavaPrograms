import java.util.Scanner;

class ReverseNum{
	
	public static void main(String args []){
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Number to reverse:");
	int n = s.nextInt();
	int rem = 0;
	int sum = 0;
	
	while(n>0)
	
	{
		rem = n%10;
		sum = (sum*10)+rem;
		n = n/10;
		
	}
	
	System.out.println(sum);
	
	}
}