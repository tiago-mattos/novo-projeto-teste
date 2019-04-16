package aulas;

public class OperadoresComparativos {

	public static void main(String[] args) {
		OperadoresComparativos executar = new OperadoresComparativos();
		executar.operadoresComparativos();

	}
	
	public void operadoresComparativos() {
		/*
		 * > maior 
		 * < menor 
		 * >= maior ou igual 
		 * <= menor ou igual 
		 * == igual 
		 * != diferente
		 */
		
		int primeiroValor = 10;
		
		boolean primeiraComparacao = primeiroValor > 10;
		boolean segundaComparacao = primeiroValor >= 10;
		boolean tereceiraComparacao = primeiroValor < 10;
		boolean quartaComparacao = primeiroValor <= 10;
		boolean quintaComparacao = primeiroValor == 10;
		boolean sextaComparacao = primeiroValor != 10;
		
		
		
		System.out.println(primeiraComparacao);
		System.out.println(segundaComparacao);
		System.out.println(tereceiraComparacao);
		System.out.println(quartaComparacao);
		System.out.println(quintaComparacao);
		System.out.println(sextaComparacao);
		
	}
}
