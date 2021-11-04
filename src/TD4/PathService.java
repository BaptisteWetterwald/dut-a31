package TD4;

public class PathService
{
    public static int du(Path path) throws Exception
    {
        int size = 0;
        if (path instanceof Folder)
        {
            Folder path2 = (Folder)path;
            if ( path2.getChildren().size() > 0)
            {
                for (IPath child : path2.getChildren())
                {
                    size += ((Path)child).getSize();
                }
            }
        }

        else
        {
            //File
            size = path.getSize();
        }

        return size;
    }

    public static String ls(Path path)
    {
        return null;
    }

    public static String lsRecursive(Path path)
    {
        return null;
    }

    public static String find(Path path, String pattern)
    {
        return null;
    }


}
