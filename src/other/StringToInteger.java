package other;

public class StringToInteger {

	public static void main(String[] args) {
		System.out.println(convert("-222"));
	}
	
	public static boolean isNumeric(String str) {
		boolean flag = false;
		
		flag = str.matches("^-?[0-9]+(\\.[0-9]+)?$");
		
		return flag;
	}
	
	public static Integer convert(String str){
		int i=0;
		boolean isNegative = false;
		
		if(str.charAt(0) == '-') {
			isNegative = true;
			i = 1;
		}
		int dotpos = -1;
		int num = 0;
		
		while(i<str.length()){
			num *= 10;
			if(str.charAt(i) == '.') {
				dotpos = i;
			} else {
				num += str.charAt(i++) -'0'; //VERY IMPORTANT
			}
		}
		
		if(isNegative){
			num = -num;
		}
		
		return num;
	}
}
