package Tablas;

import java.util.Scanner;

public class Tablas1 {

	public static void main(String[] args)
	{
		int [] tabla = new int[5];   // Aqu� y en los apuntes, el primer corchete [] viene delante de tabla, pero tambi�n se puede poner detr�s
		int i;
		Scanner teclado = new Scanner(System.in);
		// Recorrido para rellenar la tabla
		for(i=0;i<5;i++)
		{
			System.out.println("Ingrese el valor de la posici�n: "+i);
			tabla[i] = teclado.nextInt();   //El corchete de tabla [] una vez escrito siempre se pone delante de tabla
		}
		// Recorrido para mostrar los valores de la tabla
		for(i=0;i<5;i++)
		{
			System.out.println("Tabla["+i+"]="+tabla[i]);
		}
		teclado.close();

	}

}
