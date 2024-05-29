// Longest Common Prefix
public class Longest_Common_Prefix

 {
    public static  String longestCommonPrefix(String[] strs) 
    {
        if(strs.length==0)
        return "";
        String arr=strs[0];
        for(int i=1;i<strs.length;i++)
        {    
            while(strs[i].indexOf(arr)!=0)
           {
                arr=arr.substring(0,arr.length()-1);
                // System.out.println(arr);
           } 
        }
        return arr;

    }

public static void main(String args[])
{
String strs[]={"flower","flow","flight"};
System.out.println(longestCommonPrefix(strs));

}
}