//Subtract the Product and Sum of Digits of an Integer
import java.util.*;
public class A1
{
    public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
  int n,p=1,s=0;
  n=sc.nextInt();
 while(n>0)
{
    p*=n%10;
   s+=n%10;
    n=n/10;
}
System.out.println("Subtraction of  Product and digits of an integer is : "+(p-s));
}
}
