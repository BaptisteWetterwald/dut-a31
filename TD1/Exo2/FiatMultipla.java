package TD1.Exo2;

public class FiatMultipla extends Voiture
{
    public FiatMultipla()
    {
        this.reservoir = 50;
    }

    @Override
    public void accelerer() {
        System.out.println("Accélération : Youhou, à fond les bananes !");
    }

    @Override
    public void klaxonner() {
        System.out.println("Klaxon : C'est Marseille bébé !");
    }
}
