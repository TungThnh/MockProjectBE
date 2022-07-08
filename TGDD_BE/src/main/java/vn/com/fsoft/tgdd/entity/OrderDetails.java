package vn.com.fsoft.tgdd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_detail")
public class OrderDetails {
	
	@Id
	@Column(name = "order_details_id")
	private Integer orderDetailsId;
	
	@Column(name = "product_id")
	private String productId;
	
	@Column(name = "quantity")
	private Integer quantity;
	
	@Column(name = "promo_code_id")
	private Integer promoCodeId;
	
	@Column(name = "order_id")
	private Integer orderId;

	public OrderDetails() {

	}

	public OrderDetails(Integer orderDetailsId, String productId, Integer quantity, Integer promoCodeId,
			Integer orderId) {
		super();
		this.orderDetailsId = orderDetailsId;
		this.productId = productId;
		this.quantity = quantity;
		this.promoCodeId = promoCodeId;
		this.orderId = orderId;
	}

	public Integer getOrderDetailsId() {
		return orderDetailsId;
	}

	public void setOrderDetailsId(Integer orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getPromoCodeId() {
		return promoCodeId;
	}

	public void setPromoCodeId(Integer promoCodeId) {
		this.promoCodeId = promoCodeId;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	
}
