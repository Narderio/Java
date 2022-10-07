import java.lang.*;
import java.util.Scanner;


public class Esercizio
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		while(true){
		int num=(int)(Math.random()*50);
		System.out.println("Num:"+num); //questo è il numero da indovinare
		int tentativi=5;
		boolean trovato=false;
		int x=0,n;

		while(x<tentativi && trovato==false)
		{
			System.out.print("Inserisci un numero:");
			n=input.nextInt();
			if (n==num)
			{
				trovato=true;
				System.out.println("Numero indovinato!! Tentativi usati:"+(x+1));

			}
			else
			{
				if(n<num)
					System.out.println("Il numero inserito è minore di quello da trovare");
				else
					System.out.println("Il numero inserito è maggiore di quello da trovare");
			}
			x++;
		}
		System.out.println("Vuoi ricominciare il gioco?1=Si/0=No");
		int scelta=input.nextInt();
		if(scelta==0)
			break;
		}
		


	}

}