package Tablas;

import java.util.Scanner;

public class letraPorPosicion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char tabla1 [][]=new char [3][3];
		int tabla2 [][] = new int [3][3];
		int suma;

		Scanner teclado = new Scanner(System.in);

		//Asignar lops valores de i,j a j,i
		for (int i =0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.println("Valor de "+i+"-"+j);
				tabla1 [i][j] = teclado.nextInt();
			}
		}
		for (int i =0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.println("Valor de "+i+"-"+j);
				tabla2 [i][j] = teclado.nextInt();
			}
		}
		//Sumamos los valores 
		for ( int i =0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				suma [i][j] = tabla1[i][j] + tabla2[i][j];
			}
		}
		for ( int i = 0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.println(suma[i][j]+ " ");
			}
			System.out.println();
		}
		teclado.close();
	}


}


