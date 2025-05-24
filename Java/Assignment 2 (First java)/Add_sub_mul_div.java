//Take in two numbers and an operator (+, -, *, /) and 
// calculate the value. (Use if conditions)
import java.util.*;
public class Add_sub_mul_div
{
   public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
  int a,b;
a=sc.nextInt();
b=sc.nextInt();
String ch="";
ch=sc.next();
if(ch.equals("+"))
   System.out.println("Sum of two numbers is "+a+b);
else if(ch.equals("-"))
   System.out.println("Subtraction of two numbers is "+(a-b));
else if(ch.equals("/"))
   System.out.println("Divide of two numbers is "+(a/b));
else if(ch.equals("*"))
   System.out.println("Multiplications of two numbers is "+(a*b));
else
    System.out.println("Wrong input,enter from + , - , / ,* ");
}
}