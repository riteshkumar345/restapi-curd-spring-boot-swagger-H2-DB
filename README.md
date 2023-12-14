# H2 Database usage

1. We can use H2 Database as in-memory DB for practise and POC purpose only.
2. H2 Database is temporary DB which can erase the tables and its data when we stop the application.

# Dependency
<!-- H2 database dependency -->
		<dependency>
    		<groupId>com.h2database</groupId>
    		<artifactId>h2</artifactId>
		</dependency>
# Database Configuration
Ispring.datasource.url = jdbc:h2:mem:riaradb
spring.datasource.username = sa
spring.datasource.password = sa
spring.datasource.driver-class-name = org.h2.Driver

# Run the application and access H2 Console using below URL
http://localhost:8080/h2-console
# Testing API from Browser
1. http://localhost:8080/car [GET] : No Body
2. http://localhost:8080/car [POST] with Body as shown below
   {
  "carId": 4,
  "carModel": "Audi C3",
  "carPrice": 6200000
   }
3. http://localhost:8080/car [PUT] with Body as shown below , CarId should be valid one
   {
  "carId": 4,
  "carModel": "Audi C3",
  "carPrice": 6200000
   }
4. http://localhost:8080/car/{carId} [DELETE] : No Body , CarId should be valid one
