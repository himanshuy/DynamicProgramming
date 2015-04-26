package topcoder;

public class CoinDenomination {

	public static void main(String[] args) {
		int[] denominations = {1, 3, 5};
		int total = 11;
		System.out.println(minDenominations(denominations, total));
	}
	
	/**
	 * 
	 * 1. Check if total is less than or equal to coin
	 * 2. Then check if min[total-coin]+1<min[total]
	 * 
	 */
	public static int minDenominations(int[] arr, int total) {
		int[] min = new int[total];
		//Setting array values to maximum
		for(int i=0; i<total; i++) {
			min[i]=Integer.MAX_VALUE;
		}
		min[0]=0;
		
		for(int i=1; i<total; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[j]<=i && min[i - arr[j]]+1 <min[i]) {
					min[i] = min[i - arr[j]]+1;
				}
			}
		}
		
		return min[total-1];
	}

}
