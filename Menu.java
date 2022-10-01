
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class Menu {
    
    private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	private int nextItemId = 1;
	private int nextItemOrderedId = 1;

	private List<Item> Items = new ArrayList<Item>();
	private List<ItemOrdered> ItemsOrdered = new ArrayList<ItemOrdered>();
	private void mainMenu() throws Exception {
		while (true) {
			System.out.println("Welcome to Eshop");
			System.out.println("1. Add a new item");
			System.out.println("2. Remove existing item");
			System.out.println("3. List all items");
			System.out.println("4. Order a item");
			System.out.println("5. List all ordered items");
			System.out.println("6. Exit");
			System.out.print("Enter your choice (1-6): ");
			int choice = Integer.parseInt(input.readLine());

			switch (choice) {
			case 1:
				addItem();
				break;
			case 2:
				removeItem();
				break;
			case 3:
				listAllItems();
				break;
			case 4:
				orderItem();
				break;
			case 5:
				listAllItemsOrdered();
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Your choice is not in range (1-6), try again.");
				break;
			}
		}
	}
	private void addItem() throws Exception {
		System.out.print("Enter item name: ");
		String name = input.readLine();
		System.out.print("Enter item description: ");
		String description = input.readLine();
		System.out.print("Enter item price: ");
		int price = Integer.parseInt(input.readLine());

		Item Item = new Item( id, name, description, price);
		Items.add(Item);
		nextItemId++;
		System.out.println("Added new item: " + Item.toString());
	}
	private void removeItem() throws Exception {
		System.out.print("Enter item id: ");
		int id = Integer.parseInt(input.readLine());

		int ItemIndex = -1;
		for (int i = 0; i < Items.size(); i++) {
			Item Item = Items.get(i);

			if (Item.getid() == id) {
				ItemIndex = i;
				break;
			}
		}

		if (ItemIndex == -1) {
			System.out.println("Item with given id not found.");
		} else {
			Items.remove(ItemIndex);
			System.out.println("Item removed.");
		}
	}
	private void listAllItems() {
		System.out.println("Items:");
		for (Item Item : Items) {
			System.out.println(Item);
		}
	}
	private void orderItem() throws Exception {
		System.out.print("Enter item id: ");
		int id = Integer.parseInt(input.readLine());

		for (Item Item : Items) {
			if (Item.getid() == id) {
				ItemOrdered ItemOrdered = new ItemOrdered(nextItemOrderedId, Item);
				ItemsOrdered.add(ItemOrdered);
				nextItemOrderedId++;
				System.out.println("item ordered: " + ItemOrdered);
				break;
			}
		}
	}

	private void listAllItemsOrdered() {
		System.out.println("Ordered Items:");
		for (ItemOrdered ItemOrdered : ItemsOrdered) {
			System.out.println(ItemsOrdered);
		}
	}
}