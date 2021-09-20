package TD2.Exo1;

public class GermanyStrategy implements LightStrategy
{
    private LightColor oldLightColor;

    public GermanyStrategy(LightColor oldLightColor)
    {
        this.oldLightColor = oldLightColor;
    }

    @Override
    public LightColor getNextColor(LightColor lightColor)
    {
        LightColor newColor = null;
        LightColor oldColor = this.oldLightColor;
        switch (lightColor)
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
}
