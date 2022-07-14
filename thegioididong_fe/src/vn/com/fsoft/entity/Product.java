package vn.com.fsoft.entity;


public class Product {

	private String productID;
	private String productName;
	private Float price;
	private String manufacturerID;
	private Integer categoryID;
	private Integer productWarranty;
	private String imagelink;
	private Boolean status;
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
