package cake;

public class RotationPoint {

	/**
	 * words = [
    'ptolemaic',
    'retrograde',
    'supplant',
    'undulate',
    'xenoepist',
    'asymptote', # <-- rotates here!
    'babka',
    'banoffee',
    'engender',
    'karpatka',
    'othellolagkage',
    ]
	Write a function for finding the index of the "rotation point," 
	which is where I started working from the beginning of the dictionary. 
	This array is huge (there are lots of words I don't know) so we want to be efficient here.
	 */
	
	public static int rotationPoint(String[] arr) {
		String first_word = arr[0];
		int floor_index = 0;
		int ceiling_index = arr.length -1;
		
		while(floor_index < ceiling_index) {
			int guess_index = floor_index + ((ceiling_index - floor_index)/2);
			
			if(arr[guess_index].compareToIgnoreCase(first_word) > 0) {
				// Go right
				floor_index = guess_index;
			} else {
				//Go left
				ceiling_index = guess_index;
			}
		}
		
		if( floor_index +1 == ceiling_index) {
			return ceiling_index;
		}
		
		return 0;
	}
}
