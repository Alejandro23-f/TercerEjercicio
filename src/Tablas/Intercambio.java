package Tablas;


import java.util.Scanner;

public class Intercambio 
{

	public static void main(String[] args) 
	{
		int tabla []=new int [10];
		int i, j , aux;
		Scanner teclado = new Scanner(System.in);

		for (i=0;i<=9;i++)
		{
			System.out.println("Dame un n�mero entero");
			tabla [i] = teclado.nextInt();
		}
		for (i =0; i<=9;i++)
		{
			for (j=0;j<=9;j++)
			{
				if (tabla[i] < tabla[j])
				{
					aux = tabla [i];
					tabla[i] = tabla[j];
					tabla[j] = aux;
				}
			}
		}
		System.out.println("La tabla ordenada queda as�:");
		for (i=0; i<=9; i++)
		{
			System.out.println(tabla[i]);
		}
		teclado.close();
	}
}
