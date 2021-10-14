package TD2.Exo1;

public class TrafficLightObserver implements Observer
{

    @Override
    public void update(TrafficLight trafficLight)
    {
        System.out.println("Le feu de stratégie " + trafficLight.getLightStrategy() + " passe au " + trafficLight.getLightColor());
    }
}
