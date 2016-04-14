package cuadradoMagico;

import java.util.Scanner;

public class CuadradoMagico
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int orden;
		int num = 1;
		System.out.print("Introduce orden impar para generar cuadrado mágico: ");
		orden = sc.nextInt();
		sc.close();
		int[][] cuadradoM = new int [orden][orden];		
		int fila = 0;
		int col = (orden - 1) / 2;
		do
		{
			if(cuadradoM[fila][col] == 0)
			{
				cuadradoM[fila][col] = num;
				fila--;
				col++;
				num++;
				if(fila < 0)
					fila = orden - 1;
				if(col > orden - 1)
					col = 0;
			}		
			else
			{
				fila += 2;
				col--;
				if(fila == orden)
					fila = 0;
				if(fila == orden + 1)
					fila = 1;
				if(col < 0)
					col = orden - 1;					
			}
		}
		while(cuadradoM[orden - 1][(orden - 1) / 2] == 0);
		for(fila = 0; fila < cuadradoM.length; fila++)
		{
			for(col = 0; col < orden; col++)
			{
				System.out.print(cuadradoM[fila][col] + "\t");
			} 
			System.out.println();
		}	
	}
}

