public class Buyer extends User
{
    private int bonus=0;
    private String buyerCategory="Bronze";
    private ShoppingCart cart;
    private float discount = 0;
    public Buyer(String Name, String email)
    {
        super(Name, email);
    }
    
    public void awardBonus(int extra)
    {
        this.bonus += extra;

    }
    
    public void setbuyerCategory()
    {
        if ((100<bonus)&&(bonus<200)) 
        {
            buyerCategory = "Silver";
            this.discount = 1/2;
        }
        else if (bonus>200) 
        {
            buyerCategory = "Gold";
            this.discount = 1;
        }
        else buyerCategory = "Bronze";
    }
    
    public void placeOrder()
    {
        
    }
    
}