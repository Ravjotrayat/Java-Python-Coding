//To find Armstrong Number between two given number.
import java.util.*;
public class Armstrong
{  
   public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
  int a,b;
a=sc.nextInt();
b=sc.nextInt();
System.out.println("\nArmstrong number are : ");
if(a>b)
{   int c=a;a=b;b=c;
}
for(int i=a;i<=b;i++)
{   int sum=0,x; x=i;
      while(x>0)
      {
        sum+=Math.pow((x%10),3);
     x=x/10;
      }
 if(sum==i)
  System.out.println(i+" ");
}

}
}