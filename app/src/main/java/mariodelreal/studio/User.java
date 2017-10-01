package mariodelreal.studio;

class User
{
    private static User instance;

    private User()
    {

    }

    static User getInstance()
    {
        if(instance == null)
        {
            instance = new User();
        }
        return instance;
    }
}
