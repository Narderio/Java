import java.lang.*;
import java.util.Scanner;

public class Test
{
	public static void main(String[] args)
	{


		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci il nome del corso:");
		String nome= new String(input.nextLine());
		Corso1 corso=new Corso1(nome);
		
/*
		System.out.print("Inserisci il nome del docente:");
		String nome= new String(input.nextLine());
		
		System.out.print("Inserisci il cognome del docente:");
		String cognome= new String(input.nextLine());
		
		System.out.print("Inserisci la materia del docente:");
		String materia= new String(input.nextLine());*/
		
		System.out.println("Creo un docente!");
		Docente d=new Docente("Omero", "Vitali", "Java");
		//d.setNome("dario");
		corso.setDocente(d);
		


		
		Studente s1= new Studente("Dario", "Nardella", 25.5f);
		Studente s2= new Studente("Alessandro", "Napolitano", 30f);
		corso.aggiungiStudente(s1);
		corso.aggiungiStudente(s2);
		corso.stampaInfo();
		System.out.println("La media dei voti degli studenti e':"+ corso.mediaStudenti());

		System.out.println("Rimuovo il secondo studente");
		corso.rimuoviStudente(0);
		corso.stampaInfo();

	}

}

