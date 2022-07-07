package vn.com.fsoft.tgdd.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_offer")
public class ProductOffer {
	
	@Id
	@Column(name = "offer_id")
	private Integer offerID;
	
	@Column(name = "offer_description")
	private String offerDescription;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;
	
	@Column(name = "product_id")
	private String productID;

	public ProductOffer() {
	}

	public ProductOffer(Integer offerID, String offerDescription, Date startDate, Date endDate, String productID) {
		this.offerID = offerID;
		this.offerDescription = offerDescription;
		this.startDate = startDate;
		this.endDate = endDate;
		this.productID = productID;
	}

	public Integer getOfferID() {
		return offerID;
	}

	public void setOfferID(Integer offerID) {
		this.offerID = offerID;
	}

	public String getOfferDescription() {
		return offerDescription;
	}

	public void setOfferDescription(String offerDescription) {
		this.offerDescription = offerDescription;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}
	
	
	
	
}
