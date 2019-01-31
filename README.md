
# microservices_demo
microservices_demo

## activemq:
* Download and execute:
* cd apache-activemq-5.15.8/bin
* java -jar activemq.jar start

* console: http://0.0.0.0:8161/admin/queues.jsp
* user: admin
* password: admin

## mondo docker 
* docker pull mongo
* docker run --name some-mongo -p 27017:27017 -d mongo --smallfiles

## URL

### Config:
* http://localhost:8888

### Registry: (eureka)
* http://localhost:8761

### Gateway:
* http://localhost:7777
* http://localhost:7777/demo/
* http://localhost:7777/demo/api/v1/cliente


### Demo:
* http://localhost:8228
* http://192.168.0.17:8228/api/v1/cliente


