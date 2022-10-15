class AddFloatCommandLine{

public static void main(String args[])
{
int a = Integer.parseInt(args[0]);
float b = Float.parseFloat(args[1]);

float sum = a+b;

System.out.println("Sum is:" +sum);
}

}