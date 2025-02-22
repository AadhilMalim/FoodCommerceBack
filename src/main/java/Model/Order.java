package Model;

import org.springframework.data.annotation.Id;

public class Order {

	@Id
	private String id;
	private String uId;
	private String uName;
	private String uEmail;
	private String uMobile;
	private String uAdd;
	private int uPin;
	private String payMeth;
	
	private String itemId;
	private String itemName;
	private String itemCat;
	private String itemImage;
	private int itemPrice;
	private int itemDiscount;
	private String itemDesc;
	private int itemQty;
	
	private String resId;
	private String resName;
	private String resAdd;
	
	private String oStatus;
	private String oDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getuMobile() {
		return uMobile;
	}
	public void setuMobile(String uMobile) {
		this.uMobile = uMobile;
	}
	public String getuAdd() {
		return uAdd;
	}
	public void setuAdd(String uAdd) {
		this.uAdd = uAdd;
	}
	public int getuPin() {
		return uPin;
	}
	public void setuPin(int uPin) {
		this.uPin = uPin;
	}
	public String getPayMeth() {
		return payMeth;
	}
	public void setPayMeth(String payMeth) {
		this.payMeth = payMeth;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
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
	public int getiQty() {
		return itemQty;
	}
	public void setiQty(int iQty) {
		this.itemQty = iQty;
	}
	public String getResId() {
		return resId;
	}
	public void setResId(String resId) {
		this.resId = resId;
	}
	public String getResName() {
		return resName;
	}
	public void setResName(String resName) {
		this.resName = resName;
	}
	public String getResAdd() {
		return resAdd;
	}
	public void setResAdd(String resAdd) {
		this.resAdd = resAdd;
	}
	public String getoStatus() {
		return oStatus;
	}
	public void setoStatus(String oStatus) {
		this.oStatus = oStatus;
	}
	public String getoDate() {
		return oDate;
	}
	public void setoDate(String oDate) {
		this.oDate = oDate;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", uId=" + uId + ", uName=" + uName + ", uEmail=" + uEmail + ", uMobile=" + uMobile
				+ ", uAdd=" + uAdd + ", uPin=" + uPin + ", payMeth=" + payMeth + ", itemId=" + itemId + ", itemName="
				+ itemName + ", itemCat=" + itemCat + ", itemImage=" + itemImage + ", itemPrice=" + itemPrice
				+ ", itemDiscount=" + itemDiscount + ", itemDesc=" + itemDesc + ", itemQty=" + itemQty + ", resId=" + resId
				+ ", resName=" + resName + ", resAdd=" + resAdd + ", oStatus=" + oStatus + ", oDate=" + oDate + "]";
	}
	public Order(String id, String uId, String uName, String uEmail, String uMobile, String uAdd, int uPin,
			String payMeth, String itemId, String itemName, String itemCat, String itemImage, int itemPrice,
			int itemDiscount, String itemDesc, int itemQty, String resId, String resName, String resAdd, String oStatus,
			String oDate) {
		super();
		this.id = id;
		this.uId = uId;
		this.uName = uName;
		this.uEmail = uEmail;
		this.uMobile = uMobile;
		this.uAdd = uAdd;
		this.uPin = uPin;
		this.payMeth = payMeth;
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemCat = itemCat;
		this.itemImage = itemImage;
		this.itemPrice = itemPrice;
		this.itemDiscount = itemDiscount;
		this.itemDesc = itemDesc;
		this.itemQty = itemQty;
		this.resId = resId;
		this.resName = resName;
		this.resAdd = resAdd;
		this.oStatus = oStatus;
		this.oDate = oDate;
	}
	public Order() {
		super();
	}
	

}
