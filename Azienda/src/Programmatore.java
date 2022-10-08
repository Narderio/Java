import java.util.Arrays;

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
                    break;
                }

        }

    }

    public void aggiungiCertificazione(String certificazione)
    {
        boolean trovato=false;
        for(int i=0;i< certificazioni.length;i++)
            if( certificazioni[i]!=null)
                if (certificazioni[i].equals(certificazione))
                    trovato=true;

        if (trovato==true)
            System.out.println("Errore!!La certificazione era già presente");
        else
        {
            for (int i=0;i< certificazioni.length;i++)
                if(certificazioni[i]==null) {
                    certificazioni[i] = certificazione;
                    System.out.println("Certificazione inserita!!");
                    break;
                }

        }
    }

    public void stampaCertificazioni()
    {
        for (int x=0; x<linguaggiProg.length; x++)
            if (linguaggiProg[x]!=null)
                System.out.println(x+")"+ " "+ linguaggiProg[x]);
    }

    public void stampaLinguaggi()
    {
        for (int x=0; x<linguaggiProg.length; x++)
            if (linguaggiProg[x]!=null)
                System.out.println(x+")"+ " "+ linguaggiProg[x]);
    }


    public void rimuoviLinguaggio(int indice)
    {
        if (linguaggiProg[indice]!= null) {
            linguaggiProg[indice] = null;
            System.out.println("Linguaggio rimosso con successo!");
        }
        else
            System.out.println("Indice sbagliato!!");

    }

    public void rimuoviCertificazione(int indice)
    {
        if (certificazioni[indice]!= null) {
            certificazioni[indice] = null;
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
        int cont=0;//contatore di linguaggi inseriti
        for (int x=0;x<10;x++)
            if (linguaggiProg[x]!=null)
                cont++;
        String [] vett= new String[cont];//creo un vettore che contiene i linguaggi inseriti senza null
        int j=0;
        for(int x=0;x<10;x++)
            if (linguaggiProg[x]!=null) {
                vett[j] = linguaggiProg[x];
                j++;
            }

        int cont1=0;//contatore delle certificazioni inserite
        for (int x=0;x<10;x++)
            if (certificazioni[x]!=null)
                cont1++;
        String [] vett1= new String[cont1];//creo un vettore che contiene le certificazioni inserite senza null
        int j1=0;
        for(int x=0;x<10;x++)
            if (certificazioni[x]!=null) {
                vett1[j1] = certificazioni[x];
                j1++;
            }
        return super.toString() +
                "; Bonus=" + bonus +
                "; Linguaggi programmati=" + Arrays.toString(vett) +
                "; Certificazioni=" + Arrays.toString(vett1) +
                '}';
    }
}
