public class Grafico extends Dipendente
{
    private double bonus;
    private String specializzazione;

    public Grafico()
    {
        super();
    }
    public Grafico(String nome, String cognome, double stipendio, String specializzazione)
    {
        super(nome,cognome,stipendio);
        bonus=200.00;
        this.specializzazione=specializzazione;
    }

    public String toString()
    {
        String x="Nome:"+ super.getNome()+ "; Cognome:"+super.getCognome()+"; Stipendio:"+super.getStipendio()+"; Specializzazione:"+specializzazione;//ritorno le informazioni del grafico
        return x;
    }

    public void lavora()
    {
        //stampa la mansione del dipendente
    }

    public void setBonus(double bonus)
    {
        this.bonus=bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setSpecializzazione(String specializzazione)
    {
        this.specializzazione=specializzazione;
    }

    public String getSpecializzazione() {
        return specializzazione;
    }
}
