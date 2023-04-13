
//  Take integer inputs till the user enters 0 and 
//  print the largest number from all.
import java.util.*;
public class Largest_number
{
    public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
  int max=0;
 int str;
do
{    
 str=sc.nextInt();
   if(max<str)
      max=str;
}while(str!=0);
System.out.println("Largest no. is : "+max);
}
}
