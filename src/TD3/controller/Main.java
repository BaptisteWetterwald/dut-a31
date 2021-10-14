package TD3.controller;

import TD3.model.GermanyStrategy;
import TD3.model.TrafficLight;
import TD3.view.TrafficLightObserver;

public class Main
{
    public static void main(String[] args)
    {
        TrafficLight trafficLight1 = new TrafficLight(new GermanyStrategy());
        Facade facade = new Facade(trafficLight1);

        trafficLight1.addObserver(new TrafficLightObserver(trafficLight1, facade));

    }
}
