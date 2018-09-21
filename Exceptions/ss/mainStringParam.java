package ss;

public class mainStringParam {
	public static void recebeString(String s) throws Exception {
		boolean ehCompostaDeMaiusculos = true;
		for(int i = 0 ; i < s.length() ; i++) {
			if(!Character.isLetter(s.charAt(i))) {
				Exception letterExc = new Exception("charAt["+i+"] is not letter");
				throw letterExc;
			}
			if(Character.isLowerCase(s.charAt(i))) {
				ehCompostaDeMaiusculos = false;
				Exception upperExc = new Exception("charAt["+i+"] is not uppercase");
				throw upperExc;
			}
			
		}
	}
	public static void main(String[] args) {

		String a = "sa3";
		try {
			recebeString(a);
		} catch (Exception e) {
			System.err.println(e);
		}
		
	}
}
