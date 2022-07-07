package vn.com.fsoft.tgdd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "District")
public class District {
	@Id
	@Column(name = "district_id")
	private int districtID;
	
	@Column(name = "district_name")
	private String districtName;

	public District() {

	}

	public District(int districtID, String districtName) {

		this.districtID = districtID;
		this.districtName = districtName;
	}

	public int getDistrictID() {
		return districtID;
	}

	public void setDistrictID(int districtID) {
		this.districtID = districtID;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	
	
	
}
