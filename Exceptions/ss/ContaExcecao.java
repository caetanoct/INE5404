package ss;

public class ContaExcecao {
	
	public float saldo;
	
	
	public ContaExcecao(float saldo) {
		this.saldo = saldo;
	}
	public void saca(float valor) throws Exception{
				saldo -= valor;
				if(saldo < 0) {
					throw new Exception("Saldo negativo");
				}
			
	}
}
