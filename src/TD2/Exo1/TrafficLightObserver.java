package TD2.Exo1;

public class TrafficLightObserver
{

    public void update(TrafficLight trafficLight)
    {
        System.out.println("Le feu passe au " + trafficLight.getLightColor());
    }
}
