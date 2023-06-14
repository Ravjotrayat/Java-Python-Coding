//Remove Duplicates from Sorted Array
import java.util.*;
public class A27
{
     public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
System.out.println("Enter the limit");
int n=sc.nextInt();
System.out.println("Enter the elements");
int arr[]=new int[n];

for(int i=0;i<n;i++)
  arr[i]=sc.nextInt();
int c=1;
for(int i=0;i<n-1;i++)
     {
         if(arr[i]<arr[i+1])
           { 
               arr[c]=arr[i+1];
                c++; 
           } 
    }
 System.out.println("Number of elements remain is : "+c);  
for(int i=0;i<c;i++)
System.out.println(arr[i]+" ");

}
}