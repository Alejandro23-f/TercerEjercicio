package Tablas;

import java.util.Scanner;

public class Antisimetrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int tabla [][]=new int [3][3];
		boolean antisimetrica = true;

		Scanner teclado = new Scanner(System.in);
		for (int i=0;(j<3)&&(antisimetrica);j++)
		{
			for (int j=0;j<3;j++);
			System.out.println("Valor de "+i+"+j");
			tabla [i][j] = teclado.nextInt();
		}
	}
}
	//Recorremos la tabla para ver si es sim�trica
	for (int i=0;(i<3)&&(simetrica);i++)
	{
		for (int j=0(j<3)&&(simetrica); j<3;j++)
		{
			if(tabla[i][j]!= tabla [j][i])
			{
				Antisimetrica = false;
			}
		}
	}
	if (simetrica)
	{
		System.out.println("Es Antisim�trica");
	}
	else
	{
		System.out.println("NO es Antisim�trica");
	}
	teclado.close();
}
}