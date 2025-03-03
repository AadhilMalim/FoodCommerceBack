package com.team.webapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="user")
public class User {
	@Id
	private String id;
	private String uName;
	private String uPass;
	private String uEmail;
	private String uType;
	private boolean Approval;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPass() {
		return uPass;
	}
	public void setuPass(String uPass) {
		this.uPass = uPass;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getuType() {
		return uType;
	}
	public void setuType(String uType) {
		this.uType = uType;
	}
	public boolean isApproval() {
		return Approval;
	}
	public void setApproval(boolean approval) {
		Approval = approval;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", uName=" + uName + ", uPass=" + uPass + ", uEmail=" + uEmail + ", uType=" + uType
				+ ", Approval=" + Approval + "]";
	}
	public User(String id, String uName, String uPass, String uEmail, String uType, boolean approval) {
		super();
		this.id = id;
		this.uName = uName;
		this.uPass = uPass;
		this.uEmail = uEmail;
		this.uType = uType;
		Approval = approval;
	}
	public User() {
		super();
	}
	
	
	
}
