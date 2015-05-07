package topcoder;

public class BadNeighbors {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5 };

		System.out.println(maxDonations(arr));
	}
	
	public static int maxDonations(int[] arr) {
		int currentVal=arr[0];
		int bestVal=arr[0];
		int index = 0;
		if(arr.length == 1) return bestVal;
		
		for(int i=1; i<arr.length; i++) {
			if(index+1 != i) {
				currentVal += arr[i];
				if(currentVal > bestVal) {
					bestVal = currentVal;
					index = i;
				}
			}else {
				currentVal=arr[i];
			}
		}
		if(currentVal > bestVal) {
			bestVal = currentVal;
		}
		return bestVal;
	}

}
