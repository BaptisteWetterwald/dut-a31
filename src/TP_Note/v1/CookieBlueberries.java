package TP_Note.v1;

public class CookieBlueberries extends CookieTemplate
{
    public CookieBlueberries()
    {
        this.tempsCuisson = 8;
        this.ustensileCuisson = " à la casserole.";
        this.ustensileSucre = " une cuillère en bois.";
        this.printRecette();
    }

    @Override
    public String getIngredient() {
        return " aux myrtilles :";
    }

    @Override
    public void citron(){}

}
