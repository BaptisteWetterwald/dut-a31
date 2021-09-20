package TD2.Exo1;

import java.util.ArrayList;
import java.util.List;

public class TrafficLight
{
    private boolean lit;
    private LightColor lightColor;
    private LightStrategy lightStrategy;
    private List<TrafficLightObserver> observers;

    public TrafficLight(LightStrategy strategy)
    {
        this.lit = false;
        this.lightColor = LightColor.RED;
        this.lightStrategy = strategy;
        this.observers = new ArrayList<>();
    }

    public void changeColor()
    {
        this.lightColor = lightStrategy.getNextColor(this.lightColor);
        this.notifyObservers();
    }

    public LightColor getLightColor() {
        return this.lightColor;
    }

    private void notifyObservers()
    {
        for (TrafficLightObserver observer : observers)
            observer.update(this);
    }
}