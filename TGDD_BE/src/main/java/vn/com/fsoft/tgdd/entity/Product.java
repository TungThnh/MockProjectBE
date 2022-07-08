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
	private Float price;
	
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
	
	@Column(name = "brand_id")
	private Integer brand;
	
	public Product() {

	}

	public Product(String productID, String productName, Float price, String manufacturerID, Integer categoryID,
			Integer productWarranty, String imagelink, Boolean status, Integer brand) {
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

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
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

	public Integer getBrand() {
		return brand;
	}

	public void setBrand(Integer brand) {
		this.brand = brand;
	}

}
