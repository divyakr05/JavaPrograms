class Agecheck{

public static void main(String args[]) {
int age = Integer.parseInt(args[0]);
String nationality = args[1];

System.out.println("Age:"+args[0]);
System.out.println("Nationality:"+args[1]);
//System.out.println(nationality.getClass());


  if(age >= 18 && nationality.equals(args[1]) ) {
	System.out.println("Candidate is eligible for driving license");
  }
  else{
	System.out.println("Candidate not eligible for driving license"); 
  }

 }
}


