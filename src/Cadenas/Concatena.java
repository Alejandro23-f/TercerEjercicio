package Cadenas;

import java.util.Scanner;

public class Concatena {

	public static void main(String[] args)
	{
		String cadena1, cadena2, cadena3;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Escriba una cadena");
		cadena1 = teclado.next();
		System.out.println("Escriba otra cadena");
		cadena2 = teclado.next();
		cadena3 = cadena1 + cadena2;
		System.out.println(String.format("La cadena \"%s\" concatenada con la cadena \"%s\" resulta \"%s\"",cadena1, cadena2, cadena3));
		//Para que en el resultado no se vea feo, podemos ponerle dentro de las comillas esto ''   o usar \ \ 
		teclado.close();
	}

}
