import java.lang.*;
import java.util.Scanner;


public class Esercizio
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci un numero per il mese:");
		int mese= input.nextInt();
		System.out.println("Inserisci un numero per il giorno:");
		int giorno= input.nextInt();
		if (mese<0 || mese>12)
		{
			System.out.println("Errore!!");
			System.exit(0);

		}
		if ((mese==1 || mese==3 || mese==5 || mese==7 || mese==8 || mese==10 || mese==12) && giorno>31)
			{
				System.out.println("Errore!!Inserire mesi e giorni validi");
				System.exit(0);
			}

		else if (mese==2 && giorno>28)
			{
				System.out.println("Errore!!Inserire mesi e giorni validi");
				System.exit(0);
			}

		else if ((mese==4 || mese==6 || mese==9 || mese==11) && giorno>30)
			{

				System.out.println("Errore!!Inserire mesi e giorni validi");
				System.exit(0);
			}
			
		int treUno=31, treZero=30, dueOtto=28;
		int giorniPassati=0;

		switch(mese)
		{
		case 12:
				giorniPassati=giorniPassati+treZero;
		case 11:
				giorniPassati=giorniPassati+treUno;
		case 10: 
				giorniPassati=treZero+giorniPassati;
		case 9: 
				giorniPassati=treUno+giorniPassati;
		case 8: 
				giorniPassati=treUno+giorniPassati;
		case 7: 
				giorniPassati=treZero+giorniPassati;
		case 6: 
				giorniPassati=treUno+giorniPassati;
		case 5: 
				giorniPassati=treZero+giorniPassati;
		case 4: 
				giorniPassati=treUno+giorniPassati;
		case 3: 
				giorniPassati=dueOtto+giorniPassati;
		case 2: 
				giorniPassati=treUno+giorniPassati;
		case 1: 
				giorniPassati=giorniPassati + giorno;
				break;
		}
		System.out.println("I giorni giorni passati sono:"+ giorniPassati);
		
		
	}

}


