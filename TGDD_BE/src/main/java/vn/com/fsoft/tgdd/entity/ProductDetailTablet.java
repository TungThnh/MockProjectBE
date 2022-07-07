package vn.com.fsoft.tgdd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_detail_tablet")
public class ProductDetailTablet {

	@Id
	@Column(name = "product_id")
	private String productId;
	
	@Column(name = "screen_technology")
	private String screenTechnology;
	
	@Column(name = "Resolution")
	private Integer resolution;
	
	@Column(name = "screen_size")
	private Integer screen_size;
	
	@Column(name = "operating_system")
	private String operatingSystem;
	
	@Column(name = "cpu")
	private String cpu;
	
	@Column(name = "cpu_speed")
	private String cpuSpeed;
	
	@Column(name = "gpu")
	private String gpu;
	
	@Column(name = "ram")
	private Integer ram;
	
	@Column(name = "rom")
	private Integer rom;
	
	@Column(name = "rom_available")
	private Integer rom_available;
	
	@Column(name = "external_memory_card")
	private String externalMemoryCard;
	
	@Column(name = "rear_camera_resolution")
	private String rearCameraResolution;
	
	@Column(name = "movie")
	private String movie;
	
	@Column(name = "feature_rear_camera")
	private String featureRearCamera;
	
	@Column(name = "front_camera_resolution")
	private String frontCameraResolution;
	
	@Column(name = "mobile_network_support")
	private String mobileNetworkSupport;
	
	@Column(name = "sim")
	private String sim;
	
	@Column(name = "can_call")
	private Boolean canCall;
	
	@Column(name = "wifi")
	private String wifi;
	
	@Column(name = "gps")
	private String gps;
	
	@Column(name = "bluetooth")
	private String bluetooth;
	
	@Column(name = "charge_port")
	private String chargePort;
	
	@Column(name = "headphone_port")
	private String headphonePort;
	
	@Column(name = "other_port")
	private String otherPort;
	
	@Column(name = "record")
	private Boolean record;
	
	@Column(name = "radio")
	private Boolean radio;
	
	@Column(name = "battery")
	private Integer battery;
	
	@Column(name = "battery_type")
	private Integer batteryType;
	
	@Column(name = "max_charge_suppport")
	private Integer maxChargeSuppport;
	
	@Column(name = "material")
	private String material;
	
	@Column(name = "length")
	private Float length;
	
	@Column(name = "width")
	private Float width;
	
	@Column(name = "weight")
	private Float weight;
	
	@Column(name = "release_time")
	private String release_time;

	public ProductDetailTablet() {
	
	}

