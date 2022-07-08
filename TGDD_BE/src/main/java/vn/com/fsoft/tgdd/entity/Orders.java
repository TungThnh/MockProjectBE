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
	
	@Column(name = "customer_id")
	private Integer customerID;
	
	@Column(name = "time_created")
	private Date timeCreated;
	
	@Column(name = "total_price")
	private Float totalPrice;

	public Orders() {

	}

	public Orders(Integer orderID, Integer customerID, Date timeCreated, Float totalPrice) {
		this.orderID = orderID;
		this.customerID = customerID;
		this.timeCreated = timeCreated;
		this.totalPrice = totalPrice;
	}

	public Integer getOrderID() {
		return orderID;
	}

	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}

	public Integer getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Integer customerID) {
		this.customerID = customerID;
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
