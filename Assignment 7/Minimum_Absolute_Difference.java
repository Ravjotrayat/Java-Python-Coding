// Minimum Absolute Difference
public class Minimum_Absolute_Difference
 {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        List<List<Integer>> list=new ArrayList<>();

        Arrays.sort(arr);
        int mdiff=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++)
        {
            int diff=arr[i]-arr[i-1];
            if(diff<mdiff)
            {
                mdiff=diff;
            }
        }
        for(int i=1;i<arr.length;i++)
        {
            int diff=arr[i]-arr[i-1];
            if(diff==mdiff)
            {
                List<Integer> k=new ArrayList<>();
                k.add(arr[i-1]);
                k.add(arr[i]);
                list.add(k);
            }
        }

    return list;
    }
}