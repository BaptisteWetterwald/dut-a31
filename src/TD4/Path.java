package TD4;

public abstract class Path implements IPath
{
    private Folder parent;
    private String name;

    public Path(String name)
    {
        this.name = name;
    }

    public void setParent(Folder parent)
    {
        this.parent = parent;
    }

    public abstract int getSize();

    public Folder getParent()
    {
        return this.parent;
    }

    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public String getAbsolutePath()
    {
        if (this.parent == null)
            return this.getName();
        return this.parent.getAbsolutePath() + "/" + this.getName();
    }
}