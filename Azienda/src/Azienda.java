public class Azienda{
    private String nome;
    private Dipendente[] dipendenti;

    public Azienda() {
        dipendenti = new Dipendente[30];
    }

    public Azienda(String nome)
    {
        this.nome=nome;
        dipendenti = new Dipendente[30];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Dipendente getDipendente(int indice)
    {
        return dipendenti[indice];
    }

    public void setDipendenti(Dipendente[] dipendenti) {
        this.dipendenti = dipendenti;
    }

    public void aggiungiDipendente(Dipendente dipendente)
    {
        int i=0;
        while(dipendenti[i]!=null)
            i++;
        dipendenti[i]=dipendente;
    }

    public void rimuoviDipendenti(int indice)
    {
        if(dipendenti[indice]!= null)
        {
            dipendenti[indice]=null;
            System.out.println("Dipendente rimosso con successo");
        }
        else
            System.out.println("Errore!! Dipendente non trovato");
    }

    public void listaDipendenti()
    {
        for(int i=0; i<dipendenti.length; i++)
        {
            if (dipendenti[i]!=null)
                System.out.println(i+")"+dipendenti[i].toString());
        }
    }

}