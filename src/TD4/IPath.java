package TD4;

public interface IPath
{
    public abstract void addChild(IPath c) throws Exception;
    public abstract String getAbsolutePath();
    public abstract String getName();
    public abstract void setParent(Folder f);
}
