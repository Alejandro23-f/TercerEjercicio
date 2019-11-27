package Tablas;

import java.util.Random;
import java.util.Scanner;

public class Buscar {
//ESTA ESTA MAL COPIADA , MAL MAL
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tabla []=new int [100];
		int i, numero;
		boolean encontrado = false;
		Random aleatorio = new Random(); 
		Scanner teclado = new Scanner(System.in);
		//recorremos la tabla e introducimos valores
		for(i=0; i<100;i++)  //Creamos 100 número aleatorios del 1 al 100
		{
			tabla[i]=aleatorio.nextInt(100)+1;
		}


		System.out.println("Qué número quieres buscar?");
		numero = teclado.nextInt();
		for (i=0;i<100;i++)
		{
			if(numero==tabla[i])
			{
				System.out.println("El número está en la posición " +i);
				encontrado = true;
			}
		}
		if(!encontrado)
		{
			System.out.println("El número No está en la tabla");
		}
		teclado.close();
	}

}


