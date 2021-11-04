package TD4;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            Folder root = new Root("[Root]");
            IPath home = new Folder("home");
            IPath me = new Folder("me");
            IPath readme = new File("README.md", "Contenu");
            root.addChild(home);
            home.addChild(me);
            me.addChild(readme);

            System.out.println("Path root : " + root.getAbsolutePath());
            System.out.println("Path home : " + home.getAbsolutePath());
            System.out.println("Path README.md : " + readme.getAbsolutePath());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
