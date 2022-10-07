import java.lang.*;
import java.util.Scanner;


public class Test
{

	public static void nomi()
	{




	}


	public static void stampamatrice()
	{
		
			for( int j=0;j<2;j++)
			{
				System.out.println("  |  |  ");
				System.out.print("__|__|__");
				System.out.println("");
			}
			System.out.println("  |  |  ");
		
	}



	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String g1= new String() ;
		String g2= new String() ;
		int mossa;
		int [] mosse= new int[9];
		int [] mosse1= new int[5];
		int [] mosse2= new int[5];
		
		System.out.print("Inserire il nome del primo giocatore:");
		g1=input.nextLine();

		System.out.print("Inserire il nome del secondo giocatore:");
		g2=input.nextLine();
		
		
		stampamatrice();	
/*
		System.out.println("Primo giocatore:"+ g1);
		System.out.println("Inserire la posizione(1-9):");
		mossa=input.nextInt();
		mosse1[mo]

*/
		System.out.println("Mossa 1:"+mosse[0]);
		System.out.println("Primo giocatore:"+ g2);




	}

}


