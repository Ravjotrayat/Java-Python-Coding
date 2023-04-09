import java.util.*;
public class Leap_year
{
   public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
if(n%400==0)
  System.out.println("It is a Leap Year");
else if(n%100==0)
    System.out.println("Not a Leap Year");
else
  System.out.println("It is a Leap Year");
   }
}
