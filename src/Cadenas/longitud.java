package Cadenas;

import java.util.Scanner;

public class longitud {

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		String frase;
		int longitudConEspacios, longitudSinEspacios;
		System.out.println("Indique una frase");
		frase = teclado.nextLine(); //Aquí poner nextLine en lugar de Next.... porque Next solo sirve para una palabra y NextLine para una frase
		longitudConEspacios = calcularLongitud1(frase);
		System.out.println("Longitud con espacios:" + longitudConEspacios);
		longitudSinEspacios = calcularLongitud2(frase);
		System.out.println("Longitud sin espacios:" +  longitudSinEspacios);
		teclado.close();
	}

	public static int calcularLongitud1(String cadena)
	{
		int resultado = 0;
		resultado = cadena.length();
		// for (int i=0; i<cadena.length(); i++)    Resultado alternativo
		return resultado;
	}
	public static int calcularLongitud2(String cadena)
	{
		int resultado = 0;

		for (int i=0;i<cadena.length();i++)
		{
			if(cadena.charAt(i)!=' ')
			{
				resultado++;
			}
		}
		return resultado;
	}
}


