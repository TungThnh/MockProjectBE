package vn.com.fsoft.tgdd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "color_variant")
public class ColorVariant {
	
	@Id
	@Column(name = "id")
	private Integer ID;
	
	@Column(name = "product_id")
	private String productID;
	
	@Column(name = "image_gallery_path")
	private String imageGalleryPath;
	
	@Column(name = "color_id")
	private String colorID;

	public ColorVariant() {
	}

	public ColorVariant(Integer iD, String productID, String imageGalleryPath, String colorID) {
		ID = iD;
		this.productID = productID;
		this.imageGalleryPath = imageGalleryPath;
		this.colorID = colorID;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getImageGalleryPath() {
		return imageGalleryPath;
	}

	public void setImageGalleryPath(String imageGalleryPath) {
		this.imageGalleryPath = imageGalleryPath;
	}

	public String getColorID() {
		return colorID;
	}

	public void setColorID(String colorID) {
		this.colorID = colorID;
	}
}
