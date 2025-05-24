// Height Checker
import java.util.*;
public class Height_Checker {
    public static int heightChecker(int[] heights) {

     int arr[]=Arrays.copyOf(heights,heights.length);
    Arrays.sort(arr);
    int count=0;
    for(int i=0;i<heights.length;i++)
    {   
       if(arr[i]==heights[i]) 
       count++;
    }
        return arr.length-count;
    }

public static void main(String args[])
{

int array[]={1,1,4,2,1,3};
int count=heightChecker(array);
// ouput = 3
System.out.println(count);

}
}