package TD3.model;

public class BicolorStrategy extends LightStrategy
{
    @Override
    public LightColor getNextColor(LightColor lightColor) {
        if (lightColor == LightColor.GREEN)
            return LightColor.RED;
        return LightColor.GREEN;
    }
}
