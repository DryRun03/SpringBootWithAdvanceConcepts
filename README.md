# SpringBootWithAdvanceConcepts
This is a Spring Boot Project ade just for practicing the calling of API and using those API storing,fetching,deleting and Updating the data that is present in 
H2 console or we can use MySql Database just by changing the configurations of the application file.

This project basically has followed the industrial approach for developing the project that is Controller-> Model-> Service-> Repository-> Error-> Test. 
That is Model View Controller 

The Entity/model has 4 parameters that are 
1. DepartmentId(Promary Key).
2. DepartmentName.
3. DepartmentAddress.
4. DepartmentCode.

Information about Dependencies and Versions.
It uses Java 16 as the base version and dependencies are lombok, JPA, Spring Web, MySql Connector, devTools, H2 and Maven.

Information about APIs.
(In DepartmentController)

#1. Get("/departments)
This is use to get a list of all the department when we hit the URl in the postman using GetMapping.

#2. Post("departments)
This is use to add a new department into the database.

#3. Get("/departments/{id}")
This is used to return the department of the given Id that is passed in the variable in the URL using departmentCode.

#4. Delete"/departments/{id}")
This is used to delete the department of the given Id that is passes in the variable in the URL using the departmentCode.

#5. Put("/departments/{id}")
This is used to update the departmwnt of the given Id that is passes in the variable in the URL using the departmentCode.

#6. Get("/departments/name/{name}")
This is used to get the department using the name of the depaartment that is in the variable using departmentName.

Secondly the error handling package is created that will handle the error like departmentNotFound error in the database when we use the Get Method of the department by Id or by the Name

Lastly the unit testing is done for the ServicePackage in the different package that is spring.Test
