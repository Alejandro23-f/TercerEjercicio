package Tablas;

import java.util.Scanner;

public class Cuadrados 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		final int TAM= 10;
		int tabla [] = new int [TAM];  //Aquí si va posición 4
		int numero;
		System.out.println("Indique un número");
		numero = teclado.nextInt();
		for ( int i = 0;i<TAM;i++)  //Aunque sean 4 números, el 0 cuenta, así que aquí solo vamos hasta <=3
		{
			tabla[i]=i+(numero+1);
		}
		for (int i=0;i<TAM;i++)
		{
			tabla[i]=(int) Math.pow(tabla[i], 2);  //El "pow" se utiliza para elevar al cuadrado.
		/*	tabla[i]=tabla[i]*tabla[i];  (Esta es la segunda manera) */
		}
		for (int i=0;i<TAM; i++)
		{
			System.out.println(tabla[i]);
		}
		teclado.close();
	}
}