
public class PalindromRekursiv {
	
	public static boolean isPalindrom(String s){
		if(s.length()==0||s.length()==1){
			return true;
		}
		if(s.charAt(0)==s.charAt(s.length()-1)){
			return isPalindrom(s.substring(1,s.length()-1));
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sos";
		if(isPalindrom(str)){
			System.out.println(str + " ist Palindrom");
		}else{
			System.out.println(str + " ist kein Palindrom");
		}
		

	}

}