	public ProductDetailTablet(String productId, String screenTechnology, Integer resolution, Integer screen_size,
			String operatingSystem, String cpu, String cpuSpeed, String gpu, Integer ram, Integer rom,
			Integer rom_available, String externalMemoryCard, String rearCameraResolution, String movie,
			String featureRearCamera, String frontCameraResolution, String mobileNetworkSupport, String sim,
			Boolean canCall, String wifi, String gps, String bluetooth, String chargePort, String headphonePort,
			String otherPort, Boolean record, Boolean radio, Integer battery, Integer batteryType,
			Integer maxChargeSuppport, String material, Float length, Float width, Float weight, String release_time) {

		this.productId = productId;
		this.screenTechnology = screenTechnology;
		this.resolution = resolution;
		this.screen_size = screen_size;
		this.operatingSystem = operatingSystem;
		this.cpu = cpu;
		this.cpuSpeed = cpuSpeed;
		this.gpu = gpu;
		this.ram = ram;
		this.rom = rom;
		this.rom_available = rom_available;
		this.externalMemoryCard = externalMemoryCard;
		this.rearCameraResolution = rearCameraResolution;
		this.movie = movie;
		this.featureRearCamera = featureRearCamera;
		this.frontCameraResolution = frontCameraResolution;
		this.mobileNetworkSupport = mobileNetworkSupport;
		this.sim = sim;
		this.canCall = canCall;
		this.wifi = wifi;
		this.gps = gps;
		this.bluetooth = bluetooth;
		this.chargePort = chargePort;
		this.headphonePort = headphonePort;
		this.otherPort = otherPort;
		this.record = record;
		this.radio = radio;
		this.battery = battery;
		this.batteryType = batteryType;
		this.maxChargeSuppport = maxChargeSuppport;
		this.material = material;
		this.length = length;
		this.width = width;
		this.weight = weight;
		this.release_time = release_time;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getScreenTechnology() {
		return screenTechnology;
	}

	public void setScreenTechnology(String screenTechnology) {
		this.screenTechnology = screenTechnology;
	}

	public Integer getResolution() {
		return resolution;
	}

	public void setResolution(Integer resolution) {
		this.resolution = resolution;
	}

	public Integer getScreen_size() {
		return screen_size;
	}

	public void setScreen_size(Integer screen_size) {
		this.screen_size = screen_size;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getCpuSpeed() {
		return cpuSpeed;
	}

	public void setCpuSpeed(String cpuSpeed) {
		this.cpuSpeed = cpuSpeed;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public Integer getRam() {
		return ram;
	}

	public void setRam(Integer ram) {
		this.ram = ram;
	}

	public Integer getRom() {
		return rom;
	}

	public void setRom(Integer rom) {
		this.rom = rom;
	}

	public Integer getRom_available() {
		return rom_available;
	}

	public void setRom_available(Integer rom_available) {
		this.rom_available = rom_available;
	}

	public String getExternalMemoryCard() {
		return externalMemoryCard;
	}

	public void setExternalMemoryCard(String externalMemoryCard) {
		this.externalMemoryCard = externalMemoryCard;
	}

	public String getRearCameraResolution() {
		return rearCameraResolution;
	}

	public void setRearCameraResolution(String rearCameraResolution) {
		this.rearCameraResolution = rearCameraResolution;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public String getFeatureRearCamera() {
		return featureRearCamera;
	}

	public void setFeatureRearCamera(String featureRearCamera) {
		this.featureRearCamera = featureRearCamera;
	}

	public String getFrontCameraResolution() {
		return frontCameraResolution;
	}

	public void setFrontCameraResolution(String frontCameraResolution) {
		this.frontCameraResolution = frontCameraResolution;
	}

	public String getMobileNetworkSupport() {
		return mobileNetworkSupport;
	}

	public void setMobileNetworkSupport(String mobileNetworkSupport) {
		this.mobileNetworkSupport = mobileNetworkSupport;
	}

	public String getSim() {
		return sim;
	}

	public void setSim(String sim) {
		this.sim = sim;
	}

	public Boolean getCanCall() {
		return canCall;
	}

	public void setCanCall(Boolean canCall) {
		this.canCall = canCall;
	}

	public String getWifi() {
		return wifi;
	}

	public void setWifi(String wifi) {
		this.wifi = wifi;
	}

	public String getGps() {
		return gps;
	}

	public void setGps(String gps) {
		this.gps = gps;
	}

	public String getBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(String bluetooth) {
		this.bluetooth = bluetooth;
	}

	public String getChargePort() {
		return chargePort;
	}

	public void setChargePort(String chargePort) {
		this.chargePort = chargePort;
	}

	public String getHeadphonePort() {
		return headphonePort;
	}

	public void setHeadphonePort(String headphonePort) {
		this.headphonePort = headphonePort;
	}

	public String getOtherPort() {
		return otherPort;
	}

	public void setOtherPort(String otherPort) {
		this.otherPort = otherPort;
	}

	public Boolean getRecord() {
		return record;
	}

	public void setRecord(Boolean record) {
		this.record = record;
	}

	public Boolean getRadio() {
		return radio;
	}

	public void setRadio(Boolean radio) {
		this.radio = radio;
	}

	public Integer getBattery() {
		return battery;
	}

	public void setBattery(Integer battery) {
		this.battery = battery;
	}

	public Integer getBatteryType() {
		return batteryType;
	}

	public void setBatteryType(Integer batteryType) {
		this.batteryType = batteryType;
	}

	public Integer getMaxChargeSuppport() {
		return maxChargeSuppport;
	}

	public void setMaxChargeSuppport(Integer maxChargeSuppport) {
		this.maxChargeSuppport = maxChargeSuppport;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Float getLength() {
		return length;
	}

	public void setLength(Float length) {
		this.length = length;
	}

	public Float getWidth() {
		return width;
	}

	public void setWidth(Float width) {
		this.width = width;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public String getRelease_time() {
		return release_time;
	}

	public void setRelease_time(String release_time) {
		this.release_time = release_time;
	}
	
}
