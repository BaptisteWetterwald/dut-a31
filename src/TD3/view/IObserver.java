package TD3.view;

import TD3.model.TrafficLight;

public interface IObserver
{
    void update(TrafficLight trafficLight);
}
