package cake;

public class RotationPoint {

	public static void main(String[] args) {
		String[] words = {"ptolemaic","retrograde",
		                        "supplant",
		                        "undulate",
		                        "xenoepist",
		                        "asymptote",  //rotation point
		                        "babka",
		                        "banoffee",
		                        "engender",
		                        "karpatka",
		                        "othellolagkage"
		};
		
		String[] words2  = { "k","v","a","b","c","d","e","g","i" };
		System.out.println(rotationPoint(words2));
	}
	
	public static int rotationPoint(String[] arr) {
		
		String first_word = arr[0];
		int floor_index = 0;
		int ceiling_index = arr.length - 1;
		
		while(floor_index < ceiling_index) {
			int guess_index = floor_index + (ceiling_index - floor_index)/2;
			System.out.println(arr[guess_index]);
			System.out.println(arr[guess_index].compareToIgnoreCase(first_word));
			if(arr[guess_index].compareToIgnoreCase(first_word) > 0) {
				floor_index = guess_index;
			} else {
				ceiling_index = guess_index;
			}
			
			if(floor_index+1 == ceiling_index) {
				return ceiling_index;
			}
		}
		
		return 0;
	}
}
