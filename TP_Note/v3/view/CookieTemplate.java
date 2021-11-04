package TP_Note.v3.view;

public abstract class CookieTemplate
{
    protected int nbBouchees;
    protected String bruit;

    protected int tempsCuisson;
    protected String ustensileCuisson;
    protected String ustensileSucre;

    public void printRecette()
    {
        System.out.println("---------------------------------------------------");
        System.out.println("Préparation de votre cookie " + this.getIngredient());
        this.beurre();
        this.sucre();
        this.oeuf();
        this.sucreVanille();
        this.levure();
        this.farine();
        this.citron();
        this.myrtilles();
        this.boule();
        this.four();
    }

    public abstract String getIngredient();

    public void beurre()
    {
        System.out.println("Beurre ramolli " + this.ustensileCuisson);
    }

    public void sucre()
    {
        System.out.println("Sucre mélange avec " + this.ustensileSucre);
    }

    public void sucreVanille()
    {
        System.out.println("Sucre vanillé ajouté.");
    }

    public void citron()
    {
        System.out.println("Peau du citron rapée, zeste très fin obtenu et ajouté à la pâte.");
    }

    public void myrtilles()
    {
        System.out.println("Myrtilles ajoutées délicatement à la pâte.");
    }

    public void oeuf() {
        System.out.println("Oeuf ajouté");
    }

    public void levure() {
        System.out.println("Levure ajoutée.");
    }

    public void farine()
    {
        System.out.println("Farine ajoutée et remuée lentement : pâte obtenue lisse et homogène.");
    }

    public void boule()
    {
        System.out.println("Petite boule formée avec la pâte à cookies sur la plaque de papier sulfurisé.");
    }

    public void four()
    {
        System.out.println("Cookie enfourné pour " + this.tempsCuisson + " minutes.");
    }

}
