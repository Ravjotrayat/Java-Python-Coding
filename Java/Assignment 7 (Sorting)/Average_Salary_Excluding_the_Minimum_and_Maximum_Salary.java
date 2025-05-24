// Average Salary Excluding the Minimum and Maximum Salary
import java.util.*;
public class Average_Salary_Excluding_the_Minimum_and_Maximum_Salary

 {
    public static double average(int[] salary) {
        Arrays.sort(salary);
        double sum=0;
        for(int i=1;i<salary.length-1;i++)
            sum+=salary[i];
        return sum/(salary.length-2);
    }

public static void main(String args[])
{
int arr[]={48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};

System.out.println(average(arr));
}
}