package TD3.model;

public class GermanyStrategy extends LightStrategy
{
    private LightColor oldLightColor;

    public GermanyStrategy()
    {
        this.oldLightColor = LightColor.ORANGE;
    }

    @Override
    public LightColor getNextColor(LightColor lightColor)
    {
        LightColor newColor = null;
        switch (lightColor)
        {
            case GREEN:
                newColor = LightColor.ORANGE;
                this.oldLightColor = LightColor.GREEN;
                break;
            case ORANGE:
                if (this.oldLightColor.equals(LightColor.GREEN))
                    newColor = LightColor.RED;
                else
                    newColor = LightColor.GREEN;
                break;
            case RED:
                newColor = LightColor.ORANGE;
                this.oldLightColor = LightColor.RED;
                break;
        }

        return newColor;
    }

}
