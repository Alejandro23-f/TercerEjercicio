package Cadenas;

import java.util.Scanner;

public class Igualdad {

	public static void main(String[] args) {
		String cadena1, cadena2;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Escriba una cadena");
		cadena1 = teclado.next();
		System.out.println("Escriba otra cadena");
		cadena2 = teclado.next();
		if(cadena1.equals(cadena2)) // Utilizamos el método equals (NO especifica en apuntes como usarlo)
		{
			System.out.println("Son iguales");
		}
		else
		{
			System.out.println("No son iguales");
		}
		teclado.close();
	}


}
