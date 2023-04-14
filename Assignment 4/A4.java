//  Write a function to check if a given triplet is a Pythagorean 
//  triplet or not. (A Pythagorean triplet is when the sum of 
//  the square of two numbers is equal to the 
//  square of the third number).
import java.util.*;
public class A4
{
  public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
    int a,b,c;
   a=sc.nextInt();
   b=sc.nextInt();
   c=sc.nextInt();
pythagorean(a,b,c);
}
public static void pythagorean(int a, int b,int c)
{
      if( (a^2 + b^2)==(c^2) || (b^2 + c^2)==(a^2) || (a^2 + c^2)==(b^2)   )
     System.out.println("It is a Pythagorean number ");
      else 
      System.out.println("It is not a Pythagorean number ");
}

}