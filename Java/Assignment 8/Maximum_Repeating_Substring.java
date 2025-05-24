//Maximum Repeating Substring

public class Maximum_Repeating_Substring

{
    public int maxRepeating(String sequence, String word) {
        int k=0;
        StringBuilder arr=new StringBuilder(word);
        while(sequence.contains(arr))
        {
                k++;
                arr.append(word); 
        }
        return k;
    }
}

