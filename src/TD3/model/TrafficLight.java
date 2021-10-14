package TD3.model;

import TD3.view.IObserver;
import TD3.model.LightColor;
import TD3.model.LightStrategy;

import java.util.ArrayList;
import java.util.List;

public class TrafficLight
{
    private LightColor lightColor;
    private LightStrategy lightStrategy;
    private List<IObserver> observers;
    private boolean lit;

    public TrafficLight(LightStrategy strategy)
    {
        this.lightColor = LightColor.RED;
        this.lightStrategy = strategy;
        this.observers = new ArrayList<>();
        this.lit = false;
    }

    public void changeColor()
    {
        this.lit = false;
        this.notifyObservers();
        this.lightColor = this.lightStrategy.getNextColor(this.lightColor);
        this.lit = true;
        this.notifyObservers();
    }

    public void changeState()
    {
        this.lit = !this.lit;
        this.notifyObservers();
    }

    public LightColor getLightColor() {
        return this.lightColor;
    }

    private void notifyObservers()
    {
        for (IObserver observer : observers)
            observer.update(this);
    }

    public void addObserver(IObserver observer)
    {
        observers.add(observer);
    }

    public String getLightStrategyName()
    {
        return this.lightStrategy.getStrategyName();
    }

    public LightStrategy getLightStrategy()
    {
        return this.lightStrategy;
    }

    public boolean isLit()
    {
        return this.lit;
    }
}