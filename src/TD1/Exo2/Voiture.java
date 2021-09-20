package TD1.Exo2;

public abstract class Voiture
{
    protected int essence;
    protected int reservoir;

    Voiture()
    {
        this.essence = 0;
        System.out.println(this.getClass().getSimpleName() + " a pop");
    }

    public void fairePlein()
    {
        System.out.println(this.getClass().getSimpleName() + " fait le plein");
        this.essence = this.reservoir;
    }

    public int getEssence()
    {
        return this.essence;
    }

    public int getReservoir()
    {
        return this.reservoir;
    }

    public abstract void accelerer();
    public abstract void klaxonner();

}