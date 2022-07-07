package vn.com.fsoft.tgdd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_detail_phone")
public class ProductDetailPhone {
	
	@Id
	@Column(name = "product_id")
	private String productId;
	
	@Column(name = "screen_technology")
	private String screenTechnology;
	
	@Column(name = "Resolution")
	private Integer resolution;
	
	@Column(name = "screen_size")
	private Integer screenSize;
	
	@Column(name = "maximum_brightness")
	private Integer maximumBrightness;
	
	@Column(name = "tough_screen")
	private String toughScreen;
	
	@Column(name = "rear_camera_resolution")
	private String rearCameraResolution;
	
	@Column(name = "video")
	private String video;
	
	@Column(name = "flash")
	private String flash;
	
	@Column(name = "feature_rear_camera")
	private String featureRearCamera;
	
	@Column(name = "front_camera_resolution")
	private String frontCameraResolution;
	
	@Column(name = "feature_front_camera")
	private String featureFrontCamera;
	
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
	private Integer romAvailable;
	
	@Column(name = "telephone_directory")
	private String telephoneDirectory;
	
	@Column(name = "mobile_network_support")
	private String mobileNetworkSupport;
	
	@Column(name = "sim")
	private String sim;
	
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
	
	@Column(name = "battery")
	private String battery;
	
	@Column(name = "battery_type")
	private String batteryType;
	
	@Column(name = "max_charge_suppport")
	private String maxChargeSuppport;
	
	@Column(name = "battery_technology")
	private String batteryTechnology;
	
	@Column(name = "security")
	private String security;
	
	@Column(name = "microphone")
	private String microphone;
	
	@Column(name = "design")
	private String design;
	
	@Column(name = "material")
	private String material;
	
	@Column(name = "length")
	private Float length;
	
	@Column(name = "width")
	private Float width;
	
	@Column(name = "weight")
	private Float weight;
	
	@Column(name = "release_time")
	private String releaseTime;

	public ProductDetailPhone() {

	}

	public ProductDetailPhone(String productId, String screenTechnology, Integer resolution, Integer screenSize,
			Integer maximumBrightness, String toughScreen, String rearCameraResolution, String video, String flash,
			String featureRearCamera, String frontCameraResolution, String featureFrontCamera, String operatingSystem,
			String cpu, String cpuSpeed, String gpu, Integer ram, Integer rom, Integer romAvailable,
			String telephoneDirectory, String mobileNetworkSupport, String sim, String wifi, String gps,
			String bluetooth, String chargePort, String headphonePort, String otherPort, String battery,
			String batteryType, String maxChargeSuppport, String batteryTechnology, String security, String microphone,
			String design, String material, Float length, Float width, Float weight, String releaseTime) {
		this.productId = productId;
		this.screenTechnology = screenTechnology;
		this.resolution = resolution;
		this.screenSize = screenSize;
		this.maximumBrightness = maximumBrightness;
		this.toughScreen = toughScreen;
		this.rearCameraResolution = rearCameraResolution;
		this.video = video;
		this.flash = flash;
		this.featureRearCamera = featureRearCamera;
		this.frontCameraResolution = frontCameraResolution;
		this.featureFrontCamera = featureFrontCamera;
		this.operatingSystem = operatingSystem;
		this.cpu = cpu;
		this.cpuSpeed = cpuSpeed;
		this.gpu = gpu;
		this.ram = ram;
		this.rom = rom;
		this.romAvailable = romAvailable;
		this.telephoneDirectory = telephoneDirectory;
		this.mobileNetworkSupport = mobileNetworkSupport;
		this.sim = sim;
		this.wifi = wifi;
		this.gps = gps;
		this.bluetooth = bluetooth;
		this.chargePort = chargePort;
		this.headphonePort = headphonePort;
		this.otherPort = otherPort;
		this.battery = battery;
		this.batteryType = batteryType;
		this.maxChargeSuppport = maxChargeSuppport;
		this.batteryTechnology = batteryTechnology;
		this.security = security;
		this.microphone = microphone;
		this.design = design;
		this.material = material;
		this.length = length;
		this.width = width;
		this.weight = weight;
		this.releaseTime = releaseTime;
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

	public Integer getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(Integer screenSize) {
		this.screenSize = screenSize;
	}

	public Integer getMaximumBrightness() {
		return maximumBrightness;
	}

	public void setMaximumBrightness(Integer maximumBrightness) {
		this.maximumBrightness = maximumBrightness;
	}

	public String getToughScreen() {
		return toughScreen;
	}

	public void setToughScreen(String toughScreen) {
		this.toughScreen = toughScreen;
	}

	public String getRearCameraResolution() {
		return rearCameraResolution;
	}

	public void setRearCameraResolution(String rearCameraResolution) {
		this.rearCameraResolution = rearCameraResolution;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getFlash() {
		return flash;
	}

	public void setFlash(String flash) {
		this.flash = flash;
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

	public String getFeatureFrontCamera() {
		return featureFrontCamera;
	}

	public void setFeatureFrontCamera(String featureFrontCamera) {
		this.featureFrontCamera = featureFrontCamera;
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

	public Integer getRomAvailable() {
		return romAvailable;
	}

	public void setRomAvailable(Integer romAvailable) {
		this.romAvailable = romAvailable;
	}

	public String getTelephoneDirectory() {
		return telephoneDirectory;
	}

	public void setTelephoneDirectory(String telephoneDirectory) {
		this.telephoneDirectory = telephoneDirectory;
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

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public String getBatteryType() {
		return batteryType;
	}

	public void setBatteryType(String batteryType) {
		this.batteryType = batteryType;
	}

	public String getMaxChargeSuppport() {
		return maxChargeSuppport;
	}

	public void setMaxChargeSuppport(String maxChargeSuppport) {
		this.maxChargeSuppport = maxChargeSuppport;
	}

	public String getBatteryTechnology() {
		return batteryTechnology;
	}

	public void setBatteryTechnology(String batteryTechnology) {
		this.batteryTechnology = batteryTechnology;
	}

	public String getSecurity() {
		return security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}

	public String getMicrophone() {
		return microphone;
	}

	public void setMicrophone(String microphone) {
		this.microphone = microphone;
	}

	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
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

	public String getReleaseTime() {
		return releaseTime;
	}

	public void setReleaseTime(String releaseTime) {
		this.releaseTime = releaseTime;
	}
	
	
	
}
