import java.lang.*;
import java.util.Scanner;


public class Test
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		

		/*System.out.print("Primo esercizio: Investimento\n\n\n");
		System.out.println("Inserisci il denaro da investire:");
		double denaro= input.nextInt();
		System.out.println("Inserisci la percentuale di interessi annuali:");
		double interessi= input.nextInt();
		System.out.println("Inserisci gli anni di investimento:");
		int anni= input.nextInt();
		System.out.println("Il totale alla fine e':"+Metodi.invest(denaro,interessi,anni));
*/
		/*System.out.print("\n\n\nSecondo esercizio: Spazi\n\n\n");
		System.out.println("Inserisci una stringa:");
		String stringa= new String(input.nextLine());
		System.out.println("Inserisci il numero di spazi:");
		int spazi= input.nextInt();
		System.out.println("La stringa diventa:"+Metodi.space(stringa, spazi));
		*/

		System.out.println("\n\n\nTerzo esercizio: Data Precedente");
		System.out.println("\t\tPRIMA DATA");
		System.out.println("Inserisci l'anno:");
		int a1= input.nextInt();
		System.out.println("Inserisci il mese:");
		int m1= input.nextInt();
		System.out.println("Inserisci il giorno:");
		int g1= input.nextInt();
		System.out.println("\t\tSECONDA DATA");
		System.out.println("Inserisci l'anno:");
		int a2= input.nextInt();
		System.out.println("Inserisci il mese:");
		int m2= input.nextInt();
		System.out.println("Inserisci il giorno:");
		int g2= input.nextInt();
		if(Metodi.dataPrecedente(g1,m1,a1,g2,m2,a2)==true)
			System.out.println("La data è precedente o uguale!");
		else 
			System.out.println("La data è maggiore");


		/*System.out.println("\n\n\n Quarto esercizio:Stretch");
		System.out.print("Inserisci una stringa:");
		String stringa= new String(input.nextLine());
		System.out.print("Inserisci il numero che indica le ripetizioni:");
		int num= input.nextInt();		
		System.out.println("Il risultato e':"+ Metodi.stretch(stringa,num));
*/

		/*System.out.println("Inserisci gli anni:");
		int anni=input.nextInt();
		System.out.println("Inserisci i mesi:");
		int mesi=input.nextInt();
		System.out.println("Inserisci i giorni:");
		int giorni=input.nextInt();
		System.out.println("Inserisci le ore:");
		int ore=input.nextInt();
		System.out.println("Inserisci i minuti:");
		int minuti=input.nextInt();
		System.out.println("Inserisci i secondi:");
		int secondi=input.nextInt();
		System.out.println("Minuti+secondi:"+Metodi.calcolaSecondi(minuti,secondi));
		System.out.println("Ore+Minuti+secondi:"+Metodi.calcolaSecondi(ore,minuti,secondi));
		System.out.println("Giorni+ore+Minuti+secondi:"+Metodi.calcolaSecondi(giorni,ore,minuti,secondi));
		System.out.println("Mesi+giorni+ore+Minuti+secondi:"+Metodi.calcolaSecondi(mesi,giorni,ore,minuti,secondi));
		System.out.println("Anni+mesi+giorni+ore+Minuti+secondi:"+Metodi.calcolaSecondi(anni,mesi,giorni,ore,minuti,secondi));*/
		
		
		

	}

}


