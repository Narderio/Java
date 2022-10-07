import java.util.ArrayList;
public class Corso1
{
    private String nome;
    private Docente docente;
    private ArrayList<Studente> studenti= new ArrayList<Studente>();

	public Corso1(String nome)
	{
		this.nome=nome;
	}

	public void setNome(String nome)
	{
		this.nome=nome;
	}

	public String getNome()
	{
		return nome;
	}

	public void setDocente(Docente d)
	{
		this.docente=d;
	}


	public Docente getDocente()
	{
		return docente;
	}


	public void aggiungiStudente(Studente s)
	{
		if(studenti.size()<20)
			studenti.add(s);
		
	}

	public void rimuoviStudente(int indice)
	{
		studenti.remove(indice);
	}

	public void stampaInfo()
	{
		System.out.println("Il corso si chiama:"+ nome +". Il docente e':"+ docente.getNome()+" "+ docente.getCognome()+". Gli studenti sono:");
		for(int x=0; x<studenti.size();x++)
 		{
				System.out.println(studenti.get(x).getNome());
		}
	}

	public float mediaStudenti()
	{
		float media=0;
		int x; 
		for(x=0; x<studenti.size();x++)
			media+=studenti.get(x).getMediaVoti();

		System.out.println("IL totale e':"+media);
		System.out.println("La X vale:"+ x);
		return media/x;
	}




}

