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
	@Column(name = "customer_id")
	private Integer customerID;
	
	@Column(name = "time_created")
	private Date timeCreated;
	
	@Column(name = "bill_id")
	private Integer billID;

	public Orders() {

	}

	public Orders(Integer customerID, Date timeCreated, Integer billID) {
		this.customerID = customerID;
		this.timeCreated = timeCreated;
		this.billID = billID;
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

	public Integer getBillID() {
		return billID;
	}

	public void setBillID(Integer billID) {
		this.billID = billID;
	}
	
	
}
