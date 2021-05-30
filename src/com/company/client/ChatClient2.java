package com.company.client;

import java.io.IOException;

public class ChatClient2 {
    public static void main(String[] args) throws IOException {

        Client client = new Client();
        client.start();

        client.sendMessage("Hello from the Client.");
        client.sendMessage("how are you");
        client.sendMessage("I'm Fine");
        client.sendMessage("Thank you");
        client.sendMessage("Exit");

       System.out.println("Client Finished the execution.....");


    }
}
