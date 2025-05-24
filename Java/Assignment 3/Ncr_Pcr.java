//  Find Ncr & Npr
import java.util.*;
public class Ncr_Pcr
{
    public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
  int n,r;
  n=sc.nextInt();
  r=sc.nextInt();
 int per=fact(n)/fact(n-r);
int com=fact(n)/(fact(n-r) * fact(r));
System.out.println("Permutation : "+ per);
System.out.println("Combination : "+com);
}
public static int fact(int n)
{     int f=1;
       for(int i=2;i<=n;i++)
           f*=i;
   return(f);
}

}

