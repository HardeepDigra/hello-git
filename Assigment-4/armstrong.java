import java.util.Scanner;
class armstrong
{
public static void main(String args[])
{
    int number, sum = 0, rem = 0, cube = 0, temp;
    System.out.println("enter a number");

Scanner in=new Scanner(System.in);
number=in.nextInt();

{
    temp = number;

    while (number != 0)

    {

        rem = number % 10;

        cube = pow(rem, 3);

        sum = sum + cube;

        number = number / 10;

    }

    if (sum == temp)

        System.out.println("The given no is armstrong no");

    else

        System.out.println("The given no is not a armstrong no");
}

}
}