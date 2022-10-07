import java.lang.*;
import java.util.Scanner;


public class Esercizio
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci un anno:");
		int anno= input.nextInt();
		
		if ((anno%4==0  && anno%100!=0) || (anno%400==0)) 
		{
			System.out.println("Anno bisestile");	
		}
		else
			System.out.println("Anno non bisestile");
	}

}


