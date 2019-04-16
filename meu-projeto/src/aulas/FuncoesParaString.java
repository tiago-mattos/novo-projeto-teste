package aulas;

import java.util.Scanner;

public class FuncoesParaString {

	public static void main(String[] args) {
		// Formatar: toLowerCase(), toUpperCase(), trim()
		// Recortar: substring(inicio), substring(inicio, fim)
		// Substituir: Replace(char, char), Replace(string, string)
		// Buscar: IndexOf, LastIndexOf
		// str.Split(" ")

		FuncoesParaString executar = new FuncoesParaString();
		// executar.formatarString();
		executar.testeWhile();

	}

	public void formatarString() {

		String original = "abcde FGHIJ ABC abc DEFG    ";
		String minuscula = original.toLowerCase();
		String maiuscula = original.toUpperCase();
		String semEspacos = original.trim();
		String subString = original.substring(2);
		String subStringIntervalo = original.substring(2, 9);
		String substituir = original.replace('a', 'x');
		String substituirSubString = original.replace("abc", "xyz");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");

		System.out.println("Original: " + original);
		System.out.println("toLowerCase: " + minuscula);
		System.out.println("toUpperCase: " + maiuscula);
		System.out.println("trim: " + semEspacos);
		System.out.println("substring: " + subString);
		System.out.println("substring: " + subStringIntervalo);
		System.out.println("replace: " + substituir);
		System.out.println("replace: " + substituirSubString);
		System.out.println("indexOf: " + i);
		System.out.println("lastIndexOf: " + j);

		System.out.println("\n\n\n");

		String s = "potato apple lemon";

		String[] vetor = s.split(" ");

		System.out.println("Posição 0: " + vetor[0]);
		System.out.println("Posição 1: " + vetor[1]);
		System.out.println("Posição 2: " + vetor[2]);

	}

	public void testeWhile() {
		Scanner sc = new Scanner(System.in);	
		
		
		int senhaDigitada;
		
		do {
			
			System.out.println("Senha inválida");
			
			System.out.println("Digite a senha: ");
			
			senhaDigitada = sc.nextInt();
			
		} while (senhaDigitada != 2002);
		
		
		System.out.println("Acesso permitido! ");

	}
}
