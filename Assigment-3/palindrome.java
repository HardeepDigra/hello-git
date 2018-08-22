import java.util.Scanner;

class palindrome
{
public static void main(String args[])
{

int n, reversedInteger = 0, remainder, originalInteger;

Scanner in= new Scanner(System.in);


System.out.println("Enter the number.");
a

n= in.nextInt();

    originalInteger = n;

  
    while( n!=0 )
    {
        remainder = n%10;
        reversedInteger = reversedInteger*10 + remainder;
        n /= 10;
    }
    if (originalInteger == reversedInteger)
      System.out.println("palindrome");
    else
System.out.println("not palindrome");


}
}
    