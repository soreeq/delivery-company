CREATE TABLE Customers (
  customer_id UUID NOT NULL,
  first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(50) NOT NULL,
  email VARCHAR(100) NOT NULL
);

CREATE TABLE Couriers (
  courier_id UUID NOT NULL,
  name VARCHAR(100) NOT NULL,
  phone_number VARCHAR(20) NOT NULL
);

CREATE TABLE Delivery (
  delivery_id UUID NOT NULL,
  address VARCHAR(100) NOT NULL,
  city VARCHAR(50) NOT NULL,
  postal_code VARCHAR(20) NOT NULL
);

CREATE TABLE Orders (
  order_id UUID,
  customer_id UUID NOT NULL,
  order_date DATE NOT NULL,
  total DECIMAL(10,2) NOT NULL,
  status VARCHAR(50) NOT NULL,
  courier_id UUID NOT NULL,
  delivery_id UUID NOT NULL
);

CREATE TABLE Tracking (
  tracking_id UUID NOT NULL,
  order_id UUID NOT NULL,
  delivery_date DATE NOT NULL,
  status VARCHAR(50) NOT NULL
);

INSERT INTO Customers (customer_id, first_name, last_name, email)
VALUES (UUID(), 'John', 'Doe', 'john.doe@example.com');

INSERT INTO Couriers (courier_id, name, phone_number)
VALUES (UUID(), 'Courier A', '123456789');

INSERT INTO Delivery (delivery_id, address, city, postal_code)
VALUES (UUID(), '123 Main St', 'New York', '10001');

INSERT INTO Orders (order_id, customer_id, order_date, total, status, courier_id, delivery_id)
VALUES (UUID(), UUID(), '2023-06-01', 100.00, 'Shipped', UUID(), UUID());

INSERT INTO Tracking (tracking_id, order_id, delivery_date, status)
VALUES (UUID(), UUID(), '2023-06-02', 'In transit');