import java.lang.*;
import java.util.Scanner;


public class Esercizio
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci un numero:");
		int num= input.nextInt();
		int q=num/2;
		int resto=q*2;	
		if (resto==num)
			System.out.println("Il numero è pari");
		else 
			System.out.println("Il numero è dispari");
	}

}


