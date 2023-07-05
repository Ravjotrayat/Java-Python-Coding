// Peak Index in a Mountain Array
import java.util.*;
public class A7
{
 public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
//System.out.println("Enter the limit");
// int n=sc.nextInt();

int arr[]={0,10,5,2};
int n=arr.length;
System.out.println(peakIndexInMountainArray(arr));

}
public static int peakIndexInMountainArray(int[] arr) 
{
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        { 
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
            { 
                return mid;
            }
            else if(arr[mid]<arr[mid+1])
            {
                start=mid+1;
            }
            else
            {  
                end=mid-1; 
            }
        }
        return -1;
    }
}