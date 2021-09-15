package TD1.Exo2;

public class Jeep extends Voiture
{

    @Override
    public void accelerer() {
        System.out.println("Accélération : Yeeehaaaaaaa !");
    }

    @Override
    public void klaxonner() {
        System.out.println("Klaxon : Ça veut l'port d'armes");
    }
}
