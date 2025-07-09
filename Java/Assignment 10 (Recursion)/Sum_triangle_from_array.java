//    Sum triangle from array
import java.util.*;
public class Sum_triangle_from_array {
	public static void sumRecursion(int array[]) 
	{
		if (array.length < 1)
			return;

		int temp[] = new int[array.length - 1];
		for (int i = 0; i < array.length - 1; i++) {
			temp[i] = array[i] + array[i + 1];			
		}
		sumRecursion(temp);
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };
		sumRecursion(array);
	}
}