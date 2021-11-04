package TP_Note.v3.model;

import TP_Note.v3.view.CookieTemplate;

public class CookieLemon extends CookieTemplate
{
    public CookieLemon()
    {
        this.tempsCuisson = 11;
        this.ustensileCuisson = " au bain-marie.";
        this.ustensileSucre = " une cuillère en bois.";
        this.printRecette();
        this.nbBouchees = 5;
        this.bruit = "Cratch";
    }

    @Override
    public String getIngredient() {
        return " au citron :";
    }

    @Override
    public void myrtilles(){}

}
