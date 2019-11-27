package Tablas;

import java.util.Scanner;

public class Tabla2 {

	public static void main(String[] args) {

		{
			int tabla[] = new int[10];
			int i;
			Scanner teclado = new Scanner(System.in);
			// Recorrido para rellenar la tabla
			for(i=0;i<10;i++) // Un primer for le mete datos a la tabla
			{
				System.out.println("Ingrese el valor de la posición: "+i);
				tabla[i] = teclado.nextInt();
			}
			// Recorrido para tratar los elementos de la tabla
			for(i=0;i<10;i++) //Un segundo for le hace cosas a la tabla
			{
				tabla[i] = tabla[i]*2;   //Aquí ha cogido el número i , lo ha multiplicado por 2 y lo ha vuelto a meter en la tabla
			}
			// Recorrido para mostrar los valores de la tabla
			for(i=0;i<10;i++)  //Un tercer for para mostrar los resultados de la tabla
			{
				System.out.println("Tabla["+i+"]="+tabla[i]);
			}
			teclado.close();
		}
	}

}
