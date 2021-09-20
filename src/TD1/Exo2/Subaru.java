package TD1.Exo2;

public class Subaru extends Voiture
{
    @Override
    public void accelerer() {
        System.out.println("Accélération : Vroum vroummmmmmm");
    }

    @Override
    public void klaxonner() {
        System.out.println("Klaxon : Parisiens enculés");
    }
}
