package vn.com.fsoft.tgdd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "screen_size")
public class ScreenSize {
	
	@Id
	@Column(name = "screen_size_id")
	private Integer screenSizeID;
	
	@Column(name = "category_id")
	private String categoryID;
	
	@Column(name = "size")
	private Float size;

	public ScreenSize() {
	}

	public ScreenSize(Integer screenSizeID, String categoryID, Float size) {
		this.screenSizeID = screenSizeID;
		this.categoryID = categoryID;
		this.size = size;
	}

	public Integer getScreenSizeID() {
		return screenSizeID;
	}

	public void setScreenSizeID(Integer screenSizeID) {
		this.screenSizeID = screenSizeID;
	}

	public String getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}

	public Float getSize() {
		return size;
	}

	public void setSize(Float size) {
		this.size = size;
	}
	
	
	
}
