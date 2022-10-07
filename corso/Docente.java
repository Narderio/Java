public class Docente
{
	private String nome;
	private String cognome;
	private String materia;
	public Docente(String nome, String cognome, String materia)
	{
		this.nome=nome;
		this.cognome=cognome;
		this.materia=materia;

	}

	public void setNome(String nome)
	{
		this.nome=nome;
	}

	public void setCognome(String cognome)
	{
		this.cognome=cognome;
	}

	public String getNome()
	{
		return nome;
	}

	public String getCognome()
	{
		return cognome;
	}

	public void setMateria(String materia)
	{
		this.materia=materia;
	}

	public String getMateria()
	{
		return materia;
	}

	public void stampaInfo()
	{
		System.out.println("Sono "+ nome + " "+ cognome + ". Insegno e':"+ materia);

	}

	
}

