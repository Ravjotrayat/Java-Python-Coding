// Find All Numbers Disappeared in an Array
import java.util.*;
public class Find_All_Numbers_Disappeared_in_an_Array
{
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        List<Integer> lis=new ArrayList<>();
        int n=nums.length;
        int arr[]=new int[n];
        int c=0;
        for(int i:nums)
            arr[i-1]=1;
        for(int j=0;j<n;j++)
        {
            if(arr[j]==0)
            lis.add(j+1);
        }
        return lis;
    }
}

