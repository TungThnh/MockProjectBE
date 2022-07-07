package vn.com.fsoft.tgdd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@Column(name = "product_id")
	private String productID;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "price")
	private Integer price;
	
	@Column(name = "manufacturer")
	private String manufacturerID;
	
	@Column(name = "category_id")
	private Integer categoryID;
	
	@Column(name = "product_warranty")
	private Integer productWarranty;
	
	@Column(name = "image")
	private String imagelink;
	
	@Column(name = "status")
	private Boolean status;
	
	@Column(name = "Brand")
	private Boolean brand;
	
	public Product() {

	}

	public Product(String productID, String productName, Integer price, String manufacturerID, Integer categoryID,
			Integer productWarranty, String imagelink, Boolean status, Boolean brand) {
		this.productID = productID;
		this.productName = productName;
		this.price = price;
		this.manufacturerID = manufacturerID;
		this.categoryID = categoryID;
		this.productWarranty = productWarranty;
		this.imagelink = imagelink;
		this.status = status;
		this.brand = brand;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getManufacturerID() {
		return manufacturerID;
	}

	public void setManufacturerID(String manufacturerID) {
		this.manufacturerID = manufacturerID;
	}

	public Integer getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(Integer categoryID) {
		this.categoryID = categoryID;
	}

	public Integer getProductWarranty() {
		return productWarranty;
	}

	public void setProductWarranty(Integer productWarranty) {
		this.productWarranty = productWarranty;
	}

	public String getImagelink() {
		return imagelink;
	}

	public void setImagelink(String imagelink) {
		this.imagelink = imagelink;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Boolean getBrand() {
		return brand;
	}

	public void setBrand(Boolean brand) {
		this.brand = brand;
	}
	
	
}
