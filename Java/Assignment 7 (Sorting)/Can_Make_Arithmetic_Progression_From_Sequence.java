// Can Make Arithmetic Progression From Sequence

import java.util.*;
public class Can_Make_Arithmetic_Progression_From_Sequence

 {
    public static  boolean canMakeArithmeticProgression(int[] arr) {
        
        if(arr.length==1 || arr.length==2)
        return true;

        int l=arr.length;
        Arrays.sort(arr);
        int diff=arr[1]-arr[0];
        for(int i=1;i<l-1;i++)
        {
            if((arr[i+1]-arr[i])!=diff)
                return false;
        }   
        return true;
    }
public static void main(String args[])
{
int arr[]={1,4,2};
System.out.println(canMakeArithmeticProgression(arr));
}
}