package TD4;

public class File extends Path
{

    private String content;

    public File(String name, String content)
    {
        super(name);
        this.content = content;
    }

    public String getContent()
    {
        return this.content;
    }

    @Override
    public int getSize()
    {
        return this.content.length();
    }

    @Override
    public void addChild(IPath c) throws Exception
    {
        throw new Exception("A file cannot have children. Only folders can.");
    }

}
