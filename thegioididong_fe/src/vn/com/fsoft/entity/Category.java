package vn.com.fsoft.entity;


public class Category {

	private String categoryID;	
	private String categoryName;
	private Boolean status;
	private Integer categoryLevel;
	private String categoryParent;

	
	public Category() {
	}

	public Category(String categoryName, Boolean status) {
		super();
		this.categoryName = categoryName;
		this.status = status;
	}
	
	public Category(String categoryID, String categoryName, Boolean status, Integer categoryLevel,
			String categoryParent) {
		this.categoryID = categoryID;
		this.categoryName = categoryName;
		this.status = status;
		this.categoryLevel = categoryLevel;
		this.categoryParent = categoryParent;
	}

	public String getCategoryID() {
		return categoryID;
	}



	public void setCategoryID(String categoryID) {
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
