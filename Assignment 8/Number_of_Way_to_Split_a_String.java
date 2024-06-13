// Number of Ways to Split a String

import java.util.*;
public class Number_of_Way_to_Split_a_String

{
 public  static int numWays(String s) {
        long n=s.length();
        long mod=1000000007;
        long ones=0;
        for(char ch:s.toCharArray())
            ones+=ch-'0';
        if(ones==0)
            return (int)((((n-1)*(n-2))/2)%mod);
        if(ones%3!=0)
            return 0;
        
        long third=ones/3;
        ones=0;
        long way1=0;
        long way2=0;
        for(char ch:s.toCharArray())
        {
            ones+=ch-'0';
            if(ones==third)
                way1++;
            if(ones==2*third)
                way2++;
        }
        return (int)((way1*way2)%mod);
    }
public static void main(String args[])
{
String s="10101";
System.out.println(numWays(s));
}
}