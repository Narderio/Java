public class Programmatore extends Dipendente
{
    private double bonus;
    private String[] linguaggiProg=new String [10];
    private String[] certificazioni=new String [10];

    public Programmatore()
    {
        super();
    }
    public Programmatore(String nome, String cognome, double stipendio)
    {
        super(nome, cognome, stipendio);
        bonus=300.00;

    }

    public void aggiungiLinguaggio(String linguaggio)
    {
        boolean trovato=false;
        for(int i=0;i<linguaggiProg.length;i++)
            if( linguaggiProg[i]!=null)
                if (linguaggiProg[i].equals(linguaggio))
                    trovato=true;

        if (trovato==true)
            System.out.println("Errore!!Il linguaggio era già presente");
        else
        {
            for (int i=0;i< linguaggiProg.length;i++)
                if(linguaggiProg[i]==null) {
                    linguaggiProg[i] = linguaggio;
                    System.out.println("Linguaggio inserito!!");
                }

        }

    }

    public void aggiungiCertificazione(String c)
    {
        //aggiungo certificazione
    }

    public void rimuoviLinguaggio(int indice)
    {
        //rimuovo linguaggio
    }
}
