package TP_Note.v3.model;

import TP_Note.v3.view.CookieTemplate;

public class CookieChocolate extends CookieTemplate
{
    public CookieChocolate()
    {
        this.tempsCuisson = 10;
        this.ustensileCuisson = " au micro-onde.";
        this.ustensileSucre = " un fouet";
        this.printRecette();
        this.nbBouchees = 2;
        this.bruit = "Scrountch";
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
