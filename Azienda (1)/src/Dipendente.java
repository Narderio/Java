public class Dipendente
{
    private String nome;
    private String cognome;
    private double stipendio;

    public Dipendente()
    {

    }
    public Dipendente(String nome, String cognome, double stipendio)
    {
        this.nome=nome;
        this.cognome=cognome;
        this.stipendio=stipendio;
    }

    @Override
    public String toString()
    {
        String stringa="Nome: "+ nome + "; Cognome: "+cognome+"; Stipendio: "+stipendio;//ritorno le informazioni del dipendente
        return stringa;
    }

    public void lavora()
    {
        //stampa la mansione del dipendente
    }

    public void setNome(String nome)
    {
        this.nome=nome;
    }

    public void setCognome(String cognome)
    {
        this.cognome=cognome;
    }

    public void setStipendio(double stipendio)
    {
        this.stipendio=stipendio;
    }

    public String getNome()
    {
        return nome;
    }

    public String getCognome()
    {
        return cognome;
    }

    public double getStipendio()
    {
        return stipendio;
    }




}
