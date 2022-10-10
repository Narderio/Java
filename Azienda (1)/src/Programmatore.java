import java.util.ArrayList;

public class Programmatore extends Dipendente
{
    private double bonus;
    private ArrayList<String> linguaggiProg= new ArrayList<String>();
    private ArrayList<String> certificazioni= new ArrayList<String>();

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
        for(int i=0;i<linguaggiProg.size();i++)
            if( linguaggiProg.get(i)!=null)
                if (linguaggiProg.get(i).equals(linguaggio))
                    trovato=true;

        if (trovato==true)
            System.out.println("Errore!!Il linguaggio era già presente");
        else
            linguaggiProg.add(linguaggio);
    }

    public void aggiungiCertificazione(String certificazione)
    {
        boolean trovato=false;
        for(int i=0;i< certificazioni.size();i++)
            if( certificazioni.get(i)!=null)
                if (certificazioni.get(i).equals(certificazione))
                    trovato=true;

        if (trovato==true)
            System.out.println("Errore!!La certificazione era già presente");
        else
            certificazioni.add(certificazione);
    }

    public void stampaCertificazioni()
    {
        for (int x=0; x<linguaggiProg.size(); x++)
                System.out.println(x+")"+ " "+ linguaggiProg.get(x));
    }

    public void stampaLinguaggi()
    {
        for (int x=0; x<linguaggiProg.size(); x++)
                System.out.println(x+")"+ " "+ linguaggiProg.get(x));
    }


    public void rimuoviLinguaggio(int indice)
    {
        if (linguaggiProg.get(indice)!= null) {
            linguaggiProg.remove(indice);
            System.out.println("Linguaggio rimosso con successo!");
        }
        else
            System.out.println("Indice errato!");

    }

    public void rimuoviCertificazione(int indice)
    {
        if (certificazioni.get(indice)!= null) {
            certificazioni.remove(indice);
            System.out.println("Certificazione rimossa con successo!");
        }
        else
            System.out.println("Indice sbagliato!!");    }

    @Override
    public void setNome(String nome) {
        this.setNome(nome);
    }

    @Override
    public void setCognome(String cognome) {
        super.setCognome(cognome);
    }

    @Override
    public void setStipendio(double stipendio) {
        super.setStipendio(stipendio);
    }

    @Override
    public String toString() {
        String ling=new String();
        String cert=new String();
        for (int i=0;i<linguaggiProg.size();i++)
            ling+=linguaggiProg.get(i)+",";

        for (int j=0;j<certificazioni.size();j++)
            cert+=certificazioni.get(j);

        return super.toString() +
                "; Bonus=" + bonus +
                "; Linguaggi programmati=" + ling +
                "; Certificazioni=" + cert +
                '}';
    }
}
