package cake;

import util.ArrayUtil;

/**
 * You have an array of integers, and for each index you want to 
 * find the product of every integer except the integer at that index.
 * For example, given:
 * [1, 7, 3, 4]
 * 
 * your function would return:
 * [84, 12, 28, 21]
 * 
 * by calculating:
 * [7*3*4, 1*3*4, 1*7*4, 1*7*3]
 * 
 * 
 * @author himanshuyadav
 *
 */
public class ProductOfAllExceptThat {
	
	public static void main(String[] args) {
		int[] arr = {4, 3, 2, 1};
		productOfAllExceptThatOne(arr);
	}

	/**
	 * First calculates product of all the integers before given index. For first index default will be 1.
	 * Then product of all the all the integers after given index. For last index default will be 1.
	 */
	public static int[] productOfAllExceptThatOne(int[] arr) {
		
		int[] product_of_all_ints = new int[arr.length];
		
		int i=0;
		int product_before_index = 1;
		
		while(i<arr.length) {
			product_of_all_ints[i] = product_before_index;
			product_before_index *= arr[i];
			i+=1;
		}
		
		printArray(product_of_all_ints);
		i = arr.length -1;
		int product_after_index = 1;
		while(i>=0) {
			product_of_all_ints[i] *= product_after_index;
			product_after_index *= arr[i];
			i -=1;
		}
		printArray(product_of_all_ints);
		return product_of_all_ints;
	}
	
	public static void printArray(int[] a){
		System.out.println();
		for(int i: a) {
			System.out.print(i+",");
		}
	}
}
