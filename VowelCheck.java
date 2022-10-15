class VowelCheck{

public static void main(String args[]){

//String s = args[0];
char ch = args[0].charAt(0);

switch(ch){
	case 'a': System.out.println(ch +" is a Vowel");
	break;	
	case 'A': System.out.println(ch +" is a Vowel");
	break;
	case 'e': System.out.println(ch +" is a Vowel");
	break;
	case 'E': System.out.println(ch +" is a Vowel");
	break;
	case 'i': System.out.println(ch +" is a Vowel");
	break;
	case 'I': System.out.println(ch +" is a Vowel");
	break;
	case 'o': System.out.println(ch +" is a Vowel");
	break;
	case 'O': System.out.println(ch +" is a Vowel");
	break;
	case 'u': System.out.println(ch +" is a Vowel");
	break;
	case 'U': System.out.println(ch +" is a Vowel");
	break;
	default: System.out.println("Entered character is not a Vowel");
	break;
	
}

}

}