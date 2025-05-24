//  Relative Sort Array
public class Relative_Sort_Array
 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

    //    int a=0,b=0;
    //    int l=arr2.length;

    //    while(b<l)
    //    {
    //     a=swap(arr1,arr2[b++],a);
    //    }
    //    Arrays.sort(arr1,a,arr1.length);
    //    return arr1;
    // }

    // public int swap(int arr[],int target,int start)
    // {
    //     for(int i=start;i<arr.length;i++)
    //     {
    //         if(arr[i]==target)
    //         {
    //             int temp=arr[start];
    //             arr[start++]=arr[i];
    //             arr[i]=temp;
    //         }
    //     }
    //     return start;


//       OR  

    HashMap<Integer,Integer> arr=new HashMap<>();
    ArrayList<Integer> list=new ArrayList<>();

    for(int i :arr1)
    arr.put(i,arr.getOrDefault(i,0)+1);

    for(int i:arr2)
    {
        if(arr.containsKey(i))
        {
            int count=arr.get(i);
            for(int k=0;k<count;k++)
                list.add(i);

            arr.remove(i);
        }
    }

    ArrayList<Integer> list2=new ArrayList<>();
    for(Map.Entry<Integer,Integer> k : arr.entrySet())
    {
        int key=k.getKey();
        int count=k.getValue();
        for(int m=0;m<count;m++)
            list2.add(key);
    }
    Collections.sort(list2);
    list.addAll(list2);

   for(int k=0;k<arr1.length;k++)
   {
       arr1[k]=list.get(k);
   }
    return arr1;

    }
}