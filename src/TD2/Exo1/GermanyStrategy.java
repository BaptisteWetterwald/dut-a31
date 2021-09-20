package TD2.Exo1;

public class GermanyStrategy implements LightStrategy
{
    private LightColor oldLightColor;

    @Override
    public LightColor getNextColor(TrafficLight trafficLight)
    {
        LightColor newColor = null;
        LightColor oldColor = this.getOldLightColor();
        this.setOldLightColor(trafficLight.getLightColor());
        switch (trafficLight.getLightColor())
        {
            case GREEN:
                newColor = LightColor.ORANGE;
                break;
            case ORANGE:
                if (oldColor.equals(LightColor.GREEN))
                    newColor = LightColor.RED;
                else
                    newColor = LightColor.GREEN;
                break;
            case RED:
                newColor = LightColor.ORANGE;
                break;
        }

        return newColor;
    }

    public LightColor getOldLightColor() {
        return this.oldLightColor;
    }

    public void setOldLightColor(LightColor lightColor) {
        this.oldLightColor = lightColor;
    }
}
