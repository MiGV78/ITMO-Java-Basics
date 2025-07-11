
public class Slave extends Master
{
    public void Out()
    {
        System.out.println(super.NumberMaster);
    }

    public void In()
    {
        System.out.println("Введите Имя: ");
        String Name = in.nextLine();
    }
}