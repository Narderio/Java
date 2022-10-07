public class Corso
{
    private String nome;
    private Docente docente;
    private Studente [] studenti=new Studente[20];

	public Corso(String nome)
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
		for(int x=0; x<20; x++)
		{
			if(studenti[x]==null)
			{
				studenti[x]=s;
				break;
			}
		}
	}

	public void rimuoviStudente(int indice)
	{
		studenti[indice]=null;
	}

	public void stampaInfo()
	{
		System.out.println("Il corso si chiama:"+ nome +". Il docente e':"+ docente.getNome()+" "+ docente.getCognome()+". Gli studenti sono:");
		for(int x=0; x<studenti.length;x++)
 		{
 			if (studenti[x]!=null)
				System.out.println(studenti[x].getNome());
		}
	}

	public float mediaStudenti()
	{
		float media=0; 
		int j=0;
		for(int x=0; x<studenti.length;x++)
		{
			if (studenti[x]!=null)
				{
					media+=studenti[x].getMediaVoti();
					j++;
				}
		}
		System.out.println("IL totale e':"+media);
		System.out.println("La J vale:"+ j);
		return media/j;
	}




}

