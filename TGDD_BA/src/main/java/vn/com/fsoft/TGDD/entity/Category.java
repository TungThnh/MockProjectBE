package vn.com.fsoft.TGDD.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id")
	private Integer categoryID;
	
	@Column(name = "category_name")
	private String categoryName;
	
	@Column(name = "status")
	private Boolean status;
	public Category() {
		
	}
	
	public Category(String categoryName, Boolean status) {
		super();
		this.categoryName = categoryName;
		this.status = status;
	}

	public Category(int categoryID, String categoryName, boolean status) {
		this.categoryID = categoryID;
		this.categoryName = categoryName;
		this.status = status;
	}
	public int getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
}
