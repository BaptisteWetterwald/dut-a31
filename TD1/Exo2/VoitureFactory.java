package TD1.Exo2;

public class VoitureFactory
{
    private static VoitureFactory instance = null;

    public static VoitureFactory getInstance()
    {
        if (instance == null)
            instance = new VoitureFactory();
        return instance;
    }

    public Voiture createJeep()
    {
        return new Jeep();
    }

    public Voiture createFiatMultipla()
    {
        return new FiatMultipla();
    }

    public Voiture createSubaru()
    {
        return new Subaru();
    }
}
