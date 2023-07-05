
START TRANSACTION;

DELETE FROM pet;
DELETE FROM user;

INSERT INTO user (id, user_name, password, role) VALUES (1, "bob", "TODO", "TODO");

INSERT INTO pet (id, name, user_id) VALUES (1, "fluffy", 1);

COMMIT;


#     OrderItemEntity oi1 = new OrderItemEntity(p1, 99);
# OrderItemEntity oi2 = new OrderItemEntity(p2, 9);
#
# INSERT INTO orders (order_date, order_delivery_type, order_payment_type, company_id, credit_card_entity_cc_id, addressEntity_id)
# VALUES (123123123, "DELIVERY", "CARD", 1, 1, 1);









