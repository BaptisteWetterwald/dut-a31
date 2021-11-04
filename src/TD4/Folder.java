package TD4;

import java.util.ArrayList;

public class Folder extends Path
{

    private ArrayList<IPath> children;

    public Folder(String name)
    {
        super(name);
        this.children = new ArrayList<>();
    }

    public void addChild(IPath c) throws Exception
    {
        children.add(c);
        c.setParent(this);
    }

    public void removeChild(int index)
    {
        children.remove(index);
    }

    public IPath getChild(int i)
    {
        return children.get(i);
    }

    @Override
    public int getSize()
    {
        return 4096;
    }

    public ArrayList<IPath> getChildren()
    {
        return new ArrayList<>(this.children);
    }

}
