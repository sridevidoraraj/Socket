package com.gcit.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ServerThread extends Thread{
    Socket serverClient;
    int clientNo;

    ServerThread(Socket inSocket,int counter){
        serverClient = inSocket;
        clientNo=counter;
    }
    public void run(){
        try{
            DataInputStream inStream = new DataInputStream(serverClient.getInputStream());
            DataOutputStream outStream = new DataOutputStream(serverClient.getOutputStream());
            String clientMessage="", serverMessage="";
            while(!clientMessage.equals("bye")){
                clientMessage=inStream.readUTF();
                System.out.println("From Client-" +clientNo+ ": Message is :"+clientMessage);
                serverMessage="From Server to Client-" + clientNo + " Message " + clientMessage ;
                outStream.writeUTF(serverMessage);
                outStream.flush();
            }
            inStream.close();
            outStream.close();
            serverClient.close();
        }catch(Exception ex){
            System.out.println(ex);
        }finally{
            System.out.println("Client -" + clientNo + " exit!! ");
        }
    }
}
