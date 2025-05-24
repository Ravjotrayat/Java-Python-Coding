//Reverse Prefix of Word
import java.util.*;
public class Reverse_Prefix_of_Word

{
public static String reversePrefix(String word, char ch) 
    {
        int index = word.indexOf(ch);
        StringBuilder sb=new StringBuilder(word.substring(0, index+1));
        sb.reverse();
        return sb.toString().concat(word.substring(index+1));
    }



public static void main(String args[])
{
String word="abcdefd";
char ch='d';
System.out.println(reversePrefix(word,ch));

}
}
