package Tablas;

import java.util.Scanner;
import java.util.Vector;
public class Suma2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Vector <Integer> tabla =new Vector <Integer>(10,1);  //EL vector hay que importarlo 
		// Adem�s, en los vectores no le ponemos numeros, ya que no sabemos que tama�o tendr� y le ponemos Integer, por integrales

		Scanner teclado = new Scanner(System.in);
		int numero;

		do // Con el do While este lo que hacemos es leer los n�meros
		{
			//Le preguntamos al usuario qu� va a meter
			System.out.println("Introducimos un n�mero entero (0 para salir)");
			numero= teclado.nextInt();
			if(numero=!0) //Aqu� falta seguir 
			{

				tabla.addElement(6);
			}while(numero!=0);

			System.out.println("Suma de valores: "+ sumar(tabla));
			teclado.close();

		}

		public static int sumar(Vector<Integer> v)
		{
			int suma = 0;
			//Recorrer el vector para calcular la suma
			for (int i = 0; i < v.size(); i++);
		}
		return (suma);
	}
}






