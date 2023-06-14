// Minimum Cost to Move Chips to The Same Position
import java.util.*;
public class Minimum Cost_to_move_chips_to_the_same_position
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
int even=0,odd=0,cost=0;
for(int i=0;i<n;i++)
{
   if(arr[i]%2==0)
       even++;
else
    odd++;}
if(even==n || odd==n)
      System.out.println("Cost = "+ 0);
else
    System.out.println("Cost = "+ Math.min(even,odd));
}
}
