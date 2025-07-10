
//Recursive Programs to find Minimum and Maximum elements of array
import java.util.*;

public class Recursive_Programs_to_find_Minimum_and_Maximum_elements_of_array {

    public static int findMin(int arr[], int i) {
        if (i == 1)
            return arr[0];

        int minResult = findMin(arr, i - 1);
        if (arr[i - 1] < minResult)
            return arr[i - 1];
        else
            return minResult;

    }

    public static int findMax(int arr[], int i) {

        if (i == 1)
            return arr[0];

        int maxResult = findMax(arr, i - 1);
        if (arr[i - 1] > maxResult)
            return arr[i - 1];
        else
            return maxResult;
    }

    public static void main(String[] args) {
        int array[] = { 1, 14, 3, 5, -4, -8, 16 };
        int index = array.length;
        int min = findMin(array, index);
        int max = findMax(array, index);
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }
}