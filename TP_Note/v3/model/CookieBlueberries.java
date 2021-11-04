package TP_Note.v3.model;

import TP_Note.v3.view.CookieTemplate;

public class CookieBlueberries extends CookieTemplate
{
    public CookieBlueberries()
    {
        this.tempsCuisson = 8;
        this.ustensileCuisson = " à la casserole.";
        this.ustensileSucre = " une cuillère en bois.";
        this.printRecette();
        this.nbBouchees = 3;
        this.bruit = "Crosh";
    }

    @Override
    public String getIngredient() {
        return " aux myrtilles :";
    }

    @Override
    public void citron(){}

}
;;