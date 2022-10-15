class PrimeSeries{
	public static void main(String args[]){
	
	int end = Integer.parseInt(args[0]);
	
	System.out.println("prime numbers between 1 and "+end);
	
	int rem;
	int flag;
	
	for(int i=2; i<end; i++){
		
		flag = 0;
		
		for(int j=2; j<i; j++){
			
			if(i%j == 0){
				
				flag = 1;
				break;
			}
		}
	
	if(flag == 0){
		System.out.println(i);
	}
	
	}
	}
}
