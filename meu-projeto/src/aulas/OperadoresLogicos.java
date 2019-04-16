package aulas;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		OperadoresLogicos executar = new OperadoresLogicos();
		//executar.operadoresLogicos();
		executar.operadoresBitwise();
		

	}
	
	public void operadoresLogicos() {
		/*
		 * && E 
		 * || OU 
		 * ! N�O
		 */
	
		boolean primeiraComparacao = (2 > 3) && (4 != 5);
		
		boolean segundaComparacao = !(2 > 3) && (4 != 5);
		
		System.out.println(primeiraComparacao);
		System.out.println(segundaComparacao);
	}

	
	public void operadoresBitwise() {
		/*
		 * & Opera��o "E" bit a bit 
		 * | Opera��o "OU" bit a bit 
		 * ^ Opera��o "OU-exclusivo" * bit a bit
		 */
		
		int n1 = 89;
		int n2 = 60;
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
	
	}

}
