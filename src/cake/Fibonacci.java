package cake;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(fib2(100));
	}
	
	private static int fib(int n) {
		int[] result = new int[n+1];
		result[0] = 0;
		result[1] = 0;
		
		for(int i=2; i<=n; i++) {
			result[i] = result[i-1] + result[i-2];
		}
		return result[n];
	}
	
	private static int fib2(int n) {
		int back1=0;
		int back2=1;
		int result=0;
		
		for(int i=2; i<=n ; i++) {
			result = back1+back2;
			back1 = back2;
			back2 = result;
		}
		return result;
	}

}
