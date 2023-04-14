//  Write a function that returns all prime numbers between two 
//  given numbers.
import java.util.*;
public class A5
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);

       int a,b;
a=sc.nextInt();
b=sc.nextInt();
System.out.println("The prime numbers are : ");
for(int i=a;i<=b;i++)
  {   
     if(prime(i)==0)
     System.out.print(i+" ");
    }
}

public static int prime(int i)
{        int flag=0;
   for(int j=2;j<i/2;j=j*j)
         {   if(i%j==0)
            flag=1;
          }
       return flag;
}

}