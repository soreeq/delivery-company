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