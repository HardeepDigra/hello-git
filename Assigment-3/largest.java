import java.util.Scanner;
class largest
{
public static void main(String args[])
{
int num1,num2,num3;
Scanner in= new Scanner(System.in);

System.out.println("Enter First Number.");
num1=in.nextInt();
System.out.println("Enter Second Number.");
num2=in.nextInt();
System.out.println("Enter Third Number.");
num3=in.nextInt();

if(num1>num2 && num1>num3)
{
System.out.println("First number is Largest.");
}
if(num2>num1 && num2>num3)
{
System.out.println("Second number is Largest.");
}
if(num3>num1 && num3>num2)
{
System.out.println("Third number is Largest.");
}

}
}
