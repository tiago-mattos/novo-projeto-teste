package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEstruturaCondicional {

	public static void main(String[] args) {
		ExercicioEstruturaCondicional executar = new ExercicioEstruturaCondicional();
		// executar.exercicioFixacao();
		// executar.exercicio01();
		// executar.exercicio02();
		// executar.exercicio03();
		// executar.exercicio04();
		// executar.exercicio05();
		// executar.exercicio06();
		// executar.exercicio07();
		executar.exercicio08();

	}

	public void exercicioFixacao() {
		/*
		 * Fazer um programa para ler três números inteiros na mesma linha, separados
		 * por espaço em branco. Em seguida, mostrar na tela qual é o maior dos números
		 * lidos. Se houver empate, mostrar apenas um.
		 */

		Scanner sc = new Scanner(System.in);
		int X, Y, Z;

		X = sc.nextInt();
		Y = sc.nextInt();
		Z = sc.nextInt();

		if (X > Y && X > Z) {
			
			System.out.printf("Maior = %d", X);
			
		} else if (Y > X && Y > Z) {
			
			System.out.printf("Maior = %d", Y);
			
		} else {
			
			System.out.printf("Maior = %d", Z);

		}

		sc.close();

	}

	public void exercicio01() {
		/*
		 * Fazer um programa para ler um número inteiro, e depois dizer se este número é
		 * negativo ou não.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um número inteiro: ");
		
		int numero = sc.nextInt();

		if (numero < 0) {
			
			System.out.println("Negativo!");
			
		} else {
			
			System.out.println("Não negativo!");
			
		}
		sc.close();
	}

	public void exercicio02() {
		/*
		 * Fazer um programa para ler um número inteiro e dizer se este número é par ou
		 * ímpar.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um número inteiro: ");
		int numero = sc.nextInt();

		if (numero % 2 == 0) {
			
			System.out.println("Par!");

		} else {
			
			System.out.println("Impar!");
		}
		sc.close();
	}

	public void exercicio03() {
		/*
		 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
		 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
		 * múltiplos entre si. Atenção: os números devem poder ser digitados em ordem
		 * crescente ou decrescente.
		 */

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		if (A % B == 0 || B % A == 0) {
			System.out.println("São múltiplos!");
		} else {
			System.out.println("Não são múltiplos!");
		}

	}

	public void exercicio04() {
		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
		 * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
		 * uma duração mínima de 1 hora e máxima de 24 horas.
		 */
		Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt();

		int horaFinal = sc.nextInt();

		int duracao;

		if (horaInicial < horaFinal) {

			duracao = horaFinal - horaInicial;

		}

		else {

			duracao = 24 - horaInicial + horaFinal;

		}

		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		sc.close();

	}

	public void exercicio05() {
		/*
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e
		 * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
		 */

		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();

		int quantidade = sc.nextInt();

		double total;

		if (codigo == 1) {

			total = quantidade * 4.0;

		}

		else if (codigo == 2) {

			total = quantidade * 4.5;

		}

		else if (codigo == 3) {

			total = quantidade * 5.0;

		}

		else if (codigo == 4) {

			total = quantidade * 2.0;

		}

		else {

			total = quantidade * 1.5;

		}

		System.out.printf("Total: R$ %.2f%n", total);

		sc.close();
	}

	public void exercicio06() {
		/*
		 * Você deve fazer um programa que leia um valor qualquer e apresente uma
		 * mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75],
		 * (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum
		 * destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
		 */
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double numero = sc.nextDouble();

		if (numero < 0.0 || numero > 100.0) {

			System.out.println("Fora de intervalo");

		}

		else if (numero <= 25.0) {

			System.out.println("Intervalo [0,25]");

		}

		else if (numero <= 50.0) {

			System.out.println("Intervalo [25,50]");

		}

		else if (numero <= 75.0) {

			System.out.println("Intervalo [50,75]");

		}

		else {

			System.out.println("Intervalo [75,100]");

		}

		sc.close();
	}

	public void exercicio07() {
		/*
		 * Leia 2 valores com uma casa decimal (x e y), que devem representar as
		 * coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao
		 * qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem
		 * (x = y = 0). Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o
		 * ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
		 * situação.
		 */

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();

		double y = sc.nextDouble();

		if (x == 0.0 && y == 0.0) {

			System.out.println("Origem");

		}

		else if (x == 0.0) {

			System.out.println("Eixo Y");

		}

		else if (y == 0.0) {

			System.out.println("Eixo X");

		}

		else if (x > 0.0 && y > 0.0) {

			System.out.println("Q1");

		}

		else if (x < 0.0 && y > 0.0) {

			System.out.println("Q2");

		}

		else if (x < 0.0 && y < 0.0) {

			System.out.println("Q3");

		}

		else {

			System.out.println("Q4");

		}

		sc.close();
	}

	public void exercicio08() {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();

		double imposto;

		if (salario <= 2000.0) {

			imposto = 0.0;

		}

		else if (salario <= 3000.0) {

			imposto = (salario - 2000.0) * 0.08;

		}

		else if (salario <= 4500.0) {

			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;

		}

		else {

			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;

		}

		if (imposto == 0.0) {

			System.out.println("Isento");

		}

		else {

			System.out.printf("R$ %.2f%n", imposto);

		}

		sc.close();
	}
}
