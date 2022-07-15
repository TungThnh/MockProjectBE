package vn.com.fsoft.tgdd.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {
	
	@Id
	@Column(name = "order_id")
	private Integer orderID;
	
	@Column(name = "phone_number")
	private int phone_number;
	
	@Column(name = "time_created")
	private Date timeCreated;
	
	@Column(name = "total_price")
	private Float totalPrice;

	public Orders() {

	}

	public Orders(Integer orderID, int phone_number, Date timeCreated, Float totalPrice) {
		this.orderID = orderID;
		this.phone_number = phone_number;
		this.timeCreated = timeCreated;
		this.totalPrice = totalPrice;
	}

	public Integer getOrderID() {
		return orderID;
	}

	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}


	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

	public Date getTimeCreated() {
		return timeCreated;
	}

	public void setTimeCreated(Date timeCreated) {
		this.timeCreated = timeCreated;
	}

	public Float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}

}
