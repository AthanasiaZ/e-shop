import java.util.Iterator;
import java.util.List;

public class ItemIterator implements Iterator<Item> {
    private List<Item> Items;
    private int currentPosition;

    public ItemIterator(List<Item> products) {    
        this.Items = Items;
        this.currentPosition = 0;
    }

    public boolean hasNext() {
        if (this.currentPosition < this.Items.size()) {
            return true;
        } else {
            this.currentPosition = 0;
            return false;
        }
    }
    
    public Item next() {
            this.currentPosition++;
            return this.Items.get(currentPosition - 1);
    }
}