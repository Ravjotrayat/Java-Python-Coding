//   Write a program to print the factorial of a number
//   by defining a method named 'Factorial'
import java.util.*;
public class A3
{
  public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
    long n;
  n=sc.nextInt();
    Factorial(n);
}

public static void Factorial(long n)
{
     long f=1;
    for(long i=1;i<=n;i++)
             f=f*i;
  System.out.println("Factorial of " +n+" is : "+f );
}

}