package com.company.server;

import javax.sound.sampled.Port;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Server is running.....");
        ServerSocket serverSocket = new ServerSocket(6000);
        System.out.println("Server socket created.....");
        while (true){
            //Server is Running Forever
            Socket client = serverSocket.accept(); //wait until client connect
            System.out.println("Server accepted a client");
            ClientHandler clientHandler = new ClientHandler(client);
            Thread thread = new Thread(clientHandler);
            thread.start();

        }
        //accept user inputs
        //use a gui for client and server
        //encrypt messages between client and the server
        //limit the no of clients



    }
}
