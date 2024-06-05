//Sort Array by Increasing Frequency

import java.util.*;
public class Sort_Array_by_Increasing_Frequency
{
public static int[] frequencySort(int[] nums) {

     Map<Integer,Integer> arr=new HashMap<>();
     for(int i:nums)   
        arr.put(i,arr.getOrDefault(i,0)+1);

    List<Integer> list=new ArrayList<>();
    for(int i:nums)
           list.add(i);
    
        Collections.sort(list,(a,b)->
        {
            int fa=arr.get(a);
            int fb=arr.get(b);

            if(fa!=fb)  return fa-fb;
                else    return b-a;
        });
    for(int i=0;i<nums.length;i++)
        nums[i]=list.get(i);
    return nums;

}

public static void main(String args[])
{
int arr[]={1,1,2,2,2,3};
arr=frequencySort(arr);

for(int i:arr)
System.out.print(i+" ");

}
}