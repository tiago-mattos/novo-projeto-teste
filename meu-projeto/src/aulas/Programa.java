package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		/*
		 * Abrir tela de atalhos! Ctrl + Shift + L
		 */

		// Comentário única linha
		// Ctrl + Shift + C

		/*
		 * Comentário várias linhas Ctrl + Shift +
		 */

		Programa executar = new Programa();
		executar.imprimindoConsole();

	}

	public void tiposPrimitivos() {

		// De -128 a 127
		byte variavelByte;

		// true ou false
		boolean variavelBoolean;

		// ''A'' ou unicode '\u0041'
		char variavelChar;

		// Entre -2.147.483.648 e 2.147.483.647
		int variavelInt;

		// Entre -9.223.372.036.854.775.808L e 9.223.372.036.854.775.807L
		long variavelLong;

		// Entre -32.768 e 32.767
		short variavelShort;

		// 32Bits - 4.5f
		float variavelFloat;

		// 64Bits - 4.5
		double variavelDouble;

		// Declarando os tipos primitivos
		variavelByte = -128;
		variavelBoolean = true;
		variavelChar = '\u0041';
		variavelInt = 2147483647;
		variavelLong = 9223372036854775807L;
		variavelShort = 32767;
		variavelFloat = 4.5f;
		variavelDouble = 4.5;

		// Impressão
		System.out.println("Byte: " + variavelByte + "\n");
		System.out.println("Boolean: " + variavelBoolean + "\n");
		System.out.println("Char: " + variavelChar + "\n");
		System.out.println("Int: " + variavelInt + "\n");
		System.out.println("Long: " + variavelLong + "\n");
		System.out.println("Short: " + variavelShort + "\n");
		System.out.println("Float: " + variavelFloat + "\n");
		System.out.println("Double: " + variavelDouble + "\n");
	}

	public void tiposPorReferencia() {

		// Cadeia de Caracteres
		String variavelString;

		// Toda classe em java é uma subclasse de Object
		Object objeto;

		// Declarando os tipos por referência
		variavelString = "Lorem ipsum ullamcorper tristique";
		objeto = variavelString;

		// Impressão
		System.out.println("String: " + variavelString.toUpperCase() + "\n");
		System.out.println("Object: " + objeto + "\n");

	}

	public void converteFloatParaDouble() {
		double variavelDouble;
		float variavelFloat;
		int variavelInt;

		/*
		 * Pega o valor da variavelDouble, converte para (float) e atribui a
		 * variavelFloat
		 */
		variavelDouble = 5.7;
		variavelFloat = (float) variavelDouble;

		/*
		 * Pega o valor da variavelDouble, converte para (int) e atribui a variavelInt
		 */
		variavelInt = (int) variavelDouble;

		System.out.println(variavelInt);
	}

	public void imprimindoConsole() {
		
		String nome = "José";
		char sexo = 'M';
		int idade = 25;
		double peso = 81.78358;

		System.out.print("Lorem ipsum!");
		System.out.println("Lorem ipsum!");
		System.out.println("Lorem ipsum!");
		System.out.println("-------------------------------\n");
		
		System.out.printf("Peso: "+ "%.5f\n",peso);
		
		// Separador ponto (.)
		Locale.setDefault(Locale.US);
		System.out.printf("Peso: "+ "%.5f",peso);
		
		System.out.printf("\n%s tem %d anos do sexo %c e pesa %.2f quilos! ", nome, idade, sexo, peso );
		
	}
}
