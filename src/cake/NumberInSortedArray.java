package cake;

/**
 * Suppose we had an array of n integers in sorted order. 
 * How quickly could we check if a given integer is in the array? 
 *
 */

public class NumberInSortedArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(findNumber(arr,3));
	}
	
	public static boolean findNumber(int[] arr, int num) {
		boolean result = false;
		
		int firstNumber = 0;
		
		int mid = arr.length/2;
		
		while(mid<arr.length) {
			if(arr[mid] > num) {
				mid = (firstNumber + (mid-1))/2;
			} else if(arr[mid] < num) {
				firstNumber = mid;
				mid = ((firstNumber+1)+arr.length)/2;
			} else {
				return true;
			}
		}
		
		return result;
	}

}
