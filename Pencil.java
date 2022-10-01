public class Pencil extends Item
{
    private double tipSize;
    private int type;
    
    public Pencil(String name, double price, String description, int stock, int id,double tipSize, int type)
    {
        super (name, price, description, stock, id);
        this.tipSize = tipSize;
        this.type = type;
    }
    
    public String getDetails()
    {
        return "TipSize : "+tipSize+", Type : "+type;
    }
}