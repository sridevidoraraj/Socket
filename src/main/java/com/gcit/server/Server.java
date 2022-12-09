package com.gcit.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {


        try {
            ServerSocket server = new ServerSocket(8080);
            int counter = 0;
            System.out.println("Server Started ....");
            while (true) {
                counter++;
                Socket serverClient = server.accept();
                System.out.println(" >> " + "Client No:" + counter + " started!");
                ServerThread sct = new ServerThread(serverClient, counter);
                sct.start();
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
