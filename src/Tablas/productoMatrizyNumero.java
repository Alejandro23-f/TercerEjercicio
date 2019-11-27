package Tablas;

import java.util.Scanner;

public class productoMatrizyNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tabla1 [][]=new int [3][3];
		int resultado [][] = new int [3][3];
		int numero;

		Scanner teclado = new Scanner(System.in);
		for (int i =0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				resultado[i][j]= tabla1[i][j]*numero;
			}
		}
		for (int i =0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.println(resultado[i][j]+ " ");
			}
			System.out.println();
		}
		teclado.close();
	}
}
