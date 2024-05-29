//Sort_Integers_by_The_Number_of_1_Bits

public class Sort_Integers_by_The_Number_of_1_Bits
 {
    public int[] sortByBits(int[] arr) {

        List<Integer> count=new ArrayList<>();
        for(int i:arr) count.add(i);

        Collections.sort(count,new Comparator<Integer>()
        {
            public int compare(Integer a,Integer b)
            {
                int counta=Integer.bitCount(a);
                int countb=Integer.bitCount(b);
                if(counta==countb)
                    return Integer.compare(a,b);
                else
                    return Integer.compare(counta,countb);
            }});

            for(int i=0;i<arr.length;i++)
                arr[i]=count.get(i);
        return arr;}}