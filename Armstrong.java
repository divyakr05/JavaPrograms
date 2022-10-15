//Armstrong numbers ----> 0,1,153,370,371,407...


import java.util.Scanner;

class Armstrong{
	
	public static void main(String args []){
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Number:");
	int n = s.nextInt();
	int temp1 = n;
	int temp2 = n;
	int rem = 0;
	int i = 0;
	int res = 1;
	int sum =0;
	int j = 0;
	
	while(n>0)
	
	{
		n = n/10;
		i++;	
	}
	
	j = i;
	
	while(temp1>0)
	
	{
		rem = temp1%10;
		i = j;
		res = 1;
		
		while(i>0){
			
			res = (res*rem);
			//System.out.println("res "+res);
			i--;
		}
		sum = sum + res;
		temp1 = temp1/10;
		
	}
	if(sum == temp2)
	System.out.println("Armstrong Number");
	else
	System.out.println("Not an Armstrong Number");
	}
}