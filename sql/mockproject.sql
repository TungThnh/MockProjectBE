CREATE DATABASE thegioididong;

CREATE TABLE product
(
  productID CHAR(10) NOT NULL,
  productName VARCHAR(50) NOT NULL,
  price INT NOT NULL,
  manufacturerID CHAR(10) NOT NULL,
  categoryID INT NOT NULL,
  productWaranty INT NOT NULL,
  image VARCHAR(300) NOT NULL,
  interesRate INT NOT NULL,
  excusive INT NOT NULL,
  accessoriesIncluded VARCHAR(200) NOT NULL,
  PRIMARY KEY (productID)
);

CREATE TABLE category
(
  categoryID INT NOT NULL,
  categoryName VARCHAR(50) NOT NULL,
  status INT NOT NULL,
  productID CHAR(10) NOT NULL,
  PRIMARY KEY (categoryID),
  FOREIGN KEY (productID) REFERENCES product(productID)
);

CREATE TABLE manufacturer
(
  manufacturerID CHAR(10) NOT NULL,
  manufacturerName VARCHAR(100) NOT NULL,
  productID CHAR(10) NOT NULL,
  PRIMARY KEY (manufacturerID),
  FOREIGN KEY (productID) REFERENCES product(productID)
);

CREATE TABLE color_variant
(
  id INT NOT NULL,
  productID CHAR(10) NOT NULL,
  imagePath VARCHAR(300) NOT NULL,
  colorID CHAR(10) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (colorID) REFERENCES product(productID)
);

CREATE TABLE color
(
  colorName VARCHAR(50) NOT NULL,
  colorID INT NOT NULL,
  FOREIGN KEY (colorID) REFERENCES color_variant(id)
);

CREATE TABLE product_feature
(
  id INT NOT NULL,
  featureVideo VARCHAR(300) NOT NULL,
  featurePath VARCHAR(300) NOT NULL,
  productID CHAR(10) NOT NULL,
  PRIMARY KEY (ID),
  FOREIGN KEY (productID) REFERENCES product(productID)
);

CREATE TABLE product_camera
(
  id INT NOT NULL,
  imagePath VARCHAR(3000) NOT NULL,
  productID CHAR(10) NOT NULL,
  FOREIGN KEY (productID) REFERENCES product(productID)
);

CREATE TABLE product_specification
(
  id INT NOT NULL,
  productSpecification VARCHAR(300) NOT NULL,
  productID CHAR(10) NOT NULL,
  FOREIGN KEY (productID) REFERENCES product(productID)
);

CREATE TABLE product_article
(
  articleID INT NOT NULL,
  articleURL VARCHAR(300) NOT NULL,
  productID CHAR(10) NOT NULL,
  FOREIGN KEY (productID) REFERENCES product(productID)
);

CREATE TABLE product_offer
(
  offerID INT NOT NULL,
  offerDescription VARCHAR(400) NOT NULL,
  startDate DATE NOT NULL,
  endDate DATE NOT NULL,
  productID CHAR(10) NOT NULL,
  FOREIGN KEY (productID) REFERENCES product(productID)
);

CREATE TABLE product_discount
(
  discountID INT NOT NULL,
  discountPrice FLOAT NOT NULL,
  startDate DATE NOT NULL,
  endDate DATE NOT NULL,
  productID CHAR(10) NOT NULL,
  FOREIGN KEY (productID) REFERENCES product(productID)
);

CREATE TABLE promo_code
(
  promoCodeID INT NOT NULL,
  promoCodeName CHAR(50) NOT NULL,
  promoDescription VARCHAR(400) NOT NULL,
  promoCondition VARCHAR(100) NOT NULL,
  discount FLOAT NOT NULL,
  startDate DATE NOT NULL,
  endDate DATE NOT NULL,
  PRIMARY KEY (promoCodeID)
);

CREATE TABLE customer
(
  customerID INT NOT NULL,
  fullName VARCHAR(50) NOT NULL,
  phoneNumber NUMERIC NOT NULL,
  gender CHAR(10) NOT NULL,
  address VARCHAR(200) NOT NULL,
  city VARCHAR(50) NOT NULL,
  district VARCHAR(50) NOT NULL,
  ward VARCHAR(50) NOT NULL,
  Active NUMERIC NOT NULL,
  PRIMARY KEY (customerID)
);

CREATE TABLE product_introduction
(
  id INT NOT NULL,
  imageGallery VARCHAR(300) NOT NULL,
  productID CHAR(10) NOT NULL,
  PRIMARY KEY (productID),
  FOREIGN KEY (productID) REFERENCES product(productID)
);

CREATE TABLE district
(
  districtID INT NOT NULL,
  districName VARCHAR(100) NOT NULL,
  PRIMARY KEY (districtID)
);

CREATE TABLE ward
(
  wardID INT NOT NULL,
  wardName VARCHAR(100) NOT NULL,
  PRIMARY KEY (wardID)
);

CREATE TABLE city
(
  cityID INT NOT NULL,
  cityName VARCHAR(100) NOT NULL,
  PRIMARY KEY (cityID)
);

CREATE TABLE role
(
  roleID CHAR(10) NOT NULL,
  roleName VARCHAR(30) NOT NULL,
  PRIMARY KEY (roleID)
);

CREATE TABLE user
(
  userID CHAR(10) NOT NULL,
  firstName VARCHAR(50) NOT NULL,
  lastName VARCHAR(20) NOT NULL,
  userName VARCHAR(20) NOT NULL,
  password VARCHAR(50) NOT NULL,
  enabled INT NOT NULL,
  status INT NOT NULL,
  roleID CHAR(10) NOT NULL,
  PRIMARY KEY (userID),
  FOREIGN KEY (roleID) REFERENCES role(roleID)
);

CREATE TABLE order_detail
(
  billID INT NOT NULL,
  quantity INT NOT NULL,
  productID CHAR(10) NOT NULL,
  promoCodeID INT NOT NULL,
  customerID INT NOT NULL,
  PRIMARY KEY (billID),
  FOREIGN KEY (productID) REFERENCES product(productID),
  FOREIGN KEY (promoCodeID) REFERENCES promo_code(promoCodeID),
  FOREIGN KEY (customerID) REFERENCES customer(customerID)
);

CREATE TABLE orders
(
  customerID INT NOT NULL,
  timeCreated DATE NOT NULL,
  billID INT NOT NULL,
  FOREIGN KEY (billID) REFERENCES order_detail(billID)
);

CREATE TABLE store
(
  storeID INT NOT NULL,
  storeName VARCHAR(100) NOT NULL,
  address VARCHAR(300) NOT NULL,
  openHours VARCHAR(200) NOT NULL,
  districtID INT NOT NULL,
  wardID INT NOT NULL,
  cityID INT NOT NULL,
  PRIMARY KEY (storeID),
  FOREIGN KEY (districtID) REFERENCES district(districtID),
  FOREIGN KEY (wardID) REFERENCES ward(wardID),
  FOREIGN KEY (cityID) REFERENCES city(cityID)
);

CREATE TABLE sotre_product_in_stock
(
  quantity INT NOT NULL,
  storeID INT NOT NULL,
  productID CHAR(10) NOT NULL,
  FOREIGN KEY (storeID) REFERENCES store(storeID),
  FOREIGN KEY (productID) REFERENCES product_introduction(productID)
);