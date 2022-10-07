import java.lang.*;
import java.util.Scanner;


public class Test
{
	public static void main(String[] args)
	{
		Item it= new Item();
		System.out.println("Valori normali:");
		System.out.println(it.description);
		System.out.println(it.color);
		System.out.println(it.size);
		System.out.println(it.price);

		it.description="e' lungo e fa felice le donne";
		it.color="e' rosa";
		it.size='8';
		it.price=500;
		System.out.println("\n\nvalori modificati");	
		System.out.println(it.description);
		System.out.println(it.color);
		System.out.println(it.size+" centimetri:");
		System.out.println("La "+it.price+" euro");
	}

}


