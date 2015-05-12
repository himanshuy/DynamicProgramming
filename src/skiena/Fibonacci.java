package skiena;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(fibonacciCache(7));
	}
	
	public static int fibonacci(int n) {
		int[] f = new int[100];
		f[0] = 0;
		f[1] = 1;
		
		for(int i =2; i<=n ;i++) {
			
			f[i] = f[i-1]+f[i-2];
		}
		return f[n];
	}
	
	public static int fibonacciCache(int n) {
		
		int back1 = 0;
		int back2 = 1;
		int result= 0;
		
		for(int i=2; i<=n; i++) {
			result = back1+back2;
			back1 = back2;
			back2 = result;
		}
		
		return result;
	}

}
