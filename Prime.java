import java.util.Scanner;

class Prime{
	public static void main(String args []){
		
		System.out.println("Enter a positive number to check prime or not:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rem;
		int flag = 0;
		
		if(n == 1){
			System.out.println("1 is neither prime nor composite");
		}
		else{
		for(int i=2; i<n; i++)
		{
			rem = n%i;
			if(rem == 0){
			flag = 1;
			break;
			}
		}
		if(flag == 1){
			System.out.println("Not a Prime number");
		}
		else{
			System.out.println("Prime number");
		}
		}
	
	}
}