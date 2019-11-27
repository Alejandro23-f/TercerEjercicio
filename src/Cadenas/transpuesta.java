package Cadenas;

import java.util.Scanner;

public class transpuesta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tabla [][]=new int [3][3];
		int traspuesta [][] = new int [3][3];
		

		Scanner teclado = new Scanner(System.in);
		
		//Asignar lops valores de i,j a j,i
		for (int i =0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				traspuesta[i][j] = tabla [j][i];
			}
		}
		for (int i =0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.print(traspuesta[i][j]+" ");
			}
			System.out.println();
			teclado.close();
		}
	}

}
