import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart{

    private List<ItemOrdered> ItemsInOrder = new ArrayList<ItemOrdered>();
    public ItemOrdered getItems(int k)
    {
        return ItemsInOrder.get(k);
    }

    public void addItemOrdered (ItemOrdered item)
    {
        ItemsInOrder.add(item);
    }

    public void removeItemOrdered(Item Item)
    {
        ItemsInOrder.remove(Item);
    }

    /*public Iterator<Item> getIterator()
    {
        ShoppingCartIterator = new ItemIterator(Items);
        return ShoppingCartIterator;
    }*/

    public boolean showCart()
    {
        return ItemsInOrder.isEmpty();
    }

    public void clearCart()
    {
        this.ItemsInOrder.clear();
    }
}

    
        
