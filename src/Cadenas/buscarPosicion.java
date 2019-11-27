package Cadenas;

import java.util.Scanner;

public class buscarPosicion {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		String frase;
		int posicion, longitudSinEspacios;
		System.out.println("Indique una frase");
		frase = teclado.nextLine(); //Aquí poner nextLine en lugar de Next.... porque Next solo sirve para una palabra y NextLine para una frase
		longitudConEspacios = calcularLongitud1(frase);
		System.out.println("Longitud con espacios:" + longitudConEspacios);
		longitudSinEspacios = calcularLongitud2(frase);
		System.out.println("Longitud sin espacios:" +  longitudSinEspacios);
		teclado.close();

}
