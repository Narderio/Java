public class Main {
    public static void main(String[] args) {
        FiguraGeometrica c = new Circonferenza (10);
        FiguraGeometrica r = new Rettangolo(6, 10);
        FiguraGeometrica q = new Quadrato(4);
        c.calcolaArea();
        c.calcolaPerimetro();
        r.calcolaArea();
        r.calcolaPerimetro();
        ((Rettangolo)r).disegna();
        q.calcolaArea();
        q.calcolaPerimetro();
        ((Quadrato)q).disegna();
    }
}