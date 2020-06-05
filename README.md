# RayZAutomationProject

# Building Framework From Scratch

##### 1. Creating of Maven Project

##### 2. Creating Base and Utility Functions

##### 3. Organize Page Objects

##### 4. Adding Tests
	
##### 5. Data Driving and Parameterizing Tests

##### 6. Converting into TestNG Framework

##### 7. TestNG Listeners

##### 8. Screenshot on Test Failures

##### 9. Creating Excellent HTML reports for Test Results
	
##### 10. Jenkins - Continuous Integration

# Creation of Maven Project

##### 1. Create a Maven Project

		>cd <eclipse-workspace>
		>mvn archetype:generate -DgroupId=Academy -DartifactId=E2EProject -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

##### 2. Compatible with Eclipse

		>cd <root directory of the new project>
		>mvn eclipse:eclipse

##### 3. Import the project to Eclipse

* Open Eclipse
* Files ==> Import... 
* Select ==> Maven//Existing Maven Project ==> Next
* Maven Projects ==> Browse ==> Project Root Folder ==> Select Folder ==> Finish
* The project will be imported into Eclipse shortly.

>* src/test/java - All the test cases created here
>* src/main/java - All the utilities, base objects, data and etc.
>* pom.xml - the maven configure file

##### 4. Add All Dependencies and Plugins to pom.xml

* Selenium Dependency ==> search "Selenium Maven Information"

		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>3.141.59</version>
		</dependency>
	
* TestNG Dependency ==> search "TestNG Maven Dependency"

		<dependency>
			<groupId>org.testng</groupId>
			<artifactId>testng</artifactId>
			<version>6.8</version>
			<scope>test</scope>
		</dependency>

* Save "pom.xml" will get all the dependencies added to the project local repository.
	
# Creating Base and Utility Functions

##### 1. Create base java class in src/main/java

##### 2. Create public void initializeDriver() method

##### 3. java.lang.NullPointerException
if (browserName == "chrome") - wrong. shouldn't use "==".

extract the value from property file, need use browserName.equalsTo("String");

* == is a reference comparison, i.e. both objects point to the same memory location
* .equals() evaluates to the comparison of values in the objects

##### 4. data.properties
* each line ended without semicolon otherwise will cause the problem.

# Creation page objects

##### 1. Create base java class in src/main/java

##### 2. Create public void initializeDriver() method

##### 3. java.lang.NullPointerException
if (browserName == "chrome") - wrong. shouldn't use "==".

extract the value from property file, need use browserName.equalsTo("String");

* == is a reference comparison, i.e. both objects point to the same memory location
* .equals() evaluates to the comparison of values in the objects

##### 4. data.properties
* each line ended without semicolon otherwise will cause the problem.

	

 
