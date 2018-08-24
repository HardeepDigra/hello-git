import java.util.Scanner;
class prime
{
public static void main(String args[])
{
int num,n;
Scanner in=new Scanner(System.in);
System.out.println("enter the number");
n=in.nextInt();
 


for(num = 1;num<=n;num++){

       int  count = 0;

         for(int i=2;i<=num/2;i++){
             if(num%i==0){
                 count++;
                 break;
             }
        }
        
         if(count==0 && num!= 1)
           System.out.println(num);

}


}
}
