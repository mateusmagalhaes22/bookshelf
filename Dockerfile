FROM ubuntu:latest

RUN apt update

RUN apt install -y git

RUN apt install -y openjdk-21-jdk

RUN git clone https://github.com/mateusmagalhaes22/bookshelf.git

RUN cd bookshelf

RUN java -jar target/BookShelf-0.0.1-SNAPSHOT.jar

EXPOSE 8080
