import java.util.*;
public class HCF
{
   public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
int n1,n2,a=0,hcf=0;
n1=sc.nextInt();
n2=sc.nextInt();
a=Math.min(n1,n2);
for(int i=1;i<=a;i++)	
{
   if( n1%i==0 && n2%i==0 )
                hcf=i;
}
System.out.println("HCF of the given two numbers is : "+hcf);
System.out.println("LCM of the given two numbers is : "+(n1*n2)/hcf);
}
}

