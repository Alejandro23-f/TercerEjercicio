package Cadenas;

import java.util.Scanner;

public class Subcadena {

	public static void main(String[] args) {
		String cadena;
		int longitud, posicion, aux;
		Scanner teclado = new Scanner (System.in);

		System.out.println("Escriba una frase");
		cadena = teclado.nextLine();
		System.out.println("Indique la posición en la que comienza la subcadena");
		posicion = teclado.nextInt();
		aux = cadena.length();
		System.out.println("Indique la longitud de la subcadena (<"+aux+")");  
		longitud = teclado.nextInt();
		
		System.out.println(subcadena (cadena,posicion,longitud));
		teclado.close();
	}
	public static String subcadena(String cadena, int posIni, int longi)	 
	{
		return (cadena.substring(posIni -1, (posIni+longi-1)));
	}

}
