package TD4;

public class Root extends Folder
{
    public Root(String name)
    {
        super(name);
        this.setParent(null);
    }

    @Override
    public Folder getParent()
    {
        return null;
    }
}
