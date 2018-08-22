import java.util.Scanner;

class sum
{
public static void main(String args[])
{
int a;
int b;
int c;

Scanner in= new Scanner(System.in);

System.out.println("Enter first integer");
a=in.nextInt();
System.out.println("Your entered first integer is "+a);

System.out.println("Enter second integer");
b=in.nextInt();
System.out.println("Your entered seconnd integer is "+b);

c=a+b;
System.out.println("Your sum is "+c);
}
}
