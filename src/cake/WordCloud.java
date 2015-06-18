package cake;

public class WordCloud {

	public static void main(String[] args) {

	}
	
	private void buildCloud(String str) {
		
	}
	
	private boolean is_letter(char a){
		String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int i = letters.indexOf(a);
		if(i==-1) {
			return false;
		}
		return true;
	}

}
