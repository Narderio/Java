import java.lang.*;
import java.util.Scanner;


public class Test
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		

		System.out.print("Inserisci il primo numero:");
		int a= input.nextInt();
		System.out.print("Inserisci il secondo numero:");
		int b= input.nextInt();
		System.out.print("Inserisci il terzo numero:");
		int c= input.nextInt();
		System.out.print("Inserisci il quarto numero:");
		int d= input.nextInt();


		//Calcolatrice calc =new Calcolatrice(); somma prodotto media maggiore minore
		System.out.println("La somma e':"+Calcolatrice.somma(a,b,c,d));
		System.out.println("Il prodotto e':"+Calcolatrice.prodotto(a,b,c,d));
		System.out.println("La media e':"+Calcolatrice.media(a,b,c,d));
		System.out.println("Il maggiore e':"+Calcolatrice.maggiore(a,b,c,d));
		System.out.println("Il minore e':"+Calcolatrice.minore(a,b,c,d));

	}

}


