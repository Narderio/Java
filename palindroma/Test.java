import java.lang.*;
import java.util.Scanner;


public class Test
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String stringa=new String();//dichiaro stringa
		boolean palindroma=true;//setto la variabile boolean a false
		
		for (int k=0;k<args.length;k++)
			stringa=stringa+args[k];//concateno la stringa con i caratteri di args

		int j=(stringa.length()-1);//setto j all'ultima posizione dell'array
        char[] vettore = stringa.toCharArray();//metto i caratteri della stringa nell'array di char


		for (int x=0; x<stringa.length();x++){
			System.out.println("Le lettere sono:"+ vettore[x] +" "+ vettore[j]);
			if (vettore[x]!=vettore[j])//se il primo carattere è uguale all'ultimo....e poi si scorre(secondo con il penultimo ecc...)
				{
					//System.out.println("I caratteri sono diversi!");
					palindroma=false;//se sono diversi non è palindroma, altrimenti resta True come è stata settata
				}
			j--;
		}


		if (palindroma==true)
			System.out.println("La stringa è palindroma");
		else
			System.out.println("La stringa non è palindroma");
	}

}


