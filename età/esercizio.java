import java.lang.*;
import java.util.Scanner;

public class Esercizio
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci l'eta':");
		int eta= input.nextInt();
		

		System.out.println("Inserisci il nome:");
		String nome= input.next();

		System.out.println("Il mio nome e':"+ nome);
		System.out.println(nome+ " ha "+ eta+" anni");
		
		int giorniAnno=365;
		int oreGiorno=24;
		int minutiOra=60;
		int secondiMinuto=60;
		int millisecondiSecondo=1000;

		int giorni=giorniAnno*eta;
		
		int minuti=eta*giorniAnno*oreGiorno*minutiOra;//anni totali*giorni dell'anno*ore del giorno*minuti per ora
		
		long secondi=(long)eta*giorniAnno*oreGiorno*minutiOra*secondiMinuto;//anni totali*giorni dell'anno*ore del giorno*minuti per ora*secondi per minuto
		
		long millisecondi=eta*giorniAnno*oreGiorno*minutiOra*secondiMinuto*millisecondiSecondo;//anni totali*giorni dell'anno*ore del giorno*minuti per ora*secondi per minuto*1000
		
		
		System.out.println("Giorni:"+giorni);
		System.out.println("minuti:"+minuti);
		System.out.println("Secondi:"+secondi);
		System.out.println("millisecondi:"+millisecondi);

	}	


}

