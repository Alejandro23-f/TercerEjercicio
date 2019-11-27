package Cadenas;

import java.util.Scanner;

public class Nombres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
	String nombre1;
	String nombre2 ="";
	String nombre3 = new String();
	String nombre4 = new String ("");
	String nombre5;
	
	
		System.out.println("Escriba una cadena");
		nombre1 = teclado.next();
		System.out.println("Escriba una cadena");
		nombre2 = teclado.next();
		System.out.println("Escriba una cadena");
		nombre3 = teclado.next();
		System.out.println("Escriba una cadena");
		nombre4 = teclado.next();
		System.out.println("Escriba una cadena");
		nombre5 = teclado.next();
		System.out.println(String.format("Las cadenas son '%s', '%s', '%s', '%s' y \"%s\"", nombre1, nombre2, nombre3, nombre4, nombre5));
		//Para que en el resultado no se vea feo, podemos ponerle dentro de las comillas esto ''   o usar \ \ 
		teclado.close();

	}

}
