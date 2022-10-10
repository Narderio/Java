public class Circonferenza extends FiguraGeometrica{
    private int raggio;

    public Circonferenza(int raggio){
        this.raggio=raggio;
    }

    public void calcolaArea(){
        System.out.println("La circonferenza misura del cerchio:"+(3.14d*raggio*raggio));
    }

    public void calcolaPerimetro(){
        System.out.println("Il perimetro misura del cerchio:"+(2*3.14d*raggio));
    }
}
