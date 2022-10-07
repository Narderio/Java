import java.lang.*;
import java.util.Scanner;


public class Test
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int [] vett=new int[20];
		int num;
		int x=0;
		int corrente=0;

		while(x<20)
		{
			
			for (int j=1; j<corrente/2;j++)
			{
				if(corrente%)

			}
			vett[x] = input.nextInt();

			corrente++;
		}

		System.out.println("I numeri stampati sono:");
		for (int x=0; x<num;x++)
		{
			if ((x%2==0 && vett[x]%2==0)|| (x%2!=0 && vett[x]%2!=0))
				System.out.println(vett[x]);
		}
		
	}

}


