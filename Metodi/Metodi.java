public class Metodi
{
	public static double invest(double denaro, double interessi, int anni )
	{
		for (int x=0; x<anni;x++)
			denaro=denaro+((denaro/100)*interessi);
		return denaro;
	}

	public static String space(String stringa, int spazi )
	{	
		String stringa2=new String("");
		for (int x=0;x<stringa.length();x++)
		{
			stringa2+=stringa.charAt(x);
			for (int k=0;k<spazi;k++)
					stringa2+=" ";
		}
		return stringa2;
	}


	public static boolean dataPrecedente(int g1, int m1, int a1, int g2, int m2, int a2)
	{	
		//calcolo più veloce che al posto di trovare il minore calcola in numero di giorni passati dalla data 0000/00/00.
		int giorni1=(a1*365)+(m1*30)+g1;//12/04/2000
		int giorni2=(a2*365)+(m2*30)+g2;//12/05/2000

		if (giorni1<=giorni2)
			return true;
		return false;
		/*if (a1==a2 && m1==m2 && g1==g2)
			return true;
		if (a1<a2)
			return true;
		else 
			{
				if(a1==a2)
				{
					if(m1<m2)
						return true;
					else 
					{
						if(m1==m2)
							if (g1<g2)
								return true;
					}


				}

			}		

		return false;*/
	}

	public static String stretch(String stringa, int num)
	{
		String stringa2=new String("");
		for (int x=0;x<stringa.length();x++)
		{
			stringa2+=stringa.charAt(x);
			if (x==0 || x==stringa.length()-1)
			for (int k=0;k<num;k++)
					stringa2+=stringa.charAt(x);
		}
		return stringa2;


	}

	public static long calcolaSecondi(int minuti, int secondi)
	{
		long tempo=(minuti*60l)+secondi;
		return tempo;
	}

	public static long calcolaSecondi(int ore,int minuti, int secondi)
	{
		long tempo=(ore*60l) +(minuti*60l) +secondi;
		return tempo;
	}

	public static long calcolaSecondi(int giorni,int ore, int minuti, int secondi)
	{
		long tempo=(giorni*24l*60*60)+calcolaSecondi(ore, minuti, secondi);
		return tempo;
	}

	public static long calcolaSecondi(int mesi, int giorni, int ore,int minuti, int secondi)
	{
		long tempo=(mesi*30l*24*60*60)+calcolaSecondi(giorni, ore, minuti, secondi);
		return tempo;
	}

	public static long calcolaSecondi(int anni,int mesi, int giorni, int ore, int minuti, int secondi)
	{
		long tempo=(anni*365l*24*60*60)+calcolaSecondi(mesi, giorni, ore, minuti, secondi);
		return tempo;
	}

}


