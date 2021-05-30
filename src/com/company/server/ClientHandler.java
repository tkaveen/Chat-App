package com.company.server;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientHandler implements Runnable {
    private Socket client;
    public ClientHandler(Socket socket) {
        this.client = socket;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(50); //wait for 20 seconds before exeucuting the rest of the code
            //receive data
            InputStream inputStream = this.client.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            DataOutputStream outputStream = new DataOutputStream(this.client.getOutputStream());

            //Continuous Reading data from client
            String inputData;
            while((inputData = bufferedReader.readLine()) != null){

                System.out.println("Client : " + inputData);
                //Send data to Client
                switch (inputData){
                    default:
                        Scanner input = new Scanner (System.in);
                        System.out.print("You: ");
                        String res = input.nextLine();
                        outputStream.writeBytes(res + "\n");
                }
                if(inputData.equals("Exit")){
                    break;
                }
            }
            this.client.close();

        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
