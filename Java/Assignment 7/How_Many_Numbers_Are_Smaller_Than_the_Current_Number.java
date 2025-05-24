// How Many Numbers Are Smaller Than the Current Number

import java.util.*;
public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number

{
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        
        int brr[] = new int[nums.length];
         for(int i=0;i<nums.length;i++)	
          {  int c=0;
               for(int j=0;j<nums.length;j++)	
              {
                  if(nums[i]>nums[j])
                   c++;               
              }
              brr[i]=c;
           }
           return brr;
    }

public static void main(String args[])
{
int arr[]={7,7,7,7};
int w[]=smallerNumbersThanCurrent(arr);
for(int i:w)
System.out.print(i+" ");
}
}