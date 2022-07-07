package vn.com.fsoft.tgdd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "City")
public class City {
	
	@Id
	@Column(name = "city_id")
	private Integer cityID;
	
	@Column(name = "city_name")
	private String cityName;

	public City() {

	}

	public City(Integer cityID, String cityName) {

		this.cityID = cityID;
		this.cityName = cityName;
	}

	public Integer getCityID() {
		return cityID;
	}

	public void setCityID(Integer cityID) {
		this.cityID = cityID;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	
}
