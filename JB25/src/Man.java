public abstract class Man
{
    private String Name;
    private String Surname;

    public String NameIn()
    {
        return this.Name;
    }

    public String SurnameIn()
    {
        return this.Surname;
    }

    public abstract void Print();

    public Man(String NameIn, String SurnameIn)
    {
        this.Name = NameIn;
        this.Surname = SurnameIn;
    }
}

