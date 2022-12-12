# Socket Programming

## Server Program

### Structure
This project structured using intellij platform and maven as build system.

##### About Project

-> This project is used for communicating multiple clients simultaneously with single server.  

-> In this project, two class file are used. One for server main application program,another created using thread to communicate multiple clients.

-> In serverThread program, the class file extends thread in which run() method is used to get the input from multiple clients and display message in server as (From Client-" +clientNo+ ": Message is :"+clientMessage)

-> In Client, the output will be ("From Server to Client-" + clientNo + " Message " + clientMessage).

-> If from client "bye" message is given, then server will exit from specified client with the message as (Client -" + clientNo + " exit!!).

-> In main server program, the application get started with server message as "server started".

-> In socket programming, server program should start first and then only client program should start.

-> If client program is started, which client is using the server is displayed in console with message (" >> " + "Client No:" + counter + " started!").

-> The output will be as :

1. Server Started ....
2. > > Client No:1 started!
3. From Client-1: Message is :hi
4. > > Client No:2 started!
5. From Client-2: Message is :hello
6. From Client-2: Message is :bye
7. Client -2 exit!!
8. From Client-1: Message is :bye
9. Client -1 exit!! 

### Reference Link

[Link](http://net-informations.com/java/net/multithreaded.htm)


### To Run The Program

for maven, to build the project use 
```
mvn clean install
```

to run the program, in main application by clicking the run button icon where the java class file is created.

```bash
Public class Server{
```











