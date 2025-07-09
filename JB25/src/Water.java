public class Water 
{
    private String NameWater;
    private Double VolumeWater;
    private Double PraiceWater;

    public Water(){}

    public Water(String NameWater, double VolumeWater, double PraiceWater)
    {
        this.NameWater = NameWater;
        this.PraiceWater = PraiceWater;
        this.VolumeWater = VolumeWater;
    }
    public String getNameWater(){return this.NameWater;}
    public double getVolumeWater(){return this.VolumeWater;}
    public double getPraiceWater(){return this.PraiceWater;}
}
