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
        Azienda azienda = new Azienda();

        Scanner input = new Scanner(System.in);
        int scelta = 0;
        while (scelta!=3) {
            do{
            System.out.println("1) Inserire azienda");
            System.out.println("2) Gestisci dipendenti");
            System.out.println("3) Esci");
            System.out.print("inserisci la scelta:");
            scelta = input.nextInt();
            if (scelta<1 || scelta>3)
                System.out.println("Inserire un'opzione corretta");
            }
            while(scelta<1 || scelta>3);


            switch (scelta) {
                case 3:
                    System.out.println("Grazie di aver usato questo programma!!");
                    break;
                case 1:
                    System.out.print("Inserisci il nome dell'azienda:");
                    nomeAzienda = input.next();
                    azienda.setNome(nomeAzienda);
                    break;
                case 2:
                    if (azienda.getNome()!=null){
                    System.out.println("1) Aggiungere dipendenti");
                    System.out.println("2) Rimuovere dipendenti");
                    System.out.println("3) Aggiungi certificazioni o linguaggi");
                    System.out.println("4) Stampa le informazioni dei dipendenti");
                    System.out.println("5) Torna indietro");
                        System.out.print("Inserisci opzione:");
                    int scelta1 = input.nextInt();
                    if (scelta1 == 1) {
                        System.out.print("Inserisci il nome del dipendente:");
                        nome = input.next();
                        System.out.print("Inserisci il cognome del dipendente:");
                        cognome = input.next();
                        System.out.print("Inserisci lo stipendio del dipendente:");
                        stipendio = input.nextDouble();

                        System.out.println("Il dipendente è \n1)Un grafico \n2)Un programmatore");
                        int scelta2 = input.nextInt();
                        if (scelta2 == 1) {
                                System.out.print("Inserisci la specializzazione:");
                                specializzazione = input.next();
                                Grafico grafico = new Grafico(nome, cognome, stipendio, specializzazione);
                                azienda.aggiungiDipendente(grafico);
                            System.out.println("Grafico aggiunto");
                            }
                            if (scelta2 == 2) {
                                Programmatore programmatore = new Programmatore(nome,cognome,stipendio);
                                azienda.aggiungiDipendente(programmatore);
                                System.out.println("Programmatore aggiunto");
                        }

                    } else if (scelta1 == 2) {
                        azienda.listaDipendenti();
                        System.out.print("Inserisci l'indice del dipendente da rimuovere:");
                        int indice = input.nextInt();
                        azienda.rimuoviDipendenti(indice);
                    } else if (scelta1 == 3) {
                        azienda.listaDipendenti();
                        System.out.print("Inserisci l'indice del programmatore da modificare:");
                        int indice= input.nextInt();
                        Programmatore programmatore= new Programmatore();
                        try{
                            programmatore= (Programmatore)azienda.getDipendente(indice);
                            System.out.println("1)Aggiungi certificazione");
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
                                System.out.print("Indicare il numero della cartificazione:");
                                int cert = input.nextInt();
                                programmatore.rimuoviCertificazione(cert);
                            } else if (scelta3 == 3) {
                                System.out.print("Indicare il linguaggio:");
                                String ling = input.next();
                                programmatore.aggiungiLinguaggio(ling);
                            } else if (scelta3 == 4) {
                                System.out.print("Indicare il numero del linguaggio:");
                                int ling = input.nextInt();
                                programmatore.rimuoviLinguaggio(ling);
                            } else if (scelta3==5) {
                                break;

                            }
                        }
                        catch (ClassCastException e){
                            System.out.println("Errore!!L'indice non corrisponde a un programmatore");
                        }

                    }
                    else if (scelta1 == 4) {
                        azienda.listaDipendenti();
                    }
                    else if (scelta1==5)
                        break;
                    }
                    else
                        System.out.println("Prima bisogna creare un'azienda!!");
                    break;
            }
        }
    }
}