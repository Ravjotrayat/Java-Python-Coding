//  Valid Palindrome II

public class Valid_Palindrome_II

 {
//  it has append and capacity to take input and check the size in StringBuilder
    public boolean validPalindrome(String s) 
    {    if(s.length()==1)
        return true;
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
                return ( palindrome(s,i+1,j)==true || palindrome(s,i,j-1)==true);
            i++;j--;
        }
        return true;
    }
        public  boolean palindrome(String ch,int i,int j)
        {
            while(i<j)
            {
                if(ch.charAt(i)!=ch.charAt(j))
                return false;
                i++;j--;
            }
            return true;
        }
    }
