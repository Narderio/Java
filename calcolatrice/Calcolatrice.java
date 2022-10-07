public class Calcolatrice
{
	public static int somma(int a,int b,int c, int d)
	{
		return (a+b+c+d);
	}

	public static float media(int a,int b,int c, int d)
	{
		return (((float)a+b+c+d)/4);
	}
	
	public static int maggiore(int a,int b,int c, int d)
	{
		if (a>b && a>c && a>d)
			return a;
		else 
			if (b>a && b>c && b>d)
				return b;
		else if (c>a && c>b && c>d)
				return c;
		else
				return d;
	}

	public static float minore(int a,int b,int c, int d)
	{
		if (a<b && a<c && a<d)
			return a;
		else 
			if (b<a && b<c && b<d)
				return b;
		else if (c<a && c<b && c<d)
				return c;
		else
				return d;
	}	

	public static int prodotto(int a,int b,int c, int d)
	{
		return (a*b*c*d);
	}

}


