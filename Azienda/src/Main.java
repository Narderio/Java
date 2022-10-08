import java.lang.*;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static String nomeAzienda;//nome azienda
    static String nome = "", cognome = "";//attributi del dipendente
    static String specializzazione;
    static double stipendio = 0d;
    static Azienda azienda = new Azienda();


    public static void menuProgrammatore() {
        System.out.print("Inserisci l'indice del programmatore da modificare:");
        int indice = input.nextInt();
        Programmatore programmatore = new Programmatore();
        try {
            programmatore = (Programmatore) azienda.getDipendente(indice);
            System.out.println("\n\n1)Aggiungi certificazione");
            System.out.println("2)Rimuovi certificazione");
            System.out.println("3)Aggiungi linguaggio");
            System.out.println("4)Rimuovi linguaggio");
            System.out.println("5) Esci");
            int scelta3 = input.nextInt();
            if (scelta3 == 1) {
                System.out.print("Indicare la cartificazione:");
                String cert = input.next();
                programmatore.aggiungiCertificazione(cert);
            } else if (scelta3 == 2) {
                programmatore.stampaCertificazioni();
                System.out.print("Indicare il numero della cartificazione:");
                int cert = input.nextInt();
                programmatore.rimuoviCertificazione(cert);
            } else if (scelta3 == 3) {
                System.out.print("Indicare il linguaggio:");
                String ling = input.next();
                programmatore.aggiungiLinguaggio(ling);
            } else if (scelta3 == 4) {
                programmatore.stampaLinguaggi();
                System.out.print("Indicare il numero del linguaggio:");
                int ling = input.nextInt();
                programmatore.rimuoviLinguaggio(ling);
            }
        } catch (ClassCastException e) {
            System.out.println("Errore!!L'indice non corrisponde a un programmatore");
        }


    }

    public static void rimuoviDipendente() {
        System.out.print("Inserisci l'indice del dipendente da rimuovere:");
        int indice = input.nextInt();
        azienda.rimuoviDipendenti(indice);
    }


    public static void creaProgrammatore() {
        Programmatore programmatore = new Programmatore(nome, cognome, stipendio);
        azienda.aggiungiDipendente(programmatore);
        System.out.println("Programmatore aggiunto");
    }


    public static void creaGrafico() {
        System.out.print("Inserisci la specializzazione:");
        specializzazione = input.next();
        Grafico grafico = new Grafico(nome, cognome, stipendio, specializzazione);
        azienda.aggiungiDipendente(grafico);
        System.out.println("Grafico aggiunto");
    }


    public static void creaDipendente() {
        System.out.print("\nInserisci il nome del dipendente:");
        nome = input.next();
        System.out.print("\nInserisci il cognome del dipendente:");
        cognome = input.next();
        System.out.print("\nInserisci lo stipendio del dipendente:");
        stipendio = input.nextDouble();

        System.out.println("\nIl dipendente è \n1)Un grafico \n2)Un programmatore");
        System.out.print("Inserisci scelta:");
        int scelta2 = input.nextInt();
        if (scelta2 == 1)
            creaGrafico();
        else if (scelta2 == 2)
            creaProgrammatore();
    }


    public static void menuDipendenti() {
        System.out.println("1) Aggiungere dipendenti");
        System.out.println("2) Rimuovere dipendenti");
        System.out.println("3) Aggiungi/Rimuovi certificazioni o linguaggi");
        System.out.println("4) Stampa le informazioni dei dipendenti");
        System.out.println("5) Torna indietro");
        System.out.print("Inserisci opzione:");
        int scelta1 = input.nextInt();
        if (scelta1 == 1)
            creaDipendente();
        else if (scelta1 == 2) {
            azienda.listaDipendenti();
            rimuoviDipendente();
        } else if (scelta1 == 3) {
            azienda.listaDipendenti();
            menuProgrammatore();
        } else if (scelta1 == 4) {
            azienda.listaDipendenti();
        } else if (scelta1 == 5) {
            System.out.println("Torno indietro...");
        }
    }


    public static void creaAzienda() {
        System.out.print("\nInserisci il nome dell'azienda:");
        nomeAzienda = input.next();
        azienda.setNome(nomeAzienda);
    }


    public static void main(String[] args) {

        int scelta = 0;
        while (scelta != 3) {
            do {
                System.out.println("\n1) Inserire azienda");
                System.out.println("2) Gestisci dipendenti");
                System.out.println("3) Esci");
                System.out.print("inserisci la scelta:");
                scelta = input.nextInt();
                if (scelta < 1 || scelta > 3)
                    System.out.println("Inserire un'opzione corretta");
            }
            while (scelta < 1 || scelta > 3);

            switch (scelta) {
                case 3:
                    System.out.println("Grazie di aver usato questo programma!!");
                    break;

                case 1:
                    if (azienda.getNome() == null)
                        creaAzienda();
                    else
                        System.out.println("Azienda già creata!");
                    break;

                case 2:
                    System.out.println("\n\n");
                    if (azienda.getNome() != null) {
                        menuDipendenti();
                    } else
                        System.out.println("Prima bisogna creare un'azienda!!");
                    break;
            }
        }
    }
}