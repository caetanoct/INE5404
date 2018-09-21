package ss;

public class Teste {
public static void f (int i) {
try {
 switch (i) {
 default:
 case 1: throw new Exception();
 case 2: throw new Exception1();
 case 3: throw new Exception2();
 }
}
catch(Exception1 e) {
	System.out.println("case 2");
}
catch(Exception2 e) {
	System.out.println("case 3");
}
catch(Exception e) {
	System.out.println("case 1");
	}
}

	public static void main(String[] args) {
		f(1);
		f(2);
		f(3);
	}
}