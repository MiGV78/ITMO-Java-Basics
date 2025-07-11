public class Client extends Man
{
    String NameBank;
    public Client(String NameIn, String SurnameIn)
    {
        super(NameIn, SurnameIn);
    }

    @Override
    public void Print()
    {
        System.out.println(NameIn());
        System.out.println(SurnameIn());
    }
}