
This README consists of three parts. [based on shape shop README]

1. Running the spring application within the IDE against the DB in a docker container.
2. Running in two containers using docker-compose


# 1. Running the application within the IDE against the DB in a docker container

To run the database :

kill off all old processes (optional) run : 

> KILL.BAT

### Step 1 - run mysql container instance

> docker run -d -p 3306:3306 --name=petsitter-db-container --env="MYSQL_ROOT_PASSWORD=root" --env="MYSQL_PASSWORD=root" --env="MYSQL_DATABASE=petsitter" mysql

### Step 2 - setup the schema

> docker exec -i petsitter-db-container mysql -uroot -proot petsitter < SCHEMA.sql

**Potential errors**

* ERROR 2002 (HY000): Can't connect to local MySQL server through socket '/var/run/mysqld/mysqld.sock'
  * Just wait 15 seconds and try again

* unknown shorthand flag: 'u' in -uroot
  * This is because using azure context. Reset to default context : **docker context use default**

### Step 3 - setup the test data

> docker exec -i petsitter-db-container mysql -uroot -proot petsitter < TEST_DATA.sql

In IDE should be able to see this with this URL :
jdbc:mysql://localhost:3306/petsitter

In spring properties add this :hibernate.dialect
spring.datasource.url=jdbc:mysql://localhost:3306/petsitter?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false

### Step 4 - START BACKEND APP IN IDE

* it is now possible to start app (server side - spring) in IDE and debug through the code. It should be possible to 
access http://localhost:8080/petsitter/users

it should be possible to run the client side as well.

# 2. Running the application and DB via two docker containers, using docker-compose

see README in shape shop




