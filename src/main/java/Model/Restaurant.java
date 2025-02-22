package Model;

import org.springframework.data.annotation.Id;

public class Restaurant {

	@Id
	private String id;
	private String uId;
	private String resName;
	private String resAdd;
	private String resImage;
	
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
	public String getResImage() {
		return resImage;
	}
	public void setResImage(String resImage) {
		this.resImage = resImage;
	}
	
	public Restaurant(String id, String uId, String resName, String resAdd, String resImage) {
		super();
		this.id = id;
		this.uId = uId;
		this.resName = resName;
		this.resAdd = resAdd;
		this.resImage = resImage;
	}

	public Restaurant() {
		super();
	}
	
	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", uId=" + uId + ", resName=" + resName + ", resAdd=" + resAdd + ", resImage="
				+ resImage + "]";
	}
	
	
}
