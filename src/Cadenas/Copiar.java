package Cadenas;

import java.util.Scanner;

public class Copiar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner teclado = new Scanner (System.in);
		
		String texto1, texto2;
		System.out.println("Escriba un texto:");
		texto1=teclado.nextLine();
		teclado.close();
		texto2 = texto1;
		System.out.println("texto "+ texto2);
		teclado.close();
	
	}

}
