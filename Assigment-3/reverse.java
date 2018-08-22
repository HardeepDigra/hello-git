import java.util.Scanner;
class reverse
{
public static void main(String args[])
{
int num, rev=0,remainder=0;
Scanner in=new Scanner(System.in);

num=in.nextInt();

while(num!=0)
{

remainder=num%10;
rev=rev*10+remainder;
num=num/10;

}
System.out.println(rev);
}
}
