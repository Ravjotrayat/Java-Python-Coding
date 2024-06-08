//Special Array With X Elements Greater Than or Equal X

public class Special_Array_With_X_Elements_Greater_Than_or_Equal_X
 
{
    public int specialArray(int[] arr) {
        
        int count[]=new int[arr.length+1];
        for(int i:arr)
            {
                if(i>arr.length)
                    count[arr.length]++;
                else 
                    count[i]++;
            }
            int sum=0;
            for(int i=arr.length;i>=0;i--){
                sum+=count[i];
                if(sum==i)
                return i;
            }
            return -1;
    }
}