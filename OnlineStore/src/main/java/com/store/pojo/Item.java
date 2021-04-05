package com.store.pojo;

public class Item {
	
    private int itemId;
	
	private String itemName;
	
	private int Quantity;
	
	private float cost;
	
	private float discount;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public Item(int itemId, float cost, String itemName, int quantity, float discount) {
		super(); //referencing the parent classes constructor
		this.itemId = itemId;
		this.setCost(cost);
		this.setItemName(itemName);
		this.setQuantity(quantity);
		this.setDiscount(discount);
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", Quantity=" + Quantity + ", cost=" + cost
				+ ", discount=" + discount + "]";
	}
	
	

}
