package TD2.Exo1;

public class BicolorStrategy implements LightStrategy
{

    @Override
    public LightColor getNextColor(LightColor lightColor) {
        if (lightColor == LightColor.GREEN)
            return LightColor.RED;
        return LightColor.GREEN;
    }
}
