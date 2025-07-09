

public class Simple 
{
    private String ColorCar;
    private String NameCar;
    private double Mass;

    public Simple(String ColorCar)
    {
        this.ColorCar = ColorCar;
    }

    public Simple(String ColorCar, double Mass)
    {
        this.ColorCar = ColorCar;
        this.Mass = Mass;
    }

    public Simple(){}

    public String getColorCar(){return this.ColorCar;}
    public String getNameCar(){return this.NameCar;}
    public double getwt(){return this.Mass;}
    
    public void Display()
    {
        System.out.println(this.ColorCar);
        System.out.println(this.NameCar);
        System.out.println(this.Mass);
    }   

}
