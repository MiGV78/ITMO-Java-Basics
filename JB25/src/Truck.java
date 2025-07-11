public class Truck extends Car
{
    private int NumberTire;
    private int MaxMass;

    public void newWheeles(int NT)
    {
        this.NumberTire = NT;
        System.out.println(this.NumberTire);
    }
    public Truck(int NT, int MM, int w, String m, char c, float s)
    {
        super(w,m,c,s);
        this.NumberTire = NT;
        this.MaxMass = MM;
    }
}
