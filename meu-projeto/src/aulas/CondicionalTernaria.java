package aulas;

public class CondicionalTernaria {

	public static void main(String[] args) {
		// Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em
		// uma condição.
		// Sintaxe:
		// ( condição ) ? valor_se_verdadeiro : valor_se_falso

		CondicionalTernaria executar = new CondicionalTernaria();
		executar.switchCase();
		
	}

	public void switchCase() {

		double preco = 34.5;
						// ( condição ) ? valor_se_verdadeiro : valor_se_falso
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
	}
	
	
}
