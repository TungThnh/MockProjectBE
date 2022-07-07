package vn.com.fsoft.tgdd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_detail")
public class OrderDetails {
	
	@Id
	@Column(name = "bill_id")
	private Integer billId;
	
	@Column(name = "quantity")
	private Integer quantity;
	
	@Column(name = "product_id")
	private String productId;
	
	@Column(name = "promo_code_id")
	private Integer promoCodeId;
	
	@Column(name = "customer_id")
	private Integer customerId;

	public OrderDetails() {

	}

	public OrderDetails(Integer billId, Integer quantity, String productId, Integer promoCodeId, Integer customerId) {
		this.billId = billId;
		this.quantity = quantity;
		this.productId = productId;
		this.promoCodeId = promoCodeId;
		this.customerId = customerId;
	}

	public Integer getBillId() {
		return billId;
	}

	public void setBillId(Integer billId) {
		this.billId = billId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Integer getPromoCodeId() {
		return promoCodeId;
	}

	public void setPromoCodeId(Integer promoCodeId) {
		this.promoCodeId = promoCodeId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	
	
	
	

}
