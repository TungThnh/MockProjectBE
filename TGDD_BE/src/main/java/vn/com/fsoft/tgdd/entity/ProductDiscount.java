package vn.com.fsoft.tgdd.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_discount")
public class ProductDiscount {
	
	@Id
	@Column(name = "discount_id")
	private Integer discountID;
	
	@Column(name = "discounted_price")
	private Float discountPrice;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;
	
	@Column(name = "product_id")
	private String productID;

	public ProductDiscount() {
	
	}

	public ProductDiscount(Integer discountID, Float discountPrice, Date startDate, Date endDate, String productID) {
		super();
		this.discountID = discountID;
		this.discountPrice = discountPrice;
		this.startDate = startDate;
		this.endDate = endDate;
		this.productID = productID;
	}

	public Integer getDiscountID() {
		return discountID;
	}

	public void setDiscountID(Integer discountID) {
		this.discountID = discountID;
	}

	public Float getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(Float discountPrice) {
		this.discountPrice = discountPrice;
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
