package Tablas;

import java.util.Scanner;

public class RellenarTabla3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int tabla[] = new int[4];  //Aqu� si va posici�n 4
		int i;
		Scanner teclado = new Scanner(System.in);
		for (i=0;i<=3;i++)  //Aunque sean 4 n�meros, el 0 cuenta, as� que aqu� solo vamos hasta <=3
		{
				tabla[i]=0;
			}
			for (i=3;i>=0;i--)     //Esta es la soluci�n adecuada, solo hace falta una
			{
				System.out.println("Ingrese el valor de la posici�n: "+i);
				tabla[i] = teclado.nextInt();
			}
			for(i=0;i<=3;i++)  //ESTO ES OTRA SOLUCION, NO ES NECESARIO PONERLO. Un tercer for para mostrar los resultados de la tabla
			{
				System.out.println(tabla[i]);
			}
			teclado.close();
		}
	}





