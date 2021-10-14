package TD3.model;

import TD3.model.LightColor;

public abstract class LightStrategy
{
    public abstract LightColor getNextColor(LightColor lightColor);

    public String getStrategyName()
    {
        return this.getClass().getSimpleName();
    }
}
