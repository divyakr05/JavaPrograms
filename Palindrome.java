import java.util.Scanner;

class Palindrome{
	
	public static void main(String args []){
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Number:");
	int n = s.nextInt();
	int temp = n;
	int rem = 0;
	int sum = 0;
	
	while(n>0)
	
	{
		rem = n%10;
		sum = (sum*10)+rem;
		n = n/10;
		
	}
	
	if(sum == temp)
	System.out.println("Palindrome Number");
	else{
		System.out.println("Not a Palindrome Number");
	}
	
	}
}