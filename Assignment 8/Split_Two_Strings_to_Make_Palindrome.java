// Split Two Strings to Make Palindrome

import java.util.*;
public class Split_Two_Strings_to_Make_Palindrome

{

public static boolean checkPalindromeFormation(String a, String b) {
        return check(a,b) || check(b,a);
    }

    public static boolean check(String a,String b)
    {
        int i=0;
        int j=a.length()-1;
        while(i<j && a.charAt(i)==b.charAt(j)) 
        {
            i++;
            j--;
        }
        return isPalindrome(a,i,j) || isPalindrome(b,i,j);
    }

    public static boolean isPalindrome(String s,int left,int right)
    {
        while(left<right)
        {
            if(s.charAt(left)!=(s.charAt(right)))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
public static void main(String args[])
{
String a="ulacfd";
String b="jizalu";
System.out.println(checkPalindromeFormation(a,b));
}
}
