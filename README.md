# javaProducerPythonConsumer

Download apache-kafka from https://kafka.apache.org/
Stark kafka server 
install with pip python-kafka
Start broker and zookeper
zookeeper-server-start.bat zookeeper.properties 
kafka-server-start.bat server.properties

check broker runnin(optional)
zookeeper-shell.bat localhost:2181 ls /brokers/ids
Create topic for populate
kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic guilletopic

Create a producer
kafka-console-producer.bat --broker-list localhost:9092 --topic guilletopic

create a consumer that listen the topic
kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic guilletopic --from-beginning

do clean install for springboot project

run spring boot and open postam or curl and on http://localhost:9000/kafka/publish?message=MY MESSAGE

run python app and check the message from the topic 
