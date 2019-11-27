package Cadenas;

import java.util.Scanner;

public class MayúsculasMinúsculas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena1;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Escriba una cadena");
		cadena1 = teclado.next();
		System.out.println("Escriba otra cadena");
		cadena1 = teclado.next();

		System.out.println(cadena1.length());
		System.out.println(cadena1.length());
		
		teclado.close();
	}
}
