package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		Exercicios executar = new Exercicios();
		// executar.exercicio01();
		// executar.exercicio02();
		// executar.exercicio03();
		// executar.exercicio04();
		//executar.exercicio05();
		executar.exercicio06();
	}

	public void exercicio01() {

		/*
		 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
		 * soma desses números com uma mensagem explicativa, conforme exemplos.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o primeiro número: ");
		int primeiroNumero = sc.nextInt();

		System.out.println("Informe o segundo número: ");
		int segundoNumero = sc.nextInt();

		int soma = primeiroNumero + segundoNumero;
		System.out.printf("SOMA = %d", soma);

		sc.close();
	}

	public void exercicio02() {
		/*
		 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
		 * valor da área deste círculo com quatro casas decimais conforme exemplos.
		 * Fórmula da área: area = π . raio2 Considere o valor de π = 3.14159
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o raio do círculo: ");
		double raioCirculo = sc.nextDouble();

		double areaCirculo = Math.pow(raioCirculo, 2) * Math.PI;

		System.out.printf("A = %.4f", areaCirculo);

		sc.close();

	}

	public void exercicio03() {
		/*
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
		 * calcule e mostre a diferença do produto de A e B pelo produto de C e D
		 * segundo a fórmula: DIFERENCA = (A * B - C * D).
		 */

		Scanner sc = new Scanner(System.in);

		int A, B, C, D, diferenca;

		System.out.println("Informe o valor de A: ");
		A = sc.nextInt();

		System.out.println("Informe o valor de B: ");
		B = sc.nextInt();

		System.out.println("Informe o valor de C: ");
		C = sc.nextInt();

		System.out.println("Informe o valor de D: ");
		D = sc.nextInt();

		diferenca = ((A * B) - (C * D));

		System.out.printf("Diferença = %d", diferenca);

		sc.close();
	}

	public void exercicio04() {
		/*
		 * Fazer um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas, o valor que recebe por hora e calcula o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais.
		 */

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int numeroFuncionario, horasTrabalhadas;
		double valorHoraTrabalhada, salarioFuncionario;

		System.out.println("Número do funcionário: ");
		numeroFuncionario = sc.nextInt();

		System.out.println("Horas trabalhadas: ");
		horasTrabalhadas = sc.nextInt();

		System.out.println("Valor pago por horas trabalhadas: ");
		valorHoraTrabalhada = sc.nextDouble();

		salarioFuncionario = horasTrabalhadas * valorHoraTrabalhada;

		System.out.printf("Number =  %d", numeroFuncionario);
		System.out.printf("\nSalary = U$ %.2f", salarioFuncionario);

		sc.close();

	}

	public void exercicio05() {
		/*
		 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
		 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// Scanner aux = new Scanner(System.in);

		int codigoPeca_01, numeroPeca_01, codigoPeca_02, numeroPeca_02;
		double valorUnitarioPeca_01, valorUnitarioPeca_02;
		double valorPecas_01, valorPecas_02, valorTotalCompra;

		codigoPeca_01 = sc.nextInt();
		numeroPeca_01 = sc.nextInt();
		valorUnitarioPeca_01 = sc.nextDouble();

		// String proxLinha = aux.nextLine();

		codigoPeca_02 = sc.nextInt();
		numeroPeca_02 = sc.nextInt();
		valorUnitarioPeca_02 = sc.nextDouble();

		// Cálculos
		valorPecas_01 = (numeroPeca_01 * valorUnitarioPeca_01);
		valorPecas_02 = (numeroPeca_02 * valorUnitarioPeca_02);
		valorTotalCompra = valorPecas_01 + valorPecas_02;

		System.out.printf("Valor a pagar: %.2f", valorTotalCompra);

		sc.close();
	}

	public void exercicio06() {
		/*
		 * Fazer um programa que leia três valores com ponto flutuante de dupla
		 * precisão: A, B e C. Em seguida, calcule e mostre: a) a área do triângulo
		 * retângulo que tem A por base e C por altura. b) a área do círculo de raio C.
		 * (pi = 3.14159) c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B. e) a área do retângulo que tem lados A
		 * e B.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C; // Double possui precisão dupla, 64Bits.
		double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		// a) a área do triângulo retângulo que tem A por base e C por altura.
		areaTriangulo = (A * C) / 2;

		// b) a área do círculo de raio C. (pi = 3.14159)
		areaCirculo = Math.pow(C, 2) * Math.PI;

		// c) a área do trapézio que tem A e B por bases e C por altura.
		areaTrapezio = ((A + B) * C) / 2;

		// d) a área do quadrado que tem lado B.
		areaQuadrado = Math.pow(B, 2);

		// e) a área do retângulo que tem lados A e B.
		areaRetangulo = A * B;

		System.out.printf("\nTriângulo: %.3f", areaTriangulo);
		System.out.printf("\nCírculo: %.3f", areaCirculo);
		System.out.printf("\nTrapézio: %.3f",areaTrapezio);
		System.out.printf("\nQuadrado: %.3f", areaQuadrado);
		System.out.printf("\nRetângulo: %.3f", areaRetangulo);
		
		sc.close();

	}
}
