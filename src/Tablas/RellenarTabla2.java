package Tablas;

import java.util.Scanner;

public class RellenarTabla2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tabla[] = new int[4];  //Aquí si va posición 4
		int i;
		for (i=0;i<=3;i++)  //Aunque sean 4 números, el 0 cuenta, así que aquí solo vamos hasta <=3
		{

			Scanner teclado = new Scanner(System.in);
			for(i=0;i<3;i++)
			{
				tabla[i]=0;
			}
			for (i=0;i<=3;i++)
			{
				System.out.println("Ingrese el valor de la posición: "+i);
				tabla[i] = teclado.nextInt();
			}
			for(i=0;i<3;i++)  //Un tercer for para mostrar los resultados de la tabla
			{
				System.out.println(tabla[i]);
			}
			teclado.close();
		}
	}

}
