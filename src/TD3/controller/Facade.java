package TD3.controller;

import TD3.model.BicolorStrategy;
import TD3.model.FranceStrategy;
import TD3.model.GermanyStrategy;
import TD3.model.TrafficLight;

public class Facade
{
    private TrafficLight trafficLight;

    public Facade(TrafficLight trafficLight)
    {
        this.trafficLight = trafficLight;
    }

    public void switchToFrenchStrategy()
    {
        this.trafficLight = new TrafficLight(new FranceStrategy());
    }

    public void switchToGermanStrategy()
    {
        this.trafficLight =  new TrafficLight(new GermanyStrategy());
    }

    public void switchToBicolorStrategy()
    {
        this.trafficLight = new TrafficLight(new BicolorStrategy());
    }

    public void changeColor()
    {
        this.trafficLight.changeColor();
    }
}