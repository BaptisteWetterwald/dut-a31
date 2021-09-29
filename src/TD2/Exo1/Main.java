package TD2.Exo1;

public class Main
{
    public static void main(String[] args)
    {
        TrafficLight feu = new TrafficLight(new FranceStrategy());
        for (int i=0; i<10; i++)
            feu.changeColor();
        System.out.println("-----------ENDED-----------");

        TrafficLight feu2 = new TrafficLight(new GermanyStrategy(LightColor.ORANGE));
        for (int i=0; i<10; i++)
            feu2.changeColor();
        System.out.println("-----------ENDED-----------");

        TrafficLight feuBicolore = new TrafficLight(new BicolorStrategy());
        for (int i=0; i<10; i++)
            feuBicolore.changeColor();
        System.out.println("-----------ENDED-----------");
    }
}
