import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;


public class Collections_ex1 {
	//EX 1:
	public static LinkedList<Character> recebeLinkedList(LinkedList<Character> listaR){
		int maiorIndice = listaR.size()-1;
		LinkedList<Character> listaReturn = new LinkedList<Character>();
		for(int i = 0 ; i < listaR.size();i++){
			listaReturn.add(listaR.get(maiorIndice));
			maiorIndice-=1;
		}
		return listaReturn;
	}
	//EX 2:
	public static void determImprimeDuplicadas(String frase){
		String[] palavras = frase.split(" ");
		int repetidas = 0;
		for(int i = 0 ; i < palavras.length; i++){
			for(int j = i+1; j < palavras.length ; j++){

				if(palavras[i].equals(palavras[j])){
					repetidas++;
				}
				
			}
		}
		System.out.println("Número de palavras iguais:" + repetidas);
	}
	//EX4:
	 public static List<Integer> primeFactors(int number) {
	        int n = number;
	        List<Integer> factors = new ArrayList<Integer>();
	        for (int i = 2; i <= n; i++) {
	            while (n % i == 0) {
	                factors.add(i);
	                n /= i;
	            }
	        }
	        return factors;
	    }
	 public static boolean isPrime(int x) {
		    if (x==1) {
		        return true;
		    } else {
		        for(int i=2;i<=Math.sqrt(x);i++) {
		            if (x%i==0) return false;          
		    }
		    return true;
		}
	 }
		    
	//EX5:
	public static ArrayList<Integer> retornaFibonacciAte(int cota){
	int fn = 1;
	int fant = 0;
	int fnantes = fn;
	ArrayList<Integer> sequencia = new ArrayList<Integer>();
	for(int i = 0 ; fn <= cota ;i++){	
		sequencia.add(fn);
		fnantes = fn;
		fn = fn + fant;
		fant = fnantes;
	}
	return sequencia;
	}
	
	public static void main(String[] args) {
		//Teste EX1:
		System.out.println("EX1");
		LinkedList<Character> listaParaTestar = new LinkedList<Character>();
		listaParaTestar.add('1');
		listaParaTestar.add('2');
		listaParaTestar.add('3');
		listaParaTestar.add('A');
		listaParaTestar.add('B');
		listaParaTestar.add('C');
		listaParaTestar = recebeLinkedList(listaParaTestar);
		System.out.println(listaParaTestar);
		//Teste EX2: xx
		System.out.println("EX2");
		String frase = "uma frase para teste teste";
		determImprimeDuplicadas(frase);
		//Teste EX3:
		System.out.println("EX3");
		Random gerador = new Random();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(int i = 0 ; i < 25 ; i++){
			nums.add(gerador.nextInt(25));
		}
		int soma = 0;
		for(Integer num: nums){
			soma = soma + num;
		}
		System.out.println(nums);
		System.out.println("Média: " + soma/nums.size());
		//Teste EX4: xx
		System.out.println("EX4");
		int n = 57;
		System.out.println(n);
		if(isPrime(n)){
			System.out.println("é primo");
		}
		else
		{
			HashSet<Integer> fatores = new HashSet<Integer>(primeFactors(n));
			
			System.out.println(fatores);
		}
		
		
		//Teste EX5:
		System.out.println("EX5");
		ArrayList<Integer> sequencia = retornaFibonacciAte(21);
		System.out.println(sequencia);
		//Teste EX6:
		System.out.println("EX6");
		String[] siglas = {"RR","RO","AC","AM","AP","PA","MT","TO","MA","CE"};
		String[] capitais = {"Boa vista","Porto Velho","Rio Branco","Manaus","Macapá","Belém","Cuiaba","Palmas","Sao luis","Fortaleza"};
		HashMap<String, String> mapa = new HashMap<String, String>();
		for(int i = 0 ; i < siglas.length; i++){
			mapa.put(siglas[i], capitais[i]);
		}
		System.out.println(mapa);
		//Teste EX7:
		ArrayList<Integer> inteiros = new ArrayList<Integer>();
		for(int i = 0 ; i < 25 ; i++){
			inteiros.add(gerador.nextInt(25));
		}
		int max	= Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(Integer inteiro: inteiros){
			if(inteiro >= max){
				max = inteiro;
			}
			if(inteiro <= min){
				min = inteiro;
			}
		}
		System.out.println("Array:" + inteiros);
		System.out.printf("Max: %d \nMin: %d",max,min);
	}
}
