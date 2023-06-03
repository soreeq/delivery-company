
CREATE TABLE Customers (
  customer_id INT NOT NULL PRIMARY KEY,
  first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(50) NOT NULL,
  email VARCHAR(100) NOT NULL
);

CREATE TABLE Couriers (
  courier_id INT NOT NULL PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  phone_number VARCHAR(20) NOT NULL
);

CREATE TABLE Delivery (
  delivery_id INT NOT NULL PRIMARY KEY,
  address VARCHAR(100) NOT NULL,
  city VARCHAR(50) NOT NULL,
  postal_code VARCHAR(20) NOT NULL
);

CREATE TABLE Orders (
  order_id INT PRIMARY KEY,
  customer_id INT NOT NULL,
  order_date DATE NOT NULL,
  total DECIMAL(10,2) NOT NULL,
  status VARCHAR(50) NOT NULL,
  courier_id INT NOT NULL,
  delivery_id INT NOT NULL,
  FOREIGN KEY (customer_id) REFERENCES Customers(customer_id),
  FOREIGN KEY (courier_id) REFERENCES Couriers(courier_id),
  FOREIGN KEY (delivery_id) REFERENCES Delivery(delivery_id)
);


CREATE TABLE Tracking (
  tracking_id INT NOT NULL PRIMARY KEY,
  order_id INT NOT NULL,
  delivery_date DATE NOT NULL,
  status VARCHAR(50) NOT NULL,
  FOREIGN KEY (order_id) REFERENCES Orders(order_id)
);
