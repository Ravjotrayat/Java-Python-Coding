//Write a function that returns the sum of first n natural numbers.
import java.util.*;
public class A6
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);

       int a;
a=sc.nextInt();
System.out.println("Sum of "+a+" natural numbers is "+sum(a));
}

public static int sum(int a)
{    int s=0;
    while(a>0)
   { 
        s+=a;
     a--;
   }
return s;
}

}
