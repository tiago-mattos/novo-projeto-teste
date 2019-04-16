package aulas;

import java.util.Scanner;

/* Teclas
 
• CTRL+SHIFT+B - marcar/desmarcar breakpoint
• - iniciar/continuar o debug
• F6 - executar um passo (pula função)
• F5 - executar um passo (entra na função)
• F7 - sair do método em execução
• - parar debug

*/

public class Debbuging {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite três números: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		int max = maiorValor(a, b, c);
		
		imprimeValor(max);
		
		
		sc.close();

	}

	public static int maiorValor(int x, int y, int z) {

		int aux;

		if (x > y && x > z) {

			aux = x;

		} else if (y > z) {

			aux = y;

		} else {
			aux = z;

		}

		return aux;

	}

	public static void imprimeValor(int valor) {

		System.out.println("O maior valor é: " + valor);

	}

}
