import java.util.Scanner;

class grade{

public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter total marks:");
	int mark = s.nextInt();
	
	if(mark > 0 && mark < 40){
		System.out.println("Failed");
	}
	else if(mark >= 40 && mark <= 60){
		System.out.println("Grade D");
	}
	else if(mark >= 61 && mark <= 70){
		System.out.println("Grade C");
	}
	else if(mark >= 71 && mark <= 80){
		System.out.println("Grade B");
	}
	else if(mark >= 81 && mark <= 100){
		System.out.println("Grade A");
	}
	else{
		System.out.println("Enter a valid input");
	}

}

}