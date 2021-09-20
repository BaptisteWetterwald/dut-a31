package TD2.Exo1;

public class TrafficLight
{
    private boolean lit;
    private LightColor lightColor;
    private LightStrategy lightStrategy;

    public TrafficLight(LightStrategy strategy)
    {
        this.lit = false;
        this.lightColor = LightColor.RED;
        this.lightStrategy = strategy;
        if (lightStrategy instanceof GermanyStrategy)
            ((GermanyStrategy)this.lightStrategy).setOldLightColor(LightColor.ORANGE);
    }

    public void changeColor()
    {
        if (this.lit)
            this.changeState(); //s'éteint
        this.lightColor = lightStrategy.getNextColor(this);
        System.out.println("Le feu passe au " + this.lightColor.name());
        this.changeState(); //s'allume
    }

    public void changeState()
    {
        this.lit = !this.lit;
        if (lit)
            System.out.println("Le feu s'allume !");
        else
            System.out.println("Le feu s'éteint !");
    }

    public LightColor getLightColor() {
        return this.lightColor;
    }

    public boolean isLit()
    {
        return this.lit;
    }


}