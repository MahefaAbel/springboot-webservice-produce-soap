# SpringBoot WebService Soap
A soap webservice showcase with SpringBoot

## Technology Stack
- JDK 11, Eclipse, Maven – Development environment
- SpringBoot – Underlying application framework
- wsdl4j – for publishing WSDL for our Service
- SOAP-UI – for testing our service
- JAXB maven plugin – for code generation

## Refs
- Consuming a SOAP web service - https://spring.io/guides/gs/consuming-web-service/
- Producing a SOAP web service - https://spring.io/guides/gs/producing-web-service/

## Errors
### Implementation of JAXB-API has not been found on module path or classpath
Solving :

		<!-- https://mvnrepository.com/artifact/javax.xml.bind/jaxb-api -->
		<dependency>
		    <groupId>javax.xml.bind</groupId>
		    <artifactId>jaxb-api</artifactId>
		    <version>2.3.0-b170201.1204</version>
		</dependency>
		
		<!-- https://mvnrepository.com/artifact/javax.activation/activation -->
		<dependency>
		    <groupId>javax.activation</groupId>
		    <artifactId>activation</artifactId>
		    <version>1.1</version>
		</dependency>
		
		<!-- https://mvnrepository.com/artifact/org.glassfish.jaxb/jaxb-runtime -->
		<dependency>
		    <groupId>org.glassfish.jaxb</groupId>
		    <artifactId>jaxb-runtime</artifactId>
		    <version>2.3.0-b170127.1453</version>
		</dependency>
