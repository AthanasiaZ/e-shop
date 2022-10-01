import java.util.*;

public class Eshop {
    private Owner owner;
    private String name = "Otakustore";
    private List<Item> itemsList = new ArrayList<Item>();
    private List<Buyer> buyersList = new ArrayList<Buyer>();
    private List<ItemOrdered> orderList = new ArrayList<ItemOrdered>();
    
    public void addItem(Item item) 
    {
        boolean exists = false;
        String name0 = item.getName();
        for(int i = 0; i < itemsList.size();
        i++){
            Item item0 = itemsList.get(i);
            if(item0.getName().equals(name0)){
                exists = true;
            }else{
                exists = false;
            }
    }
        if(exists==false){
            itemsList.add(item);
        }
        else{
            System.out.println("The item exists.");
        }
    }
   

    public Item getItemById() {
        System.out.print("Enter item id: ");
        Scanner scan = new Scanner(System.in);
        int enter = scan.nextInt();
    }

    private void removeItem(String name){
        
       Iterator<Item> iter= itemsList.iterator();
       while(iter.hasNext()){
           
           Item item = iter.next();

            if (item.getName() == name) {
                itemsList.remove(item);
System.out.println("you have removed an item from your cart"); 
               return;
            }
        }
    }
    
    public static void showProductsInCategory(int Id){
        boolean doesntexists1=true;
        
        for(Item item : itemsList){
           if(item.getId()==Id){
                String name0=item.getName();
                System.out.println(name0);
                doesntexists1=false;
             
            }
        }
           if(doesntexists1){
               System.out.println("Exception");
    }
}
    public static void addItemOrdered(int quantity, Item item){
        String name0 = item.getName();
        int quantity0 = quantity;
        int stock = item.getStock();
        int newStock;
        Iterator<ItemOrdered> iter = orderList.iterator();
         while(iter.hasNext()){
             ItemOrdered Item = iter.next();
             if(item.getName().equals(Item.getName()))
             {
                 exists=true;
                }
            }
            if(stock>quantity && exists){
                for(ItemOrdered item0 : orderList){
                    if(item0.getName().equals(item.getName())){
                        item0.setQuantity(item0.getQuantity() + quantity);
                        int newquantity = stock - quantity;
                        Eshop.updateItemStock(name0, newquantity);
                        System.out.println("Item added to cart.");
                    }
                }
            }
            else if (stock>quantity){
                
                orderList.add(new ItemOrdered(quantity,item));
                int newquantity = stock - quantity;
                Eshop.updateItemStock(name0, newquantity);
            }
            else{
                System.out.println("Not enough items.");
                return;
            }
        }
                
    public static void removeItemOrdered(String name){
        for(int i=0; i < orderList.size(); i++){
            ItemOrdered itemOrdered = orderList.get(i);
            int quantity0;
            if(itemOrdered.getName()==(name)){
                quantity0=itemOrdered.getQuantity();
                itemOrdered.getItem().setStock(itemOrdered.getItem().getStock()+quantity0);
                
                orderList.remove(i);
                
            }
        }
    }
}