// To calculate Fibonacci Series up to n numbers
import java.util.*;
public class Fibonacci
{  
   public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
 int n,a=0,b=1,sum=0;
System.out.println("Enter the limit of series");
n=sc.nextInt();
System.out.print(a+" "+b);
for(int i=1;i<=n-2;i++)
{  sum=a+b;
  System.out.print(" "+sum);
a=b;  
b=sum; 
}
}
}