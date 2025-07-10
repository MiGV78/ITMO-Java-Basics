public class Tree 
{
    Integer Year;
    Boolean Life;
    String Name;
    
    Tree(int Year, String Name)
    {
        this.Year = Year;
        this.Name = Name;
    }
    
    Tree(int Year, boolean Life, String Name)
    {
        this.Year = Year;
        this.Life = Life;
        this.Name = Name;        
    }
    
    Tree()
    {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public int getYear(){return this.Year;}
    public boolean getLife(){return this.Life;}
    public String getName(){return this.Name;}
}
