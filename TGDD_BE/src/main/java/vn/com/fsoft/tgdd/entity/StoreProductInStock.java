package vn.com.fsoft.tgdd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "store_product_in_stock")
public class StoreProductInStock {
	
	@Id
	@Column(name = "quantity")
	private Integer quantity;
	
	@Column(name = "store_id")
	private Integer storeID;
	
	@Column(name = "product_id")
	private String productID;

	public StoreProductInStock() {
	}

	public StoreProductInStock(Integer quantity, Integer storeID, String productID) {
		this.quantity = quantity;
		this.storeID = storeID;
		this.productID = productID;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getStoreID() {
		return storeID;
	}

	public void setStoreID(Integer storeID) {
		this.storeID = storeID;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}
	
	
}
