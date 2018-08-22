import java.util.Scanner;
class leapyear
{
public static void main(String args[])
{
int year;

Scanner in = new Scanner(System.in);

System.out.println("Enter the year");
year=in.nextInt();
System.out.println("Your entered year is "+year);

{

if(year%100==0)
{
System.out.println("this is not a leap year: "+year);

}

else
{
if(year%4==0)
{
System.out.println("This is a leap year: "+year);
}
else{
System.out.println("this is not a leap year: "+year);
}
}

}

}
}
