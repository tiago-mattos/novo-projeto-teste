package aulas;

public class Operadores {

	public static void main(String[] args) {
		Operadores executar = new Operadores();
		
		//executar.operadoresAritmeticos();
		executar.operadoresAtribuicao();

	}
	
	public void operadoresAritmeticos() {
		
		int variavelA = 3 + 4 * 2;
		int variavelB = ( 3 + 4 ) * 2;
		int variavelC = 17 % 3;		
		double variavelD = (double) 10 / 8;
		
		
		System.out.println(variavelA);
		System.out.println(variavelB);
		System.out.println(variavelC);
		System.out.println(variavelD);
		
		//Fórmula de Bhaskara
		
		double a = 1.0, b = -3.0, c = -4.0; 
		
		double bhaskara = (-b + Math.sqrt(b * b - 4.0 * a * c)) / (2.0 * a);
		
		System.out.println("\nResultado Bhaskara: "+ bhaskara);
	}
	
	public void operadoresAtribuicao() {
		/*
		 * =	a = 10;
		 * +=	a += 2;
		 * -= 	a -+ 2;
		 * *=	a *= 2    a /= 2;
		 * %=	a %= 3;				 
		 */
		
		double variavelA = 10;
		double variavelB = 30;
				
		variavelA *= 2; //20
		variavelB += variavelA; //50
		
		System.out.println(variavelA);
		System.out.println(variavelB);
		
		String primeiraString = "ABC";
		String segundaString = "DEF";
		
		System.out.println(primeiraString + segundaString);
		
		int variavelC = 10;
		
		variavelC++;				
		System.out.println(variavelC);
		
		variavelC--;
		System.out.println(variavelC);
		
		
	}
}
