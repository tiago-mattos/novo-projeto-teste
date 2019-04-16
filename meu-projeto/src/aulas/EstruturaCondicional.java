package aulas;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {

		EstruturaCondicional executar = new EstruturaCondicional();
		//executar.condicionalComposta();
		executar.condicionalEcandeado();

	}


	public void condicionalComposta() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um número inteiro: ");
		int numeroInteiro = sc.nextInt();

		if (numeroInteiro % 2 == 0) {
			System.out.println("Par!");

		} else
			System.out.println("Impar!");

		sc.close();
	}

	public void condicionalEcandeado() {
		
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Que horas são? ");
		int horaDia = sc.nextInt();
		
		if (horaDia < 12) {
			System.out.println("Bom dia! ");
		}else if( (horaDia < 18)) {
			System.out.println("Boa tarde! ");
			
		}else {
			System.out.println("Boa noite!");
		}


	}

}
