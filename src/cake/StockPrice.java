package cake;

public class StockPrice {

	public static void main(String[] args) {
		int[] ar = {100, 50 , 200, 150, 300};
		System.out.println(highestStockPrice(ar));
		System.out.println(get_max_profit(ar));
	}
	
	/**
	 * Runtime O(N2)
	 * Space O(N)
	 * 
	 * @param ar
	 * @return
	 */
	
	public static int highestStockPrice(int[] ar){
		int[] a = new int[ar.length];
		int current = 0;
		
		for(int i=0; i<ar.length; i++) {
			for(int j=i+1; j<ar.length; j++){
				int val = ar[j]-ar[i];
				if(current<val) {
					current = val;
				}
			}
			a[i] = current;
		}
		return maxArray(a);
	}
	
	private static int maxArray(int[] a) {
		int k=0;
		for(int i=0; i<a.length; i++) {
			if(k<a[i]) {
				k=a[i];
			}
		}
		return k;
	}
	
	/**
	 * Runtime O(N)
	 * Space O(1)
	 * 
	 * @param arr
	 * @return
	 * @throws Exception
	 */
	public static int get_max_profit(int[] arr) {
		if (arr.length < 2) {
			return 0; //Should throw exception
		}
		int min_price = arr[0];
		int max_profit = arr[1] - arr[0];

		for (int i = 1; i < arr.length; i++) {
			int potential_profit = arr[i] - min_price;
			max_profit = Math.max(max_profit, potential_profit);
			min_price = Math.min(arr[i], min_price);

		}
		return max_profit;
	}
	
	public static int[] getProfit(int[] arr){
		
		if(arr.length <2){
			return null;
		}
		int current_profit = Integer.MIN_VALUE;
		int current_buy = arr[0];
		int global_sell = arr[1];
		int global_profit = arr[1] - arr[0];
		
		for(int i=1; i<arr.length; i++){
			current_profit = arr[i] - current_buy;
			if(current_profit > global_profit) {
				global_profit = current_profit;
				global_sell = arr[i];
			} else if(current_profit < global_profit) {
				current_buy = arr[i];
			}
		}
		int[] result = {global_profit, global_sell};
		return result;
		
	}

}
