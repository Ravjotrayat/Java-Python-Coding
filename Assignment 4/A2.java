// Define a method to find out if a number is prime or not.

import java.util.*;
public class A2
{
  public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
    long n;
n=sc.nextInt();
    prime(n);
}
public static void  prime(long n)
{    int flag=0;
      for(long i = 2;i<n/2;i=i*i)
           {       
                 if(n%i==0)
                        flag=1;
           }

     if(flag==1)
        System.out.println("It is not a Prime no.");
   else
        System.out.println("It is a Prime no.");    
} 

}
  