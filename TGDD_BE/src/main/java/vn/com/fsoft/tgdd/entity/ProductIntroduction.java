package vn.com.fsoft.tgdd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_introduction")
public class ProductIntroduction {
	
	@Id
	@Column(name = "id")
	private Integer proIntroID;
	
	@Column(name = "productID")
	private String productID;
	
	@Column(name = "image_1")
	private String imagePath1;
	
	@Column(name = "description_1")
	private String description1;
	
	@Column(name = "image_2")
	private String imagePath2;
	
	@Column(name = "description_2")
	private String description2;
	
	@Column(name = "image_3")
	private String imagePath3;
	
	@Column(name = "description_3")
	private String description3;

	public ProductIntroduction() {

	}

	public ProductIntroduction(Integer proIntroID, String productID, String imagePath1, String description1,
			String imagePath2, String description2, String imagePath3, String description3) {
		this.proIntroID = proIntroID;
		this.productID = productID;
		this.imagePath1 = imagePath1;
		this.description1 = description1;
		this.imagePath2 = imagePath2;
		this.description2 = description2;
		this.imagePath3 = imagePath3;
		this.description3 = description3;
	}

	public Integer getProIntroID() {
		return proIntroID;
	}

	public void setProIntroID(Integer proIntroID) {
		this.proIntroID = proIntroID;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getImagePath1() {
		return imagePath1;
	}

	public void setImagePath1(String imagePath1) {
		this.imagePath1 = imagePath1;
	}

	public String getDescription1() {
		return description1;
	}

	public void setDescription1(String description1) {
		this.description1 = description1;
	}

	public String getImagePath2() {
		return imagePath2;
	}

	public void setImagePath2(String imagePath2) {
		this.imagePath2 = imagePath2;
	}

	public String getDescription2() {
		return description2;
	}

	public void setDescription2(String description2) {
		this.description2 = description2;
	}

	public String getImagePath3() {
		return imagePath3;
	}

	public void setImagePath3(String imagePath3) {
		this.imagePath3 = imagePath3;
	}

	public String getDescription3() {
		return description3;
	}

	public void setDescription3(String description3) {
		this.description3 = description3;
	}
	
	
	
}
