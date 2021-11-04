package TP_Note.v1;

public class CookieChocolate extends CookieTemplate
{
    public CookieChocolate()
    {
        this.tempsCuisson = 10;
        this.ustensileCuisson = " au micro-onde.";
        this.ustensileSucre = " un fouet";
        this.printRecette();
    }

    @Override
    public String getIngredient() {
        return " aux pépites de chocolat :";
    }

    @Override
    public void sucreVanille(){}

    @Override
    public void citron(){}

    @Override
    public void myrtilles(){}
}
