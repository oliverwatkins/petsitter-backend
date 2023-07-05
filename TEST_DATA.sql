
START TRANSACTION;

DELETE FROM pet;
DELETE FROM user;

#  DECIMAL(6,6),
#     geo_lng DECIMAL(6,6),

INSERT INTO user (id, user_name, password, role, geo_lat, geo_lng) VALUES (1, "Xavia", "TODO", "TODO", 48.327896, 13.555974);
INSERT INTO user (id, user_name, password, role, geo_lat, geo_lng) VALUES (2, "David", "TODO", "TODO", 48.427896, 11.755974);
INSERT INTO user (id, user_name, password, role, geo_lat, geo_lng) VALUES (3, "Jill", "TODO", "TODO", 48.527896, 11.255974);

INSERT INTO user (id, user_name, password, role, geo_lat, geo_lng) VALUES (4, "Joe", "TODO", "TODO", 48.147896, 11.155974);
INSERT INTO user (id, user_name, password, role, geo_lat, geo_lng) VALUES (5, "Alex", "TODO", "TODO", 48.157896, 11.955974);
INSERT INTO user (id, user_name, password, role, geo_lat, geo_lng) VALUES (6, "Florian", "TODO", "TODO", 48.131737, 11.574204);

INSERT INTO user (id, user_name, password, role, geo_lat, geo_lng) VALUES (7, "Harry", "TODO", "TODO", 48.132736, 11.582768);
INSERT INTO user (id, user_name, password, role, geo_lat, geo_lng) VALUES (8, "Siobohen", "TODO", "TODO", 48.134226, 11.577693);
INSERT INTO user (id, user_name, password, role, geo_lat, geo_lng) VALUES (9, "Lynn", "TODO", "TODO", 48.145387, 11.582904);

INSERT INTO user (id, user_name, password, role, geo_lat, geo_lng) VALUES (10, "Stuart", "TODO", "TODO", 48.145387, 11.55443);
INSERT INTO user (id, user_name, password, role, geo_lat, geo_lng) VALUES (11, "Simon", "TODO", "TODO", 48.115387, 11.567963);
INSERT INTO user (id, user_name, password, role, geo_lat, geo_lng) VALUES (12, "Mr No Pets", "TODO", "TODO",  48.125387,  11.593406);


INSERT INTO pet (id, name, user_id, type) VALUES (1, "fluffy", 1, "CAT");
INSERT INTO pet (id, name, user_id, type) VALUES (2, "felix", 2, "DOG");
INSERT INTO pet (id, name, user_id, type) VALUES (3, "shia", 3, "CAT");
INSERT INTO pet (id, name, user_id, type) VALUES (4, "svea", 4, "DOG");
INSERT INTO pet (id, name, user_id, type) VALUES (5, "butt", 5, "DOG");
INSERT INTO pet (id, name, user_id, type) VALUES (6, "roid", 6, "CAT");
INSERT INTO pet (id, name, user_id, type) VALUES (7, "dopey", 6, "CAT");
INSERT INTO pet (id, name, user_id, type) VALUES (8, "mutt", 7, "DOG");
INSERT INTO pet (id, name, user_id, type) VALUES (9, "dopey 2", 7, "DOG");
INSERT INTO pet (id, name, user_id, type) VALUES (10, "mutt jr", 7, "CAT");

INSERT INTO pet (id, name, user_id, type) VALUES (11, "ruff", 8, "CAT");
INSERT INTO pet (id, name, user_id, type) VALUES (12, "nala", 8, "CAT");
INSERT INTO pet (id, name, user_id, type) VALUES (13, "roibo", 9, "DOG");
INSERT INTO pet (id, name, user_id, type) VALUES (14, "nifty", 9, "DOG");
INSERT INTO pet (id, name, user_id, type) VALUES (15, "roo", 10, "CAT");

COMMIT;


#     OrderItemEntity oi1 = new OrderItemEntity(p1, 99);
# OrderItemEntity oi2 = new OrderItemEntity(p2, 9);
#
# INSERT INTO orders (order_date, order_delivery_type, order_payment_type, company_id, credit_card_entity_cc_id, addressEntity_id)
# VALUES (123123123, "DELIVERY", "CARD", 1, 1, 1);









