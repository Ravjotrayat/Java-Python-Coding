//Kunal is allowed to go out with his friends only on the even days
// of a given month. Write a program to count the number of 
//days he can go out in the month of August.
import java.util.*;
public class Month
{
    public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
int c=0;
   System.out.print("The number of days a child can go is : ");
  for(int i=2;i<=31;i+=2)
    c++;
    System.out.print(c);

}
}
