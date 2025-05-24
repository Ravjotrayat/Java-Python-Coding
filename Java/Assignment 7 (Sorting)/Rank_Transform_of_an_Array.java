//Rank Transform of an Array

class Rank_Transform_of_an_Array
 {
    public int[] arrayRankTransform(int[] arr) {
        
        if(arr==null || arr.length==0)
            return arr;
        HashMap<Integer,Integer> mapp=new HashMap<>();
        int sorted[]=Arrays.copyOf(arr,arr.length);
        // int sorted[]=arr.clone();

        Arrays.sort(sorted);
        int count=1;
        for(int i:sorted)
        { 
             if(!mapp.containsKey(i))
                mapp.put(i,count++);
        }
        
        for(int i=0;i<arr.length;i++)
            sorted[i]=mapp.get(arr[i]);

        return sorted;
    }
}