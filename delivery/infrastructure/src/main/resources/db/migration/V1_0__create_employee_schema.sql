
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
-- Wstawianie danych do tabeli Customers
INSERT INTO Customers (customer_id, first_name, last_name, email)
VALUES (1, 'John', 'Doe', 'john.doe@example.com'),
       (2, 'Jane', 'Smith', 'jane.smith@example.com');

-- Wstawianie danych do tabeli Couriers
INSERT INTO Couriers (courier_id, name, phone_number)
VALUES (1, 'Courier A', '123456789'),
       (2, 'Courier B', '987654321');

-- Wstawianie danych do tabeli Delivery
INSERT INTO Delivery (delivery_id, address, city, postal_code)
VALUES (1, '123 Main St', 'New York', '10001'),
       (2, '456 Elm St', 'Los Angeles', '90001');

-- Wstawianie danych do tabeli Orders
INSERT INTO Orders (order_id, customer_id, order_date, total, status, courier_id, delivery_id)
VALUES (1, 1, '2023-06-01', 100.00, 'Shipped', 1, 1),
       (2, 2, '2023-06-02', 200.00, 'Delivered', 2, 2);

-- Wstawianie danych do tabeli Tracking
INSERT INTO Tracking (tracking_id, order_id, delivery_date, status)
VALUES (1, 1, '2023-06-02', 'In transit'),
       (2, 2, '2023-06-03', 'Delivered');

