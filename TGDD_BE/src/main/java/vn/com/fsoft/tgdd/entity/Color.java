package vn.com.fsoft.tgdd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "color")
public class Color {
	
	@Id
	@Column(name = "color_name")
	private String colorName;
	
	@Column(name = "color_id")
	private Integer colorID;

	public Color() {
	
	}

	public Color(String colorName, Integer colorID) {

		this.colorName = colorName;
		this.colorID = colorID;
	}

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	public Integer getColorID() {
		return colorID;
	}

	public void setColorID(Integer colorID) {
		this.colorID = colorID;
	}
	
	
}
