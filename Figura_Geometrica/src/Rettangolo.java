public class Rettangolo extends FiguraGeometrica{
    private int larghezza;
    private int altezza;

    public Rettangolo(int larghezza, int altezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public void calcolaArea() {
        System.out.println("L'area del rettangolo misura:"+(larghezza*altezza));
    }

    public void calcolaPerimetro(){
        System.out.println("Il perimetro del rettangolo misura:"+(larghezza+altezza)*2);
    }

    public void disegna(){
        for(int i=0; i<altezza; i++)//rettangolo vuoto
        {
            for(int j=0; j<larghezza; j++)
            {
                if(j==0 || i==0 || i==altezza-1 || j==larghezza-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
