// Valid Palindrome
class  Valid_Palindrome

{
    public boolean isPalindrome(String s) 
    {
        if(s.length()==1 )
        return true;
        s=s.toLowerCase();
     int i=0,j=s.length()-1;

     while(i<=j) 
    {
        char ch1=s.charAt(i);
        char ch2=s.charAt(j);       
        
         if(!Character.isLetter(ch1) &&  !Character.isDigit(ch1))
         {
             i++;
             continue;
         }
         if(!Character.isLetter(ch2) && !Character.isDigit(ch2)) 
         {
             j--;
             continue;
         }
         if(ch1!=ch2)
         {
             return false;
         }
         i++;j--;
    }
    return true;
    }
}