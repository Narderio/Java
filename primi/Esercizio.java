import java.lang.*;
import java.util.Scanner;


public class Esercizio
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Inserisci quanti numeri cercare:");
		int num= input.nextInt();
		int numeroCorrente=1;
		int numeriTrovati=0;
		while(numeriTrovati<num)
		{
			if((numeroCorrente%2!=0 && numeroCorrente%3!=0 && numeroCorrente%5!=0 && numeroCorrente%7!=0 && numeroCorrente%11!=0 && numeroCorrente%13!=0 && numeroCorrente%17!=0 && numeroCorrente%19!=0 && numeroCorrente%23!=0 && numeroCorrente%29!=0)||(numeroCorrente==2 || numeroCorrente==3 || numeroCorrente==5 || numeroCorrente==7 || numeroCorrente==11 || numeroCorrente==13 || numeroCorrente==17 ||numeroCorrente==19 ||  numeroCorrente==23 || numeroCorrente==29))
			{	
				System.out.print(numeroCorrente+",");
				numeriTrovati++;
			}
		numeroCorrente++;
		}
		




	}

}




