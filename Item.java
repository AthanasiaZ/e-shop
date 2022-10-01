public abstract class Item 
{

    private int id;
    private String name;
    private String description;
    private double price;
    private int stock;
    
    public Item(String name, double price, String description, int stock, int id)
    {
        this.name = name;
        this.price = price;
        this.description = description;
        this.stock = stock;
        this.id = id;
    }
    
    public String getBasicInfo()
    {
        String n ="Name : "+name+", Price : "+price; 
        n += "Description : "+description+", Stock : "+stock+", ID : "+id;
        return n;
    }
    
    public abstract String getDetails();
    
    public String toString()
    {
        return getBasicInfo()+"\n"+getDetails();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getStock(){
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(){
        this.stock=stock;
    }
}