package Tablas;

import java.util.Scanner;

public class Seleccion {

	public static void main(String[] args)
	{
		int tabla []=new int [10];
		int i, indice_menor, j, aux;
		Scanner teclado = new Scanner(System.in);

		for (i=0;i<=9;i++)
		{
			System.out.println("Dame un n�mero entero");
			tabla [i] = teclado.nextInt();
		}
		for (i =0; i<9;i++)
		{
			indice_menor=i;

			for (j=i+1;j<=9;j++)
			{
				if (tabla[j] < tabla[indice_menor])
				{
					indice_menor = j;
				}
			}
			aux = tabla [i];
			tabla[i] = tabla[indice_menor];
			tabla[indice_menor] = aux;
		}

		System.out.println("La tabla ordenada queda as�:");
		for (i=0; i<=9; i++)
		{
			System.out.println(tabla[i]);
		}
		teclado.close();
	}
}
