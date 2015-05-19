package cake;

import util.ArrayUtil;

/**
 * You have an array of integers, and for each index you want to 
 * find the product of every integer except the integer at that index.
 * 
 * @author himanshuyadav
 *
 */
public class ProductOfAllExceptThat {
	
	public static void main(String[] args) {
		int[] arr = {1, 3, 7, 5};
		productOfAll(arr);
	}

	public static int[] productOfAll(int[] arr) {
		
		int[] product_of_all_ints = new int[arr.length];
		
		int i=0;
		int product_before_index = 1;
		
		while(i<arr.length) {
			product_of_all_ints[i] = product_before_index;
			product_before_index *= arr[i];
			i+=1;
		}
		
		ArrayUtil.printArray(product_of_all_ints);
		i = arr.length -1;
		int product_after_index = 1;
		while(i>=0) {
			product_of_all_ints[i] *= product_after_index;
			product_after_index *= arr[i];
			i -=1;
		}
		ArrayUtil.printArray(product_of_all_ints);
		return product_of_all_ints;
	}
}
