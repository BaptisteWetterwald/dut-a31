package TD1.Exo3;

public class FranceStrategy implements LightStrategy
{

    @Override
    public LightColor getNextColor(TrafficLight trafficLight)
    {
        LightColor newColor = null;
        switch (trafficLight.getLightColor())
        {
            case GREEN:
                newColor = LightColor.ORANGE;
                break;
            case ORANGE:
                newColor = LightColor.RED;
                break;
            case RED:
                newColor = LightColor.GREEN;
                break;
        }

        return newColor;
    }
}
