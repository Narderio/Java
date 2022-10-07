import java.lang.*;
import java.util.Scanner;


public class Esercizio
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci un numero:");
		String password= input.nextLine();

		if (password.length()>7)
			System.out.println("password salvata");
		else
			System.out.println("Password troppo corta!");
	}

}


