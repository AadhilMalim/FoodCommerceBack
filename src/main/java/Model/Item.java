package Model;

import org.springframework.data.annotation.Id;

public class Item {

	@Id
	private String id;
	private String itemName;
	private String itemCat;
	private String itemImage;
	private int itemPrice;
	private String itemGender;
	private int itemDiscount;
	private String itemDesc;
	private String resId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemCat() {
		return itemCat;
	}
	public void setItemCat(String itemCat) {
		this.itemCat = itemCat;
	}
	public String getItemImage() {
		return itemImage;
	}
	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemGender() {
		return itemGender;
	}
	public void setItemGender(String itemGender) {
		this.itemGender = itemGender;
	}
	public int getItemDiscount() {
		return itemDiscount;
	}
	public void setItemDiscount(int itemDiscount) {
		this.itemDiscount = itemDiscount;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	public String getResId() {
		return resId;
	}
	public void setResId(String resId) {
		this.resId = resId;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", itemCat=" + itemCat + ", itemImage=" + itemImage
				+ ", itemPrice=" + itemPrice + ", itemGender=" + itemGender + ", itemDiscount=" + itemDiscount
				+ ", itemDesc=" + itemDesc + ", resId=" + resId + "]";
	}
	public Item(String id, String itemName, String itemCat, String itemImage, int itemPrice, String itemGender,
			int itemDiscount, String itemDesc, String resId) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.itemCat = itemCat;
		this.itemImage = itemImage;
		this.itemPrice = itemPrice;
		this.itemGender = itemGender;
		this.itemDiscount = itemDiscount;
		this.itemDesc = itemDesc;
		this.resId = resId;
	}
	public Item() {
		super();
	}
	

	
}
