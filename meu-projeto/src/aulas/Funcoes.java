package aulas;

public class Funcoes {

	public static void main(String[] args) {
		
		int a, b, c;
		
		a = 10;
		
		b = 20;
		
		c = 30;
		
		int maior = maiorValor(a, b, c);
		
		imprimeValor(maior);
		
		
	}
	
	public static int maiorValor(int x, int y, int z) {
		
		int aux;
		
		if ( x > y && x > z) {
			
			aux = x;
			
		}		
		else if (y > z) {
			
			aux = y;
			
		}
		else{
			aux = z;
			
		}
		
		return aux;
		
		
	}
	
	public static void imprimeValor(int valor) {
		
		System.out.println("O maior valor é: "+ valor);

	}
	
	
	
	
	

}
