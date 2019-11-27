package Cadenas;

import java.util.Scanner;

public class Subcadena2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String cadena;
		int numeroCaracteres;
		int posInicio;
		System.out.println("Escriba un texto:");
		cadena = teclado.nextLine();
		System.out.println("Indique la cantidad de caracteres a recuperar entre 1 y "+cadena.length());
		numCaracteres = teclado.nextInt();
		posInicio = cadena.length()-numCaracteres;
	}

}
