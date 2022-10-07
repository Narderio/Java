import java.lang.*;
import java.util.Scanner;

public class Esercizio
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci una stringa:");
		String lettera= input.next().substring(0,1);

		if (lettera.equalsIgnoreCase("a") || lettera.equalsIgnoreCase("e") || lettera.equalsIgnoreCase("i") || lettera.equalsIgnoreCase("o") || lettera.equalsIgnoreCase("u"))
			System.out.println("Vocale");
		else
			System.out.println("Consonante");
	}

}


