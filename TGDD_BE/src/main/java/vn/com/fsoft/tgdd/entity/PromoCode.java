package vn.com.fsoft.tgdd.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "promo_code")
public class PromoCode {
	
	@Id
	@Column(name = "prom_code_id")
	private Integer promoCodeID;
	
	@Column(name = "promo_code_name")
	private String promoCodeName;
	
	@Column(name = "promo_code_description")
	private String promoCodeDescription;
	
	@Column(name = "promo_type")
	private String promoType;
	
	@Column(name = "discount")
	private float discount;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;

	public PromoCode() {

	}

	public PromoCode(Integer promoCodeID, String promoCodeName, String promoCodeDescription, String promoType,
			float discount, Date startDate, Date endDate) {

		this.promoCodeID = promoCodeID;
		this.promoCodeName = promoCodeName;
		this.promoCodeDescription = promoCodeDescription;
		this.promoType = promoType;
		this.discount = discount;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Integer getPromoCodeID() {
		return promoCodeID;
	}

	public void setPromoCodeID(Integer promoCodeID) {
		this.promoCodeID = promoCodeID;
	}

	public String getPromoCodeName() {
		return promoCodeName;
	}

	public void setPromoCodeName(String promoCodeName) {
		this.promoCodeName = promoCodeName;
	}

	public String getPromoCodeDescription() {
		return promoCodeDescription;
	}

	public void setPromoCodeDescription(String promoCodeDescription) {
		this.promoCodeDescription = promoCodeDescription;
	}

	public String getPromoType() {
		return promoType;
	}

	public void setPromoType(String promoType) {
		this.promoType = promoType;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
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
	
	
}
