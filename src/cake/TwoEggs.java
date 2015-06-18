package cake;

public class TwoEggs {

	public static void main(String[] args) {
		System.out.println(eggDrop(2, 100));
	}
	private static int eggDrop(int n, int k) {
		// eggFloor[i][j] represents minimum number of trials needed for i eggs and j floors
		int[][] eggFloor = new int[n+1][k+1];
		int res;
		int i, j, x;
		
		//We always need 0 trial for 0 floor and 1 trial for 1 floor
		for(i=1; i<= n; i++ ) {
			eggFloor[i][0] = 0;
			eggFloor[i][1] = 1;
		}
		
		//Always need j trials with 1 egg and j floors
		for(j=1; j<=k; j++) {
			eggFloor[1][j] = j;
		}
		
		for(i=2; i<=n; i++) {
			for(j=2; j<=k; j++) {
				eggFloor[i][j] = Integer.MAX_VALUE;
				for(x=1; x<= j; x++) {
					res = 1 + max(eggFloor[i-1][x-1], eggFloor[i][j-x]);
					if(res < eggFloor[i][j])
						eggFloor[i][j] = res;
				}
			}
		}
		return eggFloor[n][k];
	}
	
	private static int max(int a, int b) {
		return (a > b) ? a:b;
	}
}
