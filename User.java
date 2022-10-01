public abstract class User
{
    private String Name;
    private String email;
    
    public User(String Name, String email)
    {
        this.Name=Name;
        this.email=email;
    }
    public void setName(String Name)
    {
        this.Name=Name;
    }
    public String getName()
    {
        return Name;
    }
    public void setemail(String email)
    {
        this.email=email;
    }
    public String getemail()
    {
        return email;
    }
    
}