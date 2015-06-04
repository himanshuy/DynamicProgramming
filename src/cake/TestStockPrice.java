package cake;

public class TestStockPrice {
	
	public static void main(String[] args) {
		
	}
	
	public static int getMax(int arr[]){
		
		int current_profit = Integer.MIN_VALUE;
		int current_buy = arr[0];
		int global_sell = arr[1];
		int global_profit = current_buy - global_sell;
		
		for(int i=1; i< arr.length; i++) {
			current_profit = arr[i] - current_buy;
			
			if(current_profit > global_profit) {
				global_profit = current_profit;
			}
			if(current_buy > arr[i]) {
				current_buy = arr[i];
			}
		}
		
		return global_profit;
	}

}
