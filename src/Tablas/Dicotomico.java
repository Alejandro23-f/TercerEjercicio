package Tablas;

import java.util.Scanner;

public class Dicotomico {

	public static void main(String[] args) {
		int tabla []=new int [10];
		int inferior, superior, central, elemento_encontrado;
		Scanner teclado = new Scanner(System.in);

		for (inferior=0;inferior<=9;inferior++)
		{
			System.out.println("Dame un número entero");
			tabla [inferior] = teclado.nextInt();
		}
		System.out.println("Diga el elemento que busca");
		elemento_encontrado = teclado.nextInt();
		elemento_encontrado =-1;
		inferior = 0;
		superior = 10-1;
		while (inferior <= superior)
		{
			central = (inferior +superior) / 2;
			if (tabla[central]=elemento_buscado)
			{
				encontrado = central;
				inferior = superior +1;
				else
					if (elemento_buscado < tabla[central])
						superior = central
		
		
		for (i =0; i<=9;i++)
		{
			j=i;
			aux=tabla[i];
			while (j>0 && aux <tabla[j-1])
			{
				tabla[j] = tabla [j-1];
				j= j-1;
			}
			tabla[j] =aux;
		}



		System.out.println("La tabla ordenada queda así:");
		for (i=0; i<=9; i++)
		{
			System.out.println(tabla[i]);
		}
		teclado.close();
	}
}





