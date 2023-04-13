//  Define two methods to print the maximum and the minimum 
//  number respectively among three numbers entered 
//  by the user.
import java.util.*;
public class Max_min_function
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);

   int a,b,c;
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
  max(a,b,c);
 min(a,b,c);
}
public static void max(int a,int b,int c)
{
 int x= (a>b)?(a>c? a : c ) : b;
   System.out.println("Max is : "+x);
}
public static void min(int a,int b,int c)
{
 int x= (a<b)?(a<c? a : c ) : b;
   System.out.println("Min is : "+x);
}

}
