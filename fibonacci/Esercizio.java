import java.lang.*;
import java.util.Scanner;


public class Esercizio
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci un numero:");
		int num= input.nextInt();
		int a=1,b=1;
		int somma=a+b;
		System.out.print("0,");
		for(int i=0;i<num-3;i++)
		{
			if(i==0)
				System.out.print(a + ","+b+","+somma+",");
			else
			{
				if(i==num-4)
					System.out.print(somma);
				else
					System.out.print(somma+",");
			}
			a=b;
			b=somma;
			somma=a+b;
		}
		



	}

}




