package ss;

public class mainArrayException {

	public static int[] recebeN(int n) {
		try {
			return new int[n];
		}
		catch(NegativeArraySizeException e) {
			return new int[-n];
		}
	}
	public static void main(String[] args) {
		int[] a = recebeN(-2);
		
	}

}
