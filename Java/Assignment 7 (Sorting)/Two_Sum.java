//  Two Sum

import java.util.*;
public class Two_Sum
{
public static int[] twoSum(int[] nums, int target) 
    {
        int space=1;
        while(true && space<nums.length)
        {
        for(int i=0;i<nums.length-space;i++)   
        {
            if(nums[i]+nums[i+space]==target)
                return new int[]{i,i+space};
        }
            space++;
        }
return new int[]{};
    }

public static void main(String args[])
{
int target=9;
int arr[]={2,7,11,15};
int brr[]=twoSum(arr,target);
for(int i: brr)
System.out.print(i+" ");
}
}