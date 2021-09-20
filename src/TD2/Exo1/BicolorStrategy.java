package TD2.Exo1;

public class BicolorStrategy implements LightStrategy
{

    @Override
    public LightColor getNextColor(TrafficLight trafficLight) {
        if (trafficLight.getLightColor() == LightColor.GREEN)
            return LightColor.RED;
        return LightColor.GREEN;
    }
}
