public class Owner extends User
{
    private boolean isAdmin = true;
    private Eshop eshop;
    public Owner(String Name, String email)
    {
        super(Name, email);
    }
    
    public void setEshop(Eshop n)
    {
        this.eshop = n;
    }
    
    
}