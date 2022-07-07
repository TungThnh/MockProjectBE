package vn.com.fsoft.tgdd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "store")
public class Store {
	@Id
	@Column(name = "store_id")
	private String storeID;
	
	@Column(name = "store_name")
	private String storeName;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "open_hours")
	private String openHours;
	
	@Column(name = "imageGalleryproduct_articlePath")
	private String imageGalleryproductArticlePath;
	
	@Column(name = "district_id")
	private Integer districtID;
	
	@Column(name = "ward_id")
	private Integer wardID;
	
	@Column(name = "city_id")
	private Integer cityID;

	public Store() {
	}

	public Store(String storeID, String storeName, String address, String openHours,
			String imageGalleryproductArticlePath, Integer districtID, Integer wardID, Integer cityID) {
		this.storeID = storeID;
		this.storeName = storeName;
		this.address = address;
		this.openHours = openHours;
		this.imageGalleryproductArticlePath = imageGalleryproductArticlePath;
		this.districtID = districtID;
		this.wardID = wardID;
		this.cityID = cityID;
	}

	public String getStoreID() {
		return storeID;
	}

	public void setStoreID(String storeID) {
		this.storeID = storeID;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOpenHours() {
		return openHours;
	}

	public void setOpenHours(String openHours) {
		this.openHours = openHours;
	}

	public String getImageGalleryproductArticlePath() {
		return imageGalleryproductArticlePath;
	}

	public void setImageGalleryproductArticlePath(String imageGalleryproductArticlePath) {
		this.imageGalleryproductArticlePath = imageGalleryproductArticlePath;
	}

	public Integer getDistrictID() {
		return districtID;
	}

	public void setDistrictID(Integer districtID) {
		this.districtID = districtID;
	}

	public Integer getWardID() {
		return wardID;
	}

	public void setWardID(Integer wardID) {
		this.wardID = wardID;
	}

	public Integer getCityID() {
		return cityID;
	}

	public void setCityID(Integer cityID) {
		this.cityID = cityID;
	}
	
}

