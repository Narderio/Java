import java.util.ArrayList;

public class Azienda {
    private String nome;
    private ArrayList<Dipendente> dipendenti;

    public Azienda() {
        dipendenti = new ArrayList<Dipendente>();
    }

    public Azienda(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Dipendente getDipendente(int indice) {
        return dipendenti.get(indice);
    }

    /*public void setDipendenti(Dipendente[] dipendenti) {
        this.dipendenti = dipendenti;
    }*/

    public void aggiungiDipendente(Dipendente dipendente) {
        if (dipendenti.size()<30)
            dipendenti.add(dipendente);
    }

    public void rimuoviDipendenti(int indice) {
        if (dipendenti.get(indice) != null) {
            dipendenti.remove(indice);
            System.out.println("Dipendente rimosso con successo");
        } else
            System.out.println("Errore!! Dipendente non trovato");
    }

    public void listaDipendenti() {
        for (int i = 0; i < dipendenti.size(); i++) {
            if (dipendenti.get(i) != null)
                System.out.println(i + ")" + dipendenti.get(i).toString());
        }
    }

}