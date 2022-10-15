class PrimeNum{
	public static void main(String args[]){
	
	int n = Integer.parseInt(args[0]);
	
	System.out.println("Enter number of prime numbers:");
	
	int rem;
	int flag;
	int i = 2;
	
	for(int count=1;count<n;i++){
		
		flag = 0;
		
		for(int j=2; j<i; j++){
			
			if(i%j == 0){
				
				flag = 1;
				break;
			}
		}
	
	if(flag == 0){
		System.out.println(i);
		count++;
	}
	
	}
	}
}
