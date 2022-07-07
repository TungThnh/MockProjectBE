package vn.com.fsoft.tgdd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "scan_frequency")
public class ScanFrequency {
	
	@Id
	@Column(name = "scan_frequency_id")
	private Integer scanFrequencyID;
	
	@Column(name = "scan_frequency_detail")
	private String scanFrequencyDetail;

	public ScanFrequency() {
	}

	public ScanFrequency(Integer scanFrequencyID, String scanFrequencyDetail) {
		this.scanFrequencyID = scanFrequencyID;
		this.scanFrequencyDetail = scanFrequencyDetail;
	}

	public Integer getScanFrequencyID() {
		return scanFrequencyID;
	}

	public void setScanFrequencyID(Integer scanFrequencyID) {
		this.scanFrequencyID = scanFrequencyID;
	}

	public String getScanFrequencyDetail() {
		return scanFrequencyDetail;
	}

	public void setScanFrequencyDetail(String scanFrequencyDetail) {
		this.scanFrequencyDetail = scanFrequencyDetail;
	}
	
}
