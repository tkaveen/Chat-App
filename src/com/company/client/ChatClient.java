package com.company.client;

import java.io.*;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) throws IOException {

        Client client = new Client();
        client.start();

        int i=2;
        while(i>1){
            client.sendMessage("");
        }
//        client.sendMessage("");
//        client.sendMessage("");
//        client.sendMessage("");
//        client.sendMessage("");
//        client.sendMessage("Exit");

//        client.sendMessage("how are you");
//        client.sendMessage("I'm Fine");
//        client.sendMessage("Thank you");
//        client.sendMessage("Exit");

        System.out.println("Client Finished the execution.....");
    }}



