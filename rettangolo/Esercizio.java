import java.lang.*;
import java.util.Scanner;


public class Esercizio
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci la larghezza del rettangolo:");
		int x= input.nextInt();

		System.out.println("Inserisci la lunghezza del rettangolo:");
		int y= input.nextInt();
		
		for(int i=0;i<y;i++)//rettangolo pieno
		{
			for(int j=0;j<x;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("\n\n");

		for(int i=0; i<y; i++)//rettangolo vuoto
		{
			for(int j=0; j<x; j++)
			{
				if(j==0 || i==0 || i==y-1 || j==x-1)
				System.out.print("*");
			else
				System.out.print(" ");
			}
			System.out.println("");
		}

	}

}


