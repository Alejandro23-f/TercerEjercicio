package Cadenas;

import java.util.Scanner;

public class CambiarAporO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		String texto1;
		System.out.println("Escriba un texto:");
		texto1=teclado.nextLine();
		texto1.replace('a', 'o'); //Esto es lo que se usa  para sutituir, el replace
		System.out.println(	texto1.replace('a', 'o'));
		teclado.close();
		
	}
}
		
				
			