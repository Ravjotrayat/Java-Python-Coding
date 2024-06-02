//  Maximum Product of Two Elements in an Array
import java.util.*:;
public class Maximum_Product_of_Two_Elements_in_an_Array

{
    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        if(l==1) return nums[0]-1;
        else if(l==2)
                return ((nums[0]-1)*(nums[1]-1));

        return ((nums[l-1]-1) * (nums[l-2]-1));
    }

public static void main(String args[])
{
int arr[]={3,4,5,2};
System.out.println(maxProduct(arr));
}
}