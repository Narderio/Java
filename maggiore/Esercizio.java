import java.lang.*;
import java.util.Scanner;


public class Esercizio
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci il primo numero:");
		int primo= input.nextInt();
		System.out.println("Inserisci il secondo numero:");
		int secondo= input.nextInt();
		System.out.println("Inserisci il terzo numero:");
		int terzo = input.nextInt();
		if (primo==secondo || secondo==terzo || terzo==primo)
			{
				System.out.println("Inserire valori diversi!!");
				System.exit(0);
			}
		int maggiore,minore;

		
		//maggiore
		if (primo>secondo && primo>terzo)
			maggiore=primo;
		
		else if (secondo>primo && secondo >terzo)
			maggiore= secondo;
		else 
			maggiore = terzo;

		//minore
		if (primo<secondo && primo<terzo)
			minore=primo;
		else if (secondo<primo && secondo<terzo)
			minore=secondo;
		else
			minore=terzo;
		
		
		/*metodo alternativo
		if (primo>secondo)
		{
			maggiore=primo;
			minore=secondo;
			if (primo>terzo)
			{
				if(terzo>secondo)
					minore=secondo;
				else
					minore=terzo;
			}
			else 
			{
				maggiore=terzo;
			}
		}
		else
		{
			maggiore=secondo;
			minore=primo;
			if(secondo>terzo)
			{
				if(terzo>primo)
					minore=primo;
				else
					minore=terzo;
			}
			else 
				maggiore=terzo;
		}*/
	System.out.println("Il numero maggiore e':"+ maggiore+". Il numero minore è:"+minore);
	}

}


