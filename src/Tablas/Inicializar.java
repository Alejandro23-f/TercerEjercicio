package Tablas;

public class Inicializar 
{

	public static void main(String[] args) 
	{

		final int TAM= 2;			/*De esta forma declaramos la constante, y la llamamos TAM.    AL colocar delante
								la particula final, declaramos que es imposible cambiar su valor, por tanto, ya no es variable */
		int tabla [] = new int [TAM];
		for (int i = 0;i<TAM;i++)
		{
			tabla[i]=0;
		}
		for (int i=0;i<tabla.length;i++)	//length comprueba el tama�o de la tabla	
			
			
			
			/*Gracias a colocar un TAM, si quisi�ramos cambiar un n�mero, solo lo har�amos arriba en lugar
													de en toda la tabla */
		{
			System.out.print(tabla[i]+" ");
		}
	}

}
