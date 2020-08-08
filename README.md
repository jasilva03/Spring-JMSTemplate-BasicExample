1-
This project needs an ActiveMQ docker container to run:
docker run -it --rm -p 8161:8161 -p 61616:61616 vromero/activemq-artemis

2-
The file application.properties needs the following 2 entries in order to be able to work with the above docker container:
spring.artemis.user=artemis
spring.artemis.password=simetraehcapa

3- ReadMe notes for the ActiveMQ image:
https://github.com/vromero/activemq-artemis-docker/blob/master/README.md



