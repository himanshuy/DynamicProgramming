package cake;

/**
 * 
 * Total number of ways of representing an amount
 * 
 * denomination[1,2,3] amount = 4, Answer: 4.
 * 
 * @author himanshuyadav
 *
 */

public class NumberOfCoinDenominations {

	public static int possible_solutions(int[] denominations, int amount) {
		int[] solution = new int[amount+1];
		for(int e:solution) {
			e=0;
		}
		solution[0] = 1;
		
		for(int den: denominations) {
			for(int j=1; j<=amount; j++) {
				solution[j] +=solution[j - den]; 
			}
		}
		
		return solution[amount];
	}
}
