CREATE DATABASE thegioididong;

CREATE TABLE product
(
  product_id CHAR(10) NOT NULL,
  product_name VARCHAR(50) NOT NULL,
  price INT NOT NULL,
  manufacturer_id CHAR(10) NOT NULL,
  category_id INT NOT NULL,
  product_waranty INT NOT NULL,
  image VARCHAR(300) NOT NULL,
  interes_rate FLOAT NOT NULL,
  excusive INT NOT NULL,
  accessories_included VARCHAR(200) NOT NULL,
  PRIMARY KEY (product_id)
);

CREATE TABLE category
(
  category_id INT auto_increment NOT NULL,
  category_name VARCHAR(50) NOT NULL,
  status BOOLEAN NOT NULL,
  PRIMARY KEY (category_id)
);

CREATE TABLE manufacturer
(
  manufacturer_id CHAR(10) NOT NULL,
  manufacturer_name VARCHAR(100) NOT NULL,
  PRIMARY KEY (manufacturer_id)
);

CREATE TABLE color_variant
(
  id INT NOT NULL,
  product_id CHAR(10) NOT NULL,
  image_path VARCHAR(300) NOT NULL,
  color_id CHAR(10) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (color_id) REFERENCES product(product_id)
);

CREATE TABLE color
(
  color_name VARCHAR(50) NOT NULL,
  color_id INT NOT NULL,
  FOREIGN KEY (color_id) REFERENCES color_variant(id)
);

CREATE TABLE product_feature
(
  id INT NOT NULL,
  feature_video VARCHAR(300) NOT NULL,
  feature_path VARCHAR(300) NOT NULL,
  product_id CHAR(10) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (product_id) REFERENCES product(product_id)
);

CREATE TABLE product_camera
(
  id INT NOT NULL,
  image_path VARCHAR(3000) NOT NULL,
  product_id CHAR(10) NOT NULL,
  FOREIGN KEY (product_id) REFERENCES product(product_id)
);

CREATE TABLE product_specification
(
  id INT NOT NULL,
  product_specification VARCHAR(300) NOT NULL,
  product_id CHAR(10) NOT NULL,
  FOREIGN KEY (product_id) REFERENCES product(product_id)
);

CREATE TABLE product_article
(
  article_id INT NOT NULL,
  article_url VARCHAR(300) NOT NULL,
  product_id CHAR(10) NOT NULL,
  FOREIGN KEY (product_id) REFERENCES product(product_id)
);

CREATE TABLE product_offer
(
  offer_id INT NOT NULL,
  offer_description VARCHAR(400) NOT NULL,
  start_date DATE NOT NULL,
  end_date DATE NOT NULL,
  product_id CHAR(10) NOT NULL,
  FOREIGN KEY (product_id) REFERENCES product(product_id)
);

CREATE TABLE product_discount
(
  discount_id INT NOT NULL,
  discount_price FLOAT NOT NULL,
  start_date DATE NOT NULL,
  end_date DATE NOT NULL,
  product_id CHAR(10) NOT NULL,
  FOREIGN KEY (product_id) REFERENCES product(product_id)
);

CREATE TABLE promocode
(
  promocode_id INT NOT NULL,
  promocode_name CHAR(50) NOT NULL,
  promo_description VARCHAR(400) NOT NULL,
  promo_condition VARCHAR(100) NOT NULL,
  discount FLOAT NOT NULL,
  start_date DATE NOT NULL,
  end_date DATE NOT NULL,
  PRIMARY KEY (promocode_id)
);

CREATE TABLE customer
(
  customer_id INT NOT NULL,
  full_name VARCHAR(50) NOT NULL,
  phone_number NUMERIC NOT NULL,
  gender CHAR(10) NOT NULL,
  address VARCHAR(200) NOT NULL,
  city VARCHAR(50) NOT NULL,
  district VARCHAR(50) NOT NULL,
  ward VARCHAR(50) NOT NULL,
  Active NUMERIC NOT NULL,
  PRIMARY KEY (customer_id)
);

CREATE TABLE product_introduction
(
  id INT NOT NULL,
  image_gallery VARCHAR(300) NOT NULL,
  product_id CHAR(10) NOT NULL,
  PRIMARY KEY (product_id),
  FOREIGN KEY (product_id) REFERENCES product(product_id)
);

CREATE TABLE district
(
  district_id INT NOT NULL,
  distric_name VARCHAR(100) NOT NULL,
  PRIMARY KEY (district_id)
);

CREATE TABLE ward
(
  ward_id INT NOT NULL,
  ward_name VARCHAR(100) NOT NULL,
  PRIMARY KEY (ward_id)
);

CREATE TABLE city
(
  city_id INT NOT NULL,
  city_name VARCHAR(100) NOT NULL,
  PRIMARY KEY (city_id)
);

CREATE TABLE role
(
  role_id CHAR(10) NOT NULL,
  role_name VARCHAR(30) NOT NULL,
  PRIMARY KEY (role_id)
);

CREATE TABLE user
(
  user_id CHAR(10) NOT NULL,
  first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(20) NOT NULL,
  user_name VARCHAR(20) NOT NULL,
  password VARCHAR(50) NOT NULL,
  enabled INT NOT NULL,
  status BOOLEAN NOT NULL,
  roleID CHAR(10) NOT NULL,
  PRIMARY KEY (user_id),
  FOREIGN KEY (role_id) REFERENCES role(role_id)
);

CREATE TABLE order_detail
(
  bill_id INT NOT NULL,
  quantity INT NOT NULL,
  product_id CHAR(10) NOT NULL,
  promocode_id INT NOT NULL,
  customer_id INT NOT NULL,
  PRIMARY KEY (bill_id),
  FOREIGN KEY (product_id) REFERENCES product(product_id),
  FOREIGN KEY (promocode_id) REFERENCES promocode(promocode_id),
  FOREIGN KEY (customer_id) REFERENCES customer(customer_id)
);

CREATE TABLE orders
(
  customer_id INT NOT NULL,
  time_created DATE NOT NULL,
  bill_id INT NOT NULL,
  FOREIGN KEY (bill_id) REFERENCES order_detail(bill_id)
);

CREATE TABLE store
(
  store_id INT NOT NULL,
  store_name VARCHAR(100) NOT NULL,
  address VARCHAR(300) NOT NULL,
  open_hours VARCHAR(200) NOT NULL,
  district_id INT NOT NULL,
  ward_id INT NOT NULL,
  city_id INT NOT NULL,
  PRIMARY KEY (store_id),
  FOREIGN KEY (district_id) REFERENCES district(district_id),
  FOREIGN KEY (ward_id) REFERENCES ward(ward_id),
  FOREIGN KEY (city_id) REFERENCES city(city_id)
);

CREATE TABLE store_product_in_stock
(
  quantity INT NOT NULL,
  store_id INT NOT NULL,
  product_id CHAR(10) NOT NULL,
  FOREIGN KEY (store_id) REFERENCES store(store_id),
  FOREIGN KEY (product_id) REFERENCES product_introduction(product_id)
);