package com.osc.notifier.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gen_contact_us")
public class Notification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idx;
	private String name;
	private String company;
	private String mail;
	private String phone;
	private String department;
	private String position;
	private String productClass;
	private String content;
	private String regDate;
	private String kind;
	private String country;
	private String notification;
	private String funnel;
	private String funnelStr;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getProductClass() {
		return productClass;
	}
	public void setProductClass(String productClass) {
		this.productClass = productClass;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getNotification() {
		return notification;
	}
	public void setNotification(String notification) {
		this.notification = notification;
	}
	public String getFunnel() {
		return funnel;
	}
	public void setFunnel(String funnel) {
		this.funnel = funnel;
	}
	public String getFunnelStr() {
		return funnelStr;
	}
	public void setFunnelStr(String funnelStr) {
		this.funnelStr = funnelStr;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Notification("
				+ "id=" + idx + '\'' + 
				"name=" + name + '\'' + 
				"company=" + company + '\'' + 
				"mail=" + mail + '\'' + 
				"phone=" + phone + '\'' +
				"department=" + department + '\'' +
				"position=" + position + '\'' + 
				"productClass=" + productClass + '\'' +
				"content=" + content + '\'' + 
				"regDate=" + regDate + '\'' + 
				"kind=" + kind + '\'' + 
				"country=" + country + '\'' +
				"notification=" + notification + '\'' +
				"funnel=" + funnel + '\'' +
				"funnelStr=" + funnelStr + '\'';
	}
}
