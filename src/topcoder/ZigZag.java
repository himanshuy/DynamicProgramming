package topcoder;

public class ZigZag {

	public static void main(String[] args) {
		int[] arr = {1, 17, 5, 10, 13, 15, 10, 5, 16, 8};
		System.out.println(zigZag(arr));
	}
	
	private static int zigZag(int[] arr) {
		if(arr.length == 1) return 1;
		
		int[] result = new int[arr.length-1];
		
		for(int i=1; i<arr.length; i++) {
			result[i-1] = arr[i] - arr[i-1]; 
		}
		int ii=0;
		while(ii < result.length && result[ii]==0) {
			ii++;
		}
		if(ii == result.length) return 1;
		int dir = result[ii];
		int len = 2;
		for(int i=ii+1; i<result.length; i++) {
			if(result[i]*dir < 0) {
				dir *= -1;
				len++;
			}
		}
		return len++;
	}

}
