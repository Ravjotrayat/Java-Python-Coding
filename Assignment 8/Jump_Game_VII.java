//  Jump Game VII
import java.util.*;
public class Jump_Game_VII

{
    public boolean canReach(String s, int mi, int mx) {

        int l=s.length();        
        if(s.charAt(l-1)=='1')
                return false;

        boolean available[]=new boolean[l];
        available[0]=true;
        int start=0;
        int end=0;
        for(int i=0;i<l;i++)
        {
            if(!available[i]) continue;
            start=Math.max(i+mi,end+1);
            end=Math.min(i+mx,l-1);
            for(int j=start;j<=end;j++)
            {
                if(s.charAt(j)=='0')
                    available[j]=true;
                if(available[available.length-1])
                        return true;
            }
        }
        return available[s.length()-1];
    }
}