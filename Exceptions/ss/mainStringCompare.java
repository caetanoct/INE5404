package ss;

import java.util.Scanner;

public class mainStringCompare {
	public static void recebeString(String s1, String s2) {
		try{if(s1.compareTo(s2) == 0) {
			System.out.println("São iguais");
		}
		else if(s1.compareTo(s2) > 0) {
			System.out.println("String 1 > String 2");
		}
		else if(s1.compareTo(s2) < 0) {System.out.println("String 2 > String 1");}
		}
		catch(NullPointerException e) {
			System.out.println("string null");
		}
	}
	public static void main(String[] args) {
		
		
		recebeString(null, "");
		
	}
}
