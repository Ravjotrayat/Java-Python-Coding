//Length of Last Word
public class Length_of_Last_Word
 {
    public int lengthOfLastWord(String s) 
    {
        s=s.trim();
      return (s.length()-s.lastIndexOf(" ")-1);    
    }
}