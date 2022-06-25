package khangDT.entity;

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
	
	@Column(name = "manufacturer_id")
	private String manufacturerID;
	
	@Column(name = "category_id")
	private Integer categoryID;
	
	@Column(name = "product_warranty")
	private Integer productWarranty;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "interes_rate")
	private Float interesRate;
	
	@Column(name = "excusive")
	private String excusive;
	
	@Column(name = "accessories_included")
	private String accessoriesIncluded;
	
	@Column(name = "status")
	private Boolean status;
	public Product() {

	}
	public Product(String productID, String productName, int price, String manufacturerID, int categoryID,
			int productWarranty, String image, float interesRate, String excusive, String accessoriesIncluded,
			boolean status) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.price = price;
		this.manufacturerID = manufacturerID;
		this.categoryID = categoryID;
		this.productWarranty = productWarranty;
		this.image = image;
		this.interesRate = interesRate;
		this.excusive = excusive;
		this.accessoriesIncluded = accessoriesIncluded;
		this.status = status;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getManufacturerID() {
		return manufacturerID;
	}
	public void setManufacturerID(String manufacturerID) {
		this.manufacturerID = manufacturerID;
	}
	public int getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	public int getProductWarranty() {
		return productWarranty;
	}
	public void setProductWarranty(int productWarranty) {
		this.productWarranty = productWarranty;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public float getInteresRate() {
		return interesRate;
	}
	public void setInteresRate(float interesRate) {
		this.interesRate = interesRate;
	}
	public String getExcusive() {
		return excusive;
	}
	public void setExcusive(String excusive) {
		this.excusive = excusive;
	}
	public String getAccessoriesIncluded() {
		return accessoriesIncluded;
	}
	public void setAccessoriesIncluded(String accessoriesIncluded) {
		this.accessoriesIncluded = accessoriesIncluded;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
}
