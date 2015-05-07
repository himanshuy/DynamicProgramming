package hackerRank;

import java.util.List;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		String file = "test.txt";
		List<String> list = ReadFile.readFile(file);
		int[] arr = { 15, 27, 14, 38, 26, 55, 46, 65, 85 };
		System.out.println(LIS(arr));
	}
	
	private static int LIS (int[] arr) {
		int L[] = new int[arr.length];
		L[0] = 1;
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[j]<arr[i] && L[i]<L[j]+1) {
					
				}
			}
		}
	}

}
