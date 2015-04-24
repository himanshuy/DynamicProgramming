package hackerRank;

import java.util.Scanner;

public class MaxSubArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		int[][] result = new int[n][2];
		for(int i=0;i<n;i++) {
			int l1 = Integer.parseInt(in.nextLine());
			int[] arr1 = new int[l1];
			String line = in.nextLine();
			String[] charArr = line.split(" ");
			for(int j=0;j<l1;j++) {
				arr1[j] = Integer.parseInt(charArr[j]);
			}
			int a = maxSubArraySum(arr1);
			int b = maxSubArraySumNonContinuous(arr1);
			result[i][0] = a;
			result[i][1] = b;
		}
		for(int k=0; k<n; k++) {
			System.out.print(result[k][0]+" "+result[k][1]);
			System.out.println();
		}
	}
	
	private static int maxSubArraySum(int[] arr) {
		int current_sum = arr[0];
		int best_sum = arr[0];
		for(int i=1; i<arr.length; i++) {
			int val = current_sum+arr[i];
			if(val > 0){
				current_sum = val;
			} else {
				current_sum = 0;
			}
			if(current_sum > best_sum) {
				best_sum = current_sum;
			}
		}
		
		return best_sum;
	}

	private static int maxSubArraySumWithIndex(int[] arr) {
		int current_sum=0;
		int current_index=-1;
		int best_sum = 0;
		int best_start_index=-1;
		int best_end_index=-1;
		
		for(int i=1; i<arr.length; i++) {
			int val = current_sum + arr[i];
			if(val > 0) {
				if(current_sum == 0){
					current_index = i;
				}
				current_sum = val;
			} else {
				current_sum = 0;
			}
			if(current_sum > best_sum) {
				best_sum = current_sum;
				best_start_index = current_index;
				best_end_index = i;
			}
		}
		return best_sum;
		
	}
	
	private static int maxSubArraySumNonContinuous(int[] arr) {
		int sum = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>0){
				sum += arr[i];
			}
		}
		return sum;
	}

}
