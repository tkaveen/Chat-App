package com.company.client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private DataOutputStream outputStream;
    private BufferedReader bufferedReader;

    public void start() throws IOException {
        System.out.println("Client is running.....");
        Socket socket  = new Socket("localhost", 6000);
        this.outputStream = new DataOutputStream(socket.getOutputStream());
        InputStream inputStream = socket.getInputStream();
        this.bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
    }

    public void sendMessage(String message) throws IOException{


        Scanner input = new Scanner (System.in);
        System.out.print("Client : ");
        String response = input.nextLine();
        this.outputStream.writeBytes(response +"\n");
        String dataFromServer = this.bufferedReader.readLine();
        System.out.println("Server : " + dataFromServer);
    }

}
