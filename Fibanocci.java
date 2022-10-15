import java.util.Scanner;
class Fibanocci{
	public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter number of fibanocci numbers:");
	int n = s.nextInt();
	int x = 0;
	int y = 1;
	int temp;
	
	System.out.println("Fibanocci Series:");
	System.out.println(x);
	System.out.println(y);
	
	for(int i=0; i<n-2; i++){
		temp = x+y;
		x = y;
		y = temp;
		System.out.println(temp);
	}
	

	}
}