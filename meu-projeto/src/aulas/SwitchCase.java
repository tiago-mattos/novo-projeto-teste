package aulas;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		SwitchCase executar = new SwitchCase();
		// executar.condicionalEcandeado();
		executar.switchCase();

	}
	
	public void condicionalEcandeado() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o dia da semana: ");

		int x = sc.nextInt();

		String dia;

		if (x == 1) {

			dia = "Segunda";

		} else if (x == 2) {

			dia = "Ter�a";

		} else if (x == 3) {

			dia = "Quarta";

		} else if (x == 4) {

			dia = "Quinta";

		}

		else if (x == 5) {

			dia = "Sexta";

		} else if (x == 6) {

			dia = "S�bado";

		} else if (x == 7) {

			dia = "Domingo";

		} else {
			dia = "Valor inv�lido!";
		}

		System.out.println("Dia: " + dia);

		sc.close();

	}

	public void switchCase() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o dia da semana: ");

		int x = sc.nextInt();

		String dia;

		switch (x) {
		case 1:
			dia = "Segunda";
			break;

		case 2:
			dia = "Ter�a";
			break;

		case 3:
			dia = "Quarta";
			break;

		case 4:
			dia = "Quinta";
			break;

		case 5:
			dia = "Sexta";
			break;

		case 6:
			dia = "S�bado";
			break;

		case 7:
			dia = "Domingo";
			break;

		default:
			dia = "Valor inv�lido!";
			break;
		}
		System.out.println("Dia: " + dia);
		sc.close();

	}

}
