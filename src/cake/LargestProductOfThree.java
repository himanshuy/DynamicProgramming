package cake;

/**
 * Given an array_of_ints, find the highest_product you can get from three of the integers.
 *  TODO: product of 4 integers
 *  TODO: product of k integers
 * 
 * @author himanshuyadav
 *
 */

public class LargestProductOfThree {

	public static void main(String[] args) {
		int[] arr = {1, 10, -5, 1, -100};
		
		System.out.println(largest_of_three(arr));
	}
	
	public static int largest_of_three(int[] arr) {
		
		if(arr.length < 3) return Integer.MIN_VALUE;
		
		int highest = Math.max(arr[0], arr[1]);
		int lowest = Math.min(arr[0], arr[1]);
		
		int highest_product_of_2 = arr[0]*arr[1];
		int lowest_product_of_2 = arr[0]*arr[1];
		
		int highest_product_of_3 = arr[0]*arr[1]*arr[2];
		
		for(int i=2; i<arr.length; i++) {
			highest_product_of_3 = highestOf3Numbers(highest_product_of_3,
											arr[i] * highest_product_of_2, 
											arr[i] * lowest_product_of_2);
			
			highest_product_of_2 = highestOf3Numbers(highest_product_of_2, arr[i]*highest, arr[i]*lowest);
			
			lowest_product_of_2 = lowestOf3Numbers(lowest_product_of_2, arr[i]*highest, arr[i]*lowest);
			
			highest = Math.max(highest, arr[i]);
			lowest = Math.min(lowest, arr[i]);
			
		}
		
		return highest_product_of_3;
	}
	
	private static int lowestOf3Numbers(int first, int second, int third) {
		
		if(first<=second && first<=third){
			return first;
		} else if(second<=first && second<=third) {
			return second;
		} else if(third<=first && third <= second) {
			return third;
		}
		return 0;
	}

	public static int highestOf3Numbers(int a, int b, int c){
		
		if(a>b && a>c) {
			return a;
		} else if(b>a && b>c){
			return b;
		} else if(c>a && c>b) {
			return c;
		} else {
			return Integer.MIN_VALUE;
		}
	}

}
