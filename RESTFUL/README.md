A SpringBoot Demo
==================

####Why I try to use SpringBoot?

A:Create stand-alone Spring applications.This means I dont need to start tomcat manually nor I need to config the Tomcat.


####How to run this demo ?

A:open terminal -> mvn clean install -> mvn exec:java -Dexec.mainClass=”me.ninja.App”

First command  to compile Java classes, then to run

[SpringBoot quick start][1]


#####Use httpie to test my RESTFUL demo

A:[Install httpie][2] On OSX,type :

	sudo easy_install httpie
	
	http get localhost:8080/welcome name=ninja
	
Then will appear a result like this 

	HTTP/1.1 200 OK
	Content-Length: 18
	Content-Type: application/json;charset=UTF-8
	Date: Sun, 15 Jun 2014 16:33:52 GMT
	Server: Apache-Coyote/1.1
	
	Hello World, Ninja

Or Use the POST method,type:
	
	http post localhost:8080/post name=ninja
	
Result:

	HTTP/1.1 200 OK
	Content-Length: 36
	Content-Type: application/json;charset=UTF-8
	Date: Sun, 15 Jun 2014 16:33:47 GMT
	Server: Apache-Coyote/1.1

	Hello World, Ninja. Its post method!


	



  [1]: http://projects.spring.io/spring-boot/#quick-start
  [2]: https://github.com/jakubroztocil/httpie
