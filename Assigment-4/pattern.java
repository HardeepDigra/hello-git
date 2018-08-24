import java.util.Scanner;
class pattern
{
public static void main(String args[])
{
int num,i=0;
Scanner in= new Scanner(System.in);

num=in.nextInt();


for(i=0;i<num;i++)
{
for(int j=num;j>i;j--)
{
System.out.print("x");
}
System.out.println("");
}



}
}