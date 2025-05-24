// Sentence Similarity III
import java.util.*;
public class Sentence_Similarity_III

{
public static boolean areSentencesSimilar(String s1,String s2)
{

 if(s1.equals(s2))   return true;
int i=0,j=0;
String a[]=s1.split(" ");
String b[]=s1.split(" ");
while(i<a.length && j<b.length)
{
  if(!a[i].equals(b[j])) break;
	i++;j++;

}

int l1=a.length-1;
int l2=b.length-1;
while(l1>i &&  l2>j)
{
if(!a[l1].equals(b[l2])) break;
 l1--;l2--;

}
return i>l1 || j>l2;

}


public static void main(String args[])
{
String sentence1="Eating right now";
String sentence2="Eating";
System.out.println(areSentencesSimilar(sentence1,sentence2));
}

}