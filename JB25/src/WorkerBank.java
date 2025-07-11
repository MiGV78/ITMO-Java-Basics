public class WorkerBank extends Man
{
    String NameBank;
    public WorkerBank(String NameIn, String SurnameIn)
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

