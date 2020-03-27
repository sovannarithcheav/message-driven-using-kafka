# message-driven-using-kafka

### Need
- Apache Kafka (I used : [this Docker Compose](https://github.com/bitnami/bitnami-docker-kafka))
  - You will be need [this configuration](https://github.com/bitnami/bitnami-docker-kafka#accessing-kafka-with-internal-and-external-clients) when develop Spring Boot Application with Kafka Cluster

### Running the applications

#### user-service
- port: 9000
- test url : http://localhost:9000/kafka/publish?message=TEST
- console output: 
```
2020-03-27 15:32:07.537  INFO 3204 --- [nio-9000-exec-5] i.s.userservice.engine.Producer          : #### -> Producing message -> TEST
2020-03-27 15:32:07.542  INFO 3204 --- [ad | producer-1] i.s.userservice.engine.Producer          : Sent message=[TEST] with offset=[1]
```


#### notify-service
- port: 9001
- see the console for consumed message log:
```
2020-03-27 15:12:54.441  INFO 3144 --- [ntainer#0-0-C-1] info.sovannarith.notify.engine.Consumer  : #### -> Consumed message -> TEST
```
