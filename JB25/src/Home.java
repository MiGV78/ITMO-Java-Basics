public class Home 
{
    private int NumFloorHome;
    private int YearHome;
    private String NameHome;
    public void In(int NumFloorHome, int YearHome, String NameHome)
    {
        this.NumFloorHome = NumFloorHome;
        this.YearHome = YearHome;
        this.NameHome = NameHome;
    }
    public void Out()
    {
        System.out.println("Количество этажей: " + NumFloorHome);
        System.out.println("Год постройки: " + YearHome);
        System.out.println("Наименование: " + NameHome);
    }
    public int Year()
    {
        int NowYear = 2025;
        return NowYear - this.YearHome;
    }    

}
