// Maximum Repeating Substring

import java.util.*;
public class Maximum_Repeating_Substring
{
    public static int maxRepeating(String sequence, String word) {
       int ans = 0;
        int ls = sequence.length(), lw = word.length();
        for (int i=0;i<=ls-lw;i++) {
            int j=0;
            for (;j<ls-i;j++) {
                if (sequence.charAt(i+j)!=word.charAt(j%lw)) {break;}
            }
            ans=Math.max(ans,j/lw);
        }
        return ans;
    }

public static void main(String args[])
{
String sequence="ababc",word="ac";
System.out.println(maxRepeating(sequence,wor));
}
}