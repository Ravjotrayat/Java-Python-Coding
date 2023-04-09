 import java.util.*;
public class Sum_till_x
{   
   public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String ch="";
int sum=0,p=1,c=0;
while(!ch.equals("x"))
{
    System.out.println("Enter a num or x to quit");
    ch=sc.next();
    if(!ch.equals("x"))
   {
        int n = Integer.parseInt(ch);
        sum+=n;
        c++;
    }
} 
System.out.println("Sum is: "+sum);
}
}
