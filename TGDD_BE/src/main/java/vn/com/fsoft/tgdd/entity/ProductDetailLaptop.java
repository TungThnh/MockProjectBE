package vn.com.fsoft.tgdd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_detail_laptop")
public class ProductDetailLaptop {

	@Id
	@Column(name = "product_id")
	private String productID;
	
	@Column(name = "cpu")
	private String cpu;
	
	@Column(name = "core")
	private String core;
	
	@Column(name = "cpu_speed")
	private Float cpuSpeed;
	
	@Column(name = "max_speed")
	private Float maxSpeed;
	
	@Column(name = "cache")
	private Integer cache;
	
	@Column(name = "ram")
	private Integer ram;
	
	@Column(name = "ram_type")
	private String ramType;
	
	@Column(name = "bus_ram")
	private Integer busRam;
	
	@Column(name = "max_ram")
	private Integer maxRam;
	
	@Column(name = "rom")
	private Integer rom;
	
	@Column(name = "rom_update")
	private Integer romUpdate;
	
	@Column(name = "screen_size")
	private Integer screenSize;
	
	@Column(name = "Resolution")
	private Integer resolution;
	
	@Column(name = "scan_frequency")
	private Integer scanFrequency;
	
	@Column(name = "screen_technology")
	private String screenTechnology;
	
	@Column(name = "sound_card")
	private String soundCard;
	
	@Column(name = "communication_port")
	private String communicationPort;
	
	@Column(name = "bluetooth")
	private String bluetooth;
	
	@Column(name = "memory_card_reader")
	private String memoryCardReader;
	
	@Column(name = "webcam")
	private String webcam;
	
	@Column(name = "keyboard_color")
	private String keyboardColor;
	
	@Column(name = "length")
	private Float length;
	
	@Column(name = "width")
	private Float width;
	
	@Column(name = "weight")
	private Float weight;
	
	@Column(name = "material")
	private String material;
	
	@Column(name = "battery")
	private Float battery;
	
	@Column(name = "operating_system")
	private String operatingSystem;
	
	@Column(name = "release_time")
	private String releaseTime;

	public ProductDetailLaptop() {
	
	}

	public ProductDetailLaptop(String productID, String cpu, String core, Float cpuSpeed, Float maxSpeed,
			Integer cache, Integer ram, String ramType, Integer busRam, Integer maxRam, Integer rom,
			Integer romUpdate, Integer screenSize, Integer resolution, Integer scanFrequency,
			String screenTechnology, String soundCard, String communicationPort, String bluetooth,
			String memoryCardReader, String webcam, String keyboardColor, Float length, Float width, Float weight,
			String material, Float battery, String operatingSystem, String releaseTime) {
		this.productID = productID;
		this.cpu = cpu;
		this.core = core;
		this.cpuSpeed = cpuSpeed;
		this.maxSpeed = maxSpeed;
		this.cache = cache;
		this.ram = ram;
		this.ramType = ramType;
		this.busRam = busRam;
		this.maxRam = maxRam;
		this.rom = rom;
		this.romUpdate = romUpdate;
		this.screenSize = screenSize;
		this.resolution = resolution;
		this.scanFrequency = scanFrequency;
		this.screenTechnology = screenTechnology;
		this.soundCard = soundCard;
		this.communicationPort = communicationPort;
		this.bluetooth = bluetooth;
		this.memoryCardReader = memoryCardReader;
		this.webcam = webcam;
		this.keyboardColor = keyboardColor;
		this.length = length;
		this.width = width;
		this.weight = weight;
		this.material = material;
		this.battery = battery;
		this.operatingSystem = operatingSystem;
		this.releaseTime = releaseTime;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getCore() {
		return core;
	}

	public void setCore(String core) {
		this.core = core;
	}

	public Float getCpuSpeed() {
		return cpuSpeed;
	}

	public void setCpuSpeed(Float cpuSpeed) {
		this.cpuSpeed = cpuSpeed;
	}

	public Float getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(Float maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public Integer getCache() {
		return cache;
	}

	public void setCache(Integer cache) {
		this.cache = cache;
	}

	public Integer getRam() {
		return ram;
	}

	public void setRam(Integer ram) {
		this.ram = ram;
	}

	public String getRamType() {
		return ramType;
	}

	public void setRamType(String ramType) {
		this.ramType = ramType;
	}

	public Integer getBusRam() {
		return busRam;
	}

	public void setBusRam(Integer busRam) {
		this.busRam = busRam;
	}

	public Integer getMaxRam() {
		return maxRam;
	}

	public void setMaxRam(Integer maxRam) {
		this.maxRam = maxRam;
	}

	public Integer getRom() {
		return rom;
	}

	public void setRom(Integer rom) {
		this.rom = rom;
	}

	public Integer getRomUpdate() {
		return romUpdate;
	}

	public void setRomUpdate(Integer romUpdate) {
		this.romUpdate = romUpdate;
	}

	public Integer getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(Integer screenSize) {
		this.screenSize = screenSize;
	}

	public Integer getResolution() {
		return resolution;
	}

	public void setResolution(Integer resolution) {
		this.resolution = resolution;
	}

	public Integer getScanFrequency() {
		return scanFrequency;
	}

	public void setScanFrequency(Integer scanFrequency) {
		this.scanFrequency = scanFrequency;
	}

	public String getScreenTechnology() {
		return screenTechnology;
	}

	public void setScreenTechnology(String screenTechnology) {
		this.screenTechnology = screenTechnology;
	}

	public String getSoundCard() {
		return soundCard;
	}

	public void setSoundCard(String soundCard) {
		this.soundCard = soundCard;
	}

	public String getCommunicationPort() {
		return communicationPort;
	}

	public void setCommunicationPort(String communicationPort) {
		this.communicationPort = communicationPort;
	}

	public String getBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(String bluetooth) {
		this.bluetooth = bluetooth;
	}

	public String getMemoryCardReader() {
		return memoryCardReader;
	}

	public void setMemoryCardReader(String memoryCardReader) {
		this.memoryCardReader = memoryCardReader;
	}

	public String getWebcam() {
		return webcam;
	}

	public void setWebcam(String webcam) {
		this.webcam = webcam;
	}

	public String getKeyboardColor() {
		return keyboardColor;
	}

	public void setKeyboardColor(String keyboardColor) {
		this.keyboardColor = keyboardColor;
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

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Float getBattery() {
		return battery;
	}

	public void setBattery(Float battery) {
		this.battery = battery;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getReleaseTime() {
		return releaseTime;
	}

	public void setReleaseTime(String releaseTime) {
		this.releaseTime = releaseTime;
	}
	
	

	
}
