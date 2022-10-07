import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nomeAzienda;//nome azienda
        String nome = "", cognome = "";//attributi del dipendente
        String[] linguaggiProg = new String[10];
        String[] certificazioni = new String[10];
        String specializzazione;
        double stipendio = 0d;
        Dipendente[] dipendenti = new Dipendente[30];


        Scanner input = new Scanner(System.in);
        int scelta = 0;
        while (true) {
            System.out.println("1) Inserire azienda");
            System.out.println("2) Gestisci dipendenti");
            System.out.println("3) Gestisci grafico");
            System.out.println("4) Gestisci programmatore");
            scelta = input.nextInt();

            if (scelta < 1 || scelta > 4)
                break;

            Azienda azienda = new Azienda();
            Grafico grafico =new Grafico();
            Programmatore programmatore = new Programmatore();
            switch (scelta) {
                case 1:
                    System.out.print("Inserisci il nome dell'azienda:");
                    nomeAzienda = input.nextLine();
                    azienda.setNome(nomeAzienda);
                    break;
                case 2:
                    System.out.println("1) Inserisci dipendenti");
                    System.out.println("2) Rimuovere dipendenti");
                    System.out.println("3) Stampa le informazioni dei dipendenti");
                    int scelta1 = input.nextInt();
                    if (scelta1 == 1) {
                        System.out.print("Inserisci il nome del dipendente:");
                        nome = input.nextLine();
                        System.out.print("Inserisci il cognome del dipendente:");
                        cognome = input.nextLine();
                        System.out.print("Inserisci lo stipendio del dipendente:");
                        stipendio = input.nextDouble();

                        Dipendente d = new Dipendente(nome, cognome, stipendio);
                        azienda.aggiungiDipendente(d);
                    } else if (scelta1 == 2) {
                        System.out.println("Inserisci l'indice:");
                        int indice = input.nextInt();
                        azienda.rimuoviDipendenti(indice);
                    } else if (scelta1==3) {
                        azienda.listaDipendenti();
                    }
                    break;

                case 3:
                    System.out.println("1) Inserisci un grafico ");
                    System.out.println("2) Stampa le informazioni del grafico");
                    System.out.println("3) Stampa la mansione del grafico");
                    int scelta2= input.nextInt();
                    if (scelta2==1)
                    {
                        System.out.print("Inserisci il nome del dipendente:");
                        nome = input.nextLine();
                        System.out.print("Inserisci il cognome del dipendente:");
                        cognome = input.nextLine();
                        System.out.print("Inserisci lo stipendio del dipendente:");
                        stipendio = input.nextDouble();
                        System.out.print("Inserisci la specializzazione:");
                        specializzazione = input.nextLine();
                        grafico.setNome(nome);
                        grafico.setCognome(cognome);
                        grafico.setStipendio(stipendio);
                        grafico.setSpecializzazione(specializzazione);
                    }
                    else if (scelta2==2)
                    {
                        grafico.toString();
                    }
                    else if (scelta2==3)
                    {
                        grafico.lavora();
                    }

                    break;

                case 4:
                    System.out.println("1) Inserisci un programmatore ");
                    System.out.println("2) Gestisci programmatore");
                    System.out.println("3) Stampa info del programmatore");
                    System.out.println("3) Stampa la mansione del grafico");
                    int scelta3= input.nextInt();
                    if (scelta3==1)
                    {
                        System.out.print("Inserisci il nome del programmatore:");
                        nome = input.nextLine();
                        System.out.print("Inserisci il cognome del programmatore:");
                        cognome = input.nextLine();
                        System.out.print("Inserisci lo stipendio del programmatore:");
                        stipendio = input.nextDouble();
                        programmatore.setNome(nome);
                        programmatore.setCognome(cognome);
                        programmatore.setStipendio(stipendio);
                    }
                    else if(scelta3==2)
                    {
                        System.out.println("1) Aggiungi linguaggio");
                        System.out.println("2) Rimuovi linguaggio");
                        System.out.println("3) Aggiungi certificazione");
                        System.out.println("4) Rimuovi certificazione");
                        int scelta4= input.nextInt();
                        switch (scelta4)
                        {
                            case 1:
                                System.out.print("Inserisci il linguaggio:");
                                String linguaggio= input.nextLine();
                                programmatore.aggiungiLinguaggio(linguaggio);
                        }
                    }
                    else if (scelta3==3)
                    {
                        programmatore.toString();
                    }
                    else if (scelta3==4)
                    {
                        programmatore.lavora();
                    }

                    break;
            }
        }
    }
}