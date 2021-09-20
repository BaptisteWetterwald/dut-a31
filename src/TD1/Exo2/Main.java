package TD1.Exo2;

public class Main
{
    public static void main(String[] args)
    {
        VoitureFactory factory = VoitureFactory.getInstance();

        Voiture subaru = factory.createSubaru();
        subaru.fairePlein();
        subaru.klaxonner();
        subaru.accelerer();

        Voiture fiat = factory.createFiatMultipla();
        fiat.fairePlein();
        fiat.klaxonner();
        fiat.accelerer();

        Voiture jeep = factory.createJeep();
        jeep.fairePlein();
        jeep.klaxonner();
        jeep.accelerer();
    }
}
