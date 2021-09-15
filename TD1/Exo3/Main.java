package TD1.Exo3;

public class Main
{
    public static void main(String[] args)
    {
        TrafficLight feu = new TrafficLight(new FranceStrategy());
        feu.changeState();
        for (int i=0; i<10; i++)
            feu.changeColor();

        System.out.println("-----------ENDED-----------");
        TrafficLight feu2 = new TrafficLight(new GermanyStrategy());
        feu2.changeState();
        for (int i=0; i<10; i++)
            feu2.changeColor();
    }
}
