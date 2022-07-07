package vn.com.fsoft.tgdd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_specification")
public class ProductSpecification {
	
	@Id
	@Column(name = "id")
	private Integer ID;
	
	@Column(name = "product_specification")
	private String specification;
	
	@Column(name = "product_id")
	private String productID;

	public ProductSpecification() {
	}

	public ProductSpecification(Integer iD, String specification, String productID) {
		ID = iD;
		this.specification = specification;
		this.productID = productID;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}	
}
