package TD3.model;

public class BicolorStrategy extends LightStrategy
{
    @Override
    public LightColor getNextColor(LightColor lightColor) {
        if (lightColor == LightColor.GREEN)
            return LightColor.RED;
        return LightColor.GREEN;
    }

    //2 questions
    //1 : Pq pas de use entre lightcolor et les strats
    //2 : peut-on mettre le main dans controller ?
}
