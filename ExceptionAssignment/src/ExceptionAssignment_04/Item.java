package ExceptionAssignment_04;

import java.util.Scanner;

public class Item {

	private String itemname;

	private int itemprice;

	private static int maxitembrought = 9;

	private ItemBought itemb;

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public int getItemprice() {
		return itemprice;
	}

	public void setItemprice(int itemprice) {
		this.itemprice = itemprice;
	}

	public static int getMaxitembrought() {
		return maxitembrought;
	}

	public static void setMaxitembrought(int maxitembrought) {
		Item.maxitembrought = maxitembrought;
	}

	public ItemBought getItemb() {
		return itemb;
	}

	public void setItemb(ItemBought itemb) {
		this.itemb = itemb;
	}

	@Override
	public String toString() {
		return "Item [itemname=" + itemname + ", itemprice=" + itemprice + ", itemb=" + itemb + "]";
	}

	public Item(String itemname, int itemprice, ItemBought itemb) {
		super();
		this.itemname = itemname;
		this.itemprice = itemprice;
		this.itemb = itemb;
	}

	Scanner sc = new Scanner(System.in);

	Item[] it = new Item[2];
	int bill = 0, flag=0;{
	
	for(int i = 0;i<2;i++) {
		System.out.println("Enter item " + i + "id");
		int itemid = sc.nextInt();

		System.out.println("Enter item quantity");
		int itemqunty = sc.nextInt();

		try {
			if (itemqunty > maxitembrought) {
				throw new ItemPurchase("ItemPurchaseLimitExceed");
			} else {
				flag = 1;
			}
		} catch (ItemPurchase e) {
			System.out.println(e.getMessage());
			break;
		}

		System.out.println("Enter name of item");
		String name = sc.next();
		System.out.println("Enter price of item");
		int price = sc.nextInt();
		try {
			if (price <= 0) {
				throw new ItemPurchase("you should enter value greater than 0");
			} else {
				flag = 1;
			}
		} catch (ItemPurchase e) {
			System.out.println(e.getMessage());
			break;
		}

		it[i] = new Item(name, price, new ItemBought(itemid, itemqunty));

		bill = (it[i].getItemprice() * it[i].itemb.getItemqty());
		// System.out.println(it[i]);
	}if(flag>0)
	{
		for (int i = 0; i < 2; i++) {
			System.out.println(it[i] + "" + bill);
		}

	}

}

}
