-- Wstawianie danych do tabeli Customers
INSERT INTO Customers (customer_id, first_name, last_name, email)
VALUES
(1, 'John', 'Doe', 'john.doe@example.com'),
(2, 'Jane', 'Smith', 'jane.smith@example.com'),
(3, 'Michael', 'Johnson', 'michael.johnson@example.com'),
(4, 'Emily', 'Williams', 'emily.williams@example.com'),
(5, 'Daniel', 'Brown', 'daniel.brown@example.com'),
(6, 'Olivia', 'Jones', 'olivia.jones@example.com'),
(7, 'James', 'Miller', 'james.miller@example.com'),
(8, 'Sophia', 'Davis', 'sophia.davis@example.com'),
(9, 'William', 'Wilson', 'william.wilson@example.com'),
(10, 'Ava', 'Anderson', 'ava.anderson@example.com');

-- Wstawianie danych do tabeli Couriers
INSERT INTO Couriers (courier_id, name, phone_number)
VALUES
(1, 'Courier A', '123456789'),
(2, 'Courier B', '987654321'),
(3, 'Courier C', '456789123'),
(4, 'Courier D', '321654987'),
(5, 'Courier E', '789123456'),
(6, 'Courier F', '654987321'),
(7, 'Courier G', '147258369'),
(8, 'Courier H', '963852741'),
(9, 'Courier I', '258369147'),
(10, 'Courier J', '741852963');

-- Wstawianie danych do tabeli Delivery
INSERT INTO Delivery (delivery_id, address, city, postal_code)
VALUES
(1, '123 Main St', 'New York', '10001'),
(2, '456 Elm St', 'Los Angeles', '90001'),
(3, '789 Oak St', 'Chicago', '60001'),
(4, '321 Pine St', 'Houston', '77001'),
(5, '654 Maple St', 'Miami', '33001'),
(6, '987 Cedar St', 'Seattle', '98001'),
(7, '147 Walnut St', 'Denver', '80201'),
(8, '258 Birch St', 'Boston', '02101'),
(9, '369 Pineapple St', 'San Francisco', '94101'),
(10, '741 Orange St', 'Dallas', '75201');

-- Wstawianie danych do tabeli Orders
INSERT INTO Orders (order_id, customer_id, order_date, total, status, courier_id, delivery_id)
VALUES
(1, 1, '2023-06-01', 100.00, 'Shipped', 1, 1),
(2, 2, '2023-06-02', 200.00, 'Delivered', 2, 2),
(3, 3, '2023-06-03', 150.00, 'Pending', 3, 3),
(4, 4, '2023-06-04', 300.00, 'Shipped', 4, 4),
(5, 5, '2023-06-05', 250.00, 'Delivered', 5, 5),
(6, 6, '2023-06-06', 180.00, 'Pending', 6, 6),
(7, 7, '2023-06-07', 350.00, 'Shipped', 7, 7),
(8, 8, '2023-06-08', 280.00, 'Delivered', 8, 8),
(9, 9, '2023-06-09', 210.00, 'Pending', 9, 9),
(10, 10, '2023-06-10', 400.00, 'Shipped', 10, 10);

-- Wstawianie danych do tabeli Tracking
INSERT INTO Tracking (tracking_id, order_id, delivery_date, status)
VALUES
(1, 1, '2023-06-02', 'In transit'),
(2, 2, '2023-06-03', 'Delivered'),
(3, 3, '2023-06-04', 'In transit'),
(4, 4, '2023-06-05', 'Delivered'),
(5, 5, '2023-06-06', 'In transit'),
(6, 6, '2023-06-07', 'Delivered'),
(7, 7, '2023-06-08', 'In transit'),
(8, 8, '2023-06-09', 'Delivered'),
(9, 9, '2023-06-10', 'In transit'),
(10, 10, '2023-06-11', 'Delivered');