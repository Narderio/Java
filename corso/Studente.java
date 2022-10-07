public class Studente
{
	private String nome;
	private String cognome;
	private float mediaVoti;

	public Studente(String nome, String cognome, float media)
	{
		this.nome=nome;
		this.cognome=cognome;
		this.mediaVoti=media;
	}

	public void setNome(String nome)
	{
		this.nome=nome;
	}

	public void setCognome(String cognome)
	{
		this.cognome=cognome;
	}

	public void setMediaVoti(float mediaVoti)
	{
		this.mediaVoti=mediaVoti;
	}

	public String getNome()
	{
		return nome;
	}

	public String getCognome()
	{
		return cognome;
	}
	
	public float getMediaVoti()
	{
		return mediaVoti;
	}

	public void stampaInfo()
	{
		System.out.println("Sono "+ nome + " "+ cognome + ". La mia media e':"+ mediaVoti);
	}


}

