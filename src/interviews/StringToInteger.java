package interviews;

public class StringToInteger {

	public static void main(String[] args) {
		System.out.println(convert("222.9"));
	}
	
	public static boolean isNumeric(String str) {
		boolean flag = false;
		
		flag = str.matches("^-?[0-9]+(\\.[0-9]+)?$");
		
		return flag;
	}
	
	public static long convert(String str){
		int i=0;
		boolean isNegative = false;
		
		if(str.charAt(0) == '-') {
			isNegative = true;
			i = 1;
		}
		int dotpos = -1;
		long num = 0;
		
		dotpos = str.length() - str.indexOf(".");
		
		while(i<str.length()){
			num *= 10;
			if(str.charAt(i)=='.'){
				i++;
			}
			num += str.charAt(i++) -'0'; //VERY IMPORTANT
		}
		
		long countDotPos = 1;
		while(dotpos>1){
			countDotPos *=10.0;
			num /= countDotPos;
			System.out.println(num);
			dotpos--;
		}
		
		if(isNegative){
			num = -num;
		}
		
		return num;
	}
}
