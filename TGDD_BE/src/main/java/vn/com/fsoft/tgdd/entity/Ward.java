package vn.com.fsoft.tgdd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ward")
public class Ward {
	
	@Id
	@Column(name = "ward_id")
	private Integer wardID;
	
	@Column(name = "ward_name")
	private String wardName;

	public Ward() {
	}

	public Ward(Integer wardID, String wardName) {
		this.wardID = wardID;
		this.wardName = wardName;
	}

	public Integer getWardID() {
		return wardID;
	}

	public void setWardID(Integer wardID) {
		this.wardID = wardID;
	}

	public String getWardName() {
		return wardName;
	}

	public void setWardName(String wardName) {
		this.wardName = wardName;
	}
	
}
