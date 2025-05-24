//To find out whether the given String is Palindrome or not.
import java.util.*;
public class Palindrome
{  
   public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
  String str="",rev="";
  str=sc.next().trim();
int l=str.length();
for(int i=l-1;i>0;i--)
    rev=rev+str.charAt(i);
if(str.toLowerCase().equals(rev.toLowerCase()))
   System.out.println("The String is Paindrome : "+ str);
else
     System.out.println("The String is not Paindrome : "+ str);

}
}