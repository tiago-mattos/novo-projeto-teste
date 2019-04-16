package aulas;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		EntradaDados executar = new EntradaDados();
		//executar.lerDados();
		executar.lerDados_2();

	}

	public void lerDados() {
		Scanner sc = new Scanner(System.in);

		String sentence = sc.nextLine();
		String x, y, z;
		x = sc.next();
		y = sc.next();
		z = sc.next();

		System.out.println(sentence);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		sc.close();

	}
	
	public void lerDados_2() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt(); //35
		sc.nextLine();
		String name = sc.nextLine(); //  Tiago Leandro
		char gender = sc.next().charAt(0); // M
		
		//b5
		
		String s =sc.next();
		char letter = s.charAt(0);
		int digit = Integer.parseInt(s.substring(1)); // recorta string a partir da posição 1 (b5)
		
				
		//4.32
			
		double n2 = sc.nextDouble();
		
		// Maria F 23 1.28
		String name2 = sc.next();
		char ch = sc.next().charAt(0);
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		
		//Impressão

		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(digit);
		System.out.println(n2);
		
		System.out.println(name2);
		System.out.println(ch);
		System.out.println(age);
		System.out.println(height);
		
		
		sc.close();
	}

}
