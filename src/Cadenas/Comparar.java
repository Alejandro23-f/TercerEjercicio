package Cadenas;

import java.util.Scanner;

public class Comparar {

	public static void main(String[] args) {

		String cadena1, cadena2;
		int i;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Escriba una cadena");
		cadena1 = teclado.next();
		System.out.println("Escriba otra cadena");
		cadena2 = teclado.next();
		teclado.close();

		i = cadena1.compareTo(cadena2);  // Este comando es el que usamos para comparar ALFAB�TICAMENTE

		if (i <0)
		{
			System.out.println("La primera palabra es mayor alfab�ticamente");
		}
		else if (i>0)
		{
			System.out.println("La segunda palabra es la mayor alfab�ticamente");
		}
		else
		{
			System.out.println("Ambas cadenas son iguales alfab�ticamente");
		}
	}
}

