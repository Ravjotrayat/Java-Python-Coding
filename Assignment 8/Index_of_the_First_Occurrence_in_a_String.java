// Find the Index of the First Occurrence in a String

class Index_of_the_First_Occurrence_in_a_String
 {
    public static int strStr(String haystack, String needle) {
       haystack=haystack.trim();
       if(haystack.contains(needle)) 
       {
          return haystack.indexOf(needle);
       }
       return -1;
    }
public static void main(String args[])
{
 String haystack="sadbutsad";
String needle="sad";
int result=strStr(haystack,needle);
System.out.println(result);
}
}