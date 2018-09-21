package ss;

public class mainConta {
	public static void main(String[] args) {
		ContaExcecao conta1 = new ContaExcecao(100.3f);
		
			try {
				conta1.saca(120f);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	
}
