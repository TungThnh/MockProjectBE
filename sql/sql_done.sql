-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: thegioididong
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `user_id` char(10) NOT NULL,
  `full_name` varchar(50) NOT NULL,
  `user_name` varchar(50) NOT NULL,
  `password` varchar(500) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES ('1','admin','admin','$2a$10$3x23nDrvG/UCxqGZIkMZ3OV9miH2FlI5RopVImJy8K50t/oqFxngu');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `brand`
--

DROP TABLE IF EXISTS `brand`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `brand` (
  `brand_id` int NOT NULL AUTO_INCREMENT,
  `brand_name` varchar(45) NOT NULL,
  PRIMARY KEY (`brand_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `brand`
--

LOCK TABLES `brand` WRITE;
/*!40000 ALTER TABLE `brand` DISABLE KEYS */;
INSERT INTO `brand` VALUES (1,'Apple'),(2,'Samsung'),(3,'Xiaomi'),(4,'Asus'),(5,'Intel'),(6,'HP'),(7,'Acer'),(8,'Dell'),(9,'MSI'),(10,'LG'),(11,'Oppo'),(12,'Vivo'),(13,'RealMe'),(14,'Nokia'),(15,'Việt Nam');
/*!40000 ALTER TABLE `brand` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `category` (
  `category_id` varchar(50) NOT NULL,
  `category_name` varchar(50) NOT NULL,
  `status` tinyint NOT NULL,
  `category_level` int NOT NULL,
  `category_parent` int NOT NULL,
  PRIMARY KEY (`category_id`),
  UNIQUE KEY `categoryID_UNIQUE` (`category_id`),
  UNIQUE KEY `category_name_UNIQUE` (`category_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES ('1','Laptop',1,0,0),('10','Phụ kiện Laptop',1,1,8),('11','Thiết bị nhà thông minh',1,1,8),('12','Thiết bị âm thanh',1,1,8),('13','Thiết bị lưu trữ',1,1,8),('14','Thương hiệu hàng đầu',1,1,8),('15','Phụ kiện khác',1,1,8),('16','Sạc dự phòng',1,2,9),('17','Sạc cáp',1,2,9),('18','Giá đỡ điện thoại',1,2,9),('19','Chuột, bàn phím',1,2,10),('2','Điện thoại',1,0,0),('20','Thiết bị mạng',1,2,10),('21','Tai nghe',1,2,12),('22','Loa',1,2,12),('23','Khóa Điện tử',1,2,11),('24','TV box',1,2,11),('25','thẻ nhớ',1,2,13),('26','USB',1,2,13),('27','Apple',1,2,14),('28','Samsung',1,2,14),('29','Sony',1,2,14),('3','TV',1,0,0),('30','XiaoMi',1,2,14),('31','Phụ kiện ô tô',1,2,15),('32','Máy tính cầm tay',1,2,15),('6','Tablet',1,0,0),('7','Đồng Hồ',1,0,0),('8','Phụ Kiện',1,0,0),('9','Phụ kiện di động',1,1,8);
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `city`
--

DROP TABLE IF EXISTS `city`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `city` (
  `city_id` int NOT NULL,
  `city_name` varchar(100) NOT NULL,
  PRIMARY KEY (`city_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `city`
--

LOCK TABLES `city` WRITE;
/*!40000 ALTER TABLE `city` DISABLE KEYS */;
/*!40000 ALTER TABLE `city` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `color`
--

DROP TABLE IF EXISTS `color`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `color` (
  `color_name` varchar(50) NOT NULL,
  `color_id` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`color_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `color`
--

LOCK TABLES `color` WRITE;
/*!40000 ALTER TABLE `color` DISABLE KEYS */;
/*!40000 ALTER TABLE `color` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `color_variant`
--

DROP TABLE IF EXISTS `color_variant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `color_variant` (
  `id` int NOT NULL,
  `product_id` char(10) NOT NULL,
  `image_gallery_path` varchar(300) NOT NULL,
  `color_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fkColor_id_idx` (`color_id`),
  CONSTRAINT `fkColor_id` FOREIGN KEY (`color_id`) REFERENCES `color` (`color_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `color_variant`
--

LOCK TABLES `color_variant` WRITE;
/*!40000 ALTER TABLE `color_variant` DISABLE KEYS */;
/*!40000 ALTER TABLE `color_variant` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `phone_number` decimal(10,0) NOT NULL,
  `full_name` varchar(50) NOT NULL,
  `gender` char(10) NOT NULL,
  `address` varchar(200) NOT NULL,
  `city` varchar(50) NOT NULL,
  `district` varchar(50) NOT NULL,
  `ward` varchar(50) NOT NULL,
  PRIMARY KEY (`phone_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `district`
--

DROP TABLE IF EXISTS `district`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `district` (
  `district_id` int NOT NULL,
  `distric_name` varchar(100) NOT NULL,
  PRIMARY KEY (`district_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `district`
--

LOCK TABLES `district` WRITE;
/*!40000 ALTER TABLE `district` DISABLE KEYS */;
/*!40000 ALTER TABLE `district` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_detail`
--

DROP TABLE IF EXISTS `order_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order_detail` (
  `order_detail_id` int NOT NULL,
  `order_id` int NOT NULL,
  `quantity` int NOT NULL,
  `product_id` varchar(50) NOT NULL,
  `promo_code_id` int NOT NULL,
  PRIMARY KEY (`order_detail_id`),
  KEY `fkOrder_id_idx` (`order_id`),
  KEY `fkProduct_id_idx` (`product_id`),
  KEY `fkPromo_code_idx` (`promo_code_id`),
  CONSTRAINT `fkOrder_id` FOREIGN KEY (`order_id`) REFERENCES `orders` (`order_id`),
  CONSTRAINT `fkProduct_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`),
  CONSTRAINT `fkPromo_code` FOREIGN KEY (`promo_code_id`) REFERENCES `promo_code` (`prom_code_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_detail`
--

LOCK TABLES `order_detail` WRITE;
/*!40000 ALTER TABLE `order_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `order_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `order_id` int NOT NULL AUTO_INCREMENT,
  `phone_number` decimal(10,0) NOT NULL,
  `time_created` date NOT NULL,
  `total_price` float NOT NULL,
  PRIMARY KEY (`order_id`),
  KEY `fkPhone_number_idx` (`phone_number`),
  CONSTRAINT `fkPhone_number` FOREIGN KEY (`phone_number`) REFERENCES `customer` (`phone_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `product_id` varchar(50) NOT NULL,
  `product_name` varchar(500) NOT NULL,
  `price` float NOT NULL,
  `manufacturer` char(50) NOT NULL,
  `category_id` varchar(50) NOT NULL,
  `product_warranty` int NOT NULL,
  `image` varchar(300) NOT NULL,
  `status` tinyint NOT NULL,
  `brand_id` int NOT NULL,
  PRIMARY KEY (`product_id`),
  UNIQUE KEY `product_id_UNIQUE` (`product_id`),
  UNIQUE KEY `product_name_UNIQUE` (`product_name`),
  KEY `fkBrand_id_idx` (`brand_id`),
  KEY `fkCategory_id_idx` (`category_id`),
  CONSTRAINT `fkBrand_id` FOREIGN KEY (`brand_id`) REFERENCES `brand` (`brand_id`),
  CONSTRAINT `fkCategory_id` FOREIGN KEY (`category_id`) REFERENCES `category` (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES ('acer-nitro-5','Acer Nitro 5 AN515 45 R9SC R7 5800H/8GB/512GB/8GB RTX3070/144Hz/Win10 (NH.QBRSV.001) ',39990000,'Đài Loan','1',2,'https://cdn.tgdd.vn/Products/Images/44/265461/acer-nitro-5-an515-45-r9sc-r7-5800h-8gb-512gb-600x600.jpg',1,7),('asus-gaming-rog-flow-z13','Asus Gaming ROG Flow Z13 GZ301Z i7 12700H/16GB/512GB/4GB RTX3050/120Hz/Touch/Pen/Túi/Win11 (LD110W)',48990000,'Đài Loan','1',2,'https://cdn.tgdd.vn/Products/Images/44/274539/asus-gaming-rog-flow-z13-gz301z-i7-ld110w-160322-120057-600x600.jpg',1,4),('dell-gaming-alienware-m15','Dell Gaming Alienware m15 R6 i7 11800H/32GB/1TB SSD/8GB RTX3070/240Hz/OfficeHS/Win11 (70272633)',61490000,'Hoa Kỳ','1',2,'https://cdn.tgdd.vn/Products/Images/44/271090/dell-gaming-alienware-m15-r6-i7-11800h-32gb-1tb-ssd-8gb-600x600.jpg',1,8),('elio-el075-01-el075-02','Đồng hồ đôi Elio EL075-01/EL075-02',924000,'Việt Nam','7',0,'https://cdn.tgdd.vn/Products/Images/7264/234135/elio-el075-01-el075-02-nam-nu-600x600.jpg',1,15),('hp-elitebook-x360','HP EliteBook X360 1040 G8 i7 1165G7/16GB/512GB/Touch/Pen/Win10 Pro (3G1H4PA)',42090000,'Mỹ','1',1,'https://cdn.tgdd.vn/Products/Images/44/242415/hp-elitebook-x360-1040-g8-i7-3g1h4pa-18-600x600.jpg',1,6),('intel-nuc-m15','Intel NUC M15 Kit i7 1165G7/16GB/512GB/Touch/Win10 (BBC710BCUXBC1)',27990000,'Hoa kỳ','1',1,'https://cdn.tgdd.vn/Products/Images/44/265022/intel-nuc-m15-i7-bbc710bcuxbc1-thumb-1-600x600.jpg',1,5),('ipad-pro-m1-2021','iPad Pro M1 12.9 inch WiFi 128GB (2021) ',25490000,'Mỹ','6',1,'https://cdn.tgdd.vn/Products/Images/522/237699/ipad-pro-m1-129-inch-wifi-gray-600x600.jpg',1,1),('lg-gram-16','LG Gram 16 2021 i7 1165G7/16GB/512GB/Win10 (16Z90P-G.AH75A5)',40890000,'Hàn Quốc','1',1,'https://cdn.tgdd.vn/Products/Images/44/238133/lg-gram-16-i7-16z90pgah75a5-600x600.jpg',1,10),('macbook-pro-14-m1-max-2021','MacBook Pro 14 M1 Max 2021 10-core CPU/32GB/512GB/24-core GPU (Z15G)',72900000,'Mỹ','1',3,'https://cdn.tgdd.vn/Products/Images/44/263914/macbook-pro-14-m1-max-2021-10-core-cpu-600x600.jpg',1,1),('msi-creator-z16p',' MSI Creator Z16P B12UGST i7 12700H/32GB/2TB SSD/8GB RTX3070Ti Max-Q/165Hz/Túi/Chuột/Win11 (050VN) ',78990000,'Đài Loan','1',1,'https://cdn.tgdd.vn/Products/Images/44/274777/msi-creator-z16p-b12ugst-i7-050vn-200322-110128-600x600.jpg',1,9),('nokia-g21','Nokia G21',4290000,'Phần Lan','2',1,'https://cdn.tgdd.vn/Products/Images/42/270207/nokia-g21-xanh-thumb-600x600.jpg',1,14),('oppo-find-x5-pro','OPPO Find X5 Pro 5G',32990000,'Trung Quốc','2',1,'https://cdn.tgdd.vn/Products/Images/42/250622/oppo-find-x5-pro-den-thumb-600x600.jpg',1,11),('realme-9-pro','Realme 9 Pro 5G',7990000,'Trung Quốc','2',1,'https://cdn.tgdd.vn/Products/Images/42/250190/realme-9-pro-thumb-600x600.jpg',1,13),('samsung-galaxy-a52s-5g','Samsung Galaxy A52s 5G 128GB',10990000,'Hàn Quốc','2',2,'RTpcRWNsaXBzZTJcVEdERF9CQVx0YXJnZXRcY2xhc3Nlc1xzdGF0aWNcaW1hZ2VcdGVzdC5wbmc=',1,2),('samsung-galaxy-tab-s8-ultra','Samsung Galaxy Tab S8 Ultra',30990000,'Hàn Quốc','6',0,'https://cdn.tgdd.vn/Products/Images/522/247513/samsung-galaxy-tab-s8-ultra-1-600x600.jpg',1,2),('vivo-v23e','Vivo V23e',8490000,'Trung Quốc','2',1,'https://cdn.tgdd.vn/Products/Images/42/245607/Vivo-V23e-1-2-600x600.jpg',1,12),('xiaomi-mi-12','Xiaomi 12',19990000,'Trung Quốc','2',2,'https://cdn.tgdd.vn/Products/Images/42/234621/Xiaomi-12-xam-thumb-mau-600x600.jpg',1,3);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_articleproduct_reviewproduct_review`
--

DROP TABLE IF EXISTS `product_articleproduct_reviewproduct_review`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_articleproduct_reviewproduct_review` (
  `articleID` int NOT NULL,
  `articleURL` varchar(300) NOT NULL,
  `productID` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_articleproduct_reviewproduct_review`
--

LOCK TABLES `product_articleproduct_reviewproduct_review` WRITE;
/*!40000 ALTER TABLE `product_articleproduct_reviewproduct_review` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_articleproduct_reviewproduct_review` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_detail_laptop`
--

DROP TABLE IF EXISTS `product_detail_laptop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_detail_laptop` (
  `product_id` varchar(50) NOT NULL,
  `cpu` int DEFAULT NULL,
  `core` int DEFAULT NULL,
  `cpu_speed` float DEFAULT NULL,
  `max_speed` float DEFAULT NULL,
  `cache` int DEFAULT NULL,
  `ram` int DEFAULT NULL,
  `ram_type` varchar(45) DEFAULT NULL,
  `bus_ram` int DEFAULT NULL,
  `max_ram` int DEFAULT NULL,
  `rom` int DEFAULT NULL,
  `rom_update` int DEFAULT NULL,
  `screen_size` int DEFAULT NULL,
  `resolution` int DEFAULT NULL,
  `scan_frequency` int DEFAULT NULL,
  `screen_technology` varchar(45) DEFAULT NULL,
  `sound_card` varchar(45) DEFAULT NULL,
  `audio_teachnology` varchar(45) DEFAULT NULL,
  `communication_port` varchar(45) DEFAULT NULL,
  `bluetooth` varchar(45) DEFAULT NULL,
  `memory_card_reader` varchar(45) DEFAULT NULL,
  `webcam` varchar(45) DEFAULT NULL,
  `keyboard_color` varchar(45) DEFAULT NULL,
  `length` float DEFAULT NULL,
  `width` float DEFAULT NULL,
  `weight` float DEFAULT NULL,
  `material` varchar(45) DEFAULT NULL,
  `battery` float DEFAULT NULL,
  `operating_system` varchar(45) DEFAULT NULL,
  `release_time` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`product_id`),
  CONSTRAINT `fkLaptop_productID` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_detail_laptop`
--

LOCK TABLES `product_detail_laptop` WRITE;
/*!40000 ALTER TABLE `product_detail_laptop` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_detail_laptop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_detail_phone`
--

DROP TABLE IF EXISTS `product_detail_phone`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_detail_phone` (
  `product_id` varchar(50) NOT NULL,
  `screen_technology` varchar(45) DEFAULT NULL,
  `resolution` int DEFAULT NULL,
  `screen_size` int DEFAULT NULL,
  `maximum_brightness` int DEFAULT NULL,
  `tough_screen` varchar(45) DEFAULT NULL,
  `rear_camera_resolution` varchar(45) DEFAULT NULL,
  `video` varchar(45) DEFAULT NULL,
  `flash` varchar(45) DEFAULT NULL,
  `feature_rear_camera` varchar(45) DEFAULT NULL,
  `front_camera_resolution` varchar(45) DEFAULT NULL,
  `feature_front_camera` varchar(45) DEFAULT NULL,
  `operating_system` varchar(45) DEFAULT NULL,
  `cpu` varchar(45) DEFAULT NULL,
  `cpu_speed` varchar(45) DEFAULT NULL,
  `gpu` varchar(45) DEFAULT NULL,
  `ram` int DEFAULT NULL,
  `rom` int DEFAULT NULL,
  `rom_available` int DEFAULT NULL,
  `telephone_directory` varchar(45) DEFAULT NULL,
  `mobile_network_support` varchar(45) DEFAULT NULL,
  `sim` varchar(45) DEFAULT NULL,
  `wifi` varchar(45) DEFAULT NULL,
  `gps` varchar(45) DEFAULT NULL,
  `bluetooth` varchar(45) DEFAULT NULL,
  `charge_port` varchar(45) DEFAULT NULL,
  `headphone_port` varchar(45) DEFAULT NULL,
  `other_port` varchar(45) DEFAULT NULL,
  `battery` int DEFAULT NULL,
  `battery_type` varchar(45) DEFAULT NULL,
  `max_charge_suppport` int DEFAULT NULL,
  `battery_technology` varchar(45) DEFAULT NULL,
  `security` varchar(45) DEFAULT NULL,
  `microphone` varchar(45) DEFAULT NULL,
  `design` varchar(45) DEFAULT NULL,
  `material` varchar(45) DEFAULT NULL,
  `length` float DEFAULT NULL,
  `width` float DEFAULT NULL,
  `weight` float DEFAULT NULL,
  `release_time` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`product_id`),
  KEY `fk_resolution_idx` (`resolution`),
  KEY `fkScreen_size_phone_idx` (`screen_size`),
  CONSTRAINT `fkPhone_productID` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`),
  CONSTRAINT `fkResolution_phone` FOREIGN KEY (`resolution`) REFERENCES `resolution` (`resolution_id`),
  CONSTRAINT `fkScreen_size_phone` FOREIGN KEY (`screen_size`) REFERENCES `screen_size` (`screen_size_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_detail_phone`
--

LOCK TABLES `product_detail_phone` WRITE;
/*!40000 ALTER TABLE `product_detail_phone` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_detail_phone` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_detail_tablet`
--

DROP TABLE IF EXISTS `product_detail_tablet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_detail_tablet` (
  `product_id` varchar(50) NOT NULL,
  `screen_technology` varchar(45) DEFAULT NULL,
  `resolution` int DEFAULT NULL,
  `screen_size` int DEFAULT NULL,
  `operating_system` varchar(45) DEFAULT NULL,
  `cpu` varchar(45) DEFAULT NULL,
  `cpu_speed` varchar(45) DEFAULT NULL,
  `gpu` varchar(45) DEFAULT NULL,
  `ram` int DEFAULT NULL,
  `rom` int DEFAULT NULL,
  `rom_available` int DEFAULT NULL,
  `external_memory_card` varchar(45) DEFAULT NULL,
  `rear_camera_resolution` varchar(45) DEFAULT NULL,
  `movie` varchar(45) DEFAULT NULL,
  `feature_rear_camera` varchar(45) DEFAULT NULL,
  `front_camera_resolution` varchar(45) DEFAULT NULL,
  `mobile_network_support` varchar(45) DEFAULT NULL,
  `sim` varchar(45) DEFAULT NULL,
  `can_call` tinyint(1) DEFAULT NULL,
  `wifi` varchar(45) DEFAULT NULL,
  `gps` varchar(45) DEFAULT NULL,
  `bluetooth` varchar(45) DEFAULT NULL,
  `charge_port` varchar(45) DEFAULT NULL,
  `headphone_port` varchar(45) DEFAULT NULL,
  `other_port` varchar(45) DEFAULT NULL,
  `record` tinyint(1) DEFAULT NULL,
  `radio` tinyint(1) DEFAULT NULL,
  `battery` int DEFAULT NULL,
  `battery_type` int DEFAULT NULL,
  `max_charge_suppport` int DEFAULT NULL,
  `material` varchar(45) DEFAULT NULL,
  `length` float DEFAULT NULL,
  `width` float DEFAULT NULL,
  `weight` float DEFAULT NULL,
  `release_time` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`product_id`),
  KEY `fkResolution_tablet_idx` (`resolution`),
  KEY `fkScreen_size_idx` (`screen_size`),
  CONSTRAINT `fkResolution_tablet` FOREIGN KEY (`resolution`) REFERENCES `resolution` (`resolution_id`),
  CONSTRAINT `fkScreen_size` FOREIGN KEY (`screen_size`) REFERENCES `screen_size` (`screen_size_id`),
  CONSTRAINT `fkTablet_productID` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_detail_tablet`
--

LOCK TABLES `product_detail_tablet` WRITE;
/*!40000 ALTER TABLE `product_detail_tablet` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_detail_tablet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_discount`
--

DROP TABLE IF EXISTS `product_discount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_discount` (
  `discount_id` int NOT NULL,
  `discounted_price` float NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `product_id` varchar(50) NOT NULL,
  KEY `fkDiscount_idx` (`product_id`),
  CONSTRAINT `fkDiscount` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_discount`
--

LOCK TABLES `product_discount` WRITE;
/*!40000 ALTER TABLE `product_discount` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_discount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_introduction`
--

DROP TABLE IF EXISTS `product_introduction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_introduction` (
  `id` int NOT NULL,
  `product_id` varchar(50) NOT NULL,
  `description_1` varchar(3000) NOT NULL,
  `image_1` varchar(300) NOT NULL,
  `description_2` varchar(3000) NOT NULL,
  `image_2` varchar(300) NOT NULL,
  `description_3` varchar(3000) NOT NULL,
  `image_3` varchar(300) NOT NULL,
  KEY `fkIntro_id_idx` (`product_id`),
  CONSTRAINT `fkIntro_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_introduction`
--

LOCK TABLES `product_introduction` WRITE;
/*!40000 ALTER TABLE `product_introduction` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_introduction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_offer`
--

DROP TABLE IF EXISTS `product_offer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_offer` (
  `offer_id` int NOT NULL,
  `offer_description` varchar(400) NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `product_id` varchar(50) NOT NULL,
  PRIMARY KEY (`offer_id`),
  KEY `fkOffer_id_idx` (`product_id`),
  CONSTRAINT `fkOffer_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_offer`
--

LOCK TABLES `product_offer` WRITE;
/*!40000 ALTER TABLE `product_offer` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_offer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_specification`
--

DROP TABLE IF EXISTS `product_specification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_specification` (
  `id` int NOT NULL,
  `product_specification` varchar(300) NOT NULL,
  `product_id` varchar(50) NOT NULL,
  KEY `fkSpecification_idx` (`product_id`),
  CONSTRAINT `fkSpecification` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_specification`
--

LOCK TABLES `product_specification` WRITE;
/*!40000 ALTER TABLE `product_specification` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_specification` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `promo_code`
--

DROP TABLE IF EXISTS `promo_code`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `promo_code` (
  `prom_code_id` int NOT NULL,
  `promo_code_name` char(50) NOT NULL,
  `promo_code_description` varchar(400) NOT NULL,
  `promo_type` varchar(20) NOT NULL,
  `discount` float NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  PRIMARY KEY (`prom_code_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `promo_code`
--

LOCK TABLES `promo_code` WRITE;
/*!40000 ALTER TABLE `promo_code` DISABLE KEYS */;
/*!40000 ALTER TABLE `promo_code` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resolution`
--

DROP TABLE IF EXISTS `resolution`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `resolution` (
  `resolution_id` int NOT NULL AUTO_INCREMENT,
  `category_id` varchar(45) NOT NULL,
  `resolution_size` varchar(45) NOT NULL,
  PRIMARY KEY (`resolution_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resolution`
--

LOCK TABLES `resolution` WRITE;
/*!40000 ALTER TABLE `resolution` DISABLE KEYS */;
INSERT INTO `resolution` VALUES (1,'1','1920 x1080'),(2,'1','1680 x 1050'),(3,'1','1600 x 900'),(4,'1','1440 x 900'),(5,'1','1400 x 1050'),(6,'1','1366 x 768'),(7,'1','1280 x 1024'),(8,'1','1280 x 960'),(9,'','1280 x 800'),(10,'1','1280 x 768'),(11,'1','1280 x 720'),(12,'1','1280 x 600'),(13,'1','1152 x 864'),(14,'1','1024 x 768');
/*!40000 ALTER TABLE `resolution` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `scan_frequency`
--

DROP TABLE IF EXISTS `scan_frequency`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `scan_frequency` (
  `scan_frequency_id` int NOT NULL AUTO_INCREMENT,
  `scan_frequency_detail` varchar(45) NOT NULL,
  PRIMARY KEY (`scan_frequency_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `scan_frequency`
--

LOCK TABLES `scan_frequency` WRITE;
/*!40000 ALTER TABLE `scan_frequency` DISABLE KEYS */;
INSERT INTO `scan_frequency` VALUES (1,'25'),(2,'30'),(3,'60'),(4,'80'),(5,'120'),(6,'144'),(7,'200'),(8,'240');
/*!40000 ALTER TABLE `scan_frequency` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `screen_size`
--

DROP TABLE IF EXISTS `screen_size`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `screen_size` (
  `screen_size_id` int NOT NULL AUTO_INCREMENT,
  `category_id` varchar(45) DEFAULT NULL,
  `size` varchar(45) NOT NULL,
  PRIMARY KEY (`screen_size_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `screen_size`
--

LOCK TABLES `screen_size` WRITE;
/*!40000 ALTER TABLE `screen_size` DISABLE KEYS */;
INSERT INTO `screen_size` VALUES (1,'1','13'),(2,'1','14'),(3,'1','15.5'),(4,'1','17');
/*!40000 ALTER TABLE `screen_size` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `store`
--

DROP TABLE IF EXISTS `store`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `store` (
  `store_id` int NOT NULL,
  `store_name` varchar(100) NOT NULL,
  `address` varchar(300) NOT NULL,
  `open_hours` varchar(200) NOT NULL,
  `imageGalleryproduct_articlePath` varchar(300) NOT NULL,
  `district_id` int NOT NULL,
  `ward_id` int NOT NULL,
  `city_id` int NOT NULL,
  PRIMARY KEY (`store_id`),
  KEY `store_ibfk_1` (`district_id`),
  KEY `store_ibfk_2` (`ward_id`),
  KEY `store_ibfk_3` (`city_id`),
  CONSTRAINT `store_ibfk_1` FOREIGN KEY (`district_id`) REFERENCES `district` (`district_id`),
  CONSTRAINT `store_ibfk_2` FOREIGN KEY (`ward_id`) REFERENCES `ward` (`ward_id`),
  CONSTRAINT `store_ibfk_3` FOREIGN KEY (`city_id`) REFERENCES `city` (`city_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `store`
--

LOCK TABLES `store` WRITE;
/*!40000 ALTER TABLE `store` DISABLE KEYS */;
/*!40000 ALTER TABLE `store` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `store_product_in_stock`
--

DROP TABLE IF EXISTS `store_product_in_stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `store_product_in_stock` (
  `quantity` int NOT NULL,
  `store_id` int NOT NULL,
  `product_id` varchar(50) NOT NULL,
  KEY `fkProduct_stock_id_idx` (`product_id`),
  CONSTRAINT `fkProduct_stock_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `store_product_in_stock`
--

LOCK TABLES `store_product_in_stock` WRITE;
/*!40000 ALTER TABLE `store_product_in_stock` DISABLE KEYS */;
/*!40000 ALTER TABLE `store_product_in_stock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ward`
--

DROP TABLE IF EXISTS `ward`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ward` (
  `ward_id` int NOT NULL,
  `ward_name` varchar(100) NOT NULL,
  PRIMARY KEY (`ward_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ward`
--

LOCK TABLES `ward` WRITE;
/*!40000 ALTER TABLE `ward` DISABLE KEYS */;
/*!40000 ALTER TABLE `ward` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-15 20:46:26
