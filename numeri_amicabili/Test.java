import java.lang.*;
import java.util.Scanner;


public class Test
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int [] amicabili=new int[20];//lista di tutti i numeri amicabili
		int corrente=0;//numero di cui si stanno cercando i divisori
		int [] divisori= new int[20];//tutti i divisori del numero


		while(corrente<20)//fin quando non ho trovato 10 coppie di amici
		{
			System.out.println("Ciao");
			for (int j=1; j<(corrente/2)+1;j++)//controllo tutti i divisori del numero corrente
			{
				if(corrente%j==0)
					divisori[corrente]+=j;//sommo tutti i divisori di corrente nell'array
			}
			corrente++;
		}
		System.out.println("Le somme dei divisori dei numeri sono:");
		for(int i=0;i<divisori.length;i++)
			System.out.println(divisori[i]);
		
	}

}


