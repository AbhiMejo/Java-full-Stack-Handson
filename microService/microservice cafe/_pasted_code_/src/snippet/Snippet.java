package snippet;

public class Snippet {
	server:
	  port: 5002
	spring:
	  datasource:
	    name: detailsproduct
	    driverClassName: com.mysql.cj.jdbc.Driver
	    url: jdbc:mysql://localhost:3306/detailsproduct
	    username:  root
	    password: AbhishekMejo
	  jpa:
	    hibernate.ddl-auto: update
	    properties:
	      hibernate:
	        dialect: org.hibernate.dialect.MySQL8Dialect  
}

