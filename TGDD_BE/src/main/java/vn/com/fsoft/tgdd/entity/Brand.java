package vn.com.fsoft.tgdd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "brand")
public class Brand {
	@Id
	@Column(name = "brand_id")
	private Integer brandID;
	
	@Column(name = "brand_name")
	private String brandName;

	public Brand() {

	}

	public Brand(Integer brandID, String brandName) {
		super();
		this.brandID = brandID;
		this.brandName = brandName;
	}

	public Integer getBrandID() {
		return brandID;
	}

	public void setBrandID(Integer brandID) {
		this.brandID = brandID;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	
}
