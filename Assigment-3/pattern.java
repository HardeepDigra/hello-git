import java.util.Scanner;
class pattern
{
public static void main(String args[])
{
int rows=4;

/* Scanner in = new Scanner(System.in);

System.out.println("Enter the no of rows");
rows=in.nextInt();
System.out.println("Your entered year is "+rows);
*/

for(int i=0;i<4;i++)
{
for(int j=0;j<=i;j++)
{
System.out.print("*");
}
System.out.println("");
}


}
}
