package TD3.model;

public class FranceStrategy extends LightStrategy
{

    @Override
    public LightColor getNextColor(LightColor lightColor)
    {
        LightColor newColor = null;
        switch (lightColor)
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
