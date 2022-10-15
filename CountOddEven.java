import java.util.Scanner;

class CountOddEven{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter start and end:");
		int start = s.nextInt();
		int end = s.nextInt();
		int OddCount = 0;
		int EvenCount = 0;
		
		for(int i=start+1; i<=end; i++){
		
			if(i%2 == 0){
				OddCount++;
			}
			else{
				EvenCount++;
			}
		
		}
		System.out.println("Odd Numbers:" +OddCount);
		System.out.println("Even Numbers:" +EvenCount);
		
	}
	
}