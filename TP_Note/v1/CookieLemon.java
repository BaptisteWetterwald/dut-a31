package TP_Note.v1;

public class CookieLemon extends CookieTemplate
{
    public CookieLemon()
    {
        this.tempsCuisson = 11;
        this.ustensileCuisson = " au bain-marie.";
        this.ustensileSucre = " une cuillère en bois.";
        this.printRecette();
    }

    @Override
    public String getIngredient() {
        return " au citron :";
    }

    @Override
    public void myrtilles(){}

}
