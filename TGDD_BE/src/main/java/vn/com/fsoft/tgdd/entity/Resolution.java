package vn.com.fsoft.tgdd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Resolution")
public class Resolution {
	
	@Id
	@Column(name = "resolution_id")
	private int resolutionID;
	
	@Column(name = "category_id")
	private String categoryID;
	
	@Column(name = "resolution_size")
	private String resolutionSize;

	public Resolution() {
	
	}

	public Resolution(int resolutionID, String categoryID, String resolutionSize) {

		this.resolutionID = resolutionID;
		this.categoryID = categoryID;
		this.resolutionSize = resolutionSize;
	}

	public int getResolutionID() {
		return resolutionID;
	}

	public void setResolutionID(int resolutionID) {
		this.resolutionID = resolutionID;
	}

	public String getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}

	public String getResolutionSize() {
		return resolutionSize;
	}

	public void setResolutionSize(String resolutionSize) {
		this.resolutionSize = resolutionSize;
	}
	
	
	
}
