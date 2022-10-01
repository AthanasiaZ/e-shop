public class ItemOrdered {
    private int id;
	private Item Item;
	private int quantity;
	
	public ItemOrdered() {
	}

	public ItemOrdered(int id, Item Item) {
		this.id = id;
		this.Item = Item;
	}

	public int getId() {
		return id;
	}

	public Item getItem() {
		return Item;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setItem(Item Item) {
		this.Item = Item;
	}
	 
	public int getItemQuantity() {
	    return quantity;
	   }

	@Override
	public String toString() {
		return "Id: " + id + ", Item: " + Item;
	}
}
	