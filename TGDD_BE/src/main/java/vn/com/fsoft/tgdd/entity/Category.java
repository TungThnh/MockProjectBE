package vn.com.fsoft.tgdd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author HOANG KHA
 *
 */
@Entity
@Table(name = "category")
public class Category {

	@Id
	@Column(name = "category_id")
	private int categoryID;
	
	@Column(name = "category_name")
	private String categoryName;
	
	@Column(name = "status")
	private Boolean status;
	
	@Column(name = "category_level")
	private Integer categoryLevel;
	
	@Column(name = "category_parent")
	private String categoryParent;
	
	
	
	public Category() {
	}



	public Category(String categoryName, Boolean status) {
		super();
		this.categoryName = categoryName;
		this.status = status;
	}
	
	
	
	public Category(int categoryID, String categoryName, Boolean status, Integer categoryLevel,
			String categoryParent) {
		this.categoryID = categoryID;
		this.categoryName = categoryName;
		this.status = status;
		this.categoryLevel = categoryLevel;
		this.categoryParent = categoryParent;
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

	public Integer getCategoryLevel() {
		return categoryLevel;
	}

	public void setCategoryLevel(Integer categoryLevel) {
		this.categoryLevel = categoryLevel;
	}

	public String getCategoryParent() {
		return categoryParent;
	}

	public void setCategoryParent(String categoryParent) {
		this.categoryParent = categoryParent;
	}
}
