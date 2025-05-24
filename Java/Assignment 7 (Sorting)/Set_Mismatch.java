// Set Mismatch

import java.util.*;
public class Set_Mismatch

 {
    public static int[] findErrorNums(int[] nums) {
        
        int b=0,temp=0;
        int n=(nums.length*(nums.length+1))/2;
        Set<Integer> arr=new HashSet<>();
        for(int i:nums)
            {
                if(arr.contains(i))
                    b=i;
                else{
                    arr.add(i);
                    temp+=i;
                }
            }
            return new int[]{b,n-temp};
    }
public static void main(String args[])
{
int arr[]={1,2,2,4};
int brr[]=findErrorNums(arr);
for(int i : brr)
System.out.print(i+" ");
}
}