package Tablas;

public class RellenarTabla {

	public static void main(String[] args) {

		int tabla[] = new int[20];
		{
			int i;     // ESTA ES UNA FORMA ALEATORIA DE HACER (o rellenar) LA TABLA
			for (i = 0; i < 20; i++)
			{
				tabla[i] =i*2;
			}
			for(i = 0; i< 20; i++)
			{
				System.out.println(tabla[i]);
			}
		}
	}

}
